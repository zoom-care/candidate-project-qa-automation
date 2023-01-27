package com.zoomcare.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/aylinbekem/IdeaProjects/candidate-project-qa-automation/src/test/resources/features",
        glue = "com/zoomcare/step_definitions",
        plugin = { "json:target/cucumber.json"},
        tags = "@smoke",
        dryRun = false,
        monochrome = true



)
public class RunCucumberTest {




}
