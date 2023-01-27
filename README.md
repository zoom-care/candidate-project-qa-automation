Test Cases 
1- Scenario: User only makes an emergencyCare schedule with Today calender day
2- Scenario: User is out of area should get warning message
3- Scenario: User makes an Primary Care schedule
4-Scenario: User makes X-Ray, Ultrasound & CT schedule
5-Scenario: User selects 5-Minute Flu Shot schedule and checks price
6-Scenario Outline: User sees Emergency Care when Illness Injury is selected
7-Scenario Outline: User makes Video Care schedule
8-Scenario: Page results related with service

Automation Instructions
1-Right Click on the forked project click on AddFrameworkSupport and add Maven as a build automation tool.
2-Create those directories (com,zoomcare) under java and add those directories(pages,runners,step_definitions,utilities) 
under zoomcare directory.
3-Create resources directory under test folder.
4-Create features folder under resources directory.
5-Add required dependencies/plugins into pom.xml file.
6-Add configuration.properties file on the project level to keep data(browser,url..) dynamically.
7-Add ConfigurationReader under utilities directory to read data from configuration.properties file.
8-Add Driver class under utilities.
9-Add Drivers on the project level in Drivers directory(Chrome,Gecko)
10-Add log4j.properties/logfile to generate logs in the file.
11-InheritableThreadLocal is added to Driver Class and maven-surefire-plugin into pom.xml to be able to run in parallel by using mvn verify in terminal.
12-Add maven-cucumber-reporting plugin into pom.xml to be able to generate reports in pretty format by using mvn verify in terminal.

Observations;
I have attached some screenshots under observations directory please refer.

