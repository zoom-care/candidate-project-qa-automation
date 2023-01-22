package Sergei.com.pages;

import Sergei.utility.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SchedulePage extends BasePage {

    // that class has been extended by BasePage class
    // page object model design pattern implemented


    public SchedulePage() {
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[1]")
    public WebElement clinicLocationDrop;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[2]")
    public WebElement chooseServicesDrop;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[3]")
    public WebElement chooseDateDrop;

    @FindBy(id = "quickSelectorSubmit")
    public WebElement searchButton;

    @FindBy(xpath = "//div[.='USE MY LOCATION']")
    public WebElement useMyLocation;


    @FindBy(xpath = "//div[contains(@data-testid, 'text-quick-selector-option-location')]")
    public List<WebElement> allLocations;

    @FindBy(xpath = "//div[@class='css-901oao r-18u37iz']")
    public List<WebElement> allServices;

    @FindBy(xpath = "//h1[@role='heading']")
    public WebElement headerOfServiceList;

    @FindBy(xpath = "(//div[contains(@class,'css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1o')])[3]/div[@class='css-901oao'] ")
    public WebElement message;

    @FindBy(xpath = "//div[contains(text(),'deliver care!')] ")
    public WebElement messageOutArea;

    @FindBy(xpath = "//a[@href]")
    public List <WebElement> allLinks;


    public void switchLocation(String location) {
        clinicLocationDrop.click();
        driver.getDriver().findElement(By.xpath("//div[@data-testid='text-quick-selector-option-location-" + location + "']")).click();
    }

    public WebElement switchAvailableDate (int date){
      return driver.getDriver().findElement(By.xpath("//div[text()='" + date + "']"));

    }





}

