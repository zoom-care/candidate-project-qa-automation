@smoke_testing
@US_002
Feature:Video_Care_tab
  Scenario Outline: tc_002

    Given User will navigate to the schedule page
    And when users click on the ChatCare
    And user should be able to redirect to the Log in page
    And user sends "<email>" and "<password>"
    Then user verifies unable to sign in information


    Examples:
      |email|password|
      |abc@gmail.com |123mazda|

    #using DDT to test with the fake email and password if they work properly within the system
    #user should verifies the "Unable to sign in" information from the page
