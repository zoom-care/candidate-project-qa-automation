package Sergei.com.steps_definition;

import Sergei.com.pages.SchedulePage;
import Sergei.utility.browserUtil;
import Sergei.utility.driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class US_2_as_user_I_should_be_able_to_schedule_appointment {
    SchedulePage schedulePage = new SchedulePage();
    Faker faker = new Faker();
    int choseDate = 0;
    String chosenService = "";

    @When("user click on schedule module")
    public void user_click_on_schedule_module() {
        browserUtil.sleep(3);
        schedulePage.ScheduleModule.click();

    }

    @When("user choose clinic location")
    public void user_choose_clinic_location() {

        browserUtil.sleep(4);
        schedulePage.clinicLocationDrop.click();
        List<WebElement> allLocations = schedulePage.allLocations;
        int randomNumLocations = faker.number().numberBetween(0, allLocations.size() - 1);

        for (int i = 0; i < allLocations.size(); i++) {
            if (i == randomNumLocations) {
                allLocations.get(i).click();
                break;
            }
        }
    }

    @When("user choose service")
    public void user_choose_service() {
        //  BrowserUtil.sleep(2);
        schedulePage.chooseServicesDrop.click();
        int num = 0;
        List<WebElement> allServices = schedulePage.allServices;
        int randomNumService = faker.number().numberBetween(0, allServices.size() - 1);

        for (WebElement eachElement : allServices) {
            if (num == randomNumService) {
                chosenService = eachElement.getText();
                eachElement.click();
                break;
            }
            num++;
        }
    }

    @When("user choose available date")
    public void user_choose_available_date() {
        browserUtil.sleep(2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDate localDate = new LocalDate();
        Integer day = Integer.parseInt(localDate.dayOfMonth().getAsString());

        System.out.println(day);

        schedulePage.chooseDateDrop.click();
        choseDate = faker.number().numberBetween(day, 31);
        System.out.println("Random date " + choseDate);
        for (int i = day; i <= 31; i++) {
            if (i == choseDate && schedulePage.switchAvailableDate(choseDate).isEnabled()) {
                schedulePage.switchAvailableDate(choseDate).click();
                break;
            }
        }
    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        WebDriverWait wait = new WebDriverWait(driver.getDriver(), 5);

        wait.until(ExpectedConditions.elementToBeClickable(schedulePage.searchButton)).click();

    }


    @Then("use should able to see list of availabilities and defined date")
    public void use_should_able_to_see_list_of_availabilities_and_defined_date() {
        browserUtil.sleep(3);

// Assertion
        System.out.println("Chosen service " + chosenService);
        System.out.println("Actual service " + schedulePage.headerOfServiceList.getText());
        Assert.assertTrue("NOT MATCHED", chosenService.contains(schedulePage.headerOfServiceList.getText()));


    }


    // AC 2 if user did not choose specific Service "Choose Date" dropdown should be disabled


    @When("user choose {string} dropdown")
    public void user_choose_dropdown(String clinicLocation) {
        browserUtil.sleep(3);
        schedulePage.switchLocation(clinicLocation);

    }

    @When("user click on choose date")
    public void user_click_on_choose_date() {
        schedulePage.chooseDateDrop.click();
    }

    @Then("user see {string}, search button disabled")
    public void user_see_search_button_disabled(String message) {
        //Assertion
        System.out.println("Actual message " + schedulePage.message.getText());
        System.out.println("Expected message " + message);
        Assert.assertEquals("NOT MATCHED", schedulePage.message.getText(), message);
    }

  //  3 AC as user I should be able to see list of services for each clinic

    @When("user click choose service")
    public void user_click_choose_service() {
       schedulePage.chooseServicesDrop.click();
    }

    @Then("user see list of services for clinic")
    public void user_see_list_of_services_for_clinic() {
      List <String> actualListOfServices = new ArrayList<>();
      for(WebElement eachElement : schedulePage.allServices){
          actualListOfServices.add(eachElement.getText());
      }
        System.out.println("Actual list of services " + actualListOfServices);


    }
    @Then("list of services should match with list of services from database")
    public void list_of_services_should_match_with_list_of_services_from_database() {

        // verification if actual list of services (from UI) is match with expected list of services from DB

        // if I have access to DB I can perform this two point verification


    }



}












