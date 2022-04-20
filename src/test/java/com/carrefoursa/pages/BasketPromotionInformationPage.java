package com.carrefoursa.pages;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
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
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
    public WebElement plusIconInPDPBasketPromotionInformation;
    @FindBy(css = ".col-sm-12.cart-summary-totals.minimum-cost.hidden-xs.hidden-sm")
    public WebElement orderTotalAmountMsgasketPromotionInformation;
    @FindBy(xpath = "(//span[@class='item-price js-variant-discounted-price  '])[1]")
    public WebElement searchFirstItemBasketPromotionInformation;
    @FindBy(xpath = "(//p[contains(text(),'Buy one more item to qualify for our buy 2 get 1 free offer')])[1]")
    public WebElement searchFirstItemdetail;








}
