package Sergei.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driver {


    // singleton Design pattern implemented

    private driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = configurationReader.getProperty("browser").toLowerCase();
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();

                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();

                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    driver.manage().window().maximize();

                    break;
            }
        }
        return driver;
    }

    // we use that method to close opened driver
    public static void closeDriver (){
        if (driver!= null) {
            driver.quit();
            driver = null;
        }
    }

}
