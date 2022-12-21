from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

from lib.constants import SCHEDULE_URL
from locators.schedule import ScheduleLocators
from Pages.BasePage import BasePage


class Schedule(BasePage):

    # Constructor
    def __init__(self, driver):
        super().__init__(driver)
        assert self.wait_for_url(SCHEDULE_URL)
        self.schedule_locator = ScheduleLocators()

    # Page Actions
    def select_location(self, location):
        self.wait_for_element_to_be_clickable(self.schedule_locator.LOCATION_SELECTOR).click()
        return self.find_element(self.schedule_locator.location)

    def select_service_type(self, service):
        self.wait_for_element_to_be_clickable(self.schedule_locator.CARE_TYPE_SELECTOR).click()
        return self.find_element(self.schedule_locator.service)

    def select_date(self, date):
        self.wait_for_element_to_be_clickable(self.schedule_locator.DATE_SELECTOR).click()
        return self.find_element(self.schedule_locator.date)

    def select_care_mode(self, care):
        return self.find_element(self.schedule_locator.care).click()

    def use_refresh_btn(self):
        return self.find_element(self.schedule_locator.REFRESH_BTN).click()

    def check_is_caregivers_section_available(self):
        return self.wait_for_element_to_be_present(self.schedule_locator.CAREGIVER_BLOCK)

    def is_timeslot_available(self):
        slot_enable = self.find_element(By.ID, self.locator.today_selector)
        actions = ActionChains(self.driver)
        actions.move_to_element(slot_enable)
        actions.perform()
        return self.wait_for_element_visibility(By.ID, self.locator.today_selector)
