package me.matiasormazabal.testing.definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import me.matiasormazabal.testing.MainTest;
import me.matiasormazabal.testing.api.CitiesService;

public class ScheduleDefinitions {

	private List<String> citiesFromApi;

	@When("Go to Schedule page")
	public void go_to_Schedule_page() {
		MainTest.schedulePage.goSchedulePage();
	}
	
	@When("Wait until the page is successfully loaded")
	public void wait_until_the_page_is_successfully_loaded() {
		MainTest.schedulePage.waitSchedulerScreenDisplayed();
	}
	
	@Then("Verify if is displayed the element")
	public void verify_if_is_displayed_the_element(List<String> elements) {
		for(String element : elements){
			assertTrue(MainTest.schedulePage.verifyElement(element));
		}
	}
	
	@Then("Verify if the element is enabled")
	public void verify_if_the_element_is_enabled(List<String> elements) {
		for(String element : elements){
			assertTrue(MainTest.schedulePage.verifyIfEnabledElement(element));
		}
	}
	
	@When("Click on {string}")
	public void click_on(String string) {
		MainTest.schedulePage.clickElement(string);
	}

	@When("Get list of the cities from the API")
	public void get_list_of_the_cities_from_the_API() {
		citiesFromApi = CitiesService.getCities();
		assertNotNull(citiesFromApi);
	}

	@Then("Verify the cities are from the API")
	public void verify_the_cities_are_from_the_API() {
		List<String> citiesFromWeb = MainTest.schedulePage.getCitiesDisplayed();
		assertEquals(citiesFromApi, citiesFromWeb);
	}
}
