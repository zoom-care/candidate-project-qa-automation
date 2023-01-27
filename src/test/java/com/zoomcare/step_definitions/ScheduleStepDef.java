package com.zoomcare.step_definitions;

import com.zoomcare.pages.SchedulePage;
import com.zoomcare.utilities.ConfigurationReader;
import com.zoomcare.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ScheduleStepDef {
    SchedulePage schedulePage = new SchedulePage();
    WebDriverWait wait;

    @Given("user lands on schedule page")
    public void user_lands_on_schedule_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When ("User clicks on location dropdown")
    public void User_clicks_on_location_dropdown () throws InterruptedException {
        Thread.sleep(5000);
        schedulePage.locationDropdown.click();
    }
    @When("User clicks on {string} for location")
    public void User_clicks_on_location_for_location (String location) throws InterruptedException {
        System.out.println(schedulePage.Portland.getText());
    List<WebElement> cities = schedulePage.cities;
        for (WebElement each:cities){
            System.out.println(each.getText());
            }

        switch (location) {
            case "Denver, CO":
               schedulePage.Denver.click();
                break;
            case "Portland, OR":
                Thread.sleep(2000);
                schedulePage.Portland.click();
                break;
            case "Seattle, WA":
                schedulePage.Seattle.click();
                break;
            case "Vancouver, WA":
                schedulePage.Vancouver.click();
                break;
            case "Salem, OR":
                schedulePage.Salem.click();
                break;
            case "Eugene, OR":
                schedulePage.Eugene.click();
                break;
            case "Boulder, CO":
                schedulePage.Boulder.click();
                break;
            case "Boise, ID":
                schedulePage.Boise.click();
                break;

        }
        }

    @Then("Calender picks Today automatically")
    public void calender_picks_today_automatically() {
      Assert.assertEquals("Today",schedulePage.today.getText());
    }
    @Then("User clicks on Search button and lands on time box page")
    public void user_clicks_on_search_button_and_lands_on_time_box_page() {
        schedulePage.searchButton.click();
        String ec="Emergency Care";
        Assert.assertEquals(ec,schedulePage.emergencyCareValidation.getText());
    }

    @When("User clicks on {string} from service")
    public void user_clicks_on_from_service(String service) throws InterruptedException {
Thread.sleep(5000);
        schedulePage.illness.click();

        switch (service) {
            case "Emergency Care":
                schedulePage.emergencyCare.click();
                assertEquals("Today", schedulePage.today.getText());
                break;
            case "Family Medicine":
              schedulePage.familyMedicine.click();
                break;
            case "Mental Health Meds & More":
               schedulePage.mentalHealthMedsMore.click();
                break;
            case "Mental Health Talk Therapy":
                schedulePage.mentalHealthTalkTherapy.click();
                break;
            case "X-Ray, Ultrasound & CT":
                schedulePage.xrayUltrasoundCt.click();
                break;
            case "5-Minute Flu Shot":
                schedulePage.fluShot.click();
                break;
            case "Primary Care":
                schedulePage.primaryCare.click();
                break;

        }




    }

    @When("User clicks on use my location from location options")
    public void user_clicks_on_choose_location_out_of_area()  {
       try {
            wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOf(schedulePage.useMyLocation));
            schedulePage.useMyLocation.click();
            String message =schedulePage.outOfAreaMessage.getText();
           System.out.println("outOfAreaMessage = " + message);
           Assert.assertEquals("We're not in your area yet—but we're growing almost as fast as we deliver care!",message);

       }
        catch (Exception e){
            System.out.println(e);
        }


    }

    @Then("User should see warning message")
    public void user_should_see_warning_pop_up_message() {

        assertEquals("We're not in your area yet—but we're growing almost as fast as we deliver care!", schedulePage.outOfAreaMessage.getText());

    }

    @And("User clicks on choose date")
    public void User_clicks_on_choose_date() throws InterruptedException {
Thread.sleep(3000);
        schedulePage.chooseDate.click();

    }

    @And("User clicks on Search button and lands on Primary Care page")
    public void User_clicks_on_Search_button_and_lands_on_video_visit_page(){

        schedulePage.searchButton.click();


        assertEquals("Primary Care",schedulePage.primaryCare.getText());

    }

    @And("User clicks on Clinic Care image")
    public void User_clicks_on_Clinic_Care_image() throws InterruptedException {
        Thread.sleep(5000);
        schedulePage.clinicCare.click();
        Thread.sleep(5000);
        assertEquals("We're not in your area yet—but we're growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more. Want to see clinics outside of your region? Click below.",schedulePage.outOfAreaMessage.getText());

    }

    @And("User clicks on show more link and verify clinic outside warning message")
    public void User_clicks_on_show_more_link() throws InterruptedException {
        schedulePage.showMore.click();
        Thread.sleep(5000);
        assertEquals("This clinic is outside your region",schedulePage.clinicOutsideWarningMessage.getText());
    }

    @And("User clicks on first available time")
    public void User_clicks_on_next_available_date_on_the_first_option() throws InterruptedException {
        Thread.sleep(5000);
        schedulePage.firstTimeOption.click();


    }
    @Then("User makes video visit from first option")
    public void User_makes_video_visit_from_first_option() throws InterruptedException {
        Thread.sleep(5000);
         schedulePage.firstTimeOption.click();

    }
    @And("User lands on Login Page")
    public  void User_lands_on_Login_Page() throws InterruptedException {
Thread.sleep(2000);
    assertEquals("Login | ZoomCare",Driver.getDriver().getTitle());

    }
    @Then("User sees xray warning message")
    public void User_sees_xray_warning_message() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(schedulePage.xrayMessage.getText());
        assertEquals("Illness/Injury visit",schedulePage.xrayMessage.getText());

    }

    @And("User clicks on Illness Injury Visit link")
    public void User_clicks_on_IllnessInjury_Clinic_Visit_link() throws InterruptedException {
        Thread.sleep(5000);
        schedulePage.xrayMessage.click();
        Thread.sleep(5000);

        assertEquals("Illness/Injury Clinic Visit", schedulePage.illnessClinicVisit.getText());

    }

    @Then("User clicks on Search button")
    public void user_clicks_on_search_button() {

        schedulePage.searchButton.click();
    }

    @And ("User clicks on first time slot")
    public void User_clicks_on_first_time_slot() throws InterruptedException {
    schedulePage.firstTimeOption.click();
    Thread.sleep(5000);
    }

    @And("User clicks on map link and verifies map is opened")
    public void User_clicks_on_map_link() throws InterruptedException {
        schedulePage.mapLink.click();
        Thread.sleep(5000);
        String first = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String each: windows){
            if (each.equals(first))
                continue;
            Driver.getDriver().switchTo().window(each);
            assertEquals("Google Maps", Driver.getDriver().getTitle());
        }
Driver.getDriver().switchTo().window(first);
        Thread.sleep(5000);
    }

    @And("User clicks on price Info")
    public void User_clicks_on_price_Info(){
        schedulePage.info.click();
    }

    @Then("User verifies the price")
    public void verify_pricing(){
        String price = schedulePage.flueShotPrice.getText();
        assertEquals("$35",price);
    }

    @When("User clicks on {string} for location dropdown")
    public void User_clicks_on_location_for_location_dropdown(String location) throws InterruptedException {
        Thread.sleep(5000);
        assertEquals("Emergency Care",schedulePage.emergencyCareValidation.getText());
        List<WebElement> cities = schedulePage.cities;
        for (WebElement each:cities){
            System.out.println(each.getText());

        }

        switch (location) {
            case "Denver, CO":
                schedulePage.Denver.click();

                break;
            case "Seattle, WA":
                schedulePage.Seattle.click();

                break;
            case "Vancouver, WA":
                schedulePage.Vancouver.click();

                break;
            case "Salem, OR":
                schedulePage.Salem.click();

                break;
            case "Eugene, OR":
                schedulePage.Eugene.click();

                break;
            case "Boulder, CO":
                schedulePage.Boulder.click();

                break;
            case "Boise, ID":
                schedulePage.Boise.click();

                break;

        }
    }

    @When ("User clicks on service dropdown")
    public void User_clicks_on_service_dropdown () throws InterruptedException {
        Thread.sleep(3000);
        schedulePage.chooseService.click();
        Thread.sleep(3000);
    }

    @Then("User should see Emergency Care info on the bottom of the page")
    public void User_should_see_Emergency_Care_info_on_the_bottom_of_the_page(){
        assertEquals("Emergency Care",schedulePage.emergencyCareValidation.getText());

    }

    @Then("User should click {string}")
    public void User_should_click_VideoCare(String care) throws InterruptedException {

        switch (care) {
            case "ClinicCare":

                schedulePage.clinicCare.click();
                break;
            case "VideoCare":

                schedulePage.videoCare.click();
                break;

            case "ChatCare":
                schedulePage.chatCare.click();

                break;



    }}

    @Then("User verifies {string} on the screen")
    public void Verify_informational_text_on_the_screen(String text){
        switch (text) {
            case "WA":

                assertEquals("You must be located in WASHINGTON at the time of your appointment.",schedulePage.washingtonMessage.getText());
                break;
            case "OR":

                assertEquals("You must be located in OREGON at the time of your appointment.",schedulePage.oregonMessage.getText());
                break;

            case "ID":

                assertEquals("You must be located in IDOHO at the time of your appointment.",schedulePage.idohoMessage.getText());
                break;

            case "CO":

                assertEquals("You must be located in COLORADO at the time of your appointment.",schedulePage.coloradoMessage.getText());
                break;

        }

    }

    @And("User verifies all doctors are related with service")
    public void User_verifies_all_doctors_are_related_with_service(){
        Set<String> doctors = new HashSet<>();
                for (WebElement each: schedulePage.primaryCareDoctors){
                    doctors.add(each.getText());
                }
      doctors.forEach(System.out::println);

                String fin = "[Urgent Care and Primary Care Team]";
        assertEquals(fin, doctors.toString());
    }


}