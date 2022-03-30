package com.carrefoursa.runners;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
        "pretty","html:target/site/cucumber-pretty"},
        glue = "com/carrefoursa/step_definitions",
        features = "src/test/resources/features",
        tags = "@smkBasket",
        dryRun =false
        //tags = "@smkBasket1 or @smkBasket",


)
public class CukesRunner {


}