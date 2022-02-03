package com.carrefoursa.pages;

import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = ".site-logo.head-row")
    public WebElement homePageButton;
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
    @FindBy(partialLinkText = "Kurumsal")
    public WebElement corporateLink;
    @FindBy(partialLinkText = "En Yakın CarrefourSA")
    public WebElement locationsLink;
    @FindBy(css = ".call-center.head-row.pull-right")
    public WebElement callCenterLink;
    @FindBy(id = "selectStoreCanvasAlternativeText")
    public WebElement selectionRegionLink;
    @FindBy(xpath = "(//a[@class='btn btn-default btn-block closeColorBox'])[6]")
    public WebElement informationPop_up;

}
