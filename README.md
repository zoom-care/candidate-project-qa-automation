## Test Cases

### TC 1 : Verify Want Care Location Selector

- Navigate to page https://www.zoomcare.com/schedule.
- Verify the location selector is present with text "Want care in @Location". Here @Location will be according to you local zip code.
- Click on the link and it should open a popup with all nearby locations options.
- The popup should contain "Use my location" option.
- It should also contain a input text box to enter city on zip.
- Enter a zip code Ex 97124 . The popup should display a dropdown with available address. 
- The page should be updated with the selected location. If available clinic/provider/appointment is present then that deatils should be displayed.

### TC 2 : Verify Care Selector Popover

- Navigate to page https://www.zoomcare.com/schedule.
- Verify Care Selector popover is present and Illness/Injury is selected by default.
- Click on the selector and verify the popup with all the care selector options are displayed. It should have following options Illness/Injury", "Adult COVID-19 Screening","Pediatric COVID-19 Screening","Primary Care","Family Medicine","Emergency Care",
  "Sports Physical","Mental Health Meds & More","Mental Health Talk Therapy","X-Ray & Imaging","Dermatology","Women's Health (Gynecology)","Orthopedics","Podiatry","Chiropractic","Physical Therapy".
- Select any one care Ex. Primary Care.
- Page should be updated with "Primary Care" in the Care Selector popover.
- If available clinic/provider/appointment is present then that details should be displayed.

### TC 3 : Verify Date Selector

- Navigate to page https://www.zoomcare.com/schedule.
- Verify "Today" is displayed by default.
- Click on the date selector.
- It should display the date popup.
- Select a date.
- If available clinic/provider/appointment is present for that date then that details should be displayed.

### TC 4 : Verify book an appointment 

- Navigate to page https://www.zoomcare.com/schedule.
- For avaialble provider and verify appointment details are present.
- The button with time details should be displayed. 
- The time should be as per the local time zone.
- If more than 6 , then 5 appointments should displayed and a More button should be displayed.
- Click on More and all the appointments list should be displayed.
- Less button should be displayed. Click on it and should go back to original state.
- Click on the button and we should be navigated to log in page.

### TC 5 : Verify Provider details and book appointment

- Navigate to page https://www.zoomcare.com/schedule.
- For avaialble provider and appointment details verify below details are displayed.
- Verify Clinic Link is present.
- Verify Address Details Line 1 and Line 2 are present.
- Verify "View Clinic Services" link is present.
- Verify Map is present.
- If appoitnment is present, verify appointment time button is present.
- Click on the appointment button, we should be navigated to Log In page.

### TC 6 : Verify ChatVideo Row

- Navigate to page https://www.zoomcare.com/schedule.
- Verify Clinic Care, Video Care and Chat Care buttons are present and Clinic Care is selected by default.
- Click on Video Care.
- Illness/Injury Video Vist is diplayed and if available appointment details are present.
- Click on Chat Care.
- We should be navigated to log in page.

### TC 7 : Verify Emergency Care

- Navigate to page https://www.zoomcare.com/schedule.
- Verify Emergency Care section is displayed.
- All the available Emergency Care details are displayed.
- For each available provider, message should be displayed "ZoomCare is not a hospital ER. For threatening emergencies go to the ER or call 911."

### TC 8 : Verify Doctor link

- Navigate to page https://www.zoomcare.com/schedule.
- If provider details are present, click on the Doctor Name link.
- It should be navigated to page with doctor details and next available appointment for Care selector is displayed.

### TC 9 : Verify Info $ link 

- Navigate to page https://www.zoomcare.com/schedule.
- Eor each section Illness/Injury, Emergency Care sections Info|$ link is present.
- Click on the link,
- A popup should open and it should contain the information for the clinic visit.
- It should also display Health Insurance Accepted information.
- Type of Visit : Clinic should be displayed at bottom.
- Uninsured Rates should also be displayed.






## Automation Instructions

### ZoomCare Scheduler Tests : 

An automation framework that is used to test the online scheduling page of ZoomCare website. Its uses C#.NET, Selenium POM, MS Test and FluentAssertions. 

### Versions : 

- IDE : Visual Studio 2022
- Browser : Google Chrome 101.0
- .Net Framework : .Net 6.0
- MS Test : 2.2.1.0

### Getting Started : 

Copy the framework into your local machine. Open the solution file SchedulerTests.sln in Visual Studio. In VS go to Test-> Configure Run Settings->Select Solution Wide runsettings file , select the path to the .runsettings file. 
This file is the configuration file for the framework. It contains 3 parameters which needs to be entered.
1. ApplicationUri - The link to the application.
2. Browser - Browser on which the testing would happen. (For now its only configured for Chrome.)
3. Headless - To run in headless mode or not.

Once the values are defined in .runsettings, Build the solution Build->Build Solution or Ctrl+Shift+B. 

### Installing nuget packages :

After building the solution if the NuGet packages are still not installed, then go to Tools->NuGet Package Manager->Manage NuGet Packages for Solution and install all the uninstalled packages in solution under Dependencies->Packages.
Packages Current versions:
1. DotNetSeleniumExtras.PageObjects.Core(4.0.1)
2. FluentAssertions - used for Asserts(6.6.0)
3. Selenium.Chrome.Webdriver(85.0.0)
4. Selenium.Webdriver(4.1.0)

### Framework Components :

1. Driver : This folder contains the exe for the driver. Ex chromderiver.exe. These drivers are used to run the tests in respective browser.
2. Models : This folder contains the Dtos for the application.
3. PageObjects : As this framework follows Selenium POM , this folder contains class files that represent each page. Ex Here we have SchedulerPage.cs that is the class file for Scheduler page. It will contain all the corresponding web page elements as its properties.
   Actions performed on the elements are defined as methods of this class.
4. TestCases : This folder will contain all the test cases.
5. Utilities : This folder contains all the helper classes.
6. .runsettings : XML config file.

### Steps to execute :

1. Open *\candidate-project-qa-automation\SchedulerTests\SchedulerTests.sln.
2. Build the solution.
3. Open Test->Test Explorer.
4. Right click on OnlineSchedulingTests.
5. Click Run.

### Some DataAnnotations used in framework :

1. [TestMethod] - MSTest annotation which defines a method is a test case.
2. [TestClass] - MSTest annotation to define a Test Class.
3. [ClassInitialize] - This method is called first for each test class.
4. [ClassCleanup] - This method is called after all test cases of class is executed.
5. [DynamicData], [DataRow] - Used to provide test data.

