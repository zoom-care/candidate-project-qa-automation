package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.record.SCLRecord;
import org.junit.Assert;
import pages.SchedulePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ScheduleStepDefs {
    Faker faker = new Faker();
    SchedulePage schedulePage = new SchedulePage();

    @Given("user gets on the schedule page")
    public void user_gets_on_the_schedule_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("zoom_care_schedule"));
    }

    @Given("user clicks on the loginButton")
    public void user_clicks_on_the_login_button() {
        schedulePage.loginButton.click();
    }

    @Then("user verifies {string}")
    public void user_verifies(String string) {
        String actualassert = Driver.getDriver().getTitle();
        String expectedassert = "Already have an account?";
        Assert.assertEquals(actualassert, expectedassert);
    }

    //US_002
    @Given("User will navigate to the schedule page")
    public void user_will_navigate_to_the_schedule_page() {
        Driver.getDriver().get("https://www.zoomcare.com/schedule");
    }

    @Given("when users click on the ChatCare")
    public void when_users_click_on_the_chat_care() {
        Driver.waitAndClick(schedulePage.chatCareButton, 2);
    }

    @Given("user should be able to redirect to the Log in page")
    public void user_should_be_able_to_redirect_to_the_log_in_page() {
    }

    @Given("user sends {string} and {string}")
    public void user_sends_and(String email, String password) {
        Driver.waitAndSendText(schedulePage.email, "abc@gmail.com");
        Driver.waitAndSendText(schedulePage.password, "123mazda");
        Driver.waitAndClick(schedulePage.signInButton);
    }

    @Then("user verifies unable to sign in information")
    public void user_verifies_unable_to_sign_in_information() {
        Assert.assertEquals("Unable to sign in",schedulePage.unableToSignIn.getText());
    }
    //US_003
    @When("user needs to click the Clinic")
    public void user_needs_to_click_the_clinic() {
        Driver.getDriver().get(ConfigurationReader.getProperty("zoom_care_schedule"));
    }
    @Given("users on the illness section")
    public void users_on_the_illness_section() {
        schedulePage.illinessinjury_box.click();
    }
    @Given("user chooses Orthopedics")
    public void user_chooses_orthopedics() {
        schedulePage.orthopedics.click();
        Driver.wait(4);
        schedulePage.calender.click();
    }
    @Then("user verifies the calender does appear")
    public void user_verifies_the_calender_does_appear() {

        Assert.assertEquals("Calender",schedulePage.calender.getText());

    }
    @Then("user verifies the Orthopedics sign")
    public void user_verifies_the_orthopedics_sign() {

        Assert.assertEquals("Orthopedics",schedulePage.orthopedicSign.getText());
    }
    //US_004

    @Given("clicks on myvisit button")
    public void clicks_on_myvisit_button() {
        schedulePage.myVisitButton.click();
    }

    @Given("user clicks signIn;")
    public void user_clicks_sign_in() {

        schedulePage.email.sendKeys("musa1@gmail.com");
        schedulePage.password.sendKeys("Mersion4519@");
        schedulePage.signINin.click();
    }

    @Given("user clicks on Need help sign in option")
    public void user_clicks_on_need_help_sign_in_option() {

        Driver.waitAndClick(schedulePage.needHelpSignInOption,2);
    }

    //US_005

    @Given("users click on showMore button")
    public void users_click_on_show_more_button() {

        Driver.waitAndClick(schedulePage.showMorebutton,2);

    }
    @Given("user clicks on nine fifteen AM appointment")
    public void user_clicks_on_nine_fifteen_am_appointment() {

        Driver.waitAndClick(schedulePage.ninefifteen,2);
    }

    //US_006

    @Given("user click on the calender and chooses April 4th")
    public void user_click_on_the_calender_and_chooses_april_4th() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("zoom_care_schedule"));
        Thread.sleep(3000);
        schedulePage.illinessinjury_box.click();

    }

    @Given("user click on the calender")
    public void user_click_on_the_calender() {
        schedulePage.forwardCalender.click();
        schedulePage.april.click();
    }

    //US_007
    @Given("user clicks on the dollar sign")
    public void user_clicks_on_the_dollar_sign() {
        schedulePage.dollarSignInfo.click();
    }
    @Given("user clicks on the More Info")
    public void user_clicks_on_the_more_info() {

        schedulePage.moreInfoSign.click();
        Driver.wait(3);
    }
    @Given("user clicks on the See Accepted Insurance")
    public void user_clicks_on_the_see_accepted_insurance() {

        schedulePage.seeAcceptedInsurance.click();
        Driver.wait(5);
    }

    @Then("user verifies Yes_ZoomCARE_Insurance")
    public void user_verifies_yes_zoom_care_insurance() {

    }

    //US_008

    @Given("user clicks on the signup button")
    public void user_clicks_on_the_signup_button() {

        schedulePage.sigUpButton.click();

    }
    @Given("user inputs username and password")
    public void user_inputs_username_and_password() {

        schedulePage.UserNameemail.sendKeys(faker.internet().emailAddress());
        schedulePage.strongPassword.sendKeys("MazdaLovers@1");
        Driver.wait(3);
        schedulePage.Nextbutton.click();

    }
    @Given("user place firstname lastname Mobilenumber Address zip birthday Gender")
    public void user_place_firstname_lastname_mobilenumber_address_zip_birthday_gender() {

        schedulePage.firstName.sendKeys(faker.name().firstName());
        schedulePage.lastName.sendKeys(faker.name().lastName());
        schedulePage.mobileNumber.sendKeys("3234343433");
        schedulePage.address.sendKeys(faker.address().fullAddress());
        schedulePage.zipCode.sendKeys("98121");
        schedulePage.birthDay.sendKeys("12/23/1985");
        schedulePage.malesOption.click();
        schedulePage.nextButton.click();

    }

    @Then("user verifies does this look right sign")
    public void user_verifies_does_this_look_right_sign() {

        Assert.assertEquals("Does this look right?",schedulePage.doesThisLookRightSign.getText());

    }

}










