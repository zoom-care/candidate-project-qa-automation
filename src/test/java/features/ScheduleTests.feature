Feature: Daily smoke test for ZoomCare Schedule page

  Scenario: 02 - All top banner links are working
    Given User is on schedule page
    When User is able to see all banner links
    And The links on the banner have working URLS
    Then User clicks each banner link and visits correct page

  Scenario Outline: 03 - Schedule an appointment with Clinic Care
    Given User is on schedule page
    And User is able to see services
    When User selects location "<city>"
    And User selects service "<service>"
    And User selects next available date
    And User clicks the search button
    Then Care options are listed
    And User selects next available time
    Then User is taken to the login page
    Examples:
      | city    | service |
      | seattle | illness |

  Scenario Outline: 07 - Verify video care is not an option for some services
    Given User is on schedule page
    And User is able to see services
    When User selects location "<city>"
    And User selects service "<service>"
    And User selects next available date
    And User clicks the search button
    And User is able to see services
    Then Video Care button is not present
    And Clinic Care button is not present
    Examples:
      | city     | service |
      | portland | covid   |

  Scenario Outline: 09 - Service is reset after user decides to change their location
    Given User is on schedule page
    And User is able to see services
    When User selects location "<firstCity>"
    And User selects service "<service>"
    And User selects location "<secondCity>"
    Then Services are reset
    Examples:
      | firstCity | service | secondCity |
      | eugene    | primary | boise      |