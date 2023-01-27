package com.zoomcare.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
    private static final Logger logger = Logger.getLogger(Driver.class);
    private static  InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
    private Driver(){
    }


    public static WebDriver getDriver(){

        if (driverPool.get() == null){
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
                    driverPool.set(new ChromeDriver());
                    logger.info("Browser :: " + browser);
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver");
                    driverPool.set(new FirefoxDriver());
                    logger.info("Browser :: " + browser);

            }
        }

        return driverPool.get();

    }

    public static void closeDriver(){
        if (driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }

}
