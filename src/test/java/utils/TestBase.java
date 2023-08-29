package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties props;
    public static WebDriverWait wait;

    public TestBase() {
        try {
            props = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/config/config.properties");
            props.load(fis);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void init() {
        String browser = props.getProperty("browser");
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(props.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public static void sleep(long secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void quit() {
        driver.quit();
    }
}