package com.zoomCare.step_definitions;

import com.zoomCare.pages.ZoomCarePages;
import com.zoomCare.utilities.ConfigReader;
import com.zoomCare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocationSelection_StepDef {

    ZoomCarePages zc = new ZoomCarePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    List<String> eachLocation = new ArrayList<>(Arrays.asList("Portland, OR", "Seattle, WA", "Vancouver, WA", "Salem, OR", "Eugene, OR", "Denver, CO", "Boulder, CO", "Boise, ID"));


    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {

        Driver.getDriver().get(ConfigReader.getProperty("env"));
        wait.until(ExpectedConditions.visibilityOf(zc.title));
    }

    @Then("User is able to select any available clinic locations from the dropdown menu")
    public void user_is_able_to_select_any_available_clinic_locations_from_the_list() {

        for (String each : eachLocation) {
            zc.locationDropDown.click();
            zc.clickOnLocation(each);
        }
    }
}

