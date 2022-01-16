package com.carrefoursa.step_definitions;


import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("url_preProd"));

    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");

    }
    @After
    public void closeDriver(){
        Driver.closeDriver();
    }


}