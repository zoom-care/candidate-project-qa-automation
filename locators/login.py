from selenium.webdriver.common.by import By


class LoginLocators:
    NEW_TO_ZOOMCARE = (By.XPATH, "//div[@data-testid='text-loginModal.register.newToZoom']")
    SIGN_UP = (By.XPATH, "//div[@data-testid='button-loginModal.register.signUp']")
    LOG_IN = (By.XPATH, "//div[@data-testid='button-loginModal.register.logIn']")
