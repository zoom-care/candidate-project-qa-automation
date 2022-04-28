using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchedulerUIAutomationTests.Utilities
{
    public class TestUtilities
    {
        public bool IsElementDisplayed(IWebElement element)
        {
            return element.Displayed;
        }

        public bool IsElementDisplayedAndTextValid(string elementName, IWebElement element, string expectedText)
        {
            if (!element.Displayed)
            {
                Console.WriteLine($"{elementName} was not displayed.");
                return false;
            }

            if (!element.Text.Equals(expectedText))
            {
                Console.WriteLine($"{elementName} text is incorrect.");
                return false;
            }
            return true;
        }


    }
}
