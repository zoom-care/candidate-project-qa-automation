## PART 1. TEST CASES

### 1) US1AC1: to verify main modules presence
   - Description: as user I should able to have access to four major modules on main page
  - 1AC: main modules presence checking.
  - As user I should be able to see and use modules on main home page "Schedule", "Location", "Services", "Pricing &
  - Insurance" and "Login" button
  - Priority: High
  - Environment: https://www.zoomcare.com/
  - Type: Cucumber
  - Steps:
  - 1.Given user on home page
  - 2.When use able to see main modules on home page
  - | Schedule |
  - | Locations |
  - | Services |
  - | Pricing & Insurance |
  - 3.Then user able to see "Login" button, it should be enable
  - Expected result: user should be able to see and use modules on main home page "Schedule", "Location", "Services", "
  - Pricing & Insurance" and "Login" button

 ### 2) US1AC2: to verify if main modules clickable.
   - Description: as user I should be able to click modules "Schedule", "Locations", "Services", "Pricing & Insurance", "Login"
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click "<module>"
   - 3.Then user see page related each module and title of pages contains "<module>" name
   - Examples:
   - | module |
   - | Schedule |
   - | Locations |
   - | Services |
   - | Pricing & Insurance |
   - | Login |
   - Expected result: user see page related each module and title of pages contains "module" name.

 ### 3) US2AC1: to verify user should be able to schedule an appointment.
   - Description: as user I should be able to click "choose location" of clinic, "choose Service", "choose Date", click " Search" button and see list of availabilities (random data).
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click on schedule module
   - 3.And user choose clinic location
   - 4.And user choose service
   - 5.And user choose available date
   - 6.And user click on search button
   - 7.Then use should be able to see list of availabilities and defined date
   - Expected result: user should see list of availabilities related with chosen options.


 ### 4) US2AC2: to verify that the user cannot determine the date if the service has not been specified
   - Description: if user did not choose specific service "Choose Date" dropdown should be disabled. If user click on it "Please choose a service" text appear.
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click on schedule module
   - 3.And user choose "<Clinic location>" dropdown
   - 4.And user click on choose date
   - 5.Then user see "Please choose a service", search button disabled
   - Examples:
   - | Clinic location |
   - | Portland, OR |
   - | Seattle, WA |
   - | Vancouver, WA |
   - | Salem, OR |
   - | Eugene, OR |
   - | Denver, CO |
   - | Boulder, CO |
   - | Boise, ID |
   - Expected result:the user cannot determine the service date if the service has not been selected.

 ### 5) US2AC3: to verify list of services for each clinic
   - Description: as user I should be able to see list of services for clinic (two point verification).
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click on schedule module
   - 3.And user choose "<Clinic location>" dropdown
   - 4.And user click choose service
   - 5.Then user see list of services for clinic
   - 6.And list of services should match with list of services from database
   - Examples:
   - | Clinic location |
   - | Portland, OR |
   - | Seattle, WA |
   - | Vancouver, WA |
   - | Salem, OR |
   - | Eugene, OR |
   - | Denver, CO |
   - | Boulder, CO |
   - | Boise, ID |
   - Expected result: the user sees a list of services provided by the clinic.

 ### 6) US3AC1: to verify user should be able to define clinic location in his/her area
   - Description: user should be able to choose "USE MY LOCATION" to define clinic in his/her area. 
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click on schedule module
   - 3.And user choose "Portland, OR" location
   - 4.And user choose "Use my location" option
   - 5.Then user see message "We're not in your area yet"
   - Expected result: user should be able to use "USE MY LOCATION" option.

 ### 7) US3AC2: to verify user able to see clinic location from given list
   - Description: user should be able to choose clinic location manually in case if there is no location in user area.
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click on schedule module
   - 3.And click on clinic location module
   - 4.Then user see available clinic location
   - | Portland, OR |
   - | Seattle, WA |
   - | Vancouver, WA |
   - | Salem, OR |
   - | Eugene, OR |
   - | Denver, CO |
   - | Boulder, CO |
   - | Boise, ID |
   - Expected result: user see list of clinic locations.


### 8) US4AC1: to verify for emergency care no scheduling and delivery options
   - Description: if user choose clinic, which provide emergency care, user should not see Clinic care, VideoCare, ChatCare options.
   - Priority: High
   - Environment: https://www.zoomcare.com/
   - Type: Cucumber
   - Steps:
   - 1.Given user on home page
   - 2.When user click on schedule module
   - 3.And user choose "<Clinic location>" for emergency care
   - 4.And user choose "Emergency Care"
   - 6.And user click on search button
   - 7.Then user should not see service delivery options
   - Examples:
   - | Clinic location |
   - | Portland, OR |
   - | Seattle, WA |
   - | Vancouver, WA |
   - | Salem, OR |
   - | Eugene, OR |
   - | Denver, CO |
   - | Boulder, CO |
   - | Boise, ID |
   - Expected result: user should not see Clinic care, VideoCare, ChatCare options for emergency care.


## PART 2. AUTOMATION FRAMEWORK

### Framework setup instruction.
BDD framework(Maven based).
Pre-condition - fork the project;

1) add Framework support -> maven (add POM.XML);
2) Open POM.XML file -> add dependencies-> add to project following dependencies:
   -selenium-java;
   -webdrivermanager (io.github.bonigarcia);
   -javafaker;
   -cucumber-java;
   -cucumber-junit (version must be same with cucumber-java);
   -reporting-plugin.
3) create project structure:
   a) under package java create packages: com, utility;
   b) under package com create packages: pages, runner, step_definition;
   c) on project level create file configuration.properties (store most important data).
4) under package test create resource package.
5) pages package - for page object model design pattern implementation (we store here located web elements ).
6) runner package - contain cukesRunner class, which help to establish control on framework
7) step_definition package - contains classes, where we implement java logic to automate Web driver actions. That
   package also contains hooks class where we define pre- and post-conditions for each test procedure.
8) utility package contains:
   - a) browserUtil class - to store reusable static methods, which we can use everywhere in project;
   - b) confugurationReader class - help us to open stream in order to read and pass in testing procedures data from
   configuration.properties file;
   - c) driver class - to implement singleton design pattern, which help us get same instance of driver during one
   session;
9) resource package -> features package, which need to create business layer (we use Cucumber). In feature folder we
   keep feature files, where we describe test scenarios in Gherkin language, then each test scenario we convert in java
   logic in related step_definition class.

### Noticed bugs:

1) overleaping of text
   Seattle, WA -> Physical Therapy -> date -> refresh -> View Clinic Service = text overleaping
2) next available date is not displaying next available time
   Portland, OR -> Mental Health Med&More-> date -> search ->"next available: date" button = not displaying available
   time
3) see "show more" option not extend list
   Seattle, WA -> illness/Injury->date-> Refresh -> scroll down -> click "show more" button = list not extended, "show
   more" button not disappear
4) chosen date is not matched with date throughout list of displaying services
   Portland, MO -> any service-> date -> refresh = chosen date is not matched with date into list of displaying services
