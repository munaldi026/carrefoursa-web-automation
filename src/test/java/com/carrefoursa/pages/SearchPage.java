package com.carrefoursa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(className = "sgm-cursor-pointer")
    public WebElement searchdisplay;
    @FindBy(css = "li[class='active']")
    public WebElement getSearchdisplay1;
    @FindBy(className = "seg-qa-title")
    public WebElement popularproducttitle;
}