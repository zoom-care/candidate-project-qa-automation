from selenium.webdriver.common.by import By


class HomeLocators:
    LNK_SCHEDULE = (By.XPATH, "//nav//a[@href='/schedule']")


class LoginLocators:
    LBL_NEW_TO_ZOOMCARE = (By.XPATH, "//div[@data-testid='text-loginModal.register.newToZoom']")
    BTN_SIGN_UP = (By.XPATH, "//div[@data-testid='button-loginModal.register.signUp']")
    BTN_LOG_IN = (By.XPATH, "//div[@data-testid='button-loginModal.register.logIn']")
    LBL_MESSAGE = (By.XPATH, "//div[@data-testid='text-NotificationBar-signup-or-login.message']")


class ScheduleLocators:
    # =====-Location selector (default is chosen by IP address)
    LBL_LOCATION_SELECTOR = (By.XPATH, "//div[@data-testid='text-scheduler.location.label']")
    LNK_LOCATION_SELECTOR = (By.XPATH, "//div[@data-testid='LocationSelector']//div//span")
    LNK_LOCATION_PORTLAND = (By.XPATH, "//div[@data-testid='LocationSelector.option.Portland, OR']")

    # =====-Type of care and date selectors
    SEL_CARE_TYPE = (By.XPATH, "//div[@data-testid='CareSelector.trigger']")
    SEL_CARE_TYPE_SPORTS_PHYSICAL = (By.XPATH, "//div[@data-testid='text-Sports Physical']")
    SEL_DATE = (By.XPATH, "//div[@data-testid='DateSelector.trigger']")

    # =====-Search results
    BTN_CLINIC_CARE = (By.XPATH, "//button[@data-testid='virtualClinicBox']")
    BTN_VIDEOCARE = (By.XPATH, "//button[@data-testid='virtualVideoBox']")
    BTN_CHATCARE = (By.XPATH, "//button[@data-testid='virtualChatBox']")

    LBL_RESULTS_TITLE = (By.XPATH, "//*[@data-testid='text-scheduler.serviceLine.title-undefined']']")
    LNK_RESULTS_INFO = (By.XPATH, "//*[@data-testid='text-scheduler.serviceLine.info-undefined']']")

    # identified a unique parent div that represents each search result
    # indexed the parent using an index in 'data-testid' to capture multiple search results dynamically
    LNK_ADDRESS_TITLE = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']"
                                   "//a[@data-testid='link-undefined']")
    BTN_MAP = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']//div[@data-testid='text-Map']")
    LNK_VIEW_CLINIC_SERVICES = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']"
                                          "//div[@data-testid='text-View Clinic Services']")
    LBL_VIEW_CLINIC_SERVICES = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']"
                                          "//div[@data-testid='text-Services available at this clinic']")

    IMG_CARETAKER = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']//img")
    # TODO index provider # in case results show > 1 caretaker
    LNK_CARETAKER_NAME = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']"
                                    "//a[@data-testid='link-ServiceLine.1.Clinic.{index}.Provider.1.ProviderName']")
    LBL_CARETAKER_DATE = (By.XPATH, "//div[@data-testid='ServiceLine.1.Clinic.{index}']"
                                    "//div[@data-testid='ServiceLine.1.Clinic.{index}.Provider.1.DateInfo']")
    BTN_CARETAKER_TIME_1 = (By.XPATH, "//div[@id='booking_requested_button-ServiceLine.1.Clinic.{index}.Provider.1.TimeSlot.1-1658865600000']")
