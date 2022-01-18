# Logging
Start-Transcript -Path "$Tests\$CurrentScript.txt" -Force -NoClobber -Append -Verbose

# Go to URL
$ChromeDriver.Navigate().GoToURL('https://www.zoomcare.com/schedule')
Start-Sleep -Seconds 10 # Give the page time to load

# Verify the scheduling element is visible
$SchedulerScreen = $ChromeDriver.FindElement([OpenQA.Selenium.By]::XPath('//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[2]/div'))

$Result = ($SchedulerScreen.Displayed)

Stop-Transcript