# ZoomCare Candidate Code Challenge - QA / Automation
# Submission by Scott Loftesness

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

### Part 1

1. Verify Login (Negative):
   - Open the scheduling page (https://www.zoomcare.com/schedule).
   - Verify that the page loads without errors, and click log in button.
   - Attempt log in with bad credentials.
   - Acceptance Criteria: Log in should fail, and a notice of failed log in should appear.

2. Search Availability:
   - Select a specific date and time in the scheduler.
   - Acceptance Criteria: The scheduler should allow users to select a date and time slot.

3. Navigate Back and Forth:
   - Select a future date and navigate to the next week's schedule.
   - Then navigate back to the current week's schedule.
   - Acceptance Criteria: The scheduler should allow users to navigate between weeks.

4. Location:
   - Choose a different location from the location dropdown.
   - Verify that the displayed schedule corresponds to the selected location.
   - Acceptance Criteria: The scheduler should display the schedule based on the selected location.

5. Check Appointment Details:
   - Click on an available time slot.
   - Verify that a login screen appears for unauthenticated users.
   - Acceptance Criteria: Clicking an available time slot should prompt unauthenticated users to log in.

6. Verify Links:
   - Check links within the scheduling page, like "Contact Us" or "Learn More."
   - Acceptance Criteria: Links should open the expected pages in a new tab or window.

7. Search for Specific Service:
   - Search for a specific type of service (e.g., "flu shot") using the search bar.
   - Verify that relevant results are displayed in the scheduler.
   - Acceptance Criteria: The search bar should return relevant results from the scheduler.

8. Check Responsiveness:
   - Open the scheduling page on different devices (desktop, tablet, mobile).
   - Verify that the scheduler is responsive and adjusts correctly.
   - Acceptance Criteria: The scheduler should be usable and visually appealing on all devices.

9. Verify Language Selection:
   - Change the language preference (if available) using language options.
   - Verify that the content updates to the selected language.
   - Acceptance Criteria: Changing the language should update the scheduler content.

10. Test Appointment Reminders:
    - After selecting a time slot, note the appointment time.
    - Leave the page and return later, close to the appointment time.
    - Verify if any appointment reminders are shown.
    - Acceptance Criteria: Appointment reminders should be displayed close to the scheduled time.
