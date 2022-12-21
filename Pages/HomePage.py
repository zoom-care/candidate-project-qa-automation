from selenium.webdriver.common.by import By

from lib.constants import BASE_URL
from locators.home import HomeLocators
from Pages.BasePage import BasePage


class Home(BasePage):

    # Constructor
    def __init__(self, driver):
        super().__init__(driver)
        assert self.wait_for_url(BASE_URL)
        self.locator = HomeLocators()

    # Page Actions
    def go_to_schedule(self):
        self.find_element(self.locator.SCHEDULE)
        return self.wait_for_element_to_be_clickable(By.XPATH, self.locator.SCHEDULE).click()
