package Tests;

import PageObjects.ZoomCareLandingPage;
import PageObjects.ZoomCareSchedulePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTestSuite {

    WebDriver driver;
    WebDriverWait wait;

    protected ZoomCareLandingPage zoomCareLandingPage;
    protected ZoomCareSchedulePage zoomCareSchedulePage;

    //Method to initialize the pagefactory elements.
    public void initPages(WebDriver driver,WebDriverWait wait) {
        zoomCareLandingPage = new ZoomCareLandingPage(driver,wait);
        zoomCareSchedulePage= new ZoomCareSchedulePage(driver,wait);
    }

    //Method to set up the properties and launch the automation.
    @Before
    public void settingUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        initPages(driver,wait);
    }

    //Method to close the automation browser.
    @After
    public void close() {
        driver.close();
    }
}
