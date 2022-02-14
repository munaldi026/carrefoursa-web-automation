package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPSoldAloneProduct extends  BasePage{

    @FindBy(className = "js-negative-btn")
    public WebElement giveupButton;

    @FindBy(className = "js-positive-btn")
    public WebElement goOnnButton;

}
