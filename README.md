

### Test Cases

Devise a set of test scenarios / acceptance criteria that covers enough breadth of this feature for a daily smoke test.

A few asks and helpful tips:
- Keep your focus to just the scheduling page (https://www.zoomcare.com/schedule). Anything else is not within scope of this challenge.
- If you click on a time slot, it will redirect you to a login screen if you don't have an account. We aren't concerned with the behavior past this point; focus on the behavior that displays to an unauthenticated guest just browsing our schedule. You can make an account if you wish, but these are real appointments - **please do not actually schedule any appointments for testing**.
- We know there are many, many links on our website. Be selective in which links you want to verify work, and what page they should open up under what condition.
- Prioritize your plan; try to keep your list to 8-10 test cases.
- We're interested in testing the application's front-end user interface, from an end-to-end perspective. Thinking about what the back-end (ie. API endpoint) does is useful, but is not a requirement for this challenge.
- Think about the entire workflow: what happens if you change X parameter? Does Y also change depending on X? What about things changing without any interaction after a period of time?

## Automation Instructions

### ZoomCare Scheduler Tests : 

An automation framework that is used to test the online scheduling page of ZoomCare website. Its uses C#.NET, Selenium POM, MS Test and FluentAssertions. 

### Pre-requisite : 

IDE : Visual Studio 2022
Brwoser : Google Chrome 101.0

### Getting Started : 

Copy the framework into your local machine. Open the solution file SchedulerTests.sln in Visual Studio(This framework was developed in VS 2022). In VS go to Test-> Configure Run Settings->Select Solution Wide runsettings file , select the path to the .runsettings file. 
This file is the configuration file for the framework. It contains 3 parameters which needs to be entered.
1. ApplicationUri - The link to the application.
2. Browser - Browser on which the testing would happen. (For now its only configured for Chrome.)
3. Headless - To run in headless mode or not.

Once the values are defined in .runsettings, Build the solution Build->Build Solution or Ctrl+Shift+B. 

### Installing nuget packages

After building the solution if the NuGet is still not installed, then go to Tools->NuGet Package Manager->Manage NuGet Packages for Soution and install all the unisntalled packages in Dependencies->Packages.
Packages Current versions:
1. DotNetSeleniumExtras.PageObjects.Core(4.0.1)
2. FluentAssertions - used for Asserts(6.6.0)
3. Selenium.Chrome.Webdriver(85.0.0)
4. Selenium.Webdriver(4.1.0)

### Framework Components

1. Driver : This folder contains the exe for the driver. Ex chromderiver.exe. These drivers are used to run the tests in respective browser.
2. Models : This folder contains the Dtos for the application.
3. PageObjects : As this framework follows Selenium POM , this folder contains class files that represent each page. Ex Here we have SchedulerPage.cs that is the class file for Scheduler page. It will contain all the corresponding web page elements as its properties.
   Actions performed on the elements are defined as methods of this class.
4. TestCases : This folder will contain all the test cases.
5. Utilities : This folder contains all the helper classes.
6. .runsettings : XML config file.

### Steps to execute

1. Open *\candidate-project-qa-automation\SchedulerTests\SchedulerTests.sln.
2. Build the solution.
3. Open Test->Test Explorer.
4. Right click on OnlineSchedulingTests.
5. Click Run.

### Some DataAnnotations used in framework
1. [TestMethod] - MSTest annotation which defines a method is a test case.
2. [TestClass] - MSTest annotation to define a Test Class.
3. [ClassInitialize] - This method is called first for each test class.
4. [ClassCleanup] - This method is called after all test cases of class is executed.
5. [DynamicData], [DataRow] - Used to provide test data.

