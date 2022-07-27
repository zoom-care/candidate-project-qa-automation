from page_objects.base_page import Page
from page_objects.modules.locators import HomeLocators
from page_objects.modules.schedule import Schedule


class Home(Page):
    def __init__(self, driver):
        super().__init__(driver)
        self.__locators = HomeLocators()

    def visit_schedule(self):
        self.wait_for_element_visibility(self.__locators.LNK_SCHEDULE).click()
        return Schedule(self.driver)
