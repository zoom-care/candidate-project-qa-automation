using FluentAssertions;
using OpenQA.Selenium;
using SchedulerUIAutomationTests.Models;
using SchedulerUIAutomationTests.Utilities;
using System;
using System.Collections.Generic;
using System.Linq;

namespace SchedulerTests.PageObjects
{
    // This partial class contains all data for Care Selector.
    public partial class SchedulerPage
    {
        private IWebDriver _driver;
        TestUtilities _testUtil = new();

        public IWebElement CareSelectorFilter => _driver.FindElement(By.XPath("//div[@data-testid='CareSelector.popover']"));
        public IWebElement CareSelectorPopOver => _driver.FindElement(By.XPath("//div[@data-testid='CareSelector.popover']/div/div"));
        public IWebElement CareLabel => _driver.FindElement(By.XPath("//div[@data-testid='button-CareSelector.Care']/div"));
        public IWebElement CareDiv => _driver.FindElement(By.XPath("//div[@data-testid='button-CareSelector.Care']"));
        public IList<IWebElement> CareSelectorList => _driver.FindElements(By.XPath("//*[contains(@data-testid,'CareSelector.list.option')]/div/div"));
        public IWebElement PrimaryCareSelector => _driver.FindElement(By.XPath("//div[@data-testid='text-Primary Care']"));
        public IWebElement ServiceLineLabel => _driver.FindElement(By.XPath("//*[contains(@data-testid,'text-scheduler.serviceLine')]"));

        public SchedulerPage(IWebDriver driver)
        {
            _driver = driver;
        }

        public void GoToPage(string applicationUri)
        {
            _driver.Navigate().GoToUrl(applicationUri);
        }

        public void ClickCareSelector()
        {
            CareSelectorFilter.Click();
        }

        public void VerifyCareSelectorAndService(string careSelector, string serviceSelector = "")
        {
            if (string.IsNullOrEmpty(serviceSelector))
                serviceSelector = careSelector;

            if(serviceSelector.ToLower().Contains("video"))
                _testUtil.IsElementDisplayedAndTextValid(VideoCareLabel, careSelector);
            else
                _testUtil.IsElementDisplayedAndTextValid(CareSelectorPopOver, careSelector);

            _testUtil.IsElementDisplayedAndTextValid(ServiceLineLabel, serviceSelector);               
        }

        public bool VerifyCareSelector()
        {
            _testUtil.IsElementDisplayedAndTextValid(CareLabel, "Care");
            _testUtil.VerifyAttribute(CareDiv, "aria-selected", "true");
            
            // Verify the pop up list elements are same.
            int i = 0;
            List<string> actualSelector = new();
            foreach (var item in CareSelectorList)
            {
                actualSelector.Add(item.Text);
                i++;
            }
            return Enumerable.SequenceEqual(UIConstants.expectedCareSelector, actualSelector);                
        }

        public void SelectPrimaryCare()
        {
            _testUtil.IsElementDisplayedAndTextValid(PrimaryCareSelector, "Primary Care");              
            PrimaryCareSelector.Click();                       
        }
    }

    // This partial class contains all data for Virtual Care Buttons.
    public partial class SchedulerPage
    {      
        public IWebElement ChatVideoRow => _driver.FindElement(By.XPath("//div[@data-testid='ChatVideoRow']"));
        public IWebElement ClinicCareButton => _driver.FindElement(By.XPath("//button[@data-testid='virtualClinicBox']"));
        public IWebElement VideoCareButton => _driver.FindElement(By.XPath("//button[@data-testid='virtualVideoBox']"));
        public IWebElement ChatCareButton => _driver.FindElement(By.XPath("//button[@data-testid='virtualChatBox']"));
        public IWebElement ClinicCareLabel => _driver.FindElement(By.XPath("//div[@data-testid='text-Clinic Care']"));
        public IWebElement VideoCareLabel => _driver.FindElement(By.XPath("//div[@data-testid='text-VideoCare™']"));
        public IWebElement ChatCareLabel => _driver.FindElement(By.XPath("//div[@data-testid='text-ChatCare™']"));
        public IWebElement Username => _driver.FindElement(By.Id("okta-signin-username"));
        public IWebElement Password => _driver.FindElement(By.Id("okta-signin-password"));
        public IWebElement SignIn => _driver.FindElement(By.Id("okta-signin-submit"));

        public void VerifyVirtualCareSelector()
        {
            _testUtil.IsElementDisplayed(ChatVideoRow);

            _testUtil.IsElementDisplayedAndTextValid(ClinicCareLabel, UIConstants.ClinicCare);

            _testUtil.IsElementDisplayedAndTextValid(VideoCareLabel, UIConstants.VideoCare);

            _testUtil.IsElementDisplayedAndTextValid(ChatCareLabel, UIConstants.ChatCare);                
        }

        public void ClickVirtualCare(string selector)
        {
            VerifyVirtualCareSelector();

            switch (selector.ToLower())
            {
                case "cliniccare":
                    ClinicCareButton.Click();
                    break;
                case "videocare":
                    VideoCareButton.Click();
                    break;
                case "chatcare":
                    ChatCareButton.Click();
                    break;
            }

            VerifyVirtualCareEnabled(selector);
        }

        public void VerifyVirtualCareEnabled(string selector)
        {
            switch (selector.ToLower())
            {
                case "cliniccare":
                    _testUtil.VerifyAttribute(ClinicCareButton, "aria-pressed", "true");
                    break;
                case "videocare":
                    _testUtil.VerifyAttribute(VideoCareButton, "aria-pressed", "true");                   
                    break;                
            }           
        }

        public void VerifyChatCareTakesToLoginPage()
        {
            _testUtil.IsElementDisplayed(Username);
            _testUtil.IsElementDisplayed(Password);
            _testUtil.IsElementDisplayed(SignIn);              
        }
    }

    // This partial class contains all data for Appointments.
    public partial class SchedulerPage
    {
        public IWebElement AppointmentTimeButton => _driver.FindElement(By.XPath("//*[contains(@data-testid,'button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1')]"));
        public IWebElement SignUpButton => _driver.FindElement(By.Id("sign_up_button-loginModal.register.signUp"));
        public IWebElement NotInAreaLabel => _driver.FindElement(By.XPath("//*[contains(@data-testid,'text-We're not in your area')]"));
         public IWebElement NextAvailableDate => _driver.FindElement(By.XPath("//div[@data-testid='button-ServiceLine.1.Clinic.1.EmptyState']/div"));
        public IWebElement SelectedDateNotAvailable => _driver.FindElement(By.XPath("//*[contains(@data-testid,'text-The selected day is not available')]"));

        public bool IsAppointmentButtonPresent()
        {
            try
            {
                _testUtil.IsElementDisplayed(AppointmentTimeButton);
            }
            catch(Exception)
            {
                return false;
            }
            return true;
        }

        public void ClickAppointmentButton()
        {
            AppointmentTimeButton.Click();
            RedirectToLogInPage();
        }

        public bool NextAvailableDatePresent()
        {
            _testUtil.IsElementDisplayed(NextAvailableDate);
            return true;
        }

        public void RedirectToLogInPage()
        {
            TestUtilities.WebDriverWaitForElement();
            _testUtil.IsElementDisplayed(SignUpButton);               
        }

        public void VerifyNotInArea()
        {
            _testUtil.IsElementDisplayedAndTextValid(NotInAreaLabel, UIConstants.NotInArea);
        }

        public void ClickOnNextAvailableDate()
        {
            _testUtil.IsElementDisplayedAndTextValid(SelectedDateNotAvailable, UIConstants.SelectedDayNotAvailable);
            NextAvailableDate.Click();
            ClickAppointmentButton();
        }     
    }

    // This partial class contains all data for Provider details.
    public partial class SchedulerPage
    {
        public IWebElement ClinicLocationRow => _driver.FindElement(By.XPath("//*[contains(@data-testid,'ServiceLine.1.Clinic.1.LocationRow')]"));
        public IWebElement ClinicLink => _driver.FindElement(By.XPath("//*[contains(@data-testid,'ServiceLine.1.Clinic.1.LocationRow')]/div/div/div/a"));
        public IWebElement AddressLine1 => _driver.FindElement(By.XPath("//*[contains(@data-testid,'ServiceLine.1.Clinic.1.LocationRow')]/div/div/div/div"));
        public IWebElement AddressLine2 => _driver.FindElement(By.XPath("//*[contains(@data-testid,'ServiceLine.1.Clinic.1.LocationRow')]/div/div/div/div[2]"));
        public IWebElement MapLink => _driver.FindElement(By.XPath("//*[contains(@data-testid,'map-button')]/i"));
        public IWebElement DistanceToClinic => _driver.FindElement(By.XPath("//*[contains(@data-testid,'map-button')]/div"));
        public IWebElement ViewClinicServices => _driver.FindElement(By.XPath("//div[@data-testid='text-View Clinic Services']"));
        public IWebElement ProviderAvatar => _driver.FindElement(By.XPath("//div[@data-testid='provider-avatar']"));
        public IWebElement ProviderName => _driver.FindElement(By.XPath("//a[@data-testid='link-ServiceLine.1.Clinic.1.Provider.1.ProviderName']"));
        public IWebElement ProviderService => _driver.FindElement(By.XPath("//div[@data-testid='ServiceLine.1.Clinic.1.Provider.1']/div/div"));
        public IWebElement TodayLabel => _driver.FindElement(By.XPath("//div[@data-testid='text-Today']"));
        public IWebElement TodayDate => _driver.FindElement(By.XPath("//div[@data-testid='ServiceLine.1.Clinic.1.Provider.1.DateInfo']/div/div[2]"));
        public IWebElement TimeZone => _driver.FindElement(By.XPath("//div[@data-testid='ServiceLine.1.Clinic.1.Provider.1.DateInfo']/div[2]"));

        public bool IsClinicLocationRowPresent()
        {
            _testUtil.IsElementDisplayed(ClinicLocationRow);
            return true;
        }

        public void IsClinicAddressDetailsIsPresent(string expectedClinicLink, string expectedAddressLine1, string expectedAddressLine2)
        {
            _testUtil.IsElementDisplayedAndTextValid(ClinicLink, expectedClinicLink);
            _testUtil.IsElementDisplayedAndTextValid(AddressLine1, expectedAddressLine1);
            _testUtil.IsElementDisplayedAndTextValid(AddressLine2, expectedAddressLine2);
        }

        public void IsClinicServicePresent()
        {
            _testUtil.IsElementDisplayed(ViewClinicServices); 
        }

        public void IsAddressMapPresent()
        {
            _testUtil.IsElementDisplayed(MapLink);
            _testUtil.IsElementDisplayed(DistanceToClinic);
        }

        public void VerifyProviderDetails()
        {
            _testUtil.IsElementDisplayed(ProviderName);
            _testUtil.IsElementDisplayed(ProviderService);
            _testUtil.IsElementDisplayed(ProviderAvatar);
        }

        public void VerifyDateAndAppointment(ProviderDto provider)
        {
            _testUtil.IsElementDisplayedAndTextValid(TodayDate, provider.TodayDate);
            _testUtil.IsElementDisplayedAndTextValid(TodayLabel, provider.TodayLabel);
            _testUtil.IsElementDisplayed(AppointmentTimeButton);
        }
    }

    // This partial class contains all data for Care Location Selector.
    public partial class SchedulerPage
    {
        public IWebElement LocationSelector => _driver.FindElement(By.XPath("//div[@data-testid='LocationSelector']"));
        public IWebElement WantCareLabel => _driver.FindElement(By.XPath("//div[@data-testid='LocationSelector']/div"));
        public IWebElement LocationLink => _driver.FindElement(By.XPath("//div[@data-testid='LocationSelector']/div/span"));
        public IWebElement ClinicCloseToYouLabel => _driver.FindElement(By.XPath("//*[contains(@data-testid,'text-Want to find the clinic closest')]"));
        public IWebElement UseMyLocation => _driver.FindElement(By.XPath("//*[contains(@data-testid,'text-Use my location')]"));
        public IList<IWebElement> LocationOptions => _driver.FindElements(By.XPath("//*[contains(@data-testid,'LocationSelector.option')]"));
        public IWebElement LocationSearch => _driver.FindElement(By.XPath("//input[@data-testid='location-search-input']"));
        public IWebElement SelectLocation => _driver.FindElement(By.XPath("//footer/div/div"));

        public void VerifyLocationSelector(string locationSearch)
        {
            _testUtil.IsElementDisplayed(LocationSelector);
            _testUtil.IsElementDisplayedAndContainsText(WantCareLabel, locationSearch);
            _testUtil.IsElementDisplayed(LocationLink);           
        }

        public void ClickWantCareLink()
        {
            TestUtilities.WebDriverWaitForElement();
            LocationLink.Click();
        }

        public void VerifyLocationPopup()
        {
            _testUtil.IsElementDisplayedAndTextValid(ClinicCloseToYouLabel, UIConstants.ClinicCloseToYou);
            _testUtil.IsElementDisplayedAndTextValid(UseMyLocation, UIConstants.UseMyLocation);
            LocationOptions.Count.Should().BeGreaterThan(0);
            _testUtil.IsElementDisplayed(LocationSearch);
        }

        public void EnterLocationSearch(string inputLocation)
        {
            LocationSearch.SendKeys(inputLocation);
            TestUtilities.WebDriverWaitForElement();
            TestUtilities.SelectDropdown();
        }

    }
}
