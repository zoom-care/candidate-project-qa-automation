package Sergei.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// That class help us to put our framework under control
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:target/cucumber=reports.html",// standard HTML report
        "me.jvt.cucumber.report.PrettyReports:target/cucumber" // for better report
},
        features = "src/test/resources/features",
        glue = "Sergei/com/steps_definition",
        dryRun = false,
        tags = "@Smoke",
        publish = true // generate link with HTML report, which can be shared with teammates

)
public class cukesRunner {



}
