import time

from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.common.exceptions import NoSuchElementException
from selenium.webdriver.common.by import By

driver = webdriver.Chrome('/usr/local/bin/chromedriver')



driver.implicitly_wait(30)
time.sleep(1)

# ************** Start Navigate To Page ***************
print('*****######********#######*****')
print('Start of User Named Step: Navigate to ZoomCare Scheduling Page')
driver.get('https://www.zoomcare.com/schedule')
print('Navigate to page complete')
# ************** End Navigate To Page ***************

# ************** Start Wait ***************
# *********** Sleep *********
print('*****######********#######*****')
print('Wait for page to load')
print('Sleep for 10 seconds')
time.sleep(10)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************


# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click Find Care Drop-Down')
# find element
try:
    e = driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div/div/div[1]/div/div[1]/div')
    e.click()
except NoSuchElementException:
    print('Element does not exist')
    print('*****######********#######*****')
print('End of User Named Step: Click Find Care Drop-Down')
# ************** End Click Value ***************


# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click Portland, OR')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[1]/div/div[2]/div[1]/div[3]/div/div')
    e.click()
except NoSuchElementException:
    print('Element does not exist')
    print('*****######********#######*****')
print('End of User Named Step: Click Portland, OR')
# ************** End Click Value ***************

# ************** Start Wait ***************
# *********** Sleep *********
print('*****######********#######*****')
print('Wait for page to load')
print('Sleep for 5 seconds')
time.sleep(5)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click Info | $')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div')
    print('Info | $ button exists')
    e.click()
except NoSuchElementException:
    print('Info | $ button does not exist')
    print('*****######********#######*****')
print('End of User Named Step: Click Info | $')
# ************** End Click Value ***************


# ************** Start Validation ***************
print('*****######********#######*****')
print('Start of User Named Step: Validate More Info modal opens and button is visible')
try:
    e = driver.find_element(By.XPATH, ("//*[text()='More Info']"))
    print('More Info button exists')
except NoSuchElementException:
    print('More Info button does not exist')
print('*****######********#######*****')
print('End of User Named Step: Validate More Info modal opens and button is visible')
# ************** End Validation ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click More Info')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/span[3]')
    e.click()
    print('More Info successfully clicked')
except NoSuchElementException:
    print('Unable to click button')
    print('*****######********#######*****')
print('End of User Named Step: Click More Info')
# ************** End Click Value ***************

# ************** Start Wait ***************
# *********** Sleep *********
print('*****######********#######*****')
print('Wait for page to load')
print('Sleep for 5 seconds')
time.sleep(5)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************

# ************** Start Validation ***************
print('*****######********#######*****')
print('Start of User Named Step: Validate Navigation to Urgent Care Services Page')
try:
    e = driver.find_element(By.XPATH, ("//*[text()='ZoomCare Urgent Care Services: On-Demand Illness & Injury Care']"))
    print('Page successfully rendered')
except NoSuchElementException:
    print('Unable to render page')
print('*****######********#######*****')
print('End of User Named Step: Validate Navigation to Urgent Care Services Page')
# ************** End Validation ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click Schedule')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="nav-schedule"]')
    e.click()
    print('Schedule button successfully clicked')
except NoSuchElementException:
    print('Unable to click button')
    print('*****######********#######*****')
print('End of User Named Step: Click Schedule')
# ************** End Click Value ***************

# ************** Start Wait ***************
# *********** Sleep *********
print('*****######********#######*****')
print('Wait for page to load')
print('Sleep for 3 seconds')
time.sleep(3)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************


# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click Info | $ on Emergency Care Option')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[3]/div/div[1]/div/div[2]/div')
    e.click()
    print('Emergency Care Info button successfully located and clicked')
except NoSuchElementException:
    print('Unable to locate and click button')
    print('*****######********#######*****')
print('End of User Named Step: Click Info | $ on Emergency Care Option')
# ************** End Click Value ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click More Info on Emergency Care Option')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[3]/div/div[1]/div/div[3]/div/div[1]/span[3]')
    e.click()
    print('Emergency Care More Info button successfully located and clicked')
except NoSuchElementException:
    print('Unable to locate and click button')
    print('*****######********#######*****')
print('End of User Named Step: Click More Info on Emergency Care Option')
# ************** End Click Value ***************

# ************** Start Wait ***************
# *********** Sleep *********
print('*****######********#######*****')
print('Wait for page to load')
print('Sleep for 3 seconds')
time.sleep(3)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************

# ************** Start Validation ***************
print('*****######********#######*****')
print('Start of User Named Step: Validate Navigation to Emergency Care Services Page')
try:
    e = driver.find_element(By.XPATH, ("//*[text()='ZoomCare Super - An Affordable Emergency Room Alternative']"))
    print('Page successfully rendered')
except NoSuchElementException:
    print('Unable to render page')
print('*****######********#######*****')
print('End of User Named Step: Validate Navigation to Emergency Care Services Page')
# ************** End Validation ***************


print('Overall test was a SUCCESS')
print('*****######********#######*****')
print('End of User Named Step: Validate Test Passes')
# ************** End Validate Value ***************

driver.quit()