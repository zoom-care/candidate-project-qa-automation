import pytest
from config.webdriver import WebDriverFactory
import logging

@pytest.fixture()
def each_test(request, browser):
    # Arrange
    logging.info("Running method level each_test")

    wdf = WebDriverFactory(browser)
    driver = wdf.set_driver().get_driver()

    if request.cls is not None:
        request.cls.driver = driver
        logging.info("Instantiated driver")
    else:
        logging.error("Fatal error in instantiate driver \n")

    yield driver
    # Cleanup
    driver.quit()
    logging.info("Running method level tearDown \n")


@pytest.fixture(scope="class")
def each_class(request, browser):
    # Arrange
    logging.info("Running one time each_class")

    wdf = WebDriverFactory(browser)
    driver = wdf.set_driver().get_driver()

    if request.cls is not None:
        request.cls.driver = driver
        logging.info("Instantiated driver")
    else:
        logging.error("Fatal error in instantiate driver \n")

    yield driver
    # Cleanup
    driver.quit()
    logging.info("Running one time tearDown \n")


def pytest_addoption(parser):
    parser.addoption("--browser")


@pytest.fixture(scope="session")
def browser(request):
    return request.config.getoption("--browser")
