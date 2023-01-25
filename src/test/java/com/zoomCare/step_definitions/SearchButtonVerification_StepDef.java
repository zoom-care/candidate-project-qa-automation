package com.zoomCare.step_definitions;

import com.zoomCare.pages.ZoomCarePages;
import com.zoomCare.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchButtonVerification_StepDef {

    ZoomCarePages zc = new ZoomCarePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);


    @When("User selects {string} from dropdown menu")
    public void user_selects_from_dropdown_menu(String cityName) {

        wait.until(ExpectedConditions.elementToBeClickable(zc.locationDropDown));
        zc.locationDropDown.click();
        zc.citySelector(cityName);

    }
    @When("User selects {string} service from dropdown menu")
    public void user_selects_service_from_dropdown_menu(String service) {

        wait.until(ExpectedConditions.elementToBeClickable(zc.servicesDropdown));
        zc.servicesDropdown.click();
        zc.serviceSelector(service);

    }
    @When("User selects a first available date from dates dropdown menu")
    public void user_selects_a_first_available_date_from_dates_dropdown_menu() throws InterruptedException {

        Thread.sleep(2000); //not a good way to use Thread.sleep, but the website is too loaded,
                                 // explicit wait do not work

        zc.dateBox.click();
        Thread.sleep(1000);
        zc.dateSelector();


    }

    @Then("User is able to click search button")
    public void user_is_able_to_click_search_button() throws InterruptedException {

        Thread.sleep(2000);
        zc.searchBox.click();




    }

}
