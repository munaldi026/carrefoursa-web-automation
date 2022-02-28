package com.carrefoursa.runners;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
        "pretty","html:target/site/cucumber-pretty"},
        features = "src/test/resources/features",
        glue = "com/carrefoursa/step_definitions",
        dryRun =false,
        tags = "@wip"
)
class CukesRunner {

}