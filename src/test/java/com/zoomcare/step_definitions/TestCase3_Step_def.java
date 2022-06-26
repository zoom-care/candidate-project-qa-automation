package com.zoomcare.step_definitions;

import com.zoomcare.page.TestCase3_Page;
import com.zoomcare.uitilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCase3_Step_def {

    TestCase3_Page zoomcare = new TestCase3_Page();

    @When("Patient clicks on video care")
    public void patient_clicks_on_video_care() {
        zoomcare.sleep(3);
        zoomcare.setVideoChat();

    }

    @Then("Patient select second available time")
    public void patientSelectSecondAvailableTime() {
        zoomcare.setTime();
    }

    @Then("Patient should be on login page")
    public void patientShouldBeOnLoginPage() {
        zoomcare.sleep(3);
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "Login | ZoomCare";
        Assert.assertTrue("USER IS ON THE LOGIN PAGE!!", actualResult.equals(expectedResult));
    }

    @Then("Patient clicks on go back to go back to previous page")
    public void patientClicksOnGoBackToGoBackToPreviousPage() {
        Driver.getDriver().navigate().back();


    }

    @And("Are you sure? message should pops up and Patient  click cancel button")
    public void areYouSureMessageShouldPopsUpAndPatientClickCancelButton() {
        zoomcare.sleep(3);

        zoomcare.setCancel();
    }

    @Then("Patient should be back on Scheduling page")
    public void patientShouldBeBackOnSchedulingPage() {
        zoomcare.sleep(3);
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "schedule | ZoomCare";
        Driver.closeDriver();
    }
}
