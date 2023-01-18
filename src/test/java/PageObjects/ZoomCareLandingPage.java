package PageObjects;

import Utility.BaseUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomCareLandingPage extends BaseUtility {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//div[@data-testid='quickSelector.location.popoverContent']")
    WebElement locationSelector;

    @FindBy(xpath = "//div[@data-testid='quickSelector.service.popoverContent']")
    WebElement serviceSelector;

    @FindBy(id = "quickSelectorSubmit")
    WebElement scheduleBotton;

    public ZoomCareLandingPage(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
        PageFactory.initElements(driver,this);
    }

    //Method to search for an appointment on the landing page.
    public void searchForAnAppoinment(String location,String service){
        wait.until(ExpectedConditions.elementToBeClickable(locationSelector));
        Select selectLocation = new Select(locationSelector);
        selectLocation.selectByVisibleText(location);

        wait.until(ExpectedConditions.elementToBeClickable(serviceSelector));
        Select selectService = new Select(serviceSelector);
        selectService.selectByVisibleText(service);

        wait.until(ExpectedConditions.elementToBeClickable(scheduleBotton));
        clickOnElement(scheduleBotton);
    }

    //Method to get the landing page.
    public void goToLandingPage(){
        goTo(driver,"https://www.zoomcare.com/");
    }
}
