# Schedule Page Test Cases

_TC1 - Default Search Results under Clinic Visits:_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options

AC: The page displays all Illness/Injury Clinic Visits under Clinic Care 

_TC2 - Default Search Results under Video Visits:_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options
3. Click VideoCare button

AC: The page displays all Illness/Injury Video Visits under  VideoCare

_TC3 - Search Results for Colorado under Clinic Visits (automated):_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service
6. Select "Illness/Injury"
7. Click drop-down for Date
8. Select today's date
9. Click "Search" button

AC: The page displays all Illness/Injury Clinic Visits in Colorado

_TC4 - Search Results for Colorado under Video Visits (automated):_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click "VideoCare" button

AC: The page displays all Illness/Injury Video Visits in Colorado

_TC5 - Illness/Injury Clinic Visit Pop-up Info (automated):_ 

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options 
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click "Info | $" button next to Illness/Injury Clinic Visit

AC: Pop-up appears with illness and injury visit related information 

_TC6 - Illness/Injury Video Visit Pop-up Info:_ 

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options 
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click "VideoCare" button 
11. Click "Info | $" button next to Illness/Injury Video Visit

AC: Pop-up appears with illness and injury video visit related information

_TC7 - Redirection to Login Page upon Clinic Visit Timeslot Selection:_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options 
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click first timeslot in the first search result 

AC: User is redirected to Login page

_TC8 - Redirection to Login Page upon Video Visit Timeslot Selection (automated):_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options 
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click "VideoCare" button 
11. Click first timeslot in the first search result

AC: User is redirected to Login page

_TC9 - "Continue booking" message pop-up:_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options 
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click first timeslot in the first search result 
11. Click "Schedule" tab from the top menu options on the Login Page

AC: Pop-up appears with "Continue booking" message

_TC10 - "More" Button Functionality (automated):_

Steps:
1. Navigate to https://www.zoomcare.com
2. Click Schedule from the top menu options 
3. Click drop-down for Location 
4. Select "Denver, CO"
5. Click drop-down for Service 
6. Select "Illness/Injury"
7. Click drop-down for Date 
8. Select today's date 
9. Click "Search" button 
10. Click "More" button in the first search result

AC: Additional appointment timeslots appear

# Automation Instructions

_Tools and project scope:_
1. Selection of an automation tool: Selenium
2. Scope of the framework: application's front-end UI - end-to-end functional testing of ZoomCare's scheduling feature. 
3. Programming language: Java 
4. Project structure: POM 
5. Automation tool: IDE - IntelliJ IDEA 

_Steps on how to set up a test automation environment (in my case):_
1. Install the programming language: Java (JDK) by going to Oracle website and getting/downloading latest version of JDK for your OS. Once installed on your machine, JDK path needs to be set, to do that add Java path to Environment variables under System Properties and go to PATH in System Variables by clicking "Edit" and then "New", finally add path at the root of bin folder.

2. Install the automation tool IntelliJ IDEA from https://www.jetbrains.com/idea/ and any necessary drivers (ChromeDriver or SafariDriver). 
Since I am on a MacBook, here are the steps to install ChromeDriver on macOS: 

**NOTE: Make sure you have the latest version of Google Chrome installed on your system. If not, go to the official website: https://www.google.com/chrome/.___**

   a. Open the Terminal application on your Mac 
  
    b. Run '/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"' command to install Homebrew, a package manager for macOS

**NOTE: not need to set any environment variable when installing ChromeDriver on macOS using Homebrew. Homebrew will automatically add the chromedriver binary to your system's PATH environment variable**
   
   c. Run 'brew install chromedriver' command to install ChromeDriver 
   
   d. To verify that ChromeDriver is installed, run this command: 'chromedriver --version'

3. Configure JDK in IntelliJ IDEA: 

Steps:

   a. open IntelliJ IDEA and go to "Preferences" by clicking on "IntelliJ IDEA" in the menu bar and selecting "Settings."(or "Preferences.") 

   b. In the Preferences window, go to "Build, Execution, Deployment" -> "Java" -> "JDK" and select the JDK installed in step 1 above. 
  
4. Install and configure a testing framework TestNG (since I am using Selenium with Java). TestNG can be installed by adding the TestNG dependency in the project using a build tool Gradle (to install Gradle, use Homebrew command 'brew install gradle' in Terminal). 

Steps:

   a. Add this dependency to your build.gradle file in the project: dependencies { testImplementation 'org.testng:testng:7.4.0'} 
   
   b. To configure TestNG in IntelliJ IDEA, go to "Settings" by clicking on "IntelliJ IDEA" in the menu bar and select "Plugins" and make sure that the TestNG plugin is installed and enabled.

5. Integrate an automation framework with a CI/CD pipeline in Jenkins to automate the execution of tests

Steps:

   a. Install Jenkins and ensure that the necessary plugins are installed. 
   
   b. Create a new job in Jenkins and configure it to pull the code from the repository. 
   
   c. Add a build step to execute the automation framework tests. 

6. Set up version control using Git 

Steps:

   a. Install Git by running 'brew install git' in Terminal
   
   b. Create a Git repository on GitHub to push local changes to this remote repository.


7. Create a Pull Request back to the original project.

