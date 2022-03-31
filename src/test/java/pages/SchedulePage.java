package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchedulePage {

    public SchedulePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="authentication-button-login")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@data-testid='virtualChatBox']")
    public WebElement chatCareButton;

    @FindBy(xpath = "//div[@data-testid='text-Orthopedics']")
    public WebElement orthopedics;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/h1")
    public  WebElement orthopedicSign;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]/div[2]/div")
    public WebElement calender;

    @FindBy(xpath="//*[@id=\"okta-signin-username\"]")
    public WebElement email;

    @FindBy(id="sign_up_button-loginModal.register.signUp")
    public WebElement sigUpButton;


    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div")
    public WebElement illinessinjury_box;

    @FindBy(id="okta-signin-password")
    public WebElement password;

    @FindBy(id="okta-signin-submit")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"form2\"]/div[1]/div[1]/div/div/p")
    public WebElement unableToSignIn;

    @FindBy(xpath = "//a[@data-se='needhelp']")
    public WebElement needHelpSignInOption;

    @FindBy(xpath = "//*[@id=\"help-links-container\"]/li[2]/a")
    public WebElement doNotHaveAnAccount;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]")
    public WebElement niceToMeetYou;

    @FindBy(xpath = "//a[@data-se='forgot-password']")
    public WebElement forgetYourPasswordOption;

    @FindBy(xpath="//input[@id='account-recovery-username']")
    public WebElement emailUsername;

    @FindBy(xpath = "//input[@aria-label='Username (Enter your email)']")
    public WebElement UserNameemail;


    @FindBy(xpath = "//a[@data-se='email-button']")
    public WebElement resetViaEmail;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div")
    public WebElement dollarSignInfo;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]/span[3]")
    public WebElement moreInfoSign;

    @FindBy(xpath = "/html/body/div[4]/div/div/a/strong")
    public WebElement seeAcceptedInsurance;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[5]/div/div[2]/input")
    public  WebElement strongPassword;

    @FindBy(xpath = "//*[@id=\"undefined-actions.next\"]/div")
    public WebElement Nextbutton;

    //Nice to meet you.

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[4]/div[1]/div[2]/input")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[4]/div[2]/div[2]/input")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[5]/div[2]/input")
    public WebElement mobileNumber;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[6]/div[2]/input")
    public WebElement address;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]/div[3]/div/div[2]/div/div[4]/div[2]/div[2]")
    public WebElement april;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/svg/g/g")
    public WebElement forwardCalender;


    //address

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[7]/div[2]/input")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[8]/div[2]/input")
    public WebElement birthDay;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[10]/div[1]/div[1]/div[2]")
    public WebElement malesOption;

    @FindBy(xpath = "//*[@id=\"undefined-actions.next\"]")
    public WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]/div[1]")
    public WebElement doesThisLookRightSign;

    @FindBy(xpath = "//*[@id=\"help-links-container\"]/li[3]/a")
    public WebElement helpbutton;

    @FindBy(xpath = "//input[@id='okta-signin-submit']")
    public WebElement signINin;

    @FindBy(xpath = "//h2")
    public WebElement searchingforAnswers;

    @FindBy(xpath = "//*[@id=\"cta_section\"]/a")
    public WebElement learnMoresign;

    @FindBy(id = "nav-timeline")
    public WebElement myVisitButton;

    @FindBy(xpath = "//*[@id='react-mount-page-content']/div/div/div/div[1]/div/div[2]/div[1]/div/div")
    public WebElement illnessselectionBox;

    @FindBy(xpath = "//div[@data-testid='text-Show More']")
    public WebElement showMorebutton;

    @FindBy(xpath = "//*[@id=\"booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.5-1648653300000\"]/div")
    public WebElement ninefifteen;

}

