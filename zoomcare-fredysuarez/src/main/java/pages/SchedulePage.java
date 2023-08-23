package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.StringUtils;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchedulePage extends BasePage {
    public final String URL = "https://www.zoomcare.com/schedule";
    public final String OPTIONS_LOCATOR = "div[data-testid*='text-quick-selector-option-${selectorCategory}']";
    public final String SELECTOR_LOCATOR = "div[data-testid='quickSelector.${selectorCategory}Selector']";

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    public WebElement selectorByCategory(String selectorCategory) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("selectorCategory", selectorCategory);
        return this.driver.findElement(By.cssSelector(StringUtils.interpolate(SELECTOR_LOCATOR, parameters)));
    }

    public List<WebElement> selectorOptions(String selectorCategory) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("selectorCategory", selectorCategory);
        return this.driver.findElements(By.cssSelector(StringUtils.interpolate(OPTIONS_LOCATOR, parameters)));
    }

    public WebElement getOptionContainingName(String name, String selectorCategory) {
        WebDriverWait waiter = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        waiter.until(ExpectedConditions.visibilityOf(selectorByCategory(selectorCategory)));
        selectorByCategory(selectorCategory).click();
        waiter.until(e -> selectorOptions(selectorCategory));
        return selectorOptions(selectorCategory).stream()
                .filter(o -> o.getText().trim().toLowerCase().contains(name))
                .findFirst().orElse(null);
    }

    public void selectOptionContainingName(String name, String selectorCategory) {
        getOptionContainingName(name, selectorCategory).click();
    }

    public void selectLocationContainingName(String name) {
        selectOptionContainingName(name, "location");
    }

    public void selectServiceContainingName(String name) {
        selectOptionContainingName(name, "service");
    }

    public void selectDateContainingName(String name) {
        selectOptionContainingName(name, "date");
    }

    public void selectDate() {
        WebDriverWait waiter = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        waiter.until(ExpectedConditions.visibilityOf(selectorByCategory("date")));
        selectorByCategory("date").click();
    }

    public void waitForLoad() {
        WebDriverWait waiter = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        // WebElement loadingElement = this.driver.findElement(By.cssSelector("div#react-mount-loading"));
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-testid='virtualClinicBox']")));
    }

    public WebElement btnSearch() {
        return this.driver.findElement(By.cssSelector("div[data-testid='button-quickSelector.searchButton']"));
    }

    public boolean btnSearchIsDisable() {
        String isDisable = btnSearch().getAttribute("aria-disable");
        return isDisable == "true" ? true : false;
    }
}