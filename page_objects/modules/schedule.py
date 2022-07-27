from page_objects.base_page import Page
from page_objects.modules.login import Login
from page_objects.modules.locators import ScheduleLocators
from selenium.webdriver.common.keys import Keys
from time import sleep


class Schedule(Page):
    def __init__(self, driver):
        super().__init__(driver)
        assert self.wait_for_url("https://www.zoomcare.com/schedule")
        self.__locators = ScheduleLocators()
        sleep(1)

    def set_location(self):  # TODO remove hardcode and use parameters as set_location(city)
        self.find_element(*self.__locators.LBL_LOCATION_SELECTOR)
        self.find_element(*self.__locators.LNK_LOCATION_SELECTOR).click()
        self.wait_for_element_to_be_clickable(self.__locators.LNK_LOCATION_PORTLAND).click()
        sleep(1)

    def set_care_type_and_date(self):  # TODO remove hardcode and use parameters as set_care_and_date(care_type, date)
        self.find_element(*self.__locators.SEL_CARE_TYPE).click()
        sleep(1)
        self.find_element(*self.__locators.SEL_CARE_TYPE_SPORTS_PHYSICAL).click()
        sleep(1)
        try:
            self.find_element(*self.__locators.SEL_DATE).click()
            sleep(1)
            self.find_element(*self.__locators.SEL_DATE).send_keys(Keys.ENTER)
        except Exception as e:
            print("There are no available dates. " + str(e))

    def verify_caretaker_profile(self):
        self.wait_for_element_visibility(self.__locators.LBL_RESULTS_TITLE)
        self.find_element(*self.__locators.LNK_RESULTS_INFO).click()
        self.wait_for_element_visibility(self.__locators.IMG_CARETAKER)
        self.wait_for_element_visibility(self.__locators.LBL_CARETAKER_DATE)

    def visit_caretaker_profile(self):
        self.wait_for_element_visibility(self.__locators.LNK_ADDRESS_TITLE).click()
        # return ZoomcareClinic(self.driver)

    def visit_caretaker_map(self):
        self.wait_for_element_visibility(self.__locators.BTN_MAP).click()
        # return GoogleMaps(self.driver)

    def visit_caretaker_clinic_services(self):
        self.wait_for_element_visibility(self.__locators.LNK_VIEW_CLINIC_SERVICES).click()
        self.wait_for_element_visibility(self.__locators.LBL_VIEW_CLINIC_SERVICES)

    def set_caretaker_and_time(self):
        self.wait_for_element_visibility(self.__locators.BTN_CARETAKER_TIME_1).click()
        return Login(self.driver)
