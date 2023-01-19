@Test
Feature: Schedule | ZoomCare

  Scenario: 01 - Go to Schedule and verify navigation elements
    When Go to Schedule page
    And Wait until the page is successfully loaded
    Then Verify if is displayed the element
      | Schedule Menu            |
      | Locations Menu           |
      | Services Menu            |
      | Pricing & Insurance Menu |
      | Login Button             |
    And Verify if the element is enabled
      | Schedule Menu            |
      | Locations Menu           |
      | Services Menu            |
      | Pricing & Insurance Menu |
      | Login Button             |

  Scenario: 02 - Go to Schedule and verify search elements
    When Go to Schedule page
    And Wait until the page is successfully loaded
    Then Verify if is displayed the element
      | City Selector    |
      | Service Selector |
      | Date Picker      |
      | Search Button    |
    Then Verify if the element is enabled
      | City Selector    |
      | Service Selector |
      | Date Picker      |
      | Search Button    |

  Scenario: 03 - Verify cities displayed in selector from API
    When Go to Schedule page
    And Wait until the page is successfully loaded
    And Click on "City Selector"
    And Get list of the cities from the API
    Then Verify the cities are from the API
