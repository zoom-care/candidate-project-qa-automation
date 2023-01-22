@Smoke
Feature: checking of schedule an appointment functionality


  Scenario: US3AC1: to verify user should be able to define clinic location in his/her area
  Description: user should be able to choose "USE MY LOCATION" to define clinic in his/her area.
    Given user on home page
    When user click on schedule module
    And user choose "Portland, OR" location
    And user choose "Use my location" option
    Then user see message "We're not in your area yet"


  Scenario:   US3AC2: to verify user able to see clinic location from given list
  Description: user should be able to choose clinic location manually in case if there is no location in user area.
    Given user on home page
    When user click on schedule module
    And click on clinic location module
    Then user see available clinic location
      | Portland, OR  |
      | Seattle, WA   |
      | Vancouver, WA |
      | Salem, OR     |
      | Eugene, OR    |
      | Denver, CO    |
      | Boulder, CO   |
      | Boise, ID     |




