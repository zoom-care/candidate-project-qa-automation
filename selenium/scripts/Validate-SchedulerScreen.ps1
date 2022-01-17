# Your working directory
$workingPath = "$PSScriptRoot\selenium"

# Import both WebDriver libraries
Import-Module "$($workingPath)\WebDriver.dll"
Import-Module "$($workingPath)\WebDriver.Support.dll"

# Start Chrome and go to URL
$ChromeDriver = New-Object OpenQA.Selenium.Chrome.ChromeDriver
$ChromeDriver.Navigate().GoToURL('https://www.zoomcare.com/schedule')
Start-Sleep -Seconds 10 # Give the page time to load

# Verify the scheduling element is visible
$SchedulerScreen = $ChromeDriver.FindElement([OpenQA.Selenium.By]::XPath('//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[2]/div'))
($SchedulerScreen.Displayed)

$ChromeDriver.Close()
$ChromeDriver.Quit()