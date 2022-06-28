from selenium import webdriver
from selenium.webdriver.chrome.service import Service


class WebDriverFactory:
    path = {
        "chrome": "config/drivers/chromedriver"
    }
    url = "https://www.zoomcare.com"

    def __init__(self, browser: str):
        self._browser = browser
        self._driver = None

    def set_driver(self):
        if self._browser == "chrome":
            service = Service(executable_path=WebDriverFactory.path[self._browser])
            self._driver = webdriver.Chrome(service=service)
            return self
        elif self._browser == "firefox":
            driver = webdriver.Firefox()
            return driver

    def get_driver(self, wait: int = 15):
        self._driver.maximize_window()
        self._driver.implicitly_wait(wait)
        return self._driver
