from lib.constants import LOGIN_URL
from locators.login import LoginLocators
from Pages.BasePage import BasePage


class Login(BasePage):

    # Constructor
    def __init__(self, driver):
        super().__init__(driver)
        self.locator = LoginLocators()

    # Page Actions
    def check_login_url(self):
        return self.wait_for_url(LOGIN_URL)

    def check_login_page(self):
        assert self.find_element(self.locator.SIGN_UP)
        assert self.find_element(self.locator.LOG_IN)
        return self.find_element(self.locator.NEW_TO_ZOOMCARE)

