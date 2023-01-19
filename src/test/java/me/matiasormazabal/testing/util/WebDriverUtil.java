package me.matiasormazabal.testing.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverUtil {


	private WebDriver webDriver = null;

	public WebDriverUtil() {
		
	}

	public WebDriver getWebDriver() {
		switch (AutomationProperties.AUTOMATION_LOCAL_BROWSER) { 		
		case "chrome":
			webDriver = getChromeBrowser();
			break;

		default:
			throw new GenericTestingException(String.format("Browser not valid"));
		}
		return webDriver;
	}
	
	private WebDriver getChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	public void quit() {
		webDriver.close();
	}
	
}