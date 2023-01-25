package com.zoomCare.pages;

import com.zoomCare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ZoomCarePages {


    public ZoomCarePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"quickSelectorRefinerContainer\"]/div[1]/div")
    public WebElement locationDropDown;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/h1")
    public WebElement title;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n'])[7]//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']//div")
    public List<WebElement> all_Locations;

    public void clickOnLocation(String location) {
        for (WebElement eachLocation : all_Locations) {
            if (eachLocation.getText().equals(location)) {
                eachLocation.click();
                break;
            }

        }
    }

    @FindAll(@FindBy(css = "[id^=quick-selector-option-location-]"))
    public List<WebElement> cities;

    @FindAll(@FindBy(css = ".r-lrvibr div div"))
    public List<WebElement> allDates;

    public void citySelector(String city) {
        for (WebElement eachCity : cities) {
            if (eachCity.getText().equals(city)) {
                eachCity.click();
                break;
            }
        }
    }

    @FindBy(xpath = "//*[@id=\"quickSelectorRefinerContainer\"]/div[3]/div")
    public WebElement dateBox;

    public void dateSelector() {
        List<WebElement> availableDates = new ArrayList<>();

        for (WebElement eachDate : allDates) {
            if (!eachDate.getAttribute("style").contains("rgb(219, 219, 219)")) {
                availableDates.add(eachDate);
            }
        }
        availableDates.get(0).click();


    }

    public void dateSelector(int day) {
        List<WebElement> availableDates = new ArrayList<>();
        for (WebElement eachDate : allDates) {
            if (!eachDate.getAttribute("style").contains("rgb(219, 219, 219)")) {
                availableDates.add(eachDate);
            }
        }
        for (WebElement eachDate : availableDates) {
            if (Integer.parseInt(eachDate.getText()) == day) {
                eachDate.click();
                break;
            }
        }
    }

        @FindBy(xpath = "//*[@id=\"quickSelectorRefinerContainer\"]/div[2]/div")
        public WebElement servicesDropdown;

        @FindAll(@FindBy(css = "[id^=quick-selector-option-service-]"))
        public List<WebElement> services;

        public void serviceSelector(String service) {
            for (WebElement each : services) {
                if (each.getText().strip().equalsIgnoreCase(service)) {
                    each.click();
                    break;
                }
            }
        }

    @FindBy(xpath = "//*[@id=\"quickSelectorSubmit\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@data-testid='text-The selected day is not available.']")
    public WebElement errorMessage;

    }




