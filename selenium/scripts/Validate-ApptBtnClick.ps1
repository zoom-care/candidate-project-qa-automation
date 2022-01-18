# Logging
Start-Transcript -Path "$Tests\$CurrentScript.txt" -Force -NoClobber -Append -Verbose

# Go to URL
$ChromeDriver.Navigate().GoToURL('https://www.zoomcare.com/schedule')
Start-Sleep -Seconds 10 # Give the page time to load

# Find the button for the clinic's first available appointment, then Click on the button and verify the user is taken to the login page
$ChromeDriver.FindElement([OpenQA.Selenium.By]::XPath("//*[starts-with(@id,'booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1')]")).Click()
Start-Sleep -Seconds 5 # Give the page time to load

if (($ChromeDriver.URL -eq "https://www.zoomcare.com/login")) {
    $Result = $true
}
else {
    $Result = $false
}

Stop-Transcript