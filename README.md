# Test Cases

### 1. Schedule page loads correctly
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Verify selections for location, service, and date are present and interactable
### 2. All top banner links are working (Automated)
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Verify all banner links are present
        - Verify all banner links are working URLs
        - Navigate to each link from the Schedule page
        - Verify user is successfully taken to each page
### 3. Schedule an appointment with Clinic Care (Automated)
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select any location
        - Select a Illness/Injury
        - Select the first available date
        - Click "Search"
        - Verify "Clinic Care" is selected for the user by default
        - Select the first availale appointment
        - Verify user is taken to the login page
### 4. Schedule an appointment with Video Care
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select any location
        - Select a Illness/Injury
        - Select the first available date
        - Click "Search"
        - Verify "Clinic Care" is selected for the user by default
        - Click the "VideoCare" button
        - Select the first availale appointment
        - Verify user is taken to the login page
### 5. Verify user is able to view clinic services
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select any location
        - Select Illness/Injury as the service
        - Select the first available date
        - Click "Search"
        - Click "View Clinic Services" on the first clinic result
### 6. Verify user is able to view pricing info
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select any location
        - Select Illness/Injury as the service
        - Select the first available date
        - Click "Search"
        - Click the pricing info icon on the first clinic result
### 7. Verify video care is not an option for some services (Automated)
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select any location
        - Select either COVID-19 test as the service
        - Select the first available date
        - Click "Search"
        - Verify "Video Care" and "Clinic Care" buttons are not present
### 8. Verify an order is required for X-Ray, Ultrasound, & CT service
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select Portland, OR as the location
        - Select X-Ray, Ultrasound, & CT service service
        - Select a valid date
        - Click "Search"
        - Verify notification about needing an order for the service is present
### 9. Service is reset after user decides to change their location (Automated)
    Steps:
        - Navigate to https://www.zoomcare.com/schedule
        - Select any location
        - Select any service
        - Select a different location
        - Verify the service selection has been reset

# Automation Instructions

### Overview:

This solution uses Java, Selenium, Cucumber, Maven, and Firefox.

### Prerequisites:

* Java 20
* Maven 3.9.2
* Firefox browser

### Execution:

From the project directory, run the following command in a Windows Command Prompt:

     mvn clean test
