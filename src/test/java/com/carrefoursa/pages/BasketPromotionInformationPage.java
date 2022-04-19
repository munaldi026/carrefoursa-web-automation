package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPromotionInformationPage extends BasePage{
    @FindBy(id = "js-site-search-input")
    public WebElement searchFieldBasketPromotionInformation;
    @FindBy(xpath = "//button[@class='btn btn-link js-search-validate']")
    public WebElement searchButtonBasketPromotionInformation;
    @FindBy(xpath = " (//button[@id='addToCartButton'])[1]")
    public WebElement addToBasketPromotionInformation;
    @FindBy(css = ".my-cart-text.d-sm-none")
    public WebElement myBasketBasketPromotionInformation;
    @FindBy(xpath = "//div[@class='promotion-info orderthreshold-fixedprice-promotion']")
    public WebElement yellowwarning;




}
