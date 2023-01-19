package me.matiasormazabal.testing;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import me.matiasormazabal.testing.profile.ScheduleProfile;
import me.matiasormazabal.testing.util.AutomationProperties;
import me.matiasormazabal.testing.util.CucumberRunner;
import me.matiasormazabal.testing.util.WebDriverUtil;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	CucumberRunner.class
})
public class MainTest {

	/*
	 * WebDriver
	 */
	public static WebDriver webDriver; 
	
	/*
	 * Pages Profiles
	 */
	public static ScheduleProfile schedulePage;
 
	/*
	 * Automation Config
	 */
	public static AutomationProperties automationProperties = new AutomationProperties();
	public static WebDriverUtil webDriverManager = new WebDriverUtil();


	private static void initProfiles() {
		schedulePage = PageFactory.initElements(webDriver, ScheduleProfile.class);
	}


	@BeforeClass
	public static void setUp() {
		System.out.println("*** Starting Automation  - ZoomCare Schedule *** ");
		webDriver = webDriverManager.getWebDriver();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		webDriver.manage().window().maximize();
		initProfiles();
	}

	@AfterClass
	public static void finish() {
		webDriverManager.quit();
		System.out.println("*** Bye :) *** ");
	}
}

 
