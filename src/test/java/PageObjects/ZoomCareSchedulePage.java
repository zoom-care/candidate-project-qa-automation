package PageObjects;

import Utility.BaseUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ZoomCareSchedulePage extends BaseUtility {

    @FindBy(xpath = "//div[@id='quickSelectorRefinerContainer']/*[1]")
    WebElement locationSelector;

    @FindBy(xpath = "//div[@id='quickSelectorRefinerContainer']/*[2]")
    WebElement serviceSelector;

    @FindBy(xpath = "//div[@id='quickSelectorRefinerContainer']/*[2]")
    WebElement dateSelector;

    @FindBy(xpath = "//div[@data-testid='quickSelector.location.popoverContent']")
    WebElement locationSelectorList;

    @FindBy(xpath = "//div[@data-testid='quickSelector.service.popoverContent']")
    WebElement serviceSelectorList;

    @FindBy(id = "quickSelectorSubmit")
    WebElement buttonSearch;

    @FindBy(xpath = "//div[@data-testid='ServiceLine.1.Clinic.1.Provider.1']/div/div[2]/*[last()]")
    WebElement buttonMoreSlotTime;

    @FindBy(xpath = "//div[@data-testid='ServiceLine.1.Clinic.1.Provider.1']/div/div[2]/*[.='Less']")
    WebElement buttonLessSlotTime;

    @FindBy(xpath = "//div[contains(@data-testid,'LocationRow')]/div/div/div/div[2]")
    List<WebElement> listResulttLocations;

    private WebDriver driver;
    private WebDriverWait wait;

    public ZoomCareSchedulePage(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
        PageFactory.initElements(driver,this);
    }

    //Method to return the text on the location selector.
    public String getTextFromLocationSelector(){
        return getText(locationSelector);
    }

    //Method to return the text on the service selector.
    public String getTextFromServiceSelector(){
        return getText(serviceSelector);
    }

    //Method to visit the Schedule page
    public void goToSchedulePage(){
        goTo(driver,"https://www.zoomcare.com/schedule/");
    }

    //Method to search for an appointment on a specific location and service.
    public void searchForAnAppointment(String location,String service){

        wait.until(ExpectedConditions.elementToBeClickable(locationSelectorList));
        Select selectLocation= new Select(locationSelectorList);
        selectLocation.selectByVisibleText(location);

        wait.until(ExpectedConditions.elementToBeClickable(serviceSelectorList));
        Select selectService= new Select(serviceSelectorList);
        selectService.selectByVisibleText(service);

        wait.until(ExpectedConditions.elementToBeClickable(dateSelector));
        clickOnElement(dateSelector);
        clickOnElement(dateSelector);

        wait.until(ExpectedConditions.elementToBeClickable(buttonSearch));
        clickOnElement(buttonSearch);

    }

    //Method to click on the More option on the slot times.
    public void clickOnTheButtonMoreSlotTime(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonLessSlotTime));
        clickOnElement(buttonMoreSlotTime);
    }

    //Method to click on the Less option on the slot times.
    public boolean isLessButtonDisplayed(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonLessSlotTime));
        return isDisplayed(buttonLessSlotTime);
    }

    //Method to search a keyword on every string in the list.
    public boolean keyLocationOnTheList(String keyWord){
        List<String> listString= new ArrayList<>();
        listString= getTextFromList(listResulttLocations);

        for(int i=0;i<listString.size();i++){
            if(!listString.get(i).contains(keyWord)){
                return false;
            }
        }

        return true;
    }

}
