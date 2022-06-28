# Documentation

## Test Cases
1. Select Clinic Care Option and Today where user has not logged in and location is automatically set
2. Select Video Care Option and Today where user has not logged in and location is automatically set
3. Select Chat Care Option and Today where user has not logged in and location is automatically set
4. Select Clinic Care Option and specific date where user has not logged in and location is automatically set
5. Select Clinic Care Option and Today where user has not logged in and choose location from the list
6. Select Video Care Option and Today where user has not logged in and choose location from the list
7. Select Chat Care Option and Today where user has not logged in and choose location from the list
8. Select Clinic Care Option and Today where user has not logged in and enter location manually
9. Select Video Care Option and Today where user has not logged in and enter location manually
10. Select Chat Care Option and Today where user has not logged in and enter location manually

## Automation Instructions
Note: PyCharm is required as a code editor
Once the repository is cloned:
1. Add interpreter (using Python 3.10). This create a virtual environment .
2. Install Pytest (v 7.1.2) and Selenium (v 4.3.0) using the Python Packages tab or interpreter settings.
3. Visit the site https://chromedriver.chromium.org/ and download Latest stable release according to the Operating System and other system features.
4. Unzip the file and place it in config/drivers/
5. Run the test cases in terminal: ```pytest -s -v tests --browser chrome --log-cli-level=INFO```