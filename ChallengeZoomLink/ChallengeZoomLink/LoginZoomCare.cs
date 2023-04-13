using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Interactions;
using System;

namespace ChallengeZoomLink
{
    internal class LoginZoomCare
    {
        private IWebDriver _driver = new ChromeDriver();
        
        public LoginZoomCare()
        {
            
        }


        public void OpenPage()
        {

            _driver.Navigate().GoToUrl("https://www.zoomcare.com");
            _driver.Manage().Window.Maximize();
        }

        public TimeSpan WaitPLease()
        {
            return _driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(3);
        }


        public void LogintoZoomCare()
        {

            Actions act = new Actions(_driver);
            _driver.FindElement(By.XPath("//a[@id='authentication-button-login']")).Click();
            WaitPLease();
            _driver.FindElement(By.XPath("//div[@id='log_in_button-loginModal.register.logIn']")).Click();
            WaitPLease();
            _driver.FindElement(By.XPath("//input[@id='okta-signin-username']")).SendKeys("dqturner.7@gmail.com");

            _driver.FindElement(By.XPath("//input[@id='okta-signin-password']")).SendKeys("Prettysure_6");
            WaitPLease();

            WaitPLease();
            _driver.FindElement(By.XPath("//input[@id='okta-signin-submit']")).Click();

        }
    }
}