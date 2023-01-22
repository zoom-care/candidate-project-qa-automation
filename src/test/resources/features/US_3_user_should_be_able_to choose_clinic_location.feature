@Smoke
Feature: US 3 user should be able to define clinic location
  1 AC: user should be able to choose "USE MY LOCATION" to define clinic
  2 AC: user should be able to choose clinic location manually in case if there is no location in user area


  Scenario: 1 AC: user should be able to choose "USE MY LOCATION" to define clinic
    Given user on home page
    When user click on schedule module
    And user choose "Portland, OR" location
    And user choose "Use my location" option
    Then user see message "We're not in your area yet"


  Scenario:   2 AC: user should be able to choose clinic location manually in case if there is no location in user area
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




