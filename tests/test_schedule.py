import logging
from lib import constants as c
from locators.schedule import ScheduleLocators
from test_base import BasicChromeTest
from Pages.BasePage import BasePage


class TestSchedulePage(BasicChromeTest):
    def test_appointment_location(self):
        steps = """
        1) From ZoomCare home page go to Schedule Page
        2) Select an appointment location
        3) Choose type of service
        4) Choose date for the appointment
        5) Refresh and validate that doctors are available
        """
        logging.info(steps)

        # Step 1
        self.BasePage = BasePage(self.driver, url=c.BASE_URL)
        assert self.HomePage.go_to_schedule()

        # Step 2
        assert self.SchedulePage.select_location(ScheduleLocators.OPTION_LOCATION_PORTLAND)

        # Step 3
        assert self.SchedulePage.select_service_type(ScheduleLocators.OPTION_ILLNESS_INJURY)

        # Step 4
        assert self.SchedulePage.select_date(ScheduleLocators.TODAY_DATE)

        # Step 5
        assert self.SchedulePage.use_refresh_btn()
        assert self.SchedulePage.check_is_caregivers_section_available()

    def test_caregiver_availability_for_a_care_type(self):
        steps = """
        1) From ZoomCare home page go to Schedule Page
        2) Using default location, choose type of service
        3) Choose date for the appointment
        4) Refresh and validate that doctors are available
        """
        logging.info(steps)

        # Step 1
        self.BasePage = BasePage(self.driver, url=c.BASE_URL)
        assert self.HomePage.go_to_schedule()

        # Step 2
        assert self.SchedulePage.select_service_type(ScheduleLocators.OPTION_ILLNESS_INJURY)

        # Step 3
        assert self.SchedulePage.select_date(ScheduleLocators.TODAY_DATE)

        # Step 4
        assert self.SchedulePage.use_refresh_btn()
        assert self.SchedulePage.check_is_caregivers_section_available()

    def test_login_page_selecting_clinic_type(self):
        steps = """
        1) From ZoomCare home page go to Schedule Page
        2) Using default location, type of service and date, choose video-care type
        3) Select a timeslot
        3) Check login page
        """
        logging.info(steps)

        # Step 1
        self.BasePage = BasePage(self.driver, url=c.BASE_URL)
        assert self.HomePage.go_to_schedule()

        # Step 2
        assert self.SchedulePage.select_care_mode(ScheduleLocators.VIDEOCARE)

        # Step 3
        assert self.SchedulePage.select_date(ScheduleLocators.TODAY_DATE)
        assert self.SchedulePage.is_timeslot_available()

        # Step 4
        assert self.BasePage.wait_for_url(self, url=c.LOGIN_URL)
