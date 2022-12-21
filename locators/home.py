from selenium.webdriver.common.by import By


class HomeLocators:
    SCHEDULE = (By.XPATH, "//nav//a[@href='/schedule']")
    LOCATIONS = (By.XPATH, "//nav//a[@href='/locations']")
    SERVICES = (By.XPATH, "//nav//a[@href='/services']")
    SERVICES_PRICES = (By.XPATH, "//nav//a[@href='/services-prices']")

