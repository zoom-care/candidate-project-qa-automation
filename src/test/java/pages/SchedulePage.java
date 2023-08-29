package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.TestBase;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SchedulePage extends TestBase {

    // Banner link elements
    private final By homeLink = By.xpath("//*[@href='/'][@aria-label='home']");
    private final By scheduleLink = By.id("nav-schedule");
    private final By locationsLink = By.id("nav-locations");
    private final By servicesLink = By.id("nav-services");
    private final By pricingLink = By.id("nav-pricing");
    private final By loginLink = By.xpath("//*[@href='/login']");

    // Selection elements
    private final By locationSelector = By.xpath("//*[@data-testid='quickSelector.locationSelector']");
    private final By serviceSelector = By.xpath("//*[@data-testid='quickSelector.serviceSelector']");
    private final By dateSelector = By.xpath("//*[@data-testid='quickSelector.dateSelector']");
    private final By searchButton = By.id("quickSelectorSubmit");

    // Care type button/notification elements
    private final By clinicCareButton = By.xpath("//*[@data-testid='virtualClinicBox']");
    private final By videoCareButton = By.xpath("//*[@data-testid='virtualVideoBox']");

    // Service header element
    private final By serviceLineSection = By.xpath("//*[@data-testid='ServiceLineSection']");

    // Service clinic result elements
    private final By serviceLineResult = By.xpath("//*[@data-testid='ServiceLine.1.Clinic.1']");

    // Get the title of the current page
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Wait for the services section to load
    public void waitForServices() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(serviceLineSection));
    }

    // Verify the services are displayed
    public boolean verifyServicesVisible(){
        return driver.findElement(serviceLineSection).isDisplayed();
    }

    // Verify there are results on the page
    public boolean verifyResultVisible(){
        return driver.findElement(serviceLineResult).isDisplayed();
    }

    // Verify that all banner links are displayed on the page
    public boolean verifyBannerLinksPresent(){
        List<WebElement> links = new ArrayList<>();
        links.add(driver.findElement(homeLink));
        links.add(driver.findElement(scheduleLink));
        links.add(driver.findElement(locationsLink));
        links.add(driver.findElement(servicesLink));
        links.add(driver.findElement(pricingLink));
        links.add(driver.findElement(loginLink));
        for (WebElement l : links) {
            if (!l.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    // Verify that the banner links are working URLs
    public boolean verifyBannerLinksWorking(){
        List<WebElement> links = new ArrayList<>();
        links.add(driver.findElement(homeLink));
        links.add(driver.findElement(scheduleLink));
        links.add(driver.findElement(locationsLink));
        links.add(driver.findElement(servicesLink));
        links.add(driver.findElement(pricingLink));
        links.add(driver.findElement(loginLink));

        HttpURLConnection huc = null;
        String url;
        for (WebElement l : links) {
            url = l.getAttribute("href");
            // Try to connect to each URL with a simple request
            try{
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                // If response is over 400, the link is not working correctly
                if (huc.getResponseCode() >= 400){
                    return false;
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return true;
    }

    // Verify that the clinic care button is present
    public boolean verifyClinicCareButtonPresent(){
        try{
            driver.findElement(clinicCareButton);
            return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }

    // Verify that the video care button is present
    public boolean verifyVideoCareButtonPresent(){
        try{
            driver.findElement(videoCareButton);
            return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }

    // Click the button for the city specified
    public void selectCity(String city){
        driver.findElement(locationSelector).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popover")));
        driver.findElement(By.xpath("//*[contains(@id,'quick-selector-option-location-" + city + "')]")).click();
    }

    // Click the button for the service specified
    public void selectService(String service){
        driver.findElement(serviceSelector).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popover")));
        driver.findElement(By.xpath("//*[contains(@id,'quick-selector-option-service-" + service + "')]")).click();
    }

    // Click the next available date on the calendar
    public void selectNextAvailableDate(){
        sleep(1);
        driver.findElement(dateSelector).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popover")));
        driver.findElement(By.xpath("//*[@tabindex='0'][@dir='auto']")).click();
        sleep(1);
    }

    // Click the next available time in the first result
    public void selectNextAvailableTime(){
        sleep(1);
        driver.findElement(By.xpath("//*[contains(@data-testid,'button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1')]")).click();
        sleep(1);
    }

    public void clickHomeLink(){
        driver.findElement(homeLink).click();
    }

    public void clickScheduleLink(){
        driver.findElement(scheduleLink).click();
    }

    public void clickLocationsLink(){
        driver.findElement(locationsLink).click();
    }

    public void clickServicesLink(){
        driver.findElement(servicesLink).click();
    }

    public void clickPricingLink(){
        driver.findElement(pricingLink).click();
    }

    public void clickLoginLink(){
        driver.findElement(loginLink).click();
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void clickClinicCareButton(){
        driver.findElement(clinicCareButton).click();
    }

    public void clickVideoCareButton(){
        driver.findElement(videoCareButton).click();
    }

    public String getCurrentService(){
        return driver.findElement(serviceSelector).getText();
    }

    public String getCurrentLocation(){
        return driver.findElement(locationSelector).getText();
    }

    public String getCurrentDate(){
        return driver.findElement(dateSelector).getText();
    }
}
