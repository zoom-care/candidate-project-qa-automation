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

    def get_clinic_care_background(self):
        return self.get_clinic_care().value_of_css_property('background-color')

    def is_medical_opt_selected(self, locator):
        return self.driver.find_element(*locator).get_attribute('aria-pressed')
