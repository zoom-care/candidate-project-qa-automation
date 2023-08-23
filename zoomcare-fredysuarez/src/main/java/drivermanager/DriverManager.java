package drivermanager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class for handle multithreading for parallel execution
 */
public class DriverManager {

    private WebDriver driver;
    private static final ConcurrentHashMap<Long, DriverManager> instances = new ConcurrentHashMap<Long, DriverManager>();

    private DriverManager() {
    }

    private static Long getCurrentThreadId() {
        return Thread.currentThread().getId();
    }

    private static DriverManager getInstance() {
        DriverManager instance = null;
        synchronized (instances) {
            if (instances.containsKey(getCurrentThreadId())) {
                instance = instances.get(getCurrentThreadId());
            }
        }
        return instance;
    }

    private static void setInstance(DriverManager value) {
        synchronized (instances) {
            instances.put(getCurrentThreadId(), value);
        }
    }

    /**
     * Returns current drivermanager.DriverManager instance (thread safe)
     */
    public static DriverManager getCurrentInstance() {
        if (getInstance() == null) {
            setInstance(new DriverManager());
        }
        return getInstance();
    }

    /**
     * Returns current WebDriver for the current drivermanager.DriverManager instance
     */
    public WebDriver getCurrentDriver() {
        return getCurrentDriver("Chrome", true);
    }

    public WebDriver getCurrentDriver(String browser, boolean invalidateHeadless) {
        if (driver == null) {
            switch (browser) {
                case "Chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    options.addArguments("--start-maximized");
                    if (!invalidateHeadless) {
                        options.addArguments("--headless");
                    }
                    driver = new ChromeDriver(options);
                    break;
                case "Firefox":
                    driver = new FirefoxDriver();
                    break;
            }
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
            driver.manage().window().setSize(new Dimension(1080, 920));
        }
        return driver;
    }

    public void disposeCurrentDriver() {
        if (getInstance() != null) {
            if (getInstance().driver != null) {
                try {
                    getInstance().driver.quit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            getInstance().driver = null;
            synchronized (instances) {
                instances.remove(getCurrentThreadId());
            }
        }
    }
}
