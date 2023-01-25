Feature: Error message verification

@smoke
Scenario: Verify that the error message appears when submit unavailable date

Given User is on the landing page
When  User selects "Vancouver, WA" from location dropdown
And   User selects "Primary Care" from services dropdown
And   User selects first available date from the calendar
Then  "The selected day is not available." message should appear if date is unavailable
