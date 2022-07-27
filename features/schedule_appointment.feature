Feature: Search for an appointment and navigate through the results
  As an unauthenticated guest I want to land in the Schedule page
  As an unauthenticated guest I want to set a location
  As an unauthenticated guest I want to choose the type of care I need for my appointment
  As an unauthenticated guest I want to choose a date to schedule my appointment
  As an unauthenticated guest I want to choose a caretaker's timeslot

@test
Scenario: Visit the Schedule page and choose an appointment
  Given the unauthenticated guest is in the Home page
  When the unauthenticated guest clicks on Schedule
  And the unauthenticated guest sets a location
  And the unauthenticated guest sets the type of care and date for the appointment
  And the unauthenticated guest chooses a caretaker timeslot
  Then the unauthenticated guest is redirected to log in