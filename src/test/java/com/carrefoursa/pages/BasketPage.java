package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy(css = "#cart-page-add-note0")
    public WebElement addNoteLinkInBasket;

    @FindBy(css = "a[class='vue-remove-entry-button']")
    public WebElement removeProductButtonInBasket;

    @FindBy(id = "cboxContent")
    public WebElement notPop_up;

    @FindBy(xpath = "//textarea[@name='customerNote']")
    public WebElement customerNoteTextField;

    @FindBy(partialLinkText = "Kaydet")
    public WebElement customerNoteSaveButton;

    @FindBy(id = "cart-page-add-note0")
    public WebElement cartPageAddNoteLink;

    @FindBy(css = "#customerNote_0")
    public WebElement getCustomerNoteDeleteButton;

    @FindBy(css = ".pr-note-cont")
    public WebElement noMsgTextField;

    @FindBy(xpath = "//a[@class='remove-cart-item-link']")
    public WebElement miniCartRemoveLink;

    @FindBy(css = "div[class='no-result-cart'] h1 strong")
    public WebElement miniCartEmptyMsg;

    @FindBy(css = ".js-empty-cart-link")
    public WebElement miniCartRemoveAllLink;

    @FindBy(xpath = "//a[@class='btn btn-default js-empty-cart-confirm-link empty-cart-confirm-btn']")
    public WebElement emptyCartComfirmButton;

    @FindBy(css = "#js-qty-selector-plus_0")
    public WebElement miniCartPlusIcon;

    @FindBy(css = "#js-qty-selector-minus_0")
    public WebElement miniCartMinusIcon;

    @FindBy(css = ".name")
    public WebElement productNameInMiniCart;

    public void verifyIncreaseQuantyInMiniCart() {

        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        String expected="2";
        Assert.assertEquals(expected,quantity);

    }
    public void verifydecreaseQuantyInMiniCart() {

        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        String expected="1";
        Assert.assertEquals(expected,quantity);
    }
    public void miniCartRemoveProduct(){
        miniCartRemoveLink.click();
    }

}
