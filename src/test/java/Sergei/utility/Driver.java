package Sergei.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {


    // singleton Design pattern implemented

    private Driver() {
    }




    private static WebDriver driver; // first time it will be null

    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("browser").toLowerCase();
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

//same driver instance will be return every time we call Driver.getDriver() method
        return driver;
    }

    // we use that method to close opened driver
    public static void closeDriver (){
        if (driver!= null) {
            driver.quit(); // this line kill the current session, value will NOT null, because driver object still exist
            driver = null; //- we assign driver object value NULL, now driver is null
        }
    }

}
