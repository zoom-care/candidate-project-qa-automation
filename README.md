# ZoomCare Candidate Code Challenge - QA / Automation

>Note: My current location is outside of the US, so when I try to find any appointments I get an empty result, 
> regardless of the city I choose. I checked this using a VPN with an american IP, in that case everything works fine.
> Because of this, I could only run my tests up to visiting Schedule, changing cities, selecting care type and date.
> Everything after that is a theory that I _hope_ works close to fine. <br> Sol P. from Hexacta
 
## Test Cases 
| TC ID | TC Description                                    | Test Steps                                                                                                                                         | Test Data | Expected Results                                                                                                                                                                                                                           |
|-------|---------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|-----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| TC1   | Change appointment's location                     | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Click on location's link and choose from list displayed                                       |           | Location is changed to the chosen one                                                                                                                                                                                                      |
| TC2   | Select type of care for appointment               | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Click on 'Illness/Injury' dropwdown and choose type of care                                   |           | Selected 'Illness/Injury' will change to the chosen one                                                                                                                                                                                    |
| TC3   | Select date for appointment                       | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Click on 'Today' dropdown and choose date                                                     |           | Selected date will change to the chosen one                                                                                                                                                                                                |
| TC4   | Visualize search results and pricing info         | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Select type of care and date<br>4. Visualize title in search results and click on 'Info' icon |           | Search results will display a label title with the type of care selected before<br>Search results will display an 'Info\|$' icon in the title, when clicked it'll display info                                                             |
| TC5   | Visit caretaker's profile details                 | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Select type of care and date<br>4. Visit caretaker's profile details                          |           | Clicking on caretaker's name will open up a new tab with their profile<br>Clicking on caretaker's map button will open up a new Google Maps tab<br>Clicking on caretaker's 'Clinic Services' link will display a list of services provided |
| TC6   | Select caretaker's timeslot for appointment       | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Select type of care and date<br>4. Select caretaker's timeslot                                |           | Search results will display a list of caretakers<br>The caretaker will display at least one time slot available<br>Once clicked, it will redirect to the login page                                                                        |
| TC7   | Select Video Care format for Podiatry appointment | 1. Go to www.zoomcare.com<br>2. Go to Schedule<br>3. Select Podiatry and date<br>4. Select Video Care                                              |           | Before the search results are shown, a 'Video Care' button will be displayed<br>Clicking on it will filter search results that support that format                                                                                         |

## Automation Instructions
### Prerequisites
- Install [Python](https://www.python.org/)
- Install [pip](https://pip.pypa.io/en/stable/installing/) (it might have been already installed in the previous step)
- Install [PyCharm](https://www.jetbrains.com/es-es/pycharm/download/)
- In Windows, edit system's Environment Variables
  - Variable `Path` with value of where Python was installed, e.g. `C:/Python39`
  - Variable `Path` with value of Python's Scripts folder, e.g. `C:/Python39/Scripts`
- Download [ChromeDriver](https://chromedriver.chromium.org/)
  - Unzip file `chromedriver.exe` and copy paste it in new folder `C:/chromedriver`
  > Keep in mind: ChromeDriver's selected version must be compatible with Chrome browser's installed version.
  - In Windows, edit system's Environment Variables
    - Variable `Path` with value `C:/chromedriver` (the value here has to be the path for the folder containing chromedriver.exe)

### Installing dependencies
After cloning the repository, go to the project folder, open CMD and execute the following:
```sh
$ pip install -r requirements.txt
```
This command can also be executed from PyCharm's terminal.

### Setting up interpreter and virtual environment
- After cloning the repository and installing the dependencies, open PyCharm and go to File > Settings
- Find section Project: <project_name> and go to Project Interpreter
- Click on gear button and click on `Add`
- In 'Virtual Environment' section select `New environment` and click OK

### Executing tests
To run the tests, you can use the Run menu from PyCharm and select the only `.feature` file created.
You can also open the `schedule_appointment.feature` file and click on the green double arrow icon on the left.
