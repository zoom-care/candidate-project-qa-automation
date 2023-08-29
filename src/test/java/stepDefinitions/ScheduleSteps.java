package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.*;
import pages.SchedulePage;
import utils.TestBase;

public class ScheduleSteps extends TestBase {
    SchedulePage schedulePage = new SchedulePage();

    @Before
    public void setup() {
        TestBase.init();
    }

    @Given("User is on schedule page")
    public void verifyUserOnSchedulePage() {
        Assert.assertEquals("ZoomCare | Schedule a Healthcare Appointment", schedulePage.getPageTitle());
    }

    @Then("User is taken to the login page")
    public void verifyUserIsOnLoginPage() {
        Assert.assertEquals("Login | ZoomCare", schedulePage.getPageTitle());
    }

    @And("User is able to see services")
    public void userCanSeeServices() {
        schedulePage.waitForServices();
        Assert.assertTrue(schedulePage.verifyServicesVisible());
    }

    @Then("Services are reset")
    public void servicesAreReset() {
        Assert.assertEquals("Choose Service", schedulePage.getCurrentService());
    }

    @When("User selects location {string}")
    public void userSelectsLocation(String city) {
        schedulePage.selectCity(city);
        // Verify the selection was made
        Assert.assertTrue(schedulePage.getCurrentLocation().toLowerCase().contains(city));
    }

    @When("User selects service {string}")
    public void userSelectsService(String service) {
        schedulePage.selectService(service);
        // Verify a selection was made
        Assert.assertNotEquals("Choose Service", schedulePage.getCurrentService());
    }

    @When("User selects next available date")
    public void userSelectsNextAvailableDate() {
        schedulePage.selectNextAvailableDate();
        // Verify a selection was made
        Assert.assertNotEquals("Choose Date", schedulePage.getCurrentDate());
    }

    @And("User selects next available time")
    public void userSelectsNextAvailableTime() {
        schedulePage.selectNextAvailableTime();
    }

    @When("User clicks the search button")
    public void userClicksTheSearchButton() {
        schedulePage.clickSearchButton();
    }

    @Then("Care options are listed")
    public void careOptionsAreListed() {
        schedulePage.waitForServices();
        Assert.assertTrue(schedulePage.verifyServicesVisible());
        Assert.assertTrue(schedulePage.verifyResultVisible());
    }

    @When("User is able to see all banner links")
    public void checkBannerLinksPresent() {
        Assert.assertTrue(schedulePage.verifyBannerLinksPresent());
    }

    @And("The links on the banner have working URLS")
    public void checkBannerLinksWorking() {
        Assert.assertTrue(schedulePage.verifyBannerLinksWorking());
    }

    @Then("User clicks each banner link and visits correct page")
    public void userClicksEachBannerLink() {
        if (!schedulePage.getPageTitle().equals("ZoomCare | Schedule a Healthcare Appointment")){
            schedulePage.clickScheduleLink();
        }
        // Check home page banner link from schedule page
        schedulePage.clickHomeLink();
        Assert.assertEquals("ZoomCare | Beyond Better Healthcare", schedulePage.getPageTitle());
        schedulePage.clickScheduleLink();
        // Check schedule page banner link from schedule page
        schedulePage.clickScheduleLink();
        Assert.assertEquals("ZoomCare | Schedule a Healthcare Appointment", schedulePage.getPageTitle());
        // Check locations page banner link from schedule page
        schedulePage.clickLocationsLink();
        Assert.assertEquals("ZoomCare clinic locations | Healthcare clinics near you", schedulePage.getPageTitle());
        schedulePage.clickScheduleLink();
        // Check services page banner link from schedule page
        schedulePage.clickServicesLink();
        Assert.assertEquals("ZoomCare | Healthcare Services", schedulePage.getPageTitle());
        schedulePage.clickScheduleLink();
        // Check pricing page banner link from schedule page
        schedulePage.clickPricingLink();
        Assert.assertEquals("Transparent Healthcare Pricing at ZoomCare", schedulePage.getPageTitle());
        schedulePage.clickScheduleLink();
        // Check login page banner link from schedule page
        schedulePage.clickLoginLink();
        Assert.assertEquals("Login", schedulePage.getPageTitle());
    }

    @Then("Video Care button is not present")
    public void videoCareButtonIsNotPresent() {
        Assert.assertFalse(schedulePage.verifyVideoCareButtonPresent());
    }

    @And("Clinic Care button is not present")
    public void clinicCareButtonIsNotPresent() {
        Assert.assertFalse(schedulePage.verifyClinicCareButtonPresent());
    }

    @After
    public void cleanup() {
        TestBase.quit();
    }
}
