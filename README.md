TEST CASES:

1. Feature: Scheduling page verification

Scenario: Verify that the page loads correctly by navigating to it

Given User navigates to the https://www.zoomcare.com/schedule

Then  User should be able to see scheduling page

2. Feature: Location Selection

Scenario: Verify if the user is able to select a location from a dropdown list

Given User is on the landing page

Then  User is able to select any available clinic locations from the list

3. Feature: Service Selection

Scenario: Verify if the user is able to select needed service

Given User is on the landing page

When  User clicks on services' dropdown box

Then  User is able to select any necessary service from the list

4. Feature: Date Selection

Scenario: Verify if the user is able to select a date from a dropdown list

Given User is on the landing page

When  User clicks on date dropdown box

Then  User is able to select any available date from the list

5. Feature: Search functionality verification

Scenario: Verify if search box is working as expected

Given User is on the landing page

When  User clicks all three options from dropdown menu boxes

Then  User is able to click search button


6. Feature: Care Type Selection

Scenario: Verify that the user can select particular care for his/her needs

Given User is on the landing page

Then  User should be able to choose any of three available care options

Then  User verifies that the result is as expected

7. Feature: Error message verification

Scenario: Verify that the error message appears when submit unavailable date

Given User is on the landing page

When User selects "Vancouver, WA" from location dropdown

And User selects "Primary Care" from services dropdown

And   User selects first available date from the calendar

Then  "The selected day is not available." message should appear if date is unavailable


8. Feature: Search functionality verification

Scenario: Verify if search box is working as expected

Given User is on the landing page

When  User selects "Seattle, WA" from dropdown menu

And   User selects "Mental Health Meds & More" service
from dropdown menu

And   User selects a first available date from dates dropdown menu

Then  User is able to click search button


9. Feature : Correct address verification

Given User is on the landing page

When  User selects "Seattle, WA" from dropdown menu

And   User selects "Mental Health Meds & More" service  from dropdown menu

And   User selects a first available date from dates dropdown menu

And   User clicks search button

Then  Verify if the address is as expected



AUTOMATION INSTRUCTIONS:

Creating framework starts from creating a new project. Before setting up anything I decided what tools I would use. Decided to use Cucumber BDD framework that is based on POM design pattern using Selenium WebDriver, Maven and JUnit. In the framework I am using Java as my main programming language.
Added all the necessary dependencies into pom.xml file, updated Maven. Created separate packages for pages, step_definitions, utilities and runners. Created resources directory on the test level and config.properties and .gitignore file on project level. Resources hold feature files with all the test cases using Gherkin language, and config.properties directory helps me with test data which I am using throughout the project. .gitignore file needed for those files that should be ignored.

Then I started to modify each package.

Runner package has two classes: Runner helps me to run particular test cases using tags and generates cucumber report using plugin,  and FailedRunner for rerunning only those testCases that failed.
Added useful classes to utilities package. Driver is designed based on Singleton Design Pattern to make sure that I am using single instance of the driver throughout the project. And also it contains ConfigReader class that helps me to read important data from config.properties file.
Pages package holds page classes with all necessary WebElements and useful methods using PageFactory class for initializing.
Step_Definitions package contains classes for actual TestScripts, and Hooks class that helps me to take Screenshot for failed TestCases. 