package org.delta.pex.pagemodels.Candidate;

import org.delta.automation.automationcoreframework.logger.Log;
import org.delta.automation.selenium.automationbaseclasses.BaseTestPage;
import org.delta.pex.utils.SeleniumFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ZoomLandingPage extends BaseTestPage {
    private SoftAssert softAssert;

    @FindBy(xpath ="//*[@data-testid='text-Schedule your visit']")
    private WebElement Scheduler;

    @FindBy(xpath ="//*[@data-testid='quickScheduler.location.popover']")
    private WebElement ChooseLocation;

    @FindBy(xpath ="//*[@data-testid='quickScheduler.service.popover']")
    private WebElement ChooseService;

    @FindBy(xpath ="//*[@data-testid='button-quickScheduler.button']")
    private WebElement ScheduleNow;

    @FindBy(xpath ="//*[@data-testid='text-quick-scheduler-option-location-seattle--wa']")
    private WebElement Seattle;

    @FindBy(xpath ="//*[@data-testid='text-quick-scheduler-option-service-illness-injury']")
    private WebElement Illness;

    public ZoomLandingPage(WebDriver driver, SoftAssert soAssert) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.softAssert = new SoftAssert();
    }

    public void verifySchedulerDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(Scheduler, 1000);
            Log.LOGGER.info("verifying if the Scheduler is displayed");
            softAssert.assertTrue(Scheduler.isDisplayed(), "Scheduler is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyChooseLocationDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ChooseLocation, 1000);
            Log.LOGGER.info("verifying if Choose Location is displayed");
            softAssert.assertTrue(ChooseLocation.isDisplayed(),"Choose Location is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyChooseServiceDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ChooseService, 1000);
            Log.LOGGER.info("verifying if Choose Service is displayed");
            softAssert.assertTrue(ChooseService.isDisplayed(),"Choose Service is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyScheduleNowDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduleNow, 1000);
            Log.LOGGER.info("verifying if Schedule Now button is displayed");
            softAssert.assertTrue(ScheduleNow.isDisplayed(),"Schedule Now button is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyScheduleNowIsDisabled() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduleNow, 1000);
            Log.LOGGER.info("verifying if Schedule Now button is not enabled");
            softAssert.assertFalse(ScheduleNow.isEnabled(),"Schedule Now button is not enabled");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyScheduleNowIsEnabled() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduleNow, 1000);
            Log.LOGGER.info("verifying if Schedule Now button is enabled");
            softAssert.assertTrue(ScheduleNow.isEnabled(),"Schedule Now button is enabled");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void selectLocation() {
        try {
            this.getSeleniumWait().waitForElementToBeClickable(ChooseLocation, 10000);
            Log.LOGGER.info("select a Location");
            driver.findElement(By.id("quickScheduleLocation")).click();
            Log.LOGGER.info("click Seattle");
            this.getSeleniumWait().waitForElementToBeClickable(Seattle, 10000);
            driver.findElement(By.id("quick-scheduler-option-location-seattle--wa")).click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void selectService() {
        try {
            this.getSeleniumWait().waitForElementToBeClickable(ChooseService, 10000);
            Log.LOGGER.info("select a Service");
            driver.findElement(By.id("quickScheduleService")).click();
            Log.LOGGER.info("click Illness/Injury");
            this.getSeleniumWait().waitForElementToBeClickable(Illness, 10000);
            driver.findElement(By.id("quick-scheduler-option-service-illness-injury")).click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void clickScheduleNow() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduleNow, 1000);
            Log.LOGGER.info("click Schedule Now button");
            softAssert.assertTrue(ScheduleNow.isEnabled(),"clicked Schedule Now button");
            ScheduleNow.click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }
}
