Feature: Search functionality verification

@smoke
Scenario: Verify if search box is working as expected

Given User is on the landing page
When  User selects "Seattle, WA" from dropdown menu
And   User selects "Mental Health Meds & More" service from dropdown menu
And   User selects a first available date from dates dropdown menu
Then  User is able to click search button
