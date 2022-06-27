from selenium.webdriver.common.by import By


class Common:
    nav_logo = (By.CSS_SELECTOR, '[class="nav__brand w-nav-brand"] img')


class Schedule:
    nav_schedule = (By.CSS_SELECTOR, "#nav-schedule")
    illness_injury = (By.CSS_SELECTOR, '[data-testid="text-Illness/Injury"]')
    today_selector = (By.CSS_SELECTOR, '[data-testid="text-Today"]')
    clinic_care = (By.CSS_SELECTOR, '[data-testid="virtualClinicBox"]')