package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(css = "a[class='my-shoplist col-xs-12 col-sm-6 col-md-3 col-lg-3'] em[class='icon']")
    public WebElement ShoppingListIcon;
    @FindBy(xpath = "//span[@class='item-name']")
    public WebElement productInShoppingList;

    @FindBy(css = "a[class='my-orders col-xs-12 col-sm-6 col-md-3 col-lg-3'] em[class='icon']")
    public WebElement orderListIcon;
}
