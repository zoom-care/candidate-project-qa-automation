# Test Cases
| TestId | Test Desc                        | Steps                                                    | Expectations                                                                               |
|--------|----------------------------------|----------------------------------------------------------|--------------------------------------------------------------------------------------------|
| 1      | Load Main Page                   | open https://www.zoomcare.com/schedule in browser        | Page Loads Successfully with today's date showing appointment times after current time     |
| 2      | Select Appointment               | Select an Appointment Time                               | Brought to authentication screen to login                                                  |
| 3      | City Select                      | Click on City Dropdown                                   | Dropdown should show cities close to current location                                      |
| 4      | Filter by City                   | Select a new city for an illness injury appointment      | Appointment list should filter to new city selection                                       |
| 5      | Services Select                  | Click on Services Selection dropdown                     | Relevent services to the location are shown                                                |
| 6      | Filter by Services               | Select a new Service to filter the list by               | Only providers with the selected service is shown                                          |
| 7      | Date Select                      | Click on Date Selection Dropdown                         | Today date selected by default, only future dates selectable                               |
| 8      | Select new Date                  | Click on a future date for date selection                | appointment dates are changed to new selected date with times starting early               |
| 9      | Header links                     | Verify Header links                                      | Verify the destination of header links (Schedule, Locations, Services, Pricing) is correct |
| 10     | Authentication Link              | Click login from header and authenticate user            | User is logged in                                                                          |
| 11     | Create Authenticated Appointment | After login from header, choose a valid appointment time | An appointment for logged in user is created at the time selected                          |



# Automation

## Prerequisites
* A working node based javascript environment
    * Install node at https://nodejs.org/en/download
* A git client
  * Install a git client at https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

## Project Installation / Setup
* pull the latest git repository
```shell
git clone git@github.com:zoom-care/candidate-project-qa-automation.git
```
* Install NPM Packages
```shell
cd candidate-project-qa-automation
npm i
```
* Test cypress to verify installation
    * Project should open in browser
```shell
npx cypress open
```
* Execute cypress tests
```shell
npx cypress run
```
