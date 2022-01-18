$ErrorActionPreference = "Continue"

# Logging
Start-Transcript -Path "$PSScriptRoot\First_Run.txt" -Force -NoClobber -Append -Verbose | Out-Null

# Your working directory
$workingPath = "$PSScriptRoot\selenium"

# Add the working directory to the environment path if not already present.
# This is required for the ChromeDriver to work.
if (($env:Path -split ';') -notcontains $workingPath) {
    $env:Path += ";$workingPath"
}

# Import WebDriver libraries
Import-Module "$($workingPath)\WebDriver.dll"
Import-Module "$($workingPath)\WebDriver.Support.dll"

# Initialize variables
$ChromeOptions = New-Object OpenQA.Selenium.Chrome.ChromeOptions
$ChromeOptions.addArguments('headless')
$AllTestsPassed = $true
$FailedTests = @()

# Get list of tests to run
$Tests = "$workingPath\scripts"

# Start Chrome headless
$ChromeDriver = New-Object OpenQA.Selenium.Chrome.ChromeDriver($ChromeOptions)
Start-Sleep 5 # Ensure the browser has time to start up before continuing

# Run tests found in \scripts
Get-ChildItem -Path $Tests -Filter *.ps1 | ForEach-Object {
    $CurrentScript = $_.BaseName
    Write-Host "Running $CurrentScript"
    . $_.FullName

    If (($Result)) {
        Write-Host "Test Successful"
    }
    else {
        Write-Host "Test failed"
        $AllTestsPassed = $false
        $FailedTests += "`n"
        $FailedTests += "$_"
    }
    #$ChromeDriver.Close()
}
$ChromeDriver.Quit()

if ($AllTestsPassed -eq $true) {
    Write-Host "All Tests Passed"
}
else {
    throw "The Following Tests Failed: $FailedTests"
}
Stop-Transcript