import drivermanager.DriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Common tests behavior are in this class
 * Setup and teardown methods runs once for each method/test when
 * parallel = "methods" is set in the testng.xml file
 */
@Slf4j
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    protected void setup() {
        log.info(String.format("[Thread %s]: Starting the driver", Thread.currentThread().getId()));
        this.driver = DriverManager.getCurrentInstance().getCurrentDriver();
    }

    @AfterMethod
    protected void tearDown() {
        log.info(String.format("[Thread %s]: Disposing the driver", Thread.currentThread().getId()));
        DriverManager.getCurrentInstance().disposeCurrentDriver();
    }
}
