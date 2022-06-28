import pytest
from config.webdriver import WebDriverFactory
import unittest
import time
from pages.schedule.schedule_page import SchedulePage
from pages.base import BasePage
from pages.locators.locators.locators import Schedule
from selenium.webdriver.common.by import By


@pytest.mark.usefixtures("each_test")
class TestSchedule(unittest.TestCase):

    @pytest.fixture(autouse=True)
    def before(self, each_test):
        self.base_page = BasePage(self.driver)
        self.schedule_page = SchedulePage(self.driver)
        self.url = f"{WebDriverFactory.url}/schedule"
        self.driver.get(self.url)

        # Previous assertions for all test
        title = self.base_page.get_title()
        is_logo_displayed = self.base_page.is_logo_displayed()

        self.assertEqual(title, 'Schedule | ZoomCare', "Page title is invalid")
        self.assertTrue(is_logo_displayed, "Logo is not displayed")
        self.assertIn('w--current', self.schedule_page.is_schedule_active(), "schedule is not active")
        self.assertEqual('rgba(30, 190, 231, 1)', self.schedule_page.get_schedule_link_color(),
                         "Color of schedule link is not valid")
        self.assertEqual('Today', self.schedule_page.get_today_selector().text, "Date selector is not set as today")
        self.assertEqual('rgba(46, 66, 74, 1)', self.schedule_page.get_clinic_care_background(), "")
        self.assertTrue(self.schedule_page.is_medical_opt_selected(Schedule.clinic_care), "Clinic care is not selected")

    def test_select_clinic_care(self):
        # "Select Clinic Care Option and Today where user has not logged and location is automatically set"
        time.sleep(1)
        self.schedule_page.click_date_selector()
        self.assertTrue(self.schedule_page.get_pop_over().is_displayed(), "Message is not displayed")
        self.schedule_page.click_date_selector()
        self.schedule_page.click_clinic_care()
        self.assertEqual(self.driver.current_url, 'https://okta-prod.zoomcare.com/', 'url should be '
                                                                                     '"https://okta-prod.zoomcare.com/ to log in"')
        time.sleep(1)

    def test_select_video_care(self):
        # "Select Video Care Option and Today where user has not logged and location is automatically set"
        time.sleep(1)
        self.schedule_page.click_date_selector()
        self.assertTrue(self.schedule_page.get_pop_over().is_displayed(), "Message is not displayed")
        self.schedule_page.click_date_selector()
        self.schedule_page.click_video_care()
        self.assertTrue(self.schedule_page.is_medical_opt_selected(Schedule.video_care), 'Video care is not selected')
        self.assertEqual(self.driver.current_url, 'https://okta-prod.zoomcare.com/', 'url should be "https://okta-prod.zoomcare.com/ to log in"')
        time.sleep(1)

    def test_select_chat_care(self):
        #"Select Chat Care Option and Today where user has not logged and location is automatically set"
        time.sleep(1)
        self.schedule_page.click_date_selector()
        self.assertTrue(self.schedule_page.get_pop_over().is_displayed(), "Message is not displayed")
        self.schedule_page.click_date_selector()
        self.schedule_page.click_chat_care()
        self.base_page.wait_element(By.ID, 'okta-login-container')
        self.assertEqual(self.driver.current_url, 'https://okta-prod.zoomcare.com/', 'url should be "https://okta-prod.zoomcare.com/" to log in')
