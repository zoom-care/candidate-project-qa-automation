package Sergei.com.steps_definition;

import Sergei.com.pages.SchedulePage;
import Sergei.utility.browserUtil;
import Sergei.utility.driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_1_user_should_be_able_to_see_main_modules {

    //US 1: main modules presence checking
//1 AC: main modules presence checking.
    SchedulePage schedulePage = new SchedulePage();

    @Given("user on home page")
    public void user_on_home_page() {
//always come from hooks class
    }

    @When("use able to see main modules on home page")
    public void use_able_to_see_main_modules_on_home_page(List<String> list) {

        List<WebElement> listOfWebElements = driver.getDriver().findElements(By.xpath("//a[contains(@id,'nav-')]"));

        List<String> listOfActualModules = new ArrayList<>();

        for (int i = 0; i < listOfWebElements.size(); i++) {
            listOfActualModules.add(listOfWebElements.get(i).getText());
        }
        listOfActualModules.remove(listOfActualModules.size() - 1);
        for (int i = 0; i < listOfActualModules.size(); i++) {
            if (listOfActualModules.get(i).equals("")) {
                listOfActualModules.remove(i);

            }
        }

        // Assertion part
        Assert.assertEquals("NOT MATCHED", list, listOfActualModules);

    }

    @When("user able to see {string} button, it should be enable")
    public void user_able_to_see_button(String expectedLogin) {

        String actualLogin = schedulePage.loginButton.getText();

        //Assertion button presence
        Assert.assertEquals("NOT MATCHED", expectedLogin, actualLogin);
        Assert.assertTrue("LOGIN Button  DISABLED", schedulePage.loginButton.isEnabled());


    }

//2 AC: main modules clickability checking.
    @When("user click {string}")
    public void user_click(String module) {


        browserUtil.sleep(2);

        schedulePage.switchMainModules(module);

    }

    @Then("user see page related each module and title of pages contains {string} name")
    public void user_see_page_related_each_module_and_title_of_pages_contains_name(String expectedTitle) {
        browserUtil.sleep(2);

        System.out.println("Actual title " + browserUtil.titleVerification());
        System.out.println("Expected title " + expectedTitle);

        //Assertion
        Assert.assertTrue("TITLE NOT MATCHED ", browserUtil.titleVerification().contains(expectedTitle));


    }


}
