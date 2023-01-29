# ZoomCare Candidate Code Challenge - QA / Automation

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

# Section 1: Smoke Test Cases

1. Verify that **Search Clinics** displays the correct information in service line section
2. Verify **Clinic, Clinic Services and Provider Details** options show the correct information
3. Verify a **Selected Location** filters and shows the list of available services
4. Verify **Empty State** message is displayed when selected days does not get results
5. Verify **You're almost there modal** displays when getting back from Login Page
6. Verify **Load More** option shows other 5 results
7. Verify **Load Slots** shows other available options to schedule an appointment
8. Verify **Emergency Care** service does not load the calendar
9. Verify **Service info** tooltip displays its detailed information

# Section 2: Automation Instructions.

## Getting Started

This project implements some tests to the following applications.

We implemented e2e tests using Cypress to verify the Search/Schedule Moment functionality in https://www.zoomcare.com/schedule

## Prerequisites 🛠

The only requirement for this project is to have Node.js version 14 or above installed on your machine.

## Instalation 🔌

Before starting to run the test:

1. Clone the repo
   ```sh
   git clone https://github.com/LuigiAble/candidate-project-qa-automation.git
   ```
2. Install NPM packages
   ```sh
   npm install
   ```

## Running tests 🚀

In order to run the tests, you can use the following commands:

**Cypress e2e Tests**

`Using Cypress Dasboard`

```sh
npm test
```

`Using Chrome Headless Mode`

```sh
npm run cy:e2e:chrome
```

## Reporting 📈

This project uses `cypress-mochawesome-reporter` that can be found in `cypress/reports` and in `Github jobs artifacts`.
