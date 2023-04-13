using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;

namespace ChallengeZoomLink
{
    internal class LogOutZoomCare
    {
        IWebDriver _driver = new ChromeDriver();

       
        public LogOutZoomCare()
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


        public void LogOutOfZoomCare()
        {

            _driver.FindElement(By.XPath("//a[@id='authentication-button-login']")).Click();
            WaitPLease();
            _driver.FindElement(By.XPath("//div[@id='log_in_button-loginModal.register.logIn']")).Click();
            WaitPLease();
            _driver.FindElement(By.XPath("//input[@id='okta-signin-username']")).SendKeys("dqturner.7@gmail.com");

            _driver.FindElement(By.XPath("//input[@id='okta-signin-password']")).SendKeys("Prettysure_6");
            WaitPLease();


            _driver.FindElement(By.XPath("//input[@id='okta-signin-submit']")).Click();
            WaitPLease();

            _driver.FindElement(By.XPath("//a[@id='authentication-button-account']")).Click();
            WaitPLease();
            _driver.FindElement(By.XPath("//div[contains(text(),'Logout')]")).Click();

        }
    }
}