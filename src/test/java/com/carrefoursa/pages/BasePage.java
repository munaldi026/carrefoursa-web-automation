package com.carrefoursa.pages;

import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

}