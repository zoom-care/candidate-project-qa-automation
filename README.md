# Test Cases

| TC0001      | Descritprion: <br /> Schedule page - List of Clinincs |                                                                                                      |
|        ---  |                         ---                    |                                          ---                                                         |
| Step number | Steps                                          | Expected Results                                                                                     | 
| --- | --- | --- |
| 1           | Navigate to https://www.zoomcare.com/schedule  | Schedule page should be shown                                                                       |
|             |                                                | Zoomcare logo top-right, Schedule, Locations, Services, Pricing & Insurance links and Login button should be visible.|
|             |                                                | "Want care in X?" should be shown based on the location of the user.                                |
|             |                                                | "Illness/Injury" and "Today" shown by default from a dropdown menu.                                 |
|             |                                                | The buttons "Clinic Care", "VideoCare" and "ChatCare" are visible, "Clinic Care" button is selected.|
|             |                                                | "Ilness/Injury Clinic visit title, followed by the "Info $" link are visiblle.                    |
|             |                                                | List of Clinics with available times, clicnic services and map link are visible.                    |
|             |                                                | List of Clinics should contain 5 or less options - Other options are ihdden under the "Show More" button.|
|             |                                                | Right under the list of clinics, "Emergency Care" list should be visible followed by the "Info $" link.|                                                                                               |
| --- | --- | --- |
| 2           | Press on "Want care in X?" and choose Denver   | List of clinics in Denver should appear - If less then 5, "Show more" button should not be visible. |
|             |                                                | Under "Emergency Care" the message "We're not in your area yet—but we're growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more." should be visible.|                                                 
| --- | --- | --- |
| 3           | Press the "Info $" Link next to the Clinic Visit title| The correct info should appear with the link "More info" that takes the user to the page https://www.zoomcare.com/services/illness-injury-clinic-visit                                       |
| --- | --- | --- |
| 4           | Repeat step 3 "Emergency Care" section         | The correct info should appear with the link "More info" that takes the user to the page https://www.zoomcare.com/services/emergency-care                                                     |
| --- | --- | --- |

<br />

| TC0002      | Descritprion: <br /> List of Clinic,video and chat Care|                                                                                              |
|        ---  |                         ---                    |                                          ---                                                         |
| 1 | Press "VideoCare" button | List of clinics with today's available visits/windows should appear.|
| --- | --- | --- |
|2| Press "Clinic Care" button|  List of clinics with today's available visits/windows should appear.|
| --- | --- | --- |
|3| Press "ChatCare" button| Should redirect the user to Login page.|
| --- | --- | --- |
|4| Navigate to https://www.zoomcare.com/schedule and repeat steps 1 and 2 with different dates|  List of clinics with the selected date and available visits/windows should appear.
| --- | --- | --- |
|5| Repeat steps 1 and 2 with combination of different dates and different visit reasons (Primary care,Family medicine, Dermatology etc.)|  List of clinics with the selected date and service should appear with available visits/windows.



| TC0001      | Descritprion: <br /> Schedule page - List of Clinincs |                                                                                                      |
|        ---  |                         ---                    |                                          ---                                                         |
| Step number | Steps                                          | Expected Results                                                                                     | 
| --- | --- | --- |
| 1           | Navigate to https://www.zoomcare.com/schedule  | * Schedule page should be shown <br />* Zoomcare logo top-right, Schedule, Locations, Services, Pricing & Insurance links and Login button should be visible.<br /> * "Want care in X?" should be shown based on the location of the user.<br /> * "Illness/Injury" and "Today" shown by default from a dropdown menu. <br />* The buttons "Clinic Care", "VideoCare" and "ChatCare" are visible, "Clinic Care" button is selected.<br /> *  "Ilness/Injury Clinic visit title, followed by the "Info $" link are visiblle. <br />*List of Clinics with available times, clicnic services and map link are visible. <br />*List of Clinics should contain 5 or less options - Other options are ihdden under the "Show More" button. <br />*Right under the list of clinics, "Emergency Care" list should be visible followed by the "Info $" link.|                                                         
| --- | --- | --- |
| 2           | Press on "Want care in X?" and choose Denver   | List of clinics in Denver should appear - If less then 5, "Show more" button should not be visible. |
|             |                                                | Under "Emergency Care" the message "We're not in your area yet—but we're growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more." should be visible.|                                                 
| --- | --- | --- |
| 3           | Press the "Info $" Link next to the Clinic Visit title| The correct info should appear with the link "More info" that takes the user to the page https://www.zoomcare.com/services/illness-injury-clinic-visit                                       |
| --- | --- | --- |
| 4           | Repeat step 3 "Emergency Care" section         | The correct info should appear with the link "More info" that takes the user to the page https://www.zoomcare.com/services/emergency-care                                                     |
| --- | --- | --- |


# Automation Instructions
