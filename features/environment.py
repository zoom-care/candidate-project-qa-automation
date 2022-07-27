from behave.model import Status
from behave.model import Scenario
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from page_objects.modules import home


def before_all(context):
    options = Options()
    # options.add_argument("--headless")
    options.add_argument("--no-sandbox")
    options.add_argument("--start-maximized")
    options.add_argument("--disable-gpu")
    context.driver = webdriver.Chrome(options=options)
    context.page = home.Home(context.driver)
    context.driver.implicitly_wait(10)


def after_step(context, step):
    Scenario.continue_after_failed_step = False
    if step.status is Status.failed:
        print("TEST FAILED AT " + context.driver.current_url)


def after_all(context):
    context.driver.quit()
