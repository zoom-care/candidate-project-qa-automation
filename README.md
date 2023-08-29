# ZoomCare Candidate Code Challenge - QA / Automation
# Submission by Scott Loftesness

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

### Part 1

1. Verify Login (Negative):
   - Open the scheduling page (https://www.zoomcare.com/schedule).
   - Verify that the page loads without errors.
   - Check that the scheduler is visible and functional.
   - Acceptance Criteria: The scheduling page loads properly with the scheduler displayed and functional.

2. Search Availability:
   - Select a specific date and time in the scheduler.
   - Acceptance Criteria: The scheduler should allow users to select a date and time slot.

3. Navigate Back and Forth:
   - Select a future date and navigate to the next week's schedule.
   - Then navigate back to the current week's schedule.
   - Acceptance Criteria: The scheduler should allow users to navigate between weeks.

4. Location:
   - Choose a different location from the location dropdown.
   - Verify that the displayed schedule corresponds to the selected location.
   - Acceptance Criteria: The scheduler should display the schedule based on the selected location.

5. Check Appointment Details:
   - Click on an available time slot.
   - Verify that a login screen appears for unauthenticated users.
   - Acceptance Criteria: Clicking an available time slot should prompt unauthenticated users to log in.

6. Verify Links:
   - Check links within the scheduling page, like "Contact Us" or "Learn More."
   - Acceptance Criteria: Links should open the expected pages in a new tab or window.

7. Search for Specific Service:
   - Search for a specific type of service (e.g., "flu shot") using the search bar.
   - Verify that relevant results are displayed in the scheduler.
   - Acceptance Criteria: The search bar should return relevant results from the scheduler.

8. Check Responsiveness:
   - Open the scheduling page on different devices (desktop, tablet, mobile).
   - Verify that the scheduler is responsive and adjusts correctly.
   - Acceptance Criteria: The scheduler should be usable and visually appealing on all devices.

9. Verify Language Selection:
   - Change the language preference (if available) using language options.
   - Verify that the content updates to the selected language.
   - Acceptance Criteria: Changing the language should update the scheduler content.

10. Test Appointment Reminders:
    - After selecting a time slot, note the appointment time.
    - Leave the page and return later, close to the appointment time.
    - Verify if any appointment reminders are shown.
    - Acceptance Criteria: Appointment reminders should be displayed close to the scheduled time.

These test scenarios and acceptance criteria should provide a good coverage of the scheduling page's functionality and user interactions. Adjust them according to your specific requirements and priorities.

### Part 2
This is my java code that I wrote for my selected three test cases.

package zoomeCareCodingChallenge;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class TestCases {

	private WebDriver driver;
	private JavascriptExecutor js;
	private HashMap<String, Object> vars;
	
	
	@Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	
	 @After
	  public void tearDown() {
	    driver.quit();
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
	    assertThat(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-1awozwy > .css-901oao")).getText(), is("Portland, OR"));
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n > .r-1awozwy > svg")).click();
	    
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".r-150rngu"));
	      assert(elements.size() > 0);
	    }
	    
	    //Set Location to Denver, CO - Verify change
	    assertThat(driver.findElement(By.id("quick-selector-option-location-denver--co")).getText(), is("Denver, CO"));
	    driver.findElement(By.id("quick-selector-option-location-denver--co")).click();
	    assertThat(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-1awozwy > .css-901oao")).getText(), is("Denver, CO"));
	    
	    //Reset location to Portland, OR Default
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n > .r-1awozwy > svg")).click();
	    driver.findElement(By.id("quick-selector-option-location-portland--or")).click();
	    assertThat(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .r-1awozwy > .css-901oao")).getText(), is("Portland, OR"));
	    
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
	    assertThat(driver.findElement(By.cssSelector("#quickSelectorRefinerContainer > .css-1dbjc4n:nth-child(2) .css-901oao")).getText(), is("Illness/Injury"));
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > svg > path")).click();
	    
	    //Locate, Click, and Validate Family Medicine Option
	    assertThat(driver.findElement(By.id("quick-selector-option-service-family-medicine")).getText(), is("Family Medicine"));
	    driver.findElement(By.id("quick-selector-option-service-family-medicine")).click();
	    assertThat(driver.findElement(By.cssSelector("#quickSelectorRefinerContainer > .css-1dbjc4n:nth-child(2) .css-901oao")).getText(), is("Family Medicine"));
	    
	    //Select a date and verify open time slot
	    assertThat(driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(3) > .css-1dbjc4n > .r-1awozwy")).getText(), is("Choose Date"));
	    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(3) > .css-1dbjc4n > .css-1dbjc4n > svg")).click();
	    driver.findElement(By.cssSelector(".r-1loqt21:nth-child(3) .css-901oao")).click();
	    
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("booking_requested_button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1-1693288800000")));
	    }
	    
	    //Assert for an available slot
	    assertThat(driver.findElement(By.cssSelector("#booking_requested_button-ServiceLine\\.1\\.Clinic\\.1\\.Provider\\.1\\.TimeSlot\\.1-1693288800000 > .css-901oao")).getText(), is("11:00 PM"));
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
	    assertThat(driver.findElement(By.id("authentication-button-login")).getText(), is("Login"));
	    driver.findElement(By.id("authentication-button-login")).click();
	    
	    //Wait for first login screen to load
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'sign_up_button-loginModal.register.signUp\']/div")));
	    }
	    
	    //Validate sign up and log in buttons
	    assertThat(driver.findElement(By.id("sign_up_button-loginModal.register.signUp")).getText(), is("Sign Up"));
	    assertThat(driver.findElement(By.id("log_in_button-loginModal.register.logIn")).getText(), is("Log In"));
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
	    assertThat(driver.findElement(By.xpath("//form[@id=\'form2\']/div/div/div/div/p")).getText(), is("Unable to sign in"));
	  } 
	 
}

