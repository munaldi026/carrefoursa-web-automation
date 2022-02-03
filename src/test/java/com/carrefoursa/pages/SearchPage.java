package com.carrefoursa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Carrefour Eski Kaşar')]//b[contains(text(),'Peynir')]")
    public WebElement searchdisplay;
    @FindBy(css = "li[class='active']")
    public WebElement getSearchdisplay1;
    @FindBy(className = "seg-qa-title")
    public WebElement popularproducttitle;
}