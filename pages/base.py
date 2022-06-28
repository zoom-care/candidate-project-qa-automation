from pages.locators.locators.locators import Common
from selenium.common.exceptions import NoSuchElementException
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By

class BasePage:

    def __init__(self, driver):
        self.driver = driver

    def get_title(self):
        return self.driver.title

    def is_logo_displayed(self):
        return self.driver.find_element(*Common.nav_logo).is_displayed()

    def exist(self, locator):
        try:
            self.driver.find_element(*locator)
        except NoSuchElementException:
            return False
        return True

    def wait_element(self, type, locator):
        element = None
        wait = WebDriverWait(self.driver, 10)
        try:
            element = wait.until(EC.presence_of_element_located((type, locator)))
        except:
            print("except")
        return element
