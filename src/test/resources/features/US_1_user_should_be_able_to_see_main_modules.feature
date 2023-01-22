@Smoke
Feature: as  user I should able to have access to four major modules on main page

  Scenario: US1AC1: to verify main modules presence
  Description: as user I should able to have access to four major modules on main page
    Given user on home page
    When use able to see main modules on home page
      | Schedule            |
      | Locations           |
      | Services            |
      | Pricing & Insurance |
    And user able to see "Login" button, it should be enable


  Scenario Outline: US1AC2: to verify if main modules clickable.
  Description: as user I should be able to click modules "Schedule", "Locations", "Services", "Pricing & Insurance", "Login"
    Given user on home page
    When user click "<module>"
    Then user see page related each module and title of pages contains "<module>" name
    Examples:
      | module              |
      | Schedule            |
      | Locations           |
      | Services            |
      | Pricing & Insurance |
      | Login               |
