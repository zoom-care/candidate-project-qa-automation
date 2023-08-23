package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public final String URL = "https://www.zoomcare.com";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement locationSelector() {
        return this.driver.findElement(By.cssSelector("div[data-testid='quickSelector.locationSelector']"));
    }

    public WebElement serviceSelector() {
        return this.driver.findElement(By.cssSelector("div[data-testid='quickSelector.service.popover']"));
    }

    public WebElement dateSelector() {
        return this.driver.findElement(By.cssSelector("div[data-testid='quickSelector.date.popover']"));
    }

    public WebElement heroHeading() {
        return this.driver.findElement(By.cssSelector("h1[class*=heading]"));
    }

    public String heroHeadingText() {
        return this.heroHeading().getText();
    }
}
