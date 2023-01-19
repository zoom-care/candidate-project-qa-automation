package me.matiasormazabal.testing.profile;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import me.matiasormazabal.testing.MainTest;
import me.matiasormazabal.testing.util.Constants;
import me.matiasormazabal.testing.util.GenericTestingException;

public class ScheduleProfile {
	
	@FindBy(how = How.ID, using = "nav-schedule")
	private WebElement scheduleMenu;
	
	@FindBy(how = How.ID, using = "nav-locations")
	private WebElement locationsMenu;
	
	@FindBy(how = How.ID, using = "nav-services")
	private WebElement servicesMenu;
	
	@FindBy(how = How.ID, using = "nav-pricing")
	private WebElement pricingInsuranceMenu;
	
	@FindBy(how = How.ID, using = "authentication-button-login")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//div[@data-testid='quickSelector.locationSelector']")
	private WebElement citySelector;
	
	@FindBy(how = How.XPATH, using = "//div[@data-testid='quickSelector.serviceSelector']")
	private WebElement serviceSelector;
	
	@FindBy(how = How.XPATH, using = "//div[@data-testid='quickSelector.dateSelector']")
	private WebElement daySelector;
	
	@FindBy(how = How.XPATH, using = "//div[@data-testid='button-quickSelector.searchButton']")
	private WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@data-testid,'text-quick-selector-option-location')]")
	private List<WebElement> citiesDisplayed;
	
	@FindBy(how = How.XPATH, using = "//button[@data-testid='virtualClinicBox']")
	private WebElement schedulerScreen;
	
	public void goSchedulePage() {
		MainTest.webDriver.get(Constants.ZOOMCARE_SCHEDULE_URL);
	}
	
	public boolean verifyElement(String element) {
		switch(element) {
		case "Schedule Menu" : return scheduleMenu.isDisplayed();
		case "Locations Menu": return locationsMenu.isDisplayed();
		case "Services Menu" : return servicesMenu.isDisplayed();
		case "Pricing & Insurance Menu" : return pricingInsuranceMenu.isDisplayed();
		case "Login Button" : return loginButton.isDisplayed();
		
		case "City Selector" : 		return citySelector.isDisplayed();
		case "Service Selector" :	return serviceSelector.isDisplayed();
		case "Date Picker" :		return daySelector.isDisplayed();
		case "Search Button" :    	return searchButton.isDisplayed();
		default:
			throw new GenericTestingException("Element not found");
		}
	}
	
	public boolean verifyIfEnabledElement(String element) {
		switch(element) {
		case "Schedule Menu" : return scheduleMenu.isEnabled();
		case "Locations Menu": return locationsMenu.isEnabled();
		case "Services Menu" : return servicesMenu.isEnabled();
		case "Pricing & Insurance Menu" : return pricingInsuranceMenu.isEnabled();
		case "Login Button" : return loginButton.isEnabled();
		case "City Selector" : 		return citySelector.isEnabled();
		case "Service Selector" :	return serviceSelector.isEnabled();
		case "Date Picker" :		return daySelector.isEnabled();
		case "Search Button" :    	return searchButton.isEnabled();
		default:
			throw new GenericTestingException("Element not found");
		}
	}
	
	public List<String> getCitiesDisplayed() {
		return citiesDisplayed.stream().map(x -> x.getText().trim()).collect(Collectors.toList());
	}
	
	public void clickElement(String element) {
		switch(element) {
		case "City Selector" : 		 citySelector.click();		break;
		case "Service Selector" :	 serviceSelector.click(); 	break;
		case "Date Picker" :		 daySelector.click(); 		break;
		case "Search Button" :    	 searchButton.click(); 		break;
		default:
			throw new GenericTestingException("Element not found");
		}
	}
	
	public void waitSchedulerScreenDisplayed() {
		WebDriverWait wait = new WebDriverWait(MainTest.webDriver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(schedulerScreen));
	}
	
}