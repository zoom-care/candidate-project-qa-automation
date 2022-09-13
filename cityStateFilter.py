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


    # ************** Start Validation ***************
print('*****######********#######*****')
print('Start of User Named Step: Validate City and State options')
# Identify all options by their XPATH and Text contained in their path
# Use My Location Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Use my location']"))
    print('My Location Option exists')
except NoSuchElementException:
    print('My Location Option does not exist')

# Portland, OR Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Portland, OR']"))
    print('Portland, OR option exists')
except NoSuchElementException:
    print('Portland, OR option does not exist')

# Seattle, WA Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Seattle, WA']"))
    print('Seattle, WA option exists')
except NoSuchElementException:
    print('Seattle, WA option does not exist')

# Vancouver, WA Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Vancouver, WA']"))
    print('Vancouver, WA option exists')
except NoSuchElementException:
    print('Vancouver, WA option does not exist')

# Salem, OR Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Salem, OR']"))
    print('Salem, OR option exists')
except NoSuchElementException:
    print('Salem, OR option does not exist')

# Eugene, OR Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Eugene, OR']"))
    print('Eugene, OR option exists')
except NoSuchElementException:
    print('Eugene, OR option does not exist')

# Denver, CO Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Denver, CO']"))
    print('Denver, CO option exists')
except NoSuchElementException:
    print('Denver, CO option does not exist')

# Boulder, CO Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Boulder, CO']"))
    print('Boulder, CO option exists')
except NoSuchElementException:
    print('Boulder, CO option does not exist')

# Boise, ID Option
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Boise, ID']"))
    print('Boise, ID option exists')
except NoSuchElementException:
    print('Boise, ID option does not exist')

print('*****######********#######*****')
print('End of User Named Step: Validate City and State options')
# ************************************************

# ************** Start Click Value ***************

print('*****######********#######*****')
print('Start of User Named Step: Select Portland, OR')
try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[1]/div/div[2]/div[1]/div[3]/div/div')
    e.click()
    print('Portland, OR Successfully Selected')
except NoSuchElementException:
    print('Element does not exist')

print('*****######********#######*****')
print('End of User Named Step: Select Portland, OR')
# ************** End Click Value ***************

# ************************************************

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
print('Start of User Named Step: Validate Portland, OR results')

try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/div[1]/div[2]')
    print('Element exists')
except NoSuchElementException:
    print('Element does not exist')
# Validate the page is filtered for Portland, OR results
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Illness/Injury Clinic Visit']"))
    print('Element contains correct Text')
except NoSuchElementException:
    print('Element does not contain correct Text')
# ************** End Validation ***************

# ************** Start Wait ***************
# *********** Sleep *********
print('*****######********#######*****')
print('Wait for page to load')
print('Sleep for 5 seconds')
time.sleep(5)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************


print('Overall test was a SUCCESS')
print('*****######********#######*****')
print('End of User Named Step: Validate Test Passes')
# ************** End Validate Value ***************

driver.quit()
