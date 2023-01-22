package Sergei.com.steps_definition;

import Sergei.utility.BrowserUtil;
import Sergei.utility.ConfigurationReader;
import Sergei.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().manage().window().maximize();
      Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        BrowserUtil.sleep(1);
        Driver.closeDriver();

    }

}
