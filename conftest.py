import logging
import pytest
from selenium import webdriver
from selenium.webdriver.chrome.service import Service


# Fixture for Chrome
# It is possible to create a generic method for multiple drivers
@pytest.fixture(scope="class")
def chrome_driver_init(request):
    logging.info("Instantiating Chrome Driver")

    # Create webdriver object
    service_obj = Service(executable_path="C:\drivers\chromedriver\chromedriver.exe")
    chrome_driver = webdriver.Chrome(service=service_obj)

    if request.cls:
        request.cls.driver = chrome_driver
        logging.info("Setup method: driver was instantiated")
    else:
        logging.error("Error while instantiating driver")

    yield
    # Teardown
    chrome_driver.close()
    logging.info("Teardown: performing a cleanup")
