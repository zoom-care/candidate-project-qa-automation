## Test Scenarios (for first time visitor)

1. Relevant location is auto-populated in "Want care in *(location)*?".
2. "in *(location)*" is clickable and expands to show nearby/available locations.
3. Clinics are shown below based on chosen location.
4. More care type selections and clinics are available in the dropdown.
5. Only option for appointments is "Today".
6. Available time slots are shown under each clinic.
7. If no slots are available for that day, the button shows when the next available is. Clicking that shows the available doctors and time slots for the next available day.
8. Choosing an available time slot takes you to the login page.
9. Navigating to another part of the site without confirming your reservation generates a prompt notifiying the user their chosen slot will be lost.

## Test environment setup and execution
(Test(s) were built using ChromeDriver and WebDriver, Version 97.0.4692.71.)

Steps:
1. Chrome needs to be installed, and the version needs be Version 97.0.4692.71 (if using the exe and DLLs I've included).
2. Enable Powershell script execution if needed (Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy Bypass).
3. Right-click and Run *First_Run.ps1* with Powershell. If errors happen, you may need to run it as administrator the first time.
4. Log files are located alongside each script, and are named the same.
