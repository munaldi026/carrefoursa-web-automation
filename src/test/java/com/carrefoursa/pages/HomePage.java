package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(id = "js-site-search-input")
    public WebElement searchField;
    @FindBy(className = "js-search-validate")
    public WebElement searchButton;
    @FindBy(className = "js-minicart-total-price")
    public WebElement myBasket;
    @FindBy(css = ".main-cat-link")
    public WebElement category;
    @FindBy(className = "d-block")
    public WebElement myAccount;
}
