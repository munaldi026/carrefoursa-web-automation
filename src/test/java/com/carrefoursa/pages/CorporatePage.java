package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporatePage extends BasePage{
    @FindBy(partialLinkText = "Carrefoursa.com'a git")
    public WebElement csaHomePage;

    @FindBy(xpath = "//h2")
    public WebElement displayTitle;

    @FindBy(css = "#city-select")
    public WebElement cityNameSelect;

    @FindBy(id = "town-select")
    public WebElement townNameSelect;

    @FindBy(css = ".btn.btn-sm.btn-link.btn-selectAll")
    public WebElement selectAllStoreLink;

    @FindBy(css = "#Magazadan")
    public WebElement selectServiceType;

    @FindBy(css = ".btn.btn-lg.btn-warning")
    public WebElement resultsButton;

    @FindBy(css = ".nearestCarrefoursa")
    public WebElement iFrame;

    @FindBy(css = "#mallsList")
    public WebElement mallsList;
}
