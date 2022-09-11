# Test Cases

|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Test case ID: TC0001                                                                                                                                                |
| Descritprion: Schedule page - List of Clinincs                                                                                                                      |
|--------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| Step number | Steps                                          | Expected Results                                                                                     | 
| :---------: |:----------------------------------------------:| :---------------------------------------------------------------------------------------------------:|
| 1           | Navigate to https://www.zoomcare.com/schedule  | *Schedule page should be shown                                                                       |
|             |                                                | *Zoomcare logo top-right, Schedule, Locations, Services, Pricing & Insurance links and Login button  |
|             |                                                |  should be visible.                                                                                  |
|             |                                                | *"Want care in X?" should be shown based on the location of the user.                                |
|             |                                                | *"Illness/Injury" and "Today" shown by default from a dropdown menu.                                 |
|             |                                                | *The buttons "Clinic Care", "VideoCare" and "ChatCare" are visible, "Clinic Care" button is selected.|
|             |                                                | *"Ilness/Injury Clinic visit title, followed by the "Info | $" link are visiblle.                    |
|             |                                                | *List of Clinics with available times, clicnic services and map link are visible.                    |
|             |                                                | *List of Clinics should contain 5 or less options - Other options are ihdden under the "Show More"   |
|             |                                                |  button.                                                                                             |
|             |                                                | *Right under the list of clinics, "Emergency Care" list should be visible followed by the "Info | $" |  |             |                                                |  link.                                                                                               |
| ----------- | ---------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| 2           | Press on "Want care in X?" and choose Denver   | *List of clinics in Denver should appear - If less then 5, "Show more" button should not be visible. |
|             |                                                | *Under "Emergency Care" the message "We're not in your area yet—but we're growing almost as fast     |
|             |                                                |  as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and      |
|             |                                                |  more." should be visible.                                                                           | 
| ----------- | ---------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| 3           | Press the "Info | $" Link next to the Clinic   |*The correct info should appear with the link "More info" that takes the user to the page             |
|             | Visit title                                    |  https://www.zoomcare.com/services/illness-injury-clinic-visit                                       |
| ----------- | ---------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| 4           | Repeat step 3 "Emergency Care" section         | *The correct info should appear with the link "More info" that takes the user to the page            |
|             |                                                | https://www.zoomcare.com/services/emergency-care                                                     |
| ----------- | ---------------------------------------------- | ---------------------------------------------------------------------------------------------------- |



# Automation Instructions
