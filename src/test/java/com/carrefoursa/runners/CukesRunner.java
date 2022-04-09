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
        publish = true,
        features = "src/test/resources/features/features_smoke",
        tags = "@smo",
        //tags = "@smoke001 or @smoke002 or @smoke003 or @smoke004",
        dryRun =false
        //tags = "@smkBasket1 or @smkBasket",
        //mvn test -Dcucumber.filter.tags='@smoke and not @ignore'


)
public class CukesRunner {

}