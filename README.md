![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)
## ZoomCare Candidate Code Challenge - QA / Automation

#### <span style="color: lightblue;">Sarmaya Aliyeva Gonen</span>

### <span style="color: lightblue;">Test Cases</span>

This document outlines various test cases to ensure the functionality and end to end user experience of the ZoomCare scheduler for a daily smoke test.

<span style="color: lightblue;">Available services per location:</span>
- Portland, OR - Everyday Care, Popular Services, Specialty Care, Body Works
- Seattle, WA - Everyday Care, Popular Services, Specialty Care, Body Works
- Vancouver, WA - Everyday Care, Popular Services
- Salem, OR - Everyday Care, Popular Services, Specialty Care
- Eugene, OR - Everyday Care, Popular Services, Specialty Care
- Denver, CO - Everyday Care
- Boulder, CO - Everyday Care
- Boise, ID - Everyday Care



#### <span style="color: lightblue;">[TC-01] Verify that the patient can search for a spesific service</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Select <span style="color: lightblue;">Seattle, WA</span> location from the Location dropdown
3. Select <span style="color: lightblue;">Primary Care</span> service from the Choose Service dropdown
4. Select <span style="color: lightblue;">Today's Date</span> from the Choose Date dropdown
5. Click on <span style="color: lightblue;">Search</span> button

Expected Result: Primary Care header should be displayed, with list of Primary Care providers, for the selected date


#### <span style="color: lightblue;">[TC-02] Verify that the patient can schedule the Clinic Care appoinment</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Select <span style="color: lightblue;">Salem, OR</span> location from the Location dropdown
3. Select <span style="color: lightblue;">Dermatology</span> service from the Choose Service dropdown
4. Select <span style="color: lightblue;">Tomorrow's Date</span> from the Choose Date dropdown
5. Click on <span style="color: lightblue;">Search</span> button
6. Click on Clinic Care button (if it is not selected)
7. Click on any available first slot in first available clinic

Expected Result: Patient redirected to the Login page

#### <span style="color: lightblue;">[TC-03] Verify that the patient can schedule the VideoCare appoinment</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Select <span style="color: lightblue;">Salem, OR</span> location from the Location dropdown
3. Select <span style="color: lightblue;">Dermatology</span> service from the Choose Service dropdown
4. Select <span style="color: lightblue;">Tomorrow's Date</span> from the Choose Date dropdown
5. Click on <span style="color: lightblue;">Search</span> button
6. Click on VideoCare button
7. Click on any first available slot in first available clinic (📝 *If the selected day is not available click on the "Next available: Date" button and select the available slot*)

Expected Result: Patient redirected to the Login page
#### <span style="color: lightblue;">[TC-04] Verify that the patient can schedule the appoinment for the next available date</span>

1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Select <span style="color: lightblue;">Vancouver, WA</span> location from the Location dropdown
3. Select <span style="color: lightblue;">Mental Health Meds - Initial</span> service from the Choose Service dropdown
4. Select <span style="color: lightblue;">Today's Date</span> from the Choose Date dropdown
5. Click on <span style="color: lightblue;">Search</span> button
6. Click on <span style="color: lightblue;">Next available: Date</span> button (📝 *If you don't see the <span style="color: lightblue;">Next available: Date</span> button just change the date or switch to VideoCare.*)
7. Click on any first available slot in first available clinic

Expected Result: Patient redirected to the Login page (📝 *Verify for both: Clinic Care and VideoCare*)
#### <span style="color: lightblue;">[TC-05] Verify that the patient can schedule an appointment using their own location </span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule)
2. Select <span style="color: lightblue;">USE MY LOCATION</span> location from the Location dropdown
3. Grant the permission for location (📝 *I used Chrome browser and allowed the location access*)
4. Select <span style="color: lightblue;">any available</span> service from the Choose Service dropdown
5. Select <span style="color: lightblue;">any available date</span> from the Choose Date dropdown
6. Click on <span style="color: lightblue;">Search</span> button
7. Click on any first available slot in first available clinic

Expected Result: Patient redirected to the Login page
#### <span style="color: lightblue;">[TC-06] Verify when there is no services are available for the patient's location </span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule)
2. Select <span style="color: lightblue;">USE MY LOCATION</span> location from the Location dropdown 
3. Grant the permission for location (📝 *Used Chrome browser and allowed the location access. No services available if you are in California*)

Expected Result: <span style="color: lightblue;">USE MY LOCATION</span> link replaced with <span style="color: lightblue;">Out of area</span>. <span style="color: lightblue;">We're not in your area yet—but we're growing almost as fast as we deliver care!</span>  copy displayed in info panel
#### <span style="color: lightblue;">[TC-07] Verify that the patient can check the clinic address on the Google Map</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Select <span style="color: lightblue;">Salem, OR</span> location from the Location dropdown
3. Select <span style="color: lightblue;">Dermatology</span> service from the Choose Service dropdown
4. Select <span style="color: lightblue;">Tomorrow's Date</span> from the Choose Date dropdown
5. Click on <span style="color: lightblue;">Search</span> button
6. Click on Map button

Expected Result: Patient redirected to the Google Map and the clinic address should be displayed on the map
#### <span style="color: lightblue;">[TC-08] Verify that the patient can view clinic services</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Select <span style="color: lightblue;">Salem, OR</span> location from the Location dropdown
3. Select <span style="color: lightblue;">Dermatology</span> service from the Choose Service dropdown
4. Select <span style="color: lightblue;">Tomorrow's Date</span> from the Choose Date dropdown
5. Click on <span style="color: lightblue;">Search</span> button
6. Click on View Clinic Services >> See More Details (or just click on clinic name)
7. Click on View Clinic Services button

Expected Result: Patient redirected to the zoomcare-clinic#services page. Clinic Location, Services, Review links should be displayed on zoomcare-clinic#services page
#### <span style="color: lightblue;">[TC-09] Verify that the patient can check the accepted insurances</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
2. Scroll to the footer and in How to Pay section click on <span style="color: lightblue;">Accepted Insurance</span> link

Expected Result: Patient redirected to the Accepted Health Insurers page
(📝 *You can verify other commonly used links: Contact Us, Billing & Insurance, Pricing, ZoomCare Free Nights, Translation, Download iOS App, Download Android App*)
###  <span style="color: lightblue;">Error Handling Test Cases</span>

#### <span style="color: lightblue;">[TC-10] Verify that the patient can not schedule duplicate appoinment</span>
(📝Preconditions: *Open two different browsers(ex: Chrome and Safari/Firefox) or use one regular and one incognito. Execute steps from 1-6 in both pages*)
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule).
3. Select <span style="color: lightblue;">Salem, OR</span> location from the Location dropdown (repeat this step for second )
4. Select <span style="color: lightblue;">Dermatology</span> service from the Choose Service dropdown
5. Select <span style="color: lightblue;">Tomorrow's Date</span> from the Choose Date dropdown
6. Click on <span style="color: lightblue;">Search</span> button
7. In First browser click on any first available slot in first available clinic
8. In Second browser click on the same time slot that you selected in first browser

Expected Result: Alert module displayed with <span style="color: lightblue;">Whoops! Looks like this one got away...
This appointment is no longer available. Please try again, or select another time or day below.</span> copy
#### <span style="color: lightblue;">[TC-11] Verify when the patient's location is not detected</span>
1. Navigate to url [ZoomCare>>Schedule page](https://www.zoomcare.com/schedule)
2. Select <span style="color: lightblue;">USE MY LOCATION</span> location from the Location dropdown (📝 *I used Chrome browser and blocked the location access*)

Expected Result: <span style="color: lightblue;">We are unable to retrieve your location.</span> copy displayed in info panel




## <span style="color: lightblue;">🚀 Automation Instructions</span>


 This repository contains automated tests for [Zoomcare's appointment scheduler](https://www.zoomcare.com/schedule).

## <span style="color: lightblue;">Table of Contents</span>

- 📋 [Prerequisites](#prerequisites)
- 🛠️ [Installation](#installation)
- 🔧 [Configuration](#configuration)
- ▶️  [Running Tests](#running-tests)
- 📊 [Viewing Test Results](#viewing-test-results)
- ❓ [Why WebDriverIO](#why-webdriverio)
- 📞 [Contact](#contact)


## <span style="color: lightblue;">Prerequisites</span>

Before you begin, ensure you have the following installed:
-    IDE: You can use any Integrated Development Environment (IDE) of your choice. If you don't have one, you can download and install Visual Studio Code from [Here](https://code.visualstudio.com/download)
- ⚙️ Node.js and npm: Download and install Node.js and npm (Node Package Manager) from [Here](https://nodejs.org/)
- 📦 Git: Download and install Git from [Here](https://git-scm.com/)


## <span style="color: lightblue;">Installation</span>

1. **<span style="color: lightblue;">Clone the Repository</span>**



      Clone this repository to your local machine using the following command:

    ```
    git@github.com:<your-username>/candidate-project-qa-automation.git
    ```

## <span style="color: lightblue;">Configuration</span>
1. **<span style="color: lightblue;">Navigate to the cloned repository on your local machine:</span>**

    ```
    cd candidate-project-qa-automation/zoomcare-automation
2. **<span style="color: lightblue;">Install the necessary dependencies using npm:</span>**
    ```
    npm install
## <span style="color: lightblue;">Running Tests</span>

3. **<span style="color: lightblue;">To run the automated tests, execute the following command in your Terminal</span>**
    ```
    npm test:open
    npm test:headless  //if you want to run headless
 This command will start the WebDriverIO test runner and execute the automated tests against the ZoomCare scheduler according to the defined test cases. 
 ## <span style="color: lightblue;">Viewing Test Results</span>

After running the automated tests, you can generate and view detailed test reports using Allure. Follow these steps to generate and view the Allure reports:

1. **<span style="color: lightblue;">Generate Allure Reports:</span>**

   After running the tests, the results will be stored in the `allure-results` directory. To generate Allure reports from these results, execute the following command in your Terminal:
   ```
   npm run allure:generate
2. **<span style="color: lightblue;">View Allure Reports:</span>**

    Once the reports are generated, you can view them in a user-friendly format using the Allure command. Execute the following command in your Terminal:
    ```
    npm run allure:open