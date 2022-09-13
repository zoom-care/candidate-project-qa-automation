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
print('Sleep for 3 seconds')
time.sleep(3)
print('Wait for page to load complete')
print('*****######********#######*****')
# ************** End Wait ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click More')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="undefined-ServiceLine.1.Clinic.2.Provider.1.TimeSlot.moreButton"]')
    e.click()
except NoSuchElementException:
    print('Element does not exist')
    print('*****######********#######*****')
print('Start of User Named Step: Click More')
    # ************** End Click Value ***************

# ************** Start Validation ***************
print('*****######********#######*****')
print('Start of User Named Step: Validate More time slots appear')

try:
    e = driver.find_element(By.XPATH, '//*[@id="undefined-ServiceLine.1.Clinic.2.Provider.1.TimeSlot.lessButton"]')
    print('Element exists')
except NoSuchElementException:
    print('Element does not exist')
# Validate the page is shows the Less button
try:
    e = driver.find_element(By.XPATH, ("//*[text()='Less']"))
    print('Element contains correct Text')
except NoSuchElementException:
    print('Element does not contain correct Text')
# ************** End Validation ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Click Less')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="undefined-ServiceLine.1.Clinic.2.Provider.1.TimeSlot.lessButton"]')
    e.click()
    print('successfully clicked Less')
except NoSuchElementException:
    print('Element does not exist')
    print('*****######********#######*****')
print('Start of User Named Step: Click Less')
    # ************** End Click Value ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Schedule Appointment')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1-1663101900000"]/div')
    e.click()
    print('successfully clicked appointment time')
except NoSuchElementException:
    print('Element does not exist')
    print('*****######********#######*****')
print('Start of User Named Step: Schedule Appointment')
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
print('Start of User Named Step: Validate Log In screen appears')

try:
    e = driver.find_element(By.XPATH, '//*[@id="react-mount-page-content"]/div/div/div/div[1]/div[1]/div[1]')
    print('Login Modal exists')
except NoSuchElementException:
    print('Login Modal does not exist')
try:
    e = driver.find_element(By.XPATH, ("//*[text()='New to ZoomCare?']"))
    print('Element contains correct Text')
except NoSuchElementException:
    print('Element does not contain correct Text')

print('End of User Named Step: Validate Log In screen appears')
# ************** End Validation ***************


# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Cancel Scheduling')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="nav-schedule"]')
    e.click()
    print('successfully navigated back to scheduling page')
except NoSuchElementException:
    print('Unable to cancel scheduling')
    print('*****######********#######*****')
print('End of User Named Step: Cancel Scheduling')
    # ************** End Click Value ***************

# ************** Start Click Value ***************
print('*****######********#######*****')
print('Start of User Named Step: Confirm Cancel Scheduling')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="undefined-pretty-alert-button-Cancel Booking"]/div')
    e.click()
    print('successfully cancelled scheduling')
except NoSuchElementException:
    print('Unable to cancel scheduling')
    print('*****######********#######*****')
print('Start of User Named Step: Confirm Cancel Scheduling')
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
print('Start of User Named Step: Refresh Calendar Availability')
# find element
try:
    e = driver.find_element(By.XPATH, '//*[@id="nav-schedule"]')
    e.click()
    print('successfully refreshed calendar')
except NoSuchElementException:
    print('Unable to refresh calendar')
    print('*****######********#######*****')

print('End of User Named Step: Refresh Calendar Availability')
    # ************** End Click Value ***************

# ************** Start Validation ***************
print('*****######********#######*****')
print('Start of User Named Step: Validate scheduling refreshed')

try:
    e = driver.find_element(By.XPATH, '//*[@id="booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1-1663101900000"]/div')
    print('Date exists')
except NoSuchElementException:
    print('Date does not exist')
print('Start of User Named Step: Validate scheduling refreshed')
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