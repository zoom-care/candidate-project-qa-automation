package Sergei.com.pages;

import Sergei.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    // page object model design pattern implemented

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-schedule")
    public WebElement ScheduleModule;


    @FindBy(linkText = "Locations")
    public WebElement LocationsModule;

    @FindBy(xpath = "//a[contains(@class, 'nav__link__services')]")
    public WebElement servicesModule;

    @FindBy(xpath = "//a[text()='Pricing & Insurance']")
    public WebElement pricingInsuranceModule;

    @FindBy(id = "authentication-button-login")
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()='Loading...']")
    public WebElement loading;



    public void switchMainModules(String moduleName) {
        Driver.getDriver().findElement(By.xpath("//a[text()='" + moduleName + "']")).click();

    }

}
