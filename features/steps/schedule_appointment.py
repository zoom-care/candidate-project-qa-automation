from behave import *
from page_objects.modules.home import Home


@given('the unauthenticated guest is in the Home page')
def step_imp(context):
    context.driver.get('https://www.zoomcare.com')
    context.page = Home(context.driver)


@when('the unauthenticated guest clicks on Schedule')
def step_imp(context):
    context.page = context.page.visit_schedule()


@when('the unauthenticated guest sets a location')
def step_imp(context):
    context.page.set_location()


@when('the unauthenticated guest sets the type of care and date for the appointment')
def step_imp(context):
    context.page.set_care_type_and_date()


@when('the unauthenticated guest chooses a caretaker timeslot')
def step_imp(context):
    context.page.verify_caretaker_profile()
    # context.page = context.page.visit_caretaker_profile()
    # context.page = context.page.visit_caretaker_map()
    context.page.visit_caretaker_clinic_services()
    context.page = context.page.set_caretaker_and_time()


@then('the unauthenticated guest is redirected to log in')
def step_imp(context):
    pass
    # context.page.log_in()
