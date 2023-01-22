TEST CASES
1) US 1: main modules presence checking
as  user I should able to have access to four major modules on main page
- 1 AC: main modules presence checking.
As user I should be able to see and use modules on main home page "Schedule", "Location", "Services", "Pricing & Insurance" and "Login" button
Steps:
  1.Given user on home page
  2.When use able to see main modules on home page
  | Schedule            |
  | Locations           |
  | Services            |
  | Pricing & Insurance |
  3.And user able to see "Login" button, it should be enable

- 2 AC: main modules clickability checking.
As user I should be able to click modules "Schedule", "Locations", "Services", "Pricing & Insurance", "Login" on home page should be clickable
Steps:
  1.Given user on home page
  2.When user click "<module>"
  3.Then user see page related each module and title of pages contains "<module>" name
  Examples:
  | module              |
  | Schedule            |
  | Locations           |
  | Services            |
  | Pricing & Insurance |
  | Login               |

  
2) US 2: as user I should be able to schedule an appointment.
- 1 AC: as user I should be able to choose "Location" of clinic, choose Service, choose Date, "Search" button is enable (random data).
Steps:
  1.Given user on home page
  2.When user click on schedule module
  3.And user choose clinic location
  4.And user choose service
  5.And user choose available date
  6.And user click on search button
  7.Then use should able to see list of availabilities and defined date


- 2 AC: if user did not choose specific Service "Choose Date" dropdown should be disabled. If user click on it "Please choose a service" text appear.
Steps:
  1.Given user on home page
  2.When user click on schedule module
  3.And user choose "<Clinic location>" dropdown
  4.And user click on choose date
  5.Then user see "Please choose a service", search button disabled
  Examples:
  | Clinic location |
  | Portland, OR    |
  | Seattle, WA     |
  | Vancouver, WA   |
  | Salem, OR       |
  | Eugene, OR      |
  | Denver, CO      |
  | Boulder, CO     |
  | Boise, ID       |

- 3 AC: as user I should be able to see list of services for each clinic (two point verification).
Steps:
  1.Given user on home page
  2.When user click on schedule module
  3.And user choose "<Clinic location>" dropdown
  4.And user click choose service
  5.Then user see list of services for clinic
  6.And list of services should match with list of services from database
  Examples:
  | Clinic location |
  | Portland, OR    |
  | Seattle, WA     |
  | Vancouver, WA   |
  | Salem, OR       |
  | Eugene, OR      |
  | Denver, CO      |
  | Boulder, CO     |
  | Boise, ID       |

  
3) US 3 user should be able to define clinic location
- 1 AC: user should be able to choose "USE MY LOCATION" to define clinic
  Steps:
 1.Given user on home page
 2.When user click on schedule module
 3.And user choose "Portland, OR" location
 4.And user choose "Use my location" option
 5.Then user see message "We're not in your area yet"

  - 2 AC: user should be able to choose clinic location manually in case if there is no location in user area
  Steps:
  1.Given user on home page
  2.When user click on schedule module
  3.And click on clinic location module
  4.Then user see available clinic location
  | Portland, OR    |
  | Seattle, WA     |
  | Vancouver, WA   |
  | Salem, OR       |
  | Eugene, OR      |
  | Denver, CO      |
  | Boulder, CO     |
  | Boise, ID       |

    
4) US 4 as user I should be able to choose options to service delivery: Clinic care, VideoCare, ChatCare 
- 1 AC: if user choose clinic, which provide emergency care, user should NOT see Clinic care, VideoCare, ChatCare options
- 2 AC: if user choose clinic, which provide 5-Minute Flu Shot service, user should NOT see Clinic care, VideoCare, ChatCare options
- 3 AC: if user choose clinic, which provide Dermatology service, user should see Clinic care, VideoCare.
- 4 AC: if user choose clinic, which provide X-Ray, Ultrasound & CT service, user should see message "You'll need an order from a healthcare provider to schedule an X-Ray. Don't have one? Get started with an illness/Injury visit".

AUTOMATION FRAMEWORK
Framework set up instruction.
BDD framework(Maven based).
1) fork the project;
2) add Framework support -> maven (add POM.XML);
3) Open POM.XML file -> add dependencies-> add to project following dependencies:
-selenium-java;
-webdrivermanager (io.github.bonigarcia);
-javafaker;
-cucumber-java;
-cucumber-junit (version must be same with cucumber-java);
-reporting-plugin.

4) create project structure:
under package java create packages: com, utility. Under package com create packages: pages, runner, step_definition


Noticed:

1) overleaping  of text
Seattle, WA -> Physical Therapy -> date -> refresh -> View Clinic Service = text overleaping

2) next available date is not displaying next available time
Portland, OR -> Mental Health Med&More-> date -> search ->"next available: date" button = not displaying available time

3) see "show more" option not extend list
Seattle, WA -> illness/Injury->date-> Refresh -> scroll down -> click "show more" button = list not extended, "show more" button not disappear 

4) chosen date is not matched with date throughout list of displaying services
Portland, MO -> any service-> date -> refresh = chosen date is not matched with date into list of displaying services
