# Logging
Start-Transcript -Path "$Tests\$CurrentScript.txt" -Force -NoClobber -Append -Verbose

# Go to URL
$ChromeDriver.Navigate().GoToURL('https://www.zoomcare.com/schedule')
Start-Sleep -Seconds 10 # Give the page time to load

# If a clinic has no appointments available, verify the corresponding button is present and has the 'Next available...' text
$NoApptTxt = $ChromeDriver.FindElements([OpenQA.Selenium.By]::XPath("//*[text()='The selected day is not available.']"))
$NoApptBtn = $ChromeDriver.FindElements([OpenQA.Selenium.By]::XPath("//*[contains(text(),'Next available:')]"))

if (($NoApptTxt.Count) -eq ($NoApptBtn.Count)) {
    $Result = $true
}
else {
    $Result = $false
}

Stop-Transcript