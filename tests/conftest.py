import pytest
from config.webdriver import WebDriverFactory
from utilities.logger import Logger

log = Logger().init()


@pytest.fixture()
def each_test(request, browser):
    # Arrange
    log.info("Running method level each_test")

    wdf = WebDriverFactory(browser)
    driver = wdf.set_driver().get_driver()

    if request.cls is not None:
        request.cls.driver = driver
        log.info("Instantiated driver")
    else:
        log.error("Fatal error in instantiate driver \n")

    yield driver
    # Cleanup
    driver.quit()
    log.info("Running method level tearDown \n")


@pytest.fixture(scope="class")
def each_class(request, browser):
    # Arrange
    log.info("Running one time each_class")

    wdf = WebDriverFactory(browser)
    driver = wdf.set_driver().get_driver()

    if request.cls is not None:
        request.cls.driver = driver
        log.info("Instantiated driver")
    else:
        log.error("Fatal error in instantiate driver \n")

    yield driver
    # Cleanup
    driver.quit()
    log.info("Running one time tearDown \n")


def pytest_addoption(parser):
    parser.addoption("--browser")


@pytest.fixture(scope="session")
def browser(request):
    return request.config.getoption("--browser")
