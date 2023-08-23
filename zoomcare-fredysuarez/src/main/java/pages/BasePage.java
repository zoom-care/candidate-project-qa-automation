package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Common page objects behavior are in this class
 */
public class BasePage {
    protected WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void javaScriptClick(WebElement element) {
        String script = "arguments[0].click();";
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript(script, element);
    }
}
