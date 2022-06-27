import pytest
from config.webdriver import WebDriverFactory
import unittest
import time
from pages.schedule.schedule_page import SchedulePage
from pages.base import BasePage
from pages.locators.locators.locators import Schedule


@pytest.mark.usefixtures("each_test")
class TestSchedule(unittest.TestCase):

    @pytest.fixture(autouse=True)
    def before(self, each_test):
        self.base_page = BasePage(self.driver)
        self.schedule_page = SchedulePage(self.driver)
        self.url = f"{WebDriverFactory.url}/schedule"
        self.driver.get(self.url)

        # Assertions for all test
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

    def test_smoke(self):
        print("")
