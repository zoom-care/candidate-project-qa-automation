@smoke
Feature: As a user, I should be able to schedule an appointment
Background:
  Given user lands on schedule page

 Scenario: User only makes an emergencyCare schedule with Today calender day

   When User clicks on location dropdown
   When User clicks on "Portland, OR" for location
   And User clicks on "Emergency Care" from service
   Then Calender picks Today automatically
   And User clicks on Search button and lands on time box page

###   negative test
  Scenario: User is out of area should get warning message

    When User clicks on location dropdown
    When User clicks on use my location from location options
    Then User should see warning message

    Scenario: User makes an Primary Care schedule

      And User clicks on "Primary Care" from service
      And User clicks on choose date
      And User clicks on Search button and lands on Primary Care page
      And User clicks on first available time
      And User lands on Login Page

  Scenario: User makes X-Ray, Ultrasound & CT schedule

    When User clicks on location dropdown
    When User clicks on "Portland, OR" for location
    And User clicks on "X-Ray, Ultrasound & CT" from service
    And User clicks on choose date
    And User clicks on Search button
    Then User sees xray warning message
    And User clicks on Illness Injury Visit link
    And User clicks on map link and verifies map is opened
    And User clicks on first time slot

  Scenario: User selects 5-Minute Flu Shot schedule and checks price
    When User clicks on location dropdown
    When User clicks on "Portland, OR" for location
    And User clicks on "5-Minute Flu Shot" from service
    And User clicks on choose date
    And User clicks on Search button
    And User clicks on price Info
    Then User verifies the price

  Scenario Outline: User sees Emergency Care when Illness Injury is selected
    When User clicks on location dropdown
    When User clicks on "<location>" for location dropdown
    And User clicks on service dropdown
    And User clicks on "Illness Injury" from service
    And User clicks on choose date
    And User clicks on Search button
    Then User should see Emergency Care info on the bottom of the page

    Examples:

    |location |
    |Seattle, WA|
    |Vancouver, WA|
    |Salem, OR|
    |Eugene, OR|
    |Denver, CO|
    |Boulder, CO|
    |Boise, ID|

  Scenario Outline: User makes Video Care schedule
    When User clicks on location dropdown
    When User clicks on "<location>" for location dropdown
    And User clicks on service dropdown
    And User clicks on "Illness Injury" from service
    And User clicks on choose date
    And User clicks on Search button
    Then User should click "VideoCare"
    Then User verifies "informational text" on the screen

    Examples:

      |location |
      |Seattle, WA|
      |Salem, OR|
      |Boise, ID|
      |Denver, CO|

  Scenario: Page results related with service
    And User verifies all doctors are related with service


