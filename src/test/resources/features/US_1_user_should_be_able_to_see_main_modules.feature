@Smoke
Feature: as  user I should able to have access to four major modules on main page

  Scenario: main modules presence checking
  1 AC:
  as user I should be able to see and use modules on main home page "Schedule", "Location", "Services", "Pricing & Insurance" and "Login" button
    Given user on home page
    When use able to see main modules on home page
      | Schedule            |
      | Locations           |
      | Services            |
      | Pricing & Insurance |
    And user able to see "Login" button, it should be enable


  Scenario Outline: main modules clickability checking
  as user I should be able to click modules "Schedule", "Locations", "Services", "Pricing & Insurance", "Login" on home page should be clickable

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
