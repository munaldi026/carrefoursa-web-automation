package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPPage extends BasePage{
    @FindBy(css = ".form-control.cat-sorting-option")
    public WebElement smartSortOptions;
}
