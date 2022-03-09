package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlpPriceFilterPage {
    @FindBy(xpath = "//span[@class='minSpan']")
    public WebElement minpPice;

    @FindBy(xpath = "//span[@class='maxSpan']")
    public WebElement maxPrice;

    @FindBy(className = "js-apply-filter")
    public WebElement applyButton;

    @FindBy(xpath = "//span[@class='facet-val']")
    public WebElement filterValue;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
    public WebElement deleteFilter;

}
