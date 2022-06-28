from selenium.webdriver.common.by import By


class Common:
    nav_logo = (By.CSS_SELECTOR, '[class="nav__brand w-nav-brand"] img')


class Schedule:
    nav_schedule = (By.CSS_SELECTOR, "#nav-schedule")
    illness_injury = (By.CSS_SELECTOR, '[data-testid="text-Illness/Injury"]')
    today_selector = (By.CSS_SELECTOR, '[data-testid="text-Today"]')
    clinic_care = (By.CSS_SELECTOR, '[data-testid="virtualClinicBox"]')
    date_selector = '[data-testid="DateSelector.trigger"]'
    pop_over = (By.CSS_SELECTOR, '[data-testid="text-Come see us today!"]')
    video_care = (By.CSS_SELECTOR, '[data-testid="virtualVideoBox"]')
    chat_care = (By.CSS_SELECTOR, '[data-testid="virtualChatBox"]')
    location = '[data-testid="text-scheduler.location.label"]'
    input_location = (By.CSS_SELECTOR, '[data-testid="location-search-input"]')