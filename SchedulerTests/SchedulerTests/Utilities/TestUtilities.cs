using FluentAssertions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Interactions;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace SchedulerUIAutomationTests.Utilities
{
    public class TestUtilities
    {
        public static string ApplicationUri;
        public static string _browser;
        public static bool _isHeadless;
        public static IWebDriver _driver;

        public static IWebDriver Init(TestContext context)
        {
            ApplicationUri = context.Properties["ApplicationUri"].ToString();
            _browser = context.Properties["Browser"].ToString()!;
            _isHeadless = Convert.ToBoolean(context.Properties["Headless"]);
            
            switch (_browser.ToLower())
            {
                case "chrome":
                    var options = new ChromeOptions();
                    if (_isHeadless)
                        options.AddArguments(new List<string>() { "headless", "disable-gpu", "window-size=1200,1100" });
                    _driver = new ChromeDriver(@"Driver\\", options);

                    if (!_isHeadless)
                        _driver.Manage().Window.Maximize();                    
                    break;
                // More browsers can be configured here.    
            }
            _driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(30);
            return _driver;
        }

        public void IsElementDisplayed(IWebElement element)
        {
            element.Displayed.Should().BeTrue("Element was not displayed.");
        }             

        public static void GoBack()
        {
            _driver.Navigate().Back();
        }

        public static void SelectDropdown()
        {        
            //This method has waits to select drop down values.

            WebDriverWaitForElement();

            Actions a = new(_driver);
            a.SendKeys(Keys.ArrowDown).SendKeys(Keys.Enter).Build().Perform();
            a.SendKeys(Keys.Enter).Build().Perform();

            WebDriverWaitForElement();
        }

        public static void WebDriverWaitForElement()
        {
            var t = Task.Factory.StartNew(() =>
            {
                Task.Delay(8000).Wait();
            });
            t.Wait();
        }

        public void IsElementDisplayedAndTextValid(IWebElement element, string expectedText)
        {
            element.Displayed.Should().BeTrue($"{expectedText} was not displayed.");          

            element.Text.Should().Be(expectedText, $"{expectedText} text is incorrect.");           
        }

        public void IsElementDisplayedAndContainsText(IWebElement element, string expectedText)
        {
            element.Displayed.Should().BeTrue($"{expectedText} was not displayed.");

            element.Text.Should().Contain(expectedText, $"{expectedText} text was not present.");
        }

        public void VerifyAttribute(IWebElement element, string attribute, string expectedValue)
        {
            element.GetAttribute(attribute).Should().Be(expectedValue, "Attribute value was not as expected.");
        }

    }
}
