from selenium.webdriver.common.by import By
from pages.locators.locators import locators

locator = locators.Schedule()


class SchedulePage:

    def __init__(self, driver):
        self.driver = driver

    # Methods
    def get_nav_logo(self):
        return self.driver.find_element(*locator.nav_logo)

    def get_illness_opt(self):
        return self.driver.find_element(*locator.illness_injury)

    def click_nav_logo(self):
        self.get_nav_logo().click()

    def get_nav_schedule(self):
        return self.driver.find_element(*locator.nav_schedule)

    def is_schedule_active(self):
        return self.get_nav_schedule().get_attribute('class')

    def get_schedule_link_color(self):
        return self.get_nav_schedule().value_of_css_property('color')

    def get_today_selector(self):
        return self.driver.find_element(*locator.today_selector)

    def get_clinic_care(self):
        return self.driver.find_element(*locator.clinic_care)

    def get_video_care(self):
        return self.driver.find_element(*locator.video_care)

    def get_clinic_care_background(self):
        return self.get_clinic_care().value_of_css_property('background-color')

    def get_date_selector(self):
        return self.driver.find_element(By.CSS_SELECTOR, locator.date_selector)

    def get_pop_over(self):
        return self.driver.find_element(*locator.pop_over)

    def get_chat_care(self):
        return self.driver.find_element(*locator.chat_care)

    def get_location(self):
        return self.driver.find_element(By.CSS_SELECTOR, locator.location)

    def get_input_location(self):
        return self.driver.find_element(*locator.input_location)

    def is_medical_opt_selected(self, locator):
        return self.driver.find_element(*locator).get_attribute('aria-pressed')

    def click_date_selector(self):
        self.get_date_selector().click()

    def click_clinic_care(self):
        self.get_clinic_care().click()

    def click_video_care(self):
        self.get_video_care().click()

    def click_chat_care(self):
        self.get_chat_care().click()

    def click_location(self):
        self.get_location().click()

    def enter_location(self, location):
        self.get_input_location().send_keys(location)

