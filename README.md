## Test Cases

| TC | Description | Prerequisites |      Steps     | Expected Results |
| -- | ----------- | ------------- | -------------- | ---------------- |
| T1 | Navigate menu with options: "Schedule", "Location", "Services", and "Pricing and Insurance" | User is not logged in | 1. Go to [zoomcare's schedule](https://www.zoomcare.com/schedule) page <br/> 2. Click on each option | Each menu should be clickable and take you to its corresponding page |
| T2 | Create an appointment for default location | User is not logged in  | 1. Click on "Illness/Injury" dropdown <br/> 2. Choose from the options displayed <br/> 3. Click on "Today" dropdown <br/> 4. Select a time slot | User should be taken to login page on slot selection |
| T3 | Create an appointment based on user's actual location | User is not logged in  | 1. Click on "Want care in [location]()?" <br/> 2. Choose "Use my location" from the options displayed <br/> 3. Allow location services for Zoomcare <br/> 4. Click on "Illness/Injury" dropdown <br/> 5. Choose from the options displayed 6. Click on "Today" dropdown <br/> 7. Select a time slot | User should be taken to login page on slot selection |
| T4 | Create an appointment for a listed location | User is not logged in  | 1. Click on "Want care in [location]()?" <br/> 2. Choose one of the cities listed from the options displayed <br/> 3. Click on "Illness/Injury" dropdown <br/> 4. Choose from the options displayed <br/> 5. Click on "Today" dropdown <br/> 6. Select a time slot | User should be taken to login page on slot selection |
| T5 | Create an appointment for an input city | User is not logged in  | 1. Click on "Want care in [location]()?" <br/> 2. Click on "Enter City or ZIP" from the options displayed <br/> 3. Enter a valid city name <br/> 4. Click on "Illness/Injury" dropdown <br/> 5. Choose from the options displayed 6. Click on "Today" dropdown <br/> 7. Select a time slot | User should be taken to login page on slot selection |
| T6 | Create an appointment for an input ZIP | User is not logged in  | 1. Click on "Want care in [location]()?" <br/> 2. Click on "Enter City or ZIP" from the options displayed <br/> 3. Enter a valid ZIP code <br/> 4. Click on "Illness/Injury" dropdown <br/> 5. Choose from the options displayed <br/> 6. Click on "Today" dropdown <br/> 7. Select a time slot | User should be taken to login page on slot selection |
| T7 | Start a ChatCare for Illness/Injury today | User is not logged in  | 1. Select a location <br/> 2. Click on ChatCare| User should be taken to login page |
| T8 | Request help | User is not logged in  | 1. Go to "Online Help" section <br/> 2. Click on "Send Us a Message" <br/>| "Send Us a Message" page should be displayed |
| T9 | Open Terms of Use | User is not logged in  | 1. Go to bottom of the page <br/> 2. Click on "Terms of Use" <br/>| "ZoomCare Website and App Terms of Use" page should be displayed |

## Automation Instructions

* Install [Visual Studio Code](https://code.visualstudio.com)
* Install [Playwright](https://playwright.dev/docs/intro#installing-playwright) (follow the instructions)
* Clone this repo
* Execute: npm install