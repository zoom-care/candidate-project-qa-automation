from page_objects.base_page import Page
from page_objects.modules.locators import LoginLocators


class Login(Page):
    def __init__(self, driver):
        super().__init__(driver)
        assert self.wait_for_url("/login")
        self.__locators = LoginLocators()

    def sign_up(self):
        self.wait_for_element_visibility(self.__locators.LBL_NEW_TO_ZOOMCARE)
        self.wait_for_element_visibility(self.__locators.LBL_MESSAGE)
        self.find_element(*self.__locators.BTN_SIGN_UP).click()
        # return Register(self.driver)

    def log_in(self):
        self.wait_for_element_visibility(self.__locators.BTN_LOG_IN).click()
        # return oktaProdZoomcare(self.driver)
