package Tests;

import PageObjects.ZoomCareLandingPage;
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

    public void initPages(WebDriver driver) {
        zoomCareLandingPage = new ZoomCareLandingPage(driver);
    }

    @Before
    public void settingUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        initPages(driver);
        driver.get("https://www.zoomcare.com/");
    }

    @After
    public void close() {
        //driver.close();
    }
}
