package com.carrefoursa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(className = "selected sgm-search-selected")
    public WebElement searchdisplay;
    @FindBy(className = "seg-qa-title")
    public WebElement popularproducttitle;
}