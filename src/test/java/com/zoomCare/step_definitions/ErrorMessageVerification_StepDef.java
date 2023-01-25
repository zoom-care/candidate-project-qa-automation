package com.zoomCare.step_definitions;

import com.zoomCare.pages.ZoomCarePages;
import com.zoomCare.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMessageVerification_StepDef {

    ZoomCarePages zc = new ZoomCarePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);


    @When("User selects {string} from location dropdown")
    public void user_selects_from_location_dropdown(String cityName) {

        wait.until(ExpectedConditions.elementToBeClickable(zc.locationDropDown));
        zc.locationDropDown.click();
        zc.citySelector(cityName);

    }
    @When("User selects {string} from services dropdown")
    public void user_selects_from_services_dropdown(String serviceName) {

        wait.until(ExpectedConditions.elementToBeClickable(zc.servicesDropdown));
        zc.servicesDropdown.click();
        zc.serviceSelector(serviceName);
    }
    @When("User selects first available date from the calendar")
    public void user_selects_first_available_date_from_the_calendar() throws InterruptedException {

        Thread.sleep(2000);
        zc.dateBox.click();
        Thread.sleep(1000);
        zc.dateSelector();

        Thread.sleep(2000);
        zc.searchBox.click();

    }
    @Then("{string} message should appear if date is unavailable")
    public void message_should_appear_if_date_is_unavailable(String errorMessage) {

        Assert.assertTrue(zc.errorMessage.getText().equals(errorMessage));

    }
}
