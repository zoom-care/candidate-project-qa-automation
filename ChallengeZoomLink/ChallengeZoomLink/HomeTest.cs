using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Interactions;
using System;

namespace ChallengeZoomLink
{
    internal class HomeTest
    {
        private IWebDriver _driver = new ChromeDriver();

        public HomeTest()
        {
            
        }


        public void OpenPage()
        {

            _driver.Navigate().GoToUrl("https://www.zoomcare.com");
            _driver.Manage().Window.Maximize();
        }

        public TimeSpan WaitPLease()
        {
            return _driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(4);
        }


        public void Search()
        {
           
            Actions act = new Actions(_driver);
            _driver.FindElement(By.XPath("//div[@data-testid='quickSelector.location.popover']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")).Click();
            WaitPLease();
            IWebElement listElelment = _driver.FindElement(By.XPath("//div[@id='quick-selector-option-location-eugene--or']"));
            WaitPLease();
            act.MoveToElement(listElelment).DoubleClick().Perform();
            WaitPLease();
            _driver.FindElement(By.XPath("//div[@data-testid='quickSelector.service.popover']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")).Click();
            WaitPLease();
            IWebElement listElelment2 = _driver.FindElement(By.XPath("//div[@id='quick-selector-option-service-sports-physical']"));
            WaitPLease();
            act.MoveToElement(listElelment2).DoubleClick().Perform();
            WaitPLease();
            _driver.FindElement(By.XPath("//div[@id='quickSelectorSubmit']")).Click();
            WaitPLease();
            _driver.FindElement(By.XPath("//div[normalize-space()='Show More']")).Click();

        }
        //*[@id="quickSelectorRefinerContainer"]/div[1]
        //*[@id="quick-selector-option-location-salem--or"]
        //div[@data-testid='quickSelector.location.popover']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']

    }
}