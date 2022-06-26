@all
Feature:  Scheduling section

  Background:
    * Patient open the ZoomCare page and go schedule section

  @TestCase1
  Scenario:  Verify the items and drop down are presents
    When  Patient clicks on the DropDown
    Then  Patient Should see all the dropdown Options


  @TestCase2
  Scenario:  select specific location with zip code, choosing provide
  and checking the drop down
    Then Patient clicks on  Want Care ....?
    And Select Vancouver WA in location  Filed
    When  Patient clicks on the DropDown
    And Select Primary Care From The DropDown
    Then Choose any provider
    Then Patient Select the earliest time available
    Then Verify Patient Should be on the Login or Sign Up Page

  @TestCase3
  Scenario: User Select Video care and Sign up to book an appointment
    When Patient clicks on video care
    Then Choose any provider
    When Patient select second available time
    Then Patient should be on login page
    Then Patient clicks on go back to go back to previous page
    And  Are you sure? message should pops up and Patient  click cancel button
    Then Patient should be back on Scheduling page
