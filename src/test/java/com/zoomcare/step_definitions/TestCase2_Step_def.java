package com.zoomcare.step_definitions;

import com.zoomcare.page.TestCase2_Page;
import com.zoomcare.uitilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TestCase2_Step_def {

    TestCase2_Page zoomcare = new TestCase2_Page();

    @Then("Patient clicks on  Want Care ....?")
    public void patient_clicks_on_want_care() {
        zoomcare.clickOnLocation();
    }


    @And("Select Vancouver WA in location  Filed")
    public void selectVancouverWAInLocationFiled() {
        zoomcare.selectLocation();
    }

    @Then("Select Primary Care From The DropDown")
    public void select_primary_care_from_the_drop_down() {
        zoomcare.sleep(3);
        zoomcare.selectPrimaryCare();
    }

    @Then("Choose any provider")
    public void choose_any_provider() {
        zoomcare.selectProvider();
    }

    @Then("Patient Select the earliest time available")
    public void patient_select_the_earliest_time_available() {
        zoomcare.selectTime();
    }



    @Then("Verify Patient Should be on the Login or Sign Up Page")
    public void verify_patient_should_be_on_the_login_or_sign_up_page() {
        zoomcare.sleep(3);
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "Login | ZoomCare";
        Assert.assertTrue("USER IS ON THE LOGIN/SING UP PAGE!!", actualResult.equals(expectedResult));
        Driver.closeDriver();
    }


}
