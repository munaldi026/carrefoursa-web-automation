package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FilterPage extends BasePage{


    @FindBy(xpath = "(//div[@class='searchFilters'])[2]")
    public WebElement opportunitiesCheckbox;

    @FindBy(xpath = "(//div[@class='searchFilters'])[1]")
    public WebElement instockCheckbox;

    @FindBy(xpath = "//span[@class='facet-mark'][1]")
    public WebElement activia;

    @FindBy(xpath = "//a[normalize-space()='Activia']")
    public WebElement activiaLink;

    @FindBy(css = "li[class='remove-facet-col'] span[class='glyphicon glyphicon-remove']")
    public WebElement removeFilterIcon;


    @FindBy(xpath = "//span[@class='facet-val'][1]")
    public WebElement activiaIsDisplay;




}

