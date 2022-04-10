package com.carrefoursa.runners;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber.json", "rerun:target/rerun.txt"},
        glue = "com/carrefoursa/step_definitions",
        features = "src/test/resources/features/features_smoke",
        publish = true,
        tags = "@smoke",
        dryRun =false
        //tags = "@smkBasket1 or @smkBasket",


)
public class CukesRunner {


}