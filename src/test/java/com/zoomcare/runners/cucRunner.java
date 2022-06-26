package com.zoomcare.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/zoomcare/step_definitions",
        tags = " @all",
        dryRun = false

)
public class cucRunner {
}
