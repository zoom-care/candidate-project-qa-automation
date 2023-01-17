# ZoomCare Candidate Code Challenge - QA / Automation

Test cases:

### Part 1

1. Verify the flow to start scheduling on the main page.
Once the user is on the landing page and he provides the locations and area needed, the option to "Scheduele now" should be enabled and once the user clicks on that.. The user will land on the: https://www.zoomcare.com/schedule with the details provided before.

2. Verify the scheduling option (Main functionality):
Choose a location, an area and a date, then the button "refresh" should be enabled and once the user clicks on that, it should show a list result.

3. Verify all the doctors on the list result are from the location selected. Check everyone matching the location selected before.

4. Verify the behavior for the button "More" on the slot time. Once the user clicks on that, there should be more dates available and the button "Less" is displayed at the end.

5. Verify all the time slots follow the user to the next stage. (Login Page screen).

6. Verify the corrected flow on the detial´s doctor. Given the users wants to know more details about the doctor and the user wants to go back to the previous page then the user should be able to go back to the previous page and this page should remain the options selected previously. 

7. Verify when the user clicks on the "chatCare" option, the user should be lead to the: 

8. Verify when the user clicks on the "VideoCare", the user user should get a list for video chat options.

9. Verify when the user clicks on the date, and then select the day after today, the option for date 
changes for "Tomorrow" and once the user clikcs on refresh, all the list should display the proper date (tomorrow).

### Part 2

Take at least three cases that you've written in Part 1, and propose how they would transfer into an automated test by coding/scripting them with a framework and/or tool. Use whatever you're comfortable with (Selenium, Cypress, etc.), and you can write in any programming/scripting language you choose.

What we're looking for:
- Verifying you can write code and/or script well (knowledge of built-in functions for your chosen language, good organization of classes/functions, reasonable use of comments, etc.)
- You have a clear vision for how to automate (using POM or Screenplay methodology, BDD or TDD best practices, etc.)
- You know how to get the results you need (knowledge of the framework(s) and libraries chosen, and using their functionality appropriately)
- Working code is good. Pretty working code is better. Fast, pretty, working code is best.
