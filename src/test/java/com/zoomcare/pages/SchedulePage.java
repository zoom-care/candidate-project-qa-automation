package com.zoomcare.pages;

import com.zoomcare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SchedulePage {

    public SchedulePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath="//nav[@class='nav__menu-2 w-nav-menu']/a")
    public List<WebElement> navigationMenu;

    @FindBy(xpath = "//div[contains(text(),'growing almost')]")
    public WebElement outOfAreaMessage;

    @FindBy(xpath = "//div[text()='Choose Location']")
    public WebElement chooseLocation;

    @FindBy(xpath = "//div[contains(text(), 'Choose Service')]")
    public WebElement chooseService;

    @FindBy(xpath ="//div[contains(text(), 'Portland')]" )
    public WebElement Portland;
    @FindBy(xpath ="//div[contains(text(), 'Seattle')]" )
    public WebElement Seattle;
    @FindBy(xpath ="//div[contains(text(), 'Vancouver')]" )
    public WebElement Vancouver;
    @FindBy(xpath ="//div[contains(text(), 'Salem')]" )
    public WebElement Salem;
    @FindBy(xpath ="//div[contains(text(), 'Eugene')]" )
    public WebElement Eugene;
    @FindBy(xpath ="//div[contains(text(), 'Denver')]" )
    public WebElement Denver;
    @FindBy(xpath ="//div[contains(text(), 'Boulder')]" )
    public WebElement Boulder;
    @FindBy(xpath ="//div[contains(text(), 'Boise')]" )
    public WebElement Boise;

    @FindBy(xpath = "//div[contains(text(),'USE MY LOCATION')]")
    public WebElement useMyLocation;

    @FindBy(css = "div[id^='quick-selector-option-location']")
    public List<WebElement> cities;

    @FindBy(xpath = "//div[contains(text(), 'Urgent Care and Primary Care Team')]")
    public List<WebElement> primaryCareDoctors;

    @FindBy(xpath = "//div[@class='css-901oao r-18u37iz']")
    public List<WebElement> servicesList;

    @FindBy(xpath = "(//div[@class='css-901oao r-18u37iz'])[7]")
    public WebElement emergencyCare;

    @FindBy(xpath = "//div[text()='Family Medicine']")
    public WebElement familyMedicine;

    @FindBy(xpath = "//div[text()='Mental Health Meds & More']")
    public WebElement mentalHealthMedsMore;

    @FindBy(xpath = "//div[text()='Mental Health Talk Therapy']")
    public WebElement mentalHealthTalkTherapy;

    @FindBy(xpath = "//div[text()='X-Ray, Ultrasound & CT']")
    public WebElement xrayUltrasoundCt;

    @FindBy(xpath = "//div[text()='Today']")
    public WebElement today;

    @FindBy (xpath = "//div[contains(text(), 'Illness/Injury')]")
    public WebElement illness;

    @FindBy(xpath = "//div[text()='Refresh']")
    public WebElement refresh;

    @FindBy(xpath = "(//div[contains(text(), 'Portland')])[1]")
    public WebElement locationDropdown;

    @FindBy(xpath = "//div[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath ="//h1[contains(text(),'Emergency Care')]")
    public WebElement emergencyCareValidation;

    @FindBy(xpath ="//div[contains(text(),'Choose Date')]")
    public WebElement chooseDate;

    @FindBy(xpath = "//*[contains(text(),'Family Medicine Video Visit')]")
    public WebElement familyMedicineVideoVisitValidation;

    @FindBy(xpath = "//div[contains(text(),'Clinic Care')]")
    public WebElement clinicCare;

    @FindBy(xpath = "//*[contains(text(),'VideoCare')]")
    public WebElement videoCare;

    @FindBy(xpath = "//*[contains(text(),'ChatCare')]")
    public WebElement chatCare;

    @FindBy(xpath = "//div[contains(text(),'The selected day is not available.')]")
    public WebElement dayNotAvailable;

    @FindBy(xpath="//div[contains(text(),'Show More')]")
    public WebElement showMore;

    @FindBy(xpath = "(//div[contains(text(),'This clinic is outside your region')])[1]")
    public WebElement clinicOutsideWarningMessage;

    @FindBy(xpath = "(//div[contains(text(),'Next available')])[1]")
    public WebElement nextAvailableDateOption;

    @FindBy(xpath = "(//div[starts-with(@id,'booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.')])[1]")
    public WebElement firstTimeOption;

    @FindBy(xpath = "//*[contains(text(),'Injury')]")
    public WebElement xrayMessage;

    @FindBy(xpath = "//*[contains(text(),'Illness/Injury Clinic Visit')]")
    public WebElement illnessClinicVisit;

    @FindBy(xpath = "//*[contains(text(),'Imaging')]")
    public WebElement imaging;

    @FindBy(xpath = "//div[contains(text(), 'Map')]")
    public WebElement mapLink;

    @FindBy(xpath = "//div[contains(text(),'5-Minute Flu Shot')]")
    public  WebElement fluShot;

    @FindBy(xpath = "//div[contains(text(),'Info | $')]")
    public WebElement info;

    @FindBy(xpath = "//div[contains(text(),'$35')]")
    public WebElement flueShotPrice;

    @FindBy(xpath = "//*[contains(text(),'Primary Care')]")
    public WebElement primaryCare;



    @FindBy(xpath = "//div[contains(text(),'Women')]")
    public WebElement womensHealth;

    @FindBy(xpath = "//div[contains(text(),'You must be located in OREGON at the time of your appointment.')]")
    public WebElement oregonMessage;

    @FindBy(xpath = "//div[contains(text(),'You must be located in WASHINGTON at the time of your appointment.')]")
    public WebElement washingtonMessage;

    @FindBy(xpath = "//div[contains(text(),'You must be located in IDOHO at the time of your appointment.')]")
    public WebElement idohoMessage;

    @FindBy(xpath = "//div[contains(text(),'You must be located in COLORADO at the time of your appointment.')]")
    public WebElement coloradoMessage;


}
