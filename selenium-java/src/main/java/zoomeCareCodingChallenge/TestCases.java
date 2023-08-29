package zoomeCareCodingChallenge;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Duration;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCases {

	private WebDriver driver;

	@Before
	public void setUp() {
	    try {
	        driver = new ChromeDriver();
	       
	    } catch (Exception e) {
	        e.printStackTrace();
	        fail("WebDriver initialization failed: " + e.getMessage());
	    }
	}


	@After
	public void tearDown() {
	    if (driver != null) {
	        driver.quit();
	    }
	}


	 @Test
	  public void locationDropDown() {

		//Launch Driver
	    driver.get("https://www.zoomcare.com/schedule");
	    driver.manage().window().setSize(new Dimension(1639, 1020));

	    //Wait for page to fully load before proceeding
	    {
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-18u37iz:nth-child(2)")));
	    }

	    //Validate page is fully loaded
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n > .r-1awozwy > svg"));
	      assert(elements.size() > 0);
	    }

	    // Validate Location Drop information
	    assertEquals(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-1awozwy > .css-901oao")).getText(), is("Portland, OR"));
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n > .r-1awozwy > svg")).click();

	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".r-150rngu"));
	      assert(elements.size() > 0);
	    }

	    //Set Location to Denver, CO - Verify change
	    assertEquals(driver.findElement(By.id("quick-selector-option-location-denver--co")).getText(), is("Denver, CO"));
	    driver.findElement(By.id("quick-selector-option-location-denver--co")).click();
	    assertEquals(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-1awozwy > .css-901oao")).getText(), is("Denver, CO"));

	    //Reset location to Portland, OR Default
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n > .r-1awozwy > svg")).click();
	    driver.findElement(By.id("quick-selector-option-location-portland--or")).click();
	    assertEquals(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-1awozwy > .css-901oao")).getText(), is("Portland, OR"));

	  }


	  @Test
	  public void servicesDropdown() {

		//Launch Driver
	    driver.get("https://www.zoomcare.com/schedule");
	    driver.manage().window().setSize(new Dimension(1639, 1020));

	    //Wait for page to fully load
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-18u37iz:nth-child(2)")));
	    }

	    //Validate page default services of "Illness/Injury"
	    assertEquals(driver.findElement(By.cssSelector("#quickSelectorRefinerContainer > .css-1dbjc4n:nth-child(2) .css-901oao")).getText(), is("Illness/Injury"));
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > svg > path")).click();

	    //Locate, Click, and Validate Family Medicine Option
	    assertEquals(driver.findElement(By.id("quick-selector-option-service-family-medicine")).getText(), is("Family Medicine"));
	    driver.findElement(By.id("quick-selector-option-service-family-medicine")).click();
	    assertEquals(driver.findElement(By.cssSelector("#quickSelectorRefinerContainer > .css-1dbjc4n:nth-child(2) .css-901oao")).getText(), is("Family Medicine"));

	    //Select a date and verify open time slot
	    assertEquals(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(3) > .css-1dbjc4n > .r-1awozwy")).getText(), is("Choose Date"));
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(3) > .css-1dbjc4n > .css-1dbjc4n > svg")).click();
	    driver.findElement(By.cssSelector(".r-1loqt21:nth-child(3) .css-901oao")).click();

	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1-1693288800000")));
	    }

	    //Assert for an available slot
	    assertEquals(driver.findElement(By.cssSelector("#booking_requested_button-ServiceLine\\.1\\.Clinic\\.1\\.Provider\\.1\\.TimeSlot\\.1-1693288800000 > .css-901oao")).getText(), is("11:00 PM"));
	  }

	  @Test
	  public void loginFail() {

		//Driver Start Up
	    driver.get("https://www.zoomcare.com/schedule");
	    driver.manage().window().setSize(new Dimension(1639, 1020));

	    //Wait for Page to fully load
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".css-1dbjc4n:nth-child(2) > .r-13awgt0 > .css-1dbjc4n > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n > .r-18u37iz")));
	    }

	    //Validate and Click log in button
	    assertEquals(driver.findElement(By.id("authentication-button-login")).getText(), is("Login"));
	    driver.findElement(By.id("authentication-button-login")).click();

	    //Wait for first login screen to load
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'sign_up_button-loginModal.register.signUp\']/div")));
	    }

	    //Validate sign up and log in buttons
	    assertEquals(driver.findElement(By.id("sign_up_button-loginModal.register.signUp")).getText(), is("Sign Up"));
	    assertEquals(driver.findElement(By.id("log_in_button-loginModal.register.logIn")).getText(), is("Log In"));
	    driver.findElement(By.id("log_in_button-loginModal.register.logIn")).click();

	    //Wait for user credentials page to load
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\'zoomcare-online logo\']")));
	    }

	    //Enter Bad Username/Password
	    driver.findElement(By.id("okta-signin-username")).click();
	    driver.findElement(By.id("okta-signin-username")).sendKeys("testUser");
	    driver.findElement(By.id("okta-signin-password")).click();
	    driver.findElement(By.id("okta-signin-password")).sendKeys("badPass");
	    driver.findElement(By.id("okta-signin-submit")).click();

	    //Wait for Log in failure message to show
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\'form2\']/div/div/div/div/p")));
	    }

	    //Validate presence of fail log in attempt
	    assertEquals(driver.findElement(By.xpath("//form[@id=\'form2\']/div/div/div/div/p")).getText(), is("Unable to sign in"));
	  }

}
