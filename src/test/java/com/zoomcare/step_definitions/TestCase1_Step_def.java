package com.zoomcare.step_definitions;

import com.zoomcare.page.TestCase1_Page;
import com.zoomcare.uitilites.ConfigurationReader;
import com.zoomcare.uitilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase1_Step_def {

    TestCase1_Page zoomcare = new TestCase1_Page();

    @Given("Patient open the ZoomCare page and go schedule section")
    public void patient_open_the_zoom_care_page_and_go_schedule_section() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        zoomcare.sleep(10);


    }

    @When("Patient clicks on the DropDown")
    public void patient_clicks_on_the_drop_down() {
        zoomcare.sleep(3);
        zoomcare.setClickDropdown();


    }


    @Then("Patient Should see all the dropdown Options")
    public void patientShouldSeeAllTheDropdownOptions() {

        zoomcare.setListOfItem();
        Driver.closeDriver();
    }


}
