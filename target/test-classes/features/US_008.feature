@smoke_testing
@US_008
Feature:Confirmation_button
  Scenario:tc_008

    Given user gets on the schedule page
    And user clicks on the loginButton
    And user clicks on the signup button
    And user inputs username and password
    And user place firstname lastname Mobilenumber Address zip birthday Gender
    Then user verifies does this look right sign

       #Does page have following sign "Does this look right ?"
       # information after placing multiple signup information
