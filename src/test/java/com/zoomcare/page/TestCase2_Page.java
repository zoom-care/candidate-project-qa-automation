package com.zoomcare.page;

import com.zoomcare.uitilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase2_Page {


    public TestCase2_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //===================================================================================
    //====================================================================================
    @FindBy(xpath = "//div[@data-testid='CareSelector.popover']")
    public WebElement dropdown;
    //div[data-testid='CareSelector.popover'] div[class='css-901oao css-vcwn7f']

    @FindBy(xpath = "(//span[@class='css-901oao css-16my406'])[1]")
    public WebElement wantCare;

    @FindBy(xpath = "//div[@data-testid='LocationSelector.option.Vancouver, WA']")
    public WebElement location;

    @FindBy(xpath = "//div[@dir='auto'][normalize-space()='Primary Care']")
    public WebElement primaryCare;

    @FindBy(xpath = "(//div[@data-testid='ServiceLine.1.Clinic.1.Provider.1'])[1]")
    public WebElement provider;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n'])[17]")
    public WebElement earliestTime;


//====================================================================================

    public void clickOnLocation() {
        wantCare.click();
    }

    public void selectLocation() {
        location.click();
    }

    public void clickOnDropDown() {
        dropdown.click();
    }

    public void selectPrimaryCare() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(primaryCare));
        primaryCare.click();
    }

    public void selectProvider() {
        provider.click();
    }

    public void selectTime() {
        earliestTime.click();
    }


    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

}
