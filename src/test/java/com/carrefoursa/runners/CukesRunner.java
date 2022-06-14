package com.carrefoursa.runners;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        /*
        IMPORTANT NOTE
        Before starting test execution please check the web site
        1- Teslimat seceneklerim ("Size Getirelim" secili olmali)
        2- Siparislerim ( Onay bekleyen ya da aktif siparislerim olmamali,Order testinde tarih ayarlamasi yapilmali )
        3- Sepetim ( Bosaltilmis olmali )
         */

        plugin = {"pretty","json:target/json-report/cucumber.json"},
        glue = "com/carrefoursa/step_definitions",

        //FOR SMOKE
        features = "src/test/resources/features/features_smoke",
        //FOR REGRESSION
        //features = "src/test/resources/features/features_regression",
        //FOR MINI REGRESSION
        //features = "src/test/resources/features/features_mini_regression",
        //"json:target/cucumber.json",
        publish = true,
        tags = "@demo",
        dryRun =false
        //tags = "@reg or @smoke"
        //"rerun:target/rerun.txt"


)
public class CukesRunner {

}