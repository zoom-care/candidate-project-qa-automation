# ZoomCare Candidate Code Challenge - QA / Automation

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

##  Test Cases

1. select an appointment location, choose service, date and refresh button
2. select a type of care for an appointment, choose date and refresh button
3. select a clinic type of care and a timeslot -> see login page (url) https://www.zoomcare.com/login
4. select the next available date for an appointment and search
5. select a video type of care and a timeslot -> see login page (url) https://www.zoomcare.com/login
6. select chat-care -> see login page (url) https://okta-prod.zoomcare.com/
7. check info and price for a service -> popover
8. select map to see location -> Google Maps location page will be open

Type of care selection can be easy automatized to check every option for a regression test suite.

### Acceptance Criteria:
#### Examples of possible acceptance criteria for Schedule page:
- Given a list of doctors, it will be possible to choose only one timeslot at the time.
- Given a location, only doctors of the selected zone will be available (default location depends on IP address when on the list or Portland when it's not).
- Given a certain date, only available doctors will be shown.

## Automation Instructions
### Prerequisites
Once the repository is cloned locally:
- Install Python (https://www.python.org/downloads/) used release: 3.10.5
- Install Pycharm as code editor (https://www.jetbrains.com/pycharm/download)
Version: 2022.2
Build: 222.3345.131
- Install Pytest - used pytest 7.1.2 
  ```
  pip install pytest
  ```
- Install Selenium (https://selenium-python.readthedocs.io/installation.html)
- Install the virtual environment
  ```
  pip install virtualenv
  ```
- Download [ChromeDriver](https://chromedriver.chromium.org/) Version used: 103.0.5060.134



### Installing dependencies
- After cloning the repository, go to the project folder, open CMD or Terminal and execute the following:
  ```
  pip install -r requirements.txt
  ```

### Setting up interpreter on Pycharm and virtual environment
- After cloning the repository and installing the dependencies, open PyCharm and go to File > Settings
- Find section Project: <project_name> and go to Project Interpreter
- Click on gear button and click on `Add`
- In 'Virtual Environment' section select `New environment` and click OK


#### On Windows:

- Edit system's Environment Variables
  - Variable `Path` with value of where Python was installed, e.g. `C:/Python39`
  - Variable `Path` with value of Python's Scripts folder, e.g. `C:/Python39/Scripts`
- Unzip file `chromedriver.exe` and copy and paste it in new folder `C:/chromedriver`
  > ChromeDriver's version must be compatible with Chrome browser's installed version.
- Edit system's Environment Variables
  - Variable `Path` with value `C:/chromedriver` (the value here has to be the path for the folder containing chromedriver.exe)
- Other drivers: [Mozilla Firefox](https://github.com/mozilla/geckodriver/releases)
- Activate the virtual environment
  ```
  venv\Scripts\activate
  ```
- Run a Smoke test
  ```
  pytest -s .\tests\test_schedule.py
  ```

#### On Linux (tested on Linux Mint):
- Activate the virtual environment
  ```
  source venv/bin/activate
  ```
- Run a Smoke test
  ```
  pytest -s tests/test_schedule.py --log-cli-level=INFO
  ```


> Outside US or Canada it is not possible to see anything on the Schedule page (such as doctors, date/time or type of care)<br>
> Test scripts were created looking at the Schedule page using an online VPN service, but it was not possible to test it with it.
