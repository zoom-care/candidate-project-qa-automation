from selenium.webdriver.common.by import By


class ScheduleLocators:
    # Location
    LOCATION_SELECTOR = (By.XPATH, '//div[@data-testid="quickSelector.location.popover"]')
    OPTION_LOCATION_PORTLAND = (By.ID, "quick-selector-option-location-portland--or")

    # Type of care
    CARE_TYPE_SELECTOR = (By.XPATH, '//div[@data-testid="quickSelector.service.popover"]')
    OPTION_ILLNESS_INJURY = (By.ID, "quick-selector-option-service-illness-injury")

    # Date
    DATE_SELECTOR = (By.XPATH, '//div[@data-testid="quickSelector.date.popover"]')
    TODAY_DATE = (By.CSS_SELECTOR, '[data-testid="text-Today"]')

    # Care mode
    CLINIC_CARE = (By.XPATH, "//button[@data-testid='virtualClinicBox']")
    VIDEOCARE = (By.XPATH, "//button[@data-testid='virtualVideoBox']")
    CHATCARE = (By.XPATH, "//button[@data-testid='virtualChatBox']")

    # Refresh
    REFRESH_BTN = (By.XPATH, '//div[@id="quickSelectorSubmit"]')

    # Caregiver
    CAREGIVER_BLOCK = (By.XPATH, '//div[@data-testid="ServiceLineSection"]')
