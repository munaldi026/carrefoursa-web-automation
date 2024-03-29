package com.carrefoursa.step_definitions;


import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigReader.getProperty("upgrade"));
//        Driver.getDriver().findElement(By.xpath("//button[@id='details-button']")).click();
//        Driver.getDriver().findElement(By.xpath("//a[@id='proceed-link']")).click();
        Driver.getDriver().manage().deleteAllCookies();
        ReusableMethods.closeCerez();

    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

     Driver.close();

    }

}