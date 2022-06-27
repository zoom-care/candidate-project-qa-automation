from pages.locators.locators.locators import Common
from selenium.common.exceptions import NoSuchElementException


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
