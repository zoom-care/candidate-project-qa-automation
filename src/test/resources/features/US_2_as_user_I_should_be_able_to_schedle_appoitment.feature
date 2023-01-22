@Smoke
Feature: as user I should be able to schedule an appointment
  1 AC:
  - as user I should be able to choose "Location" of clinic, choose Service, choose Date, "Search" button is enable (random data).
  2 AC:
  -  if user did not choose specific Service "Choose Date" dropdown should be disabled, if user click on it "Please choose a service" text appear, search button disabled.
  3 AC:
  - as user I should be able to see list of services for each clinic (two point verification).


  Scenario: 1 AC: as user I should be able to choose "Location" of clinic, "Choose Service", "Choose Date", "Search" button is enable (random data)
    Given user on home page
    When user click on schedule module
    And user choose clinic location
    And user choose service
    And user choose available date
    And user click on search button
    Then use should able to see list of availabilities and defined date


  Scenario Outline: 2 AC: if user did not choose specific Service "Choose Date" dropdown should be disabled
  if user did not choose specific Service "Choose Date" dropdown should be disabled, if user click on it "Please choose a service" text appear

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

Scenario Outline: 3 AC as user I should be able to see list of services for each clinic
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
