from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.ui import WebDriverWait


class Page:
    def __init__(self, driver):
        self.driver = driver
        self.TIMEOUT = 15
        self.wait = WebDriverWait(self.driver, self.TIMEOUT)

    def find_element(self, *locator):
        return self.driver.find_element(*locator)

    def wait_for_url(self, url):
        try:
            return self.wait.until(expected_conditions.url_contains(url), "Could not find the URL")
        except:
            return False

    def wait_for_element_to_be_clickable(self, locator):
        return self.wait.until(expected_conditions.element_to_be_clickable(locator), "Timeout exceeded")

    def wait_for_element_to_be_present(self, locator):
        return self.wait.until(expected_conditions.presence_of_element_located(locator), "Timeout exceeded")

    def wait_for_element_visibility(self, locator):
        return self.wait.until(expected_conditions.visibility_of_element_located(locator), "Timeout exceeded")
