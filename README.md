# Test Cases

| TC0001      | Description: <br /> Schedule page - List of Clinics |                                                                                                      |
|        ---  |                         ---                    |                                          ---                                                         |
| *Step number* | *Steps*                                          | *Expected Results*                                                                                     | 
| 1           | Navigate to https://www.zoomcare.com/schedule  | - Schedule page should be shown <br />- Zoomcare logo top-right, Schedule, Locations, Services, Pricing & Insurance links, and Login button should be visible.<br /> - "Want care in X?" should be shown based on the location of the user.<br /> - "Illness/Injury" and "Today" shown by default from a dropdown menu. <br />- The buttons "Clinic Care", "VideoCare" and "ChatCare" are visible, "Clinic Care" button is selected.<br /> - "Illness/Injury Clinic Visit title, followed by the "Info $" link are visible. <br />- List of Clinics with available times, clinic services, and map link are visible. <br />- List of Clinics should contain 5 or fewer options - Other options are hidden under the "Show More" button. <br />- Right under the list of clinics, "Emergency Care" list should be visible followed by the "Info $" link.|                                                         
| 2           | Press on "Want care in X?" and choose Denver   | - List of clinics in Denver should appear - If less then 5, "Show more" button should not be visible. <br />- Under "Emergency Care" the message "We're not in your area yet—but we're growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more." should be visible.|                                                 
| 3           | Press the "Info $" Link next to the Clinic Visit title| - The correct info should appear with the link "More info" that takes the user to the page https://www.zoomcare.com/services/illness-injury-clinic-visit                                       |
| 4           | Press "Schedule" in the navigation bar and repeat step 3 for the "Emergency Care" section         | - The correct info should appear with the link "More info" that takes the user to the page https://www.zoomcare.com/services/emergency-care         

<br />

| TC0002      | Description: <br /> List of Clinics,video and chat Care|   |
|        ---  |                         ---                    |                                          ---                                                         |
| *Step number* | *Steps*                                          | *Expected Results*                                                                                     | 
| 1 | Press "VideoCare" button | - List of clinics with today's available visits/windows should appear.|
|2| Press "Clinic Care" button| - List of clinics with today's available visits/windows should appear.|
|3| Press "ChatCare" button| - Should redirect the user to the Login page.|
|4| Navigate to https://www.zoomcare.com/schedule and repeat steps 1 and 2 with different dates| - List of clinics with the selected date and available visits/windows should appear.
|5| Repeat steps 1 and 2 with a combination of different Cities, dates and different visit reasons (Primary care,Family medicine, Dermatology, etc.)| - List of clinics for the selected City with the selected date and service should appear with available visits/windows.

<br />

| TC0003      | Description: <br /> Schedule an Appointment as a Guest|   |
|        ---  |                         ---                    |                                          ---                                                         |
| *Step number* | *Steps*                                          | *Expected Results*                                                                                     | 
| 1 | Press on "Want care in X?", choose "Seattle, WA" and tomorrow's date | - List of clinics with tomorrow's available visits/windows should appear.|
|2| Press "More" on any Professional to see all available appointment windows | - All available appointment times should appear.|
|3| Press on any available window for any professional| - Should redirect the user to the Login page.|
|4| Press the "Back" button in the browser| - Popup window with the message "Click "Continue" to complete your booking. If you leave the page now, you may lose this appointment time." should appear.
|5| Press "Cancel Booking"| - List of clinics with today's available visits/windows should appear.
|6| Repeat steps 3 and 4, Press "Continue"| - Should redirect the user to the Login page.
|7| Repeat steps 2,3,4 and 5 with a combination of different cities, date, reasons and appointment times for "Clinic Care" and "VideoCare"| - All available appointments should work as expected in steps 2,3 and 4.

<br />

# Automation Instructions

**Summary**
This is a repository for cypress end-to-end automation test

**Requirement to run the automation**
* node.js (https://nodejs.org/en/)

**First time getting files from this repository**
* Open a terminal and navigate to the desired directory where the repository will be placed
* Run the command "git clone https://github.com/AlyssaDonchu/candidate-project-qa-automation.git"

**Running Cypress in interactive visual Cypress Test runner**
* Navigate to the folder "Automation" (cd Automation)
* Run the command "npm install cypress"
* Run the command "npx cypress open"



