Step #1 - Test Cases:


TESTCASE #1 - Filter Available Care By City and State
Preconditions:
Navigate to the ZoomCare Scheduling page: https://www.zoomcare.com/schedule
Once you have navigated to the page, open a dev tools window (right-click the page + Inspect) then navigate to the 
Network tab

Steps:
1 - From the Scheduling landing page, click the **Want Care In (YOUR CITY AND STATE)** button in the top-left of
the page

Expected Result:
Verify a drop-down list of cities and states populates below the button
Verify the available cities and states are:
Use My Location
Portland, OR
Seattle, WA
Vancouver, WA
Salem, OR
Eugene, OR
Denver, CO
Boulder, CO
Boise, ID

2 - Click **Portland, OR**

Expected Result: Verify the page updates and is now showing available care for Illness/Injury Clinic Visit in Portland,
OR
Verify the Clinic Care tab is selected at the top of the page
Verify an input field titled "Enter City or ZIP" populates below the cities and states list

-3 In your Network tab, navigate to the network call titled "Schedule" (there should be 2)
Click the Payload tab on the Schedule network call

Expected Result: 
Verify the city field in the Payload is set to Portland
Verify the state field in the Payload is set to OR

4 - Repeat steps 1 - 3 for each available city and state

Expected Result: Verify the page updates to show available care for Illness/Injury Clinic Visit in each selected city
and state


TESTCASE #2 - Filter Available Services
Preconditions:
Navigate to the ZoomCare Scheduling page: https://www.zoomcare.com/schedule

1- From the Scheduling landing page, click the **Want Care In (YOUR CITY AND STATE)** button in the top-left of
the page
Click **Portland, OR**

Expected Result:
Verify the page updates and is now showing Clinic Services in Portland OR
Verify the page is split in 2 sections -  Illness/Injury Clinic Visit and Emergency Care
Verify the Illness/Injury Clinic Visit section shows 5 available options and a Show More button

2 - Click the Show More button
Expected Result: Verify 5 more options populate in the list of care options
Verify the Show More button remains at the bottom of the results


-3 Click the VideoCare tab at the top of the page, to the left of the Clinic Care tab

Expected Result: Verify the page updates and the VideoCare tab is now selected
Verify each care option in the results shows a video camera icon on their avatar
Verify the results shows 5 available options and a Show More button

-4 Click the ChatCare tab at the top of the page, to the left of the VideoCare tab
Expected Result: Verify you are navigated to the ZoomCare login page

-5 Navigate back to the ZoomCare scheduling page with the hyperlink in the test preconditions
Expected Result: Verify the scheduling page is no longer showing care results
Verify the location is no longer set to Portland, OR and is set back to your current city and state


TESTCASE #3 - Available Care Types
Preconditions:
Navigate to the ZoomCare Scheduling page: https://www.zoomcare.com/schedule

1 - From the Scheduling landing page, click the **Want Care In (YOUR CITY AND STATE)** button in the top-left of
the page
Click **Portland, OR**
Click the **Illness/Injury** drop-down below the city and state button
Select the 5-Minute Flu Shot option

Expected Result: Verify the page updates and shows available care for Flu Shots in the Portland, OR area

2- Refresh your browser

Expected Result: Verify the page refreshes and remains filtered for Flu Shots

3- Click the **5-Minute Flu Shot** drop-down
Repeat steps 1 and 2 for each available care type: 
Adult COVID-19 Screening
Pediatric COVID-19 Screening
Primary Care
Sports Physical
Emergency Care
Family Medicine
Mental Health Meds & More
Mental Health Talk Therapy
X-Ray Ultrasound & CT
Dermatology
Women's Health (Gynecology)
Orthopedics
Podiatry
Chiropractic
Physical Therapy

Expected Result: Verify the scheduling page updates and shows available care for each of the care types as they are
selected
Verify when the page refreshes, the most recent selected care type persists on the scheduling page



TESTCASE #4 - Info and Pricing
Preconditions:
Navigate to the ZoomCare Scheduling page: https://www.zoomcare.com/schedule

1 - From the Scheduling landing page, click the **Want Care In (YOUR CITY AND STATE)** button in the top-left of
the page
Click **Portland, OR**
When the page updates to show results for Portland, OR, Click the ** Info | $ ** button in the top-right of the search 
results

Expected Result: Verify a modal appears below the **Info | $** button
Verify the Type of Visit section of the modal is listed as Clinic Visit

2 - Click **More Info**

Expected Result: Verify you are navigated to the ZoomCare Urgent Care Services: On-Demand Illness & Injury Care page
Verify the URL is showing as "zoomcare.com/services/illness-injury-clinic-visit"
Verify the available care results for Illness/Injury listed on the page match the results from the scheduling page

3 - Click **Schedule** in the top nav bar
When you are navigated back to the schedule page, scroll down to the Emergency Care options
Click **Info | $**
Click **More Info**

Expected Result: Verify you are navigated to the ZoomCare Super - An Affordable Emergency Room Alternative
Verify the URL is showing as "zoomcare.com/services/emergency-care"
Verify the available care results for Emergency Care listed on the page match the results from the scheduling page


TESTCASE #5 - Schedule an Appointment
Preconditions:
Navigate to the ZoomCare Scheduling page: https://www.zoomcare.com/schedule

1 - From the Scheduling landing page, click the **Want Care In (YOUR CITY AND STATE)** button in the top-left of
the page
Click **Portland, OR**

Expected Result: Verify the page updates to show available care in Portland, OR for Illness/Injury Clinic Visit
Verify each result in the list of available care shows 5 available times for today's date
Verify there is a **More** button on the right side of their available times

2 - Click **More** on one of the available care options

Expected Result: Verify more available times appear on the care option you selected for today's date
Verify the **More** button is now changed to **Less**

3 - Click **Less**
Expected Result: Verify the additional time slots disappear from the care option you selected and is returned to 
showing the first 5 available times for today's date


5 - Select any one of the available times listed for Melissa Woodyard, ND (If one is not available, it will show the
message "Whoops, looks like this one got away")

Expected Result:
Verify you are navigated to the ZooomCare Login page
Verify there is a Sign Up button and a Log In button

6 - Click the back arrow on your browser to navigate back to the scheduling page

Expected Result: Verify you are navigated back to the scheduling page
Verify a confirmation modal appears on the screen "You're almost there! Click "Continue" to complete your booking. If 
you leave the page now, you may lose this appointment time."

7 - Click **Cancel Booking**
Expected Result: Verify your appointment booking is successfully cancelled and you are navigated back to the scheduling
page
Verify the page is still filtered for Illness/Injury Clinic Visit for Portland, OR



Step #2 - Automation Test:

Preconditions: 
Clone this repository to your machine
Pull origin from the branch
Open the .py files in your recommended code editor (PyCharm)
Run each file in your code editor and watch the  browser window and console as the test runs for success and error messages





