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
using SchedulerUIAutomationTests.Utilities;
using FluentAssertions;
using SchedulerUIAutomationTests.Models;

namespace SchedulerTests.TestCases
{
    [TestClass]
    public class OnlineSchedulingTests
    {
        internal static SchedulerPage schedulerPage;
        internal static IWebDriver _driver;

        [ClassInitialize]
        public static void Init(TestContext context)
        {
            _driver = TestUtilities.Init(context);
            schedulerPage = new SchedulerPage(_driver);
            PageFactory.InitElements(_driver, schedulerPage);        
        }

        [TestMethod]
        [TestCategory("Smoke")]
        [Description("This test verifies the Care Selector. Here we test Primary Care option.")]
        public void PrimaryCareSelectorTest()
        {
            // Navigate to the schedule page.
            schedulerPage.GoToPage(TestUtilities.ApplicationUri);

            // Verify the default Care selected is Injury/Illness.
            schedulerPage.VerifyCareSelectorAndService(UIConstants.IllnessInjury, UIConstants.IllnessInjury_ServiceLine);            
            schedulerPage.ClickCareSelector();

            // Verify the List inside the popup.
            schedulerPage.VerifyCareSelector().Should().BeTrue("Care Selector List is not as expected.");
            
            // Select the Primary Care option and verify it.
            schedulerPage.SelectPrimaryCare();
            schedulerPage.VerifyCareSelectorAndService(UIConstants.PrimaryCare, UIConstants.PrimaryCare);            
        }

        [TestMethod]
        [TestCategory("Smoke")]
        [Description("This test verifies the ChatCare, VideoCare, ChatCare button in the ChatVideoRow.")]
        public void ChatVideoRowTest()
        {
            // Navigate to the schedule page.
            schedulerPage.GoToPage(TestUtilities.ApplicationUri);

            // Verify Clinic Care button.
            schedulerPage.VerifyVirtualCareEnabled("cliniccare");
            schedulerPage.VerifyCareSelectorAndService(UIConstants.IllnessInjury, UIConstants.IllnessInjury_ServiceLine);

            // Verify Video Care button.
            schedulerPage.ClickVirtualCare("videocare");
            schedulerPage.VerifyCareSelectorAndService(UIConstants.VideoCare, UIConstants.VideoCare_ServiceLine);

            // Verify Chat Care button.
            schedulerPage.ClickVirtualCare("chatcare");
            schedulerPage.VerifyChatCareTakesToLoginPage();
        }

        [TestMethod]
        [TestCategory("Smoke")]
        [Description("This test verifies the Appointment Scheduling if time slot is available or not for Illness/Injury Clinic care.")]
        public void VerifyClinicCareAppointmentScheduling()
        {
            schedulerPage.GoToPage(TestUtilities.ApplicationUri);

            // Verify if schedule appointment time is present.
            if(schedulerPage.IsAppointmentButtonPresent())
            {
                // Verify click on time slot takes you to log in page.
                schedulerPage.ClickAppointmentButton();                
                TestUtilities.GoBack();

                //Verify Cancel appointment alert.
                schedulerPage.VerifyCancelAppointmentAlert();
                schedulerPage.ClickNoButton();                
                TestUtilities.GoBack();

                schedulerPage.ClickAppointmentButton();
                TestUtilities.GoBack();
                schedulerPage.ClickCancelVisitButton();
                schedulerPage.VerifyCareSelectorAndService(UIConstants.IllnessInjury, UIConstants.IllnessInjury_ServiceLine);
            }
            else if(schedulerPage.NextAvailableDatePresent())
            {
                // Verify if next avaialbe date is present.
                schedulerPage.ClickOnNextAvailableDate();
            }
            else
            {
                // Verify clinic not in area.
                schedulerPage.VerifyNotInArea();
            }
        }

        [TestMethod]
        [TestCategory("Smoke")]
        [Description("This test verifies the Provider details for one Provider.")]
        [DynamicData(nameof(GetProviderDetails), DynamicDataSourceType.Method)]
        public void VerifyProviderDetailsAndScheduleAppointment(ProviderDto provider)
        {
            schedulerPage.GoToPage(TestUtilities.ApplicationUri);

            // Verify provider details if its present.
            if (schedulerPage.IsClinicLocationRowPresent())
            {
                schedulerPage.IsClinicAddressDetailsIsPresent(provider.ClinicLink, provider.AddressLine1, provider.AddressLine2);
                schedulerPage.IsClinicServicePresent();
                schedulerPage.IsAddressMapPresent();
                schedulerPage.VerifyProviderDetails();
                schedulerPage.VerifyDateAndAppointment(provider);
                // Verify if schedule appointment time is present.
                if (schedulerPage.IsAppointmentButtonPresent())
                {
                    // Verify click on time slot takes you to log in page.
                    schedulerPage.ClickAppointmentButton();
                }
            }
            // If provider details is not present verify below messages are displayed.
            else if (schedulerPage.NextAvailableDatePresent())
            {
                schedulerPage.ClickOnNextAvailableDate();
            }
            else
            {
                schedulerPage.VerifyNotInArea();
            }
        }

        [TestMethod]
        [TestCategory("Smoke")]
        [Description("This test verifies the Location Selector")]
        [DataRow("97124", "Tanasbourne - Midnight", "2711 NE Town Center Dr", "Hillsboro, OR 97006")]
        public void WantCareLocationTest(string locationSearch, string ClinicLink, string AddressLine1, string AddressLine2)
        {
            schedulerPage.GoToPage(TestUtilities.ApplicationUri);
            // Verify Want Care link.
            schedulerPage.VerifyLocationSelector(UIConstants.WantCare);
            schedulerPage.ClickWantCareLink();

            // Verify the location popup.
            schedulerPage.VerifyLocationPopup();

            //Enter test location and verify the details are reflected in the page.
            schedulerPage.EnterLocationSearch(locationSearch);
            schedulerPage.VerifyLocationSelector(UIConstants.WantCare97124);
            schedulerPage.IsClinicAddressDetailsIsPresent(ClinicLink, AddressLine1, AddressLine2);
        }

        [ClassCleanup]
        public static void CleanupTest()
        {
            _driver.Quit();
        }

        // Provider test data.
        public static IEnumerable<object[]> GetProviderDetails()
        {
            yield return new object[] { new ProviderDto() {
                ClinicLink = "Tanasbourne - Midnight",
                AddressLine1 = "2711 NE Town Center Dr",
                AddressLine2 = "Hillsboro, OR 97006",
                TodayLabel = "Today",
                TodayDate = DateTime.Now.ToString("MMM dd"),
                TimeZone = "(PDT) Pacific Daylight Time"
            } };

        }
    }
}
