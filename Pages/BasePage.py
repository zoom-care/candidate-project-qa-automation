from selenium.common import NoSuchElementException
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


# Parent class for all pages
class BasePage:
    def __init__(self, driver, url):
        self.driver = driver
        self.driver.get(url)
        self.driver.maximize_window()
        self.TIMEOUT = 15
        self.wait = WebDriverWait(self.driver, self.TIMEOUT)

    def find_element(self, *locator):
        """
        It's used to access any single element on the web page
        :param locator: tuple, type of locator and value
        :return: obj, object matching the locator
        """
        return self.driver.find_element(*locator)

    def wait_for_url(self, url: str) -> bool:
        """
        Return a True/False condition marking if the url appeared or not
        :param url: str, url to be found
        :return: bool
        """
        try:
            return self.wait.until(expected_conditions.url_contains(url), "Could not find the URL")
        except:
            return False

    def wait_for_element_to_be_clickable(self, type, locator):
        return self.wait.until(expected_conditions.element_to_be_clickable((type, locator)), "Timeout exceeded")

    def wait_for_element_to_be_present(self, type, locator):
        try:
            self.wait.until(expected_conditions.presence_of_element_located((type, locator)), "Timeout exceeded")
        except NoSuchElementException:
            return False
        return True

    def wait_for_element_visibility(self, type, locator):
        return self.wait.until(expected_conditions.visibility_of_element_located((type, locator)), "Timeout exceeded")

    def wait_for_element_invisibility(self, type, locator):
        return self.wait.until(expected_conditions.invisibility_of_element_located((type, locator)), "Timeout exceeded")
