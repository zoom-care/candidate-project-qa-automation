package Sergei.com.steps_definition;

import Sergei.utility.browserUtil;
import Sergei.utility.configurationReader;
import Sergei.utility.driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class hooks {

    @Before
    public void setup() {
        driver.getDriver().get(configurationReader.getProperty("env"));
        driver.getDriver().manage().window().maximize();
        driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        browserUtil.sleep(1);
        driver.closeDriver();

    }

}
