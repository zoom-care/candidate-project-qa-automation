package Sergei.com.steps_definition;

import Sergei.com.pages.SchedulePage;
import Sergei.utility.browserUtil;
import Sergei.utility.driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class US_3_user_should_be_able_to_choose_clinic_location {
    SchedulePage schedulePage = new SchedulePage();
    Actions actions = new Actions(driver.getDriver());
    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 10);

    @When("user choose {string} location")
    public void user_choose_location(String portlandLocation) {
        browserUtil.sleep(3);
        schedulePage.switchLocation(portlandLocation);

    }

    @When("user choose {string} option")
    public void user_choose_option(String myLocation) {
        browserUtil.sleep(3);
        schedulePage.clinicLocationDrop.click();
        actions.moveToElement(schedulePage.useMyLocation).click().perform();


    }

    @Then("user see message {string}")
    public void user_see_message(String message) {
        // Assertion
        String actualMessage = schedulePage.messageOutArea.getText();

        Assert.assertTrue(actualMessage.contains(message));
    }

    //  2 AC: user should be able to choose clinic location manually in case if there is no location in user area

    @When("click on clinic location module")
    public void click_on_clinic_location_module() {

        wait.until(ExpectedConditions.visibilityOf(driver.getDriver().findElement(By.xpath("//button[@data-testid='virtualClinicBox']"))));
        actions.moveToElement(schedulePage.clinicLocationDrop).click().perform();

    }

    @Then("user see available clinic location")
    public void user_see_available_clinic_location(List<String> allLocationsExpected) {
        List<WebElement> allActualLocations = schedulePage.allLocations;
        List<String> listOfAllActuallLocations = new ArrayList<>();

        for (WebElement eachElement : allActualLocations) {
            listOfAllActuallLocations.add(eachElement.getText());
        }
        System.out.println("Actual locations " + listOfAllActuallLocations);
        System.out.println("Expected locations " + allLocationsExpected);

// Assertion
        Assert.assertEquals("NOT MATCHED", allLocationsExpected, listOfAllActuallLocations);
    }


}
