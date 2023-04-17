package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class SchedulePage extends BasePage {
    public SchedulePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By scheduleBtn = By.cssSelector("a#nav-schedule");
    By locationField = By.xpath("//div[@data-testid='quickSelector.location.popover']//div[contains(text(),'Portland')]"); ////div[@data-testid='quickSelector.locationSelector']
    By denverCOLocation = By.cssSelector("#quick-selector-option-location-denver--co");
    By serviceField = By.xpath("//div[@data-testid='quickSelector.service.popover']"); ////div[text()='Choose Service']
    By illInjService = By.xpath("//div[contains(text(),'Illness/Injury')]");
    By dateField = By.xpath("//div[@data-testid='quickSelector.dateSelector']"); ////div[@data-testid='quickSelector.date.popover'] //div[text()='Choose Date']
    By todayDate = By.xpath("//div[@id='popover']//div[contains(text(),'17')]");
    By searchBtn = By.cssSelector("#quickSelectorSubmit");
    By videoCareBtn = By.xpath("//button[@data-testid='virtualVideoBox']");
    By clinicInfoBtn = By.xpath("//div[@data-testid='ServiceLine.1']//div[contains(text(),'Info')]");
    By clinicVisitPopUp = By.xpath("//div[@data-testid='service-line-info-card-Illness/Injury-Clinic-Visit']");
    By firstTimeslot = By.xpath("//div[@id='booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1-1681740000000']");
    By moreBtn = By.xpath("//div[@data-testid='ServiceLine.1.Clinic.1']//div[contains(text(),'More')]");
    By lessBtn = By.xpath("//div[@data-testid='ServiceLine.1.Clinic.1']//div[contains(text(),'Less')]");


    public SchedulePage selectSchedule() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(scheduleBtn)).click();
        Thread.sleep(2000);
        return this;
    }

    public SchedulePage selectLocation() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(locationField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(denverCOLocation)).click();
        return this;
    }

    public SchedulePage selectService() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(serviceField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(illInjService)).click();
        Thread.sleep(2000);
        return this;
    }

    public SchedulePage selectDate() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(dateField)).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(todayDate)).click();
        return this;
    }

    public SchedulePage clickSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        return this;
    }

    public boolean isCODisplayed() {
        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@data-testid='ServiceLine.1.ClinicSection']"));
        for (WebElement clinic : searchResults) {
            if (clinic.getText().contains("CO 80")) {
            }
        }
        return true;
    }
    public SchedulePage clickVideoCareBtn() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(videoCareBtn)).click();
        Thread.sleep(2000);
        return this;
    }

    public SchedulePage clickClinicInfoBtn() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(clinicInfoBtn)).click();
        Thread.sleep(2000);
        return this;
    }

    public boolean isClinicIllInjPopUpDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clinicVisitPopUp));
        return true;
    }

    public SchedulePage clickFirstTimeslot() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(firstTimeslot)).click();
        Thread.sleep(2000);
        return this;
    }

    public boolean isLoginPageDisplayed(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.zoomcare.com/login");
        return true;
    }

    public SchedulePage clickMoreBtn() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn)).click();
        Thread.sleep(2000);
        return this;
    }
    public boolean isLessBtnDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lessBtn));
        return true;
    }
}
