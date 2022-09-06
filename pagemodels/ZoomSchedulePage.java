package org.delta.pex.pagemodels.Candidate;

import org.delta.automation.automationcoreframework.logger.Log;
import org.delta.automation.selenium.automationbaseclasses.BaseTestPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ZoomSchedulePage extends BaseTestPage {
    private SoftAssert softAssert;

    @FindBy(xpath ="//*[@data-testid='text-scheduler.location.label']")
    private WebElement ScheduledLocation;

    @FindBy(xpath ="//*[@data-testid='CareSelector.trigger']")
    private WebElement ScheduledService;

    @FindBy(xpath ="//*[@data-testid='DateSelector.trigger']")
    private WebElement ScheduledDate;

    @FindBy(xpath ="//*[@data-testid='virtualClinicBox']")
    private WebElement ClinicCareButton;

    @FindBy(xpath ="//*[@data-testid='virtualVideoBox']")
    private WebElement VideoCareButton;

    @FindBy(xpath ="//*[@data-testid='virtualChatBox']")
    private WebElement ChatCareButton;

    @FindBy(xpath ="//*[@data-testid='text-scheduler.serviceLine.title-undefined']")
    private WebElement ServiceHeader;

    @FindBy(xpath ="//*[@data-testid='ServiceLineSection']")
    private WebElement ServiceLineSection;

    @FindBy(xpath ="//*[@data-testid='text-scheduler.serviceLine.info-undefined']")
    private WebElement InfoLink;

    @FindBy(xpath ="//*[@data-testid='ServiceLine.1.ClinicSection']")
    private WebElement ServiceLineClinic;

    @FindBy(xpath ="//*[@data-testid='ServiceLine.1.Clinic.1.LocationRow']")
    private WebElement ServiceLineClinicLocation;

    @FindBy(xpath ="//*[@data-testid='map-button-4abd86a0-acc7-4afb-ae27-3e83a7f56f20']")
    private WebElement ServiceLineMapButton;

    @FindBy(xpath ="//*[@data-testid='text-View Clinic Services']")
    private WebElement ServiceLineClinicServicesLink;

    @FindBy(xpath ="//*[@data-testid='ServiceLine.1.Clinic.1.Provider.1']")
    private WebElement ServiceLineClinicProvider;

    @FindBy(xpath ="//*[@data-testid='link-ServiceLine.1.Clinic.1.Provider.1.ProviderName']")
    private WebElement ServiceLineClinicProviderName;

    @FindBy(xpath ="//*[@data-testid='text-Urgent Care and Primary Care Team']")
    private WebElement ServiceLineClinicProviderTeam;

    @FindBy(xpath ="//*[@data-testid='ServiceLine.1.Clinic.1.Provider.1.DateInfo']")
    private WebElement ServiceLineClinicProviderDateInfo;

    @FindBy(xpath ="//div[contains(@data-testid,'button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1')]")
    private WebElement ServiceLineClinicProviderTimeSlot;

    public ZoomSchedulePage(WebDriver driver, SoftAssert soAssert) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.softAssert = new SoftAssert();
    }

    public void verifyScheduledLocationDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduledLocation, 1000);
            Log.LOGGER.info("verifying if the Scheduled Location is displayed");
            softAssert.assertTrue(ScheduledLocation.isDisplayed(), "Scheduled Location is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyScheduledServiceDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduledService, 1000);
            Log.LOGGER.info("verifying if the Scheduled Service is displayed");
            softAssert.assertTrue(ScheduledService.isDisplayed(), "Scheduled Service is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyScheduledDateDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ScheduledDate, 1000);
            Log.LOGGER.info("verifying if the Scheduled Date is displayed");
            softAssert.assertTrue(ScheduledDate.isDisplayed(), "Scheduled Date is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyClinicCareButtonDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ClinicCareButton, 1000);
            Log.LOGGER.info("verifying if the Clinic Care Button is displayed");
            softAssert.assertTrue(ClinicCareButton.isDisplayed(), "Clinic Care Button is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyVideoCareButtonDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(VideoCareButton, 1000);
            Log.LOGGER.info("verifying if the Video Care Button is displayed");
            softAssert.assertTrue(VideoCareButton.isDisplayed(), "Video Care Button is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyChatCareButtonDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ChatCareButton, 1000);
            Log.LOGGER.info("verifying if the Chat Care Button is displayed");
            softAssert.assertTrue(ChatCareButton.isDisplayed(), "Chat Care Button is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceHeaderDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceHeader, 1000);
            Log.LOGGER.info("verifying if the Service Header is displayed");
            softAssert.assertTrue(ServiceHeader.isDisplayed(), "Service Header is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceLineSectionDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineSection, 1000);
            Log.LOGGER.info("verifying if the Service Line Section is displayed");
            softAssert.assertTrue(ServiceLineSection.isDisplayed(), "Service Line Section is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyInfoLinkDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(InfoLink, 1000);
            Log.LOGGER.info("verifying if the Info Link is displayed");
            softAssert.assertTrue(InfoLink.isDisplayed(), "Info Link is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceLineClinicDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinic, 1000);
            Log.LOGGER.info("verifying if the Service Line Clinic is displayed");
            softAssert.assertTrue(ServiceLineClinic.isDisplayed(), "Service Line Clinic is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void clickClinicCareButton() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ClinicCareButton, 1000);
            Log.LOGGER.info("clicking Clinic Care Button");
            ClinicCareButton.click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void clickVideoCareButton() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(VideoCareButton, 1000);
            Log.LOGGER.info("clicking Video Care Button");
            VideoCareButton.click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void clickChatCareButton() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ChatCareButton, 1000);
            Log.LOGGER.info("clicking Chat Care Button");
           ChatCareButton.click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceLineLocationDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicLocation, 1000);
            Log.LOGGER.info("verifying if the Service Line Clinic Location is displayed");
            softAssert.assertTrue(ServiceLineClinicLocation.isDisplayed(), "Service Line Clinic Location is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceLineMapDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineMapButton, 1000);
            Log.LOGGER.info("verifying if the Service Line Map button is displayed");
            softAssert.assertTrue(ServiceLineMapButton.isDisplayed(), "Service Line Map Button is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceClinicServicesDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicServicesLink, 1000);
            Log.LOGGER.info("verifying if the Service Line Clinic Services Link is displayed");
            softAssert.assertTrue(ServiceLineClinicServicesLink.isDisplayed(), "Service Line Clinic Services Link is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceClinicProviderDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicProvider, 1000);
            Log.LOGGER.info("verifying if the Service Line Clinic Provider is displayed");
            softAssert.assertTrue(ServiceLineClinicProvider.isDisplayed(), "Service Line Clinic Provider is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceClinicProviderNameDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicProviderName, 1000);
            Log.LOGGER.info("verifying if the Service Line Clinic Provider Name is displayed");
            softAssert.assertTrue(ServiceLineClinicProviderName.isDisplayed(), "Service Line Clinic Provider Name is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceClinicProviderTeamDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicProviderTeam, 1000);
            Log.LOGGER.info("verifying if the Service Line Clinic Provider Team is displayed");
            softAssert.assertTrue(ServiceLineClinicProviderTeam.isDisplayed(), "Service Line Clinic Provider Team is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyServiceClinicProviderDateInfoDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicProviderDateInfo, 10000);
            Log.LOGGER.info("verifying if the Service Line Clinic Provider Date Info is displayed");
            softAssert.assertTrue(ServiceLineClinicProviderDateInfo.isDisplayed(), "Service Line Clinic Provider Date Info is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void verifyTimeSlotDisplays() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicProviderTimeSlot, 1000);
            Log.LOGGER.info("verifying Time slot is displayed");
            softAssert.assertTrue(ServiceLineClinicProviderTimeSlot.isDisplayed(), "Time slot is displayed");
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }

    public void clickTimeSlot() {
        try {
            this.getSeleniumWait().waitForElementToBeVisible(ServiceLineClinicProviderTimeSlot, 1000);
            Log.LOGGER.info("clicking Time slot");
            ServiceLineClinicProviderTimeSlot.click();
        }
        catch(Exception e) {
            Log.LOGGER.error("Error displays -" + e);
        }
    }
}
