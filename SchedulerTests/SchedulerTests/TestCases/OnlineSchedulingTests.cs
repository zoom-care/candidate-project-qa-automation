using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium.Chrome;
using SchedulerTests.PageObjects;
using SeleniumExtras.PageObjects;

namespace SchedulerTests.TestCases
{
    [TestClass]
    public class OnlineSchedulingTests
    {
        internal static SchedulerPage schedulerPage;
        internal static IWebDriver driver;
        [ClassInitialize]
        public static void Init(TestContext context)
        {
            var options = new ChromeOptions();
            string path = @"Driver\\";
            driver = new ChromeDriver(path, options);
            schedulerPage = new SchedulerPage(driver);
            PageFactory.InitElements(driver, schedulerPage);        
        }

        [TestMethod]
        public void CareSelectorTests()
        {
            schedulerPage.GoToPage();
            Assert.IsTrue(schedulerPage.VerifyIllnessInjuryLabel());
            schedulerPage.ClickCareSelector();
            Assert.IsTrue(schedulerPage.VerifyCareSelector());
            schedulerPage.SelectCareSelector("Primary Care");
         
        }

        [ClassCleanup]
        public static void CleanupTest()
        {
            driver.Close();
            driver.Quit();
        }
    }
}
