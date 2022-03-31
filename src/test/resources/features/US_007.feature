@smoke_testing
@US_007
Feature:Verifying the Accepted insurers
  Scenario:tc_007
    Given user gets on the schedule page
    And user clicks on the dollar sign
    And user clicks on the More Info
    And user clicks on the See Accepted Insurance
    Then user verifies Yes_ZoomCARE_Insurance

# Does page have the full list of the insurances
