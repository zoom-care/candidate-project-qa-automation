package me.matiasormazabal.testing.util;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/me/matiasormazabal/testing/features"},
		glue = { "me/matiasormazabal/testing/definitions"},
		junit = { "--step-notifications" },
		tags = { "@Test" },
		monochrome = true
		)
public abstract class CucumberRunner {

}
