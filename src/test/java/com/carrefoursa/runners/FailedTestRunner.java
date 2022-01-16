package com.carrefoursa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/failed-html-report"},
        features = "@target/rerun.txt",
        glue = "src/test/java/com/carrefoursa/stepDefinitions"
)
public class FailedTestRunner {
}
