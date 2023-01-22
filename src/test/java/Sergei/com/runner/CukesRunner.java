package Sergei.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "json:target/cucumber.json",//
        "html:target/cucumber=reports.html",// standard HTML report
        "me.jvt.cucumber.report.PrettyReports:target/cucumber" // for better report
},
        features = "src/test/resources/features",
        glue = "Sergei/com/steps_definition",
        dryRun = false,
        tags = "@Smoke",
        publish = true // generate link with HTML report, which can be shared with teammates

)
public class CukesRunner {



}
