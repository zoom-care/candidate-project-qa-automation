using OpenQA.Selenium;
using SchedulerUIAutomationTests.Utilities;
using SeleniumExtras.PageObjects;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchedulerTests.PageObjects
{
    public class SchedulerPage
    {
        private IWebDriver _driver;
        TestUtilities _testUtil = new();

        [CacheLookup]
        public IWebElement CareSelectorFilter => _driver.FindElement(By.XPath("//div[@data-testid='CareSelector.popover']"));

        public IWebElement IllnessInjuryLabel => _driver.FindElement(By.XPath("//div[@data-testid='text-Illness/Injury']"));
        public IWebElement CareLabel => _driver.FindElement(By.XPath("//div[@data-testid='button-CareSelector.Care']/div"));
        public IWebElement CareDiv => _driver.FindElement(By.XPath("//div[@data-testid='button-CareSelector.Care']"));

        public IList<IWebElement> CareSelectorList => _driver.FindElements(By.XPath("//div[@data-testid=CareSelector.list']/div"));


        public SchedulerPage(IWebDriver driver)
        {
            _driver = driver;
            //PageFactory.InitElements(driver, this); // This doesn't exist in current context using .NET Core
        }

        public void GoToPage()
        {
            _driver.Navigate().GoToUrl("https://www.zoomcare.com/schedule");
        }

        public void ClickCareSelector()
        {
            CareSelectorFilter.Click();
        }

        public bool VerifyIllnessInjuryLabel()
        {
            return _testUtil.IsElementDisplayedAndTextValid("Illness/Injury label", IllnessInjuryLabel, "Illness/Injury");

        }

        public bool VerifyCareSelector()
        {
            if (!_testUtil.IsElementDisplayedAndTextValid("Care label", CareLabel, "Care"))
                return false;

            if(!CareDiv.GetAttribute("aria-selected").Equals("true"))
            {
                Console.WriteLine("Care was not selected by default.");
                return false;
            }
            int i = 0;

            foreach (var item in CareSelectorList)
            {

                string text = item.FindElement(By.XPath($"/div[{i}]/div/div")).Text;
                i++;
            }
            return true;
        }

        public void SelectCareSelector(string selectText)
        {
            CareSelectorFilter.Click();
            string val = CareLabel.GetAttribute("aria-selected");
            
        }
    }
}
