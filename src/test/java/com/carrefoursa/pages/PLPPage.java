package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPPage extends BasePage{
    @FindBy(css = ".form-control.cat-sorting-option")
    public WebElement smartSortOptions;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-block js-add-to-cart js-add-to-cart-product-item'])[1]")
    public WebElement sepeteEklePLP;
}
