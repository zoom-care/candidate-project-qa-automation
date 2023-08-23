# ZoomCare Candidate Code Challenge - QA / Automation
# Freddy Suarez

## Test Cases

### TC-01-HomePage_ClickOnScheduleNavButton_SchedulePageIsDisplayed
Steps
    1. Navigate to home page "https://www.zoomcare.com"
    2. Click on Schedule button located in the top nav bar
    3. Verify Schedule Page is displayed and Schedule module is displayed
### TC-02-SchedulePage_SelectPortlandLocationAndOpenServicesSelector_PortlandAvailableServicesAreDisplayed
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Portland" from Location dropdown
    3. Open Services dropdown by clicking on it
    4. Verify only services for Portland are displayed
### TC-03-SchedulePage_SelectSeattleLocationAndOpenServicesSelector_WomenHealthServiceIsDisplayed
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3. Open Services dropdown by clicking on it
    4. Verify Women Health's Service is displayed
### TC-03-SchedulePage_SelectSalemLocationAndOpenServicesSelector_DermathologyServiceIsNotDisplayed
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3. Open Services dropdown by clicking on it
    4. Verify Dermathology Service is not displayed
### TC-04-SchedulePage_SelectAnyLocationAndVerifyServicesChangeLocation_ServicesSelectorDisplayChooseService
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3. Open Services dropdown by clicking on it
    4. Verify services for Seattle are displayed
    5. Select "Salem" from Locationd dropdown
    6. Verify Service Dropdown change to "Choose service"
### TC-05-SchedulePage_SelectLocation_SearchBtnIsDisable
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3. Verify Search button is disable
### TC-06-SchedulePage_SelectLocationAndService_SearchBtnIsDisable
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3 Select "Primary care" from services dropdown
    4. Verify Search button is disable
### TC-06-SchedulePage_SelectLocationServiceAndDate_BtnSearchIstDisplayed
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3 Select "Primary care" from services dropdown
    4. Select "Date" dropdown
    5. Verify Search button is enable
### TC-07-SchedulePage_SelectLocationServiceDateAndClickSearch_RefreshBtnIsEnable
Steps
    1. Navigate to home page "https://www.zoomcare.com/schedule"
    2. Select "Seattle" from Location dropdown
    3 Select "Primary care" from services dropdown
    4. Select "Date" dropdown
    5. Click on Button Search
    6. Verify services for specific date are displayed
    
## Automation Instructions

### Requirements
* Windows 10
* JDK 8+
* Maven
* Any modern web browser. (E.g: Chrome, Firefox, Edge)
* Windows environment variables for `JAVA_HOME` and `MAVEN _HOME`

### Running tests
#### From Windows Command Prompt

* Go to project directory
* Download and install dependencies from Maven Central executing this command
    ```
    mvn clean install
    ```
* Run all the tests executing this command
    ```
    mvn test
    ```