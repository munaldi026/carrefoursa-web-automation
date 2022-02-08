package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FilterPage extends BasePage{


    @FindBy(xpath = "(//div[@class='searchFilters'])[2]")
    public WebElement discountCheckbox;

    @FindBy(xpath = "(//div[@class='searchFilters'])[1]")
    public WebElement intockCheckbox;
}
