@Smoke
Feature: checking of schedule an appointment functionality

  Scenario: US2AC1: to verify user should be able to schedule an appointment.
  Description: as user I should be able to click "choose location" of clinic, "choose Service", "choose Date", click " Search" button and see list of availabilities (random data).
    Given user on home page
    When user click on schedule module
    And user choose clinic location
    And user choose service
    And user choose available date
    And user click on search button
    Then use should able to see list of availabilities and defined date


  Scenario Outline: US2AC2: to verify that the user cannot determine the date if the service has not been specified
  Description: if user did not choose specific service "Choose Date" dropdown should be disabled. If user click on it "Please choose a service" text appear.

    Given user on home page
    When user click on schedule module
    And user choose "<Clinic location>" dropdown
    And user click on choose date
    Then user see "Please choose a service", search button disabled
    Examples:
      | Clinic location |
      | Portland, OR    |
      | Seattle, WA     |
      | Vancouver, WA   |
      | Salem, OR       |
      | Eugene, OR      |
      | Denver, CO      |
      | Boulder, CO     |
      | Boise, ID       |

Scenario Outline: US2AC3: to verify list of services for each clinic
Description: as user I should be able to see list of services for clinic (two point verification).
  Given user on home page
  When user click on schedule module
  And user choose "<Clinic location>" dropdown
  And user click choose service
  Then user see list of services for clinic
  And list of services should match with list of services from database
  Examples:
    | Clinic location |
    | Portland, OR    |
    | Seattle, WA     |
    | Vancouver, WA   |
    | Salem, OR       |
    | Eugene, OR      |
    | Denver, CO      |
    | Boulder, CO     |
    | Boise, ID       |
