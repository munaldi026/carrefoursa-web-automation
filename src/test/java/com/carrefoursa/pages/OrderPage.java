package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{
    @FindBy(id="cancelOrder")
    public WebElement cancelOrderButton;

    @FindBy(xpath = "//button[normalize-space()='Evet']")
    public WebElement orderCancelConfirmButton;

    @FindBy(id = "cboxContent")
    public WebElement calcelOrderPop_up;

    @FindBy(css = ".continue-btn-text")
    public WebElement continueOrderButton;

    @FindBy(css = ".js-pickupinstore-cargo-choice")
    public WebElement pickUpInStoreButton;

    @FindBy(css = "a[id='selectDeliveryAddressBtn0'] span")
    public WebElement selectDeliveryAdresButton;

    @FindBy(xpath = "//span[normalize-space()='Fatura adresi olarak seçtiniz']")
    public WebElement selectBillingAdresButton;

    @FindBy(css = ".continue-btn-text")
    public WebElement deliveryAddressSubmitButton;

    @FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
    public WebElement deliveryTime;

    @FindBy(css = ".continue-btn-text")
    public WebElement deliverySlotSubmitButton;

    @FindBy(css = ".continue-btn-text")
    public WebElement continueButton;

    @FindBy(css= "#cc_at_delivery")
    public WebElement payByCCAtDelivery;

    @FindBy(css = "#shopping_loan")
    public WebElement payByShoppingLoan;

    @FindBy(css = ".continue-btn-text")
    public WebElement onlinePaySubmitButton;

    @FindBy(css = "#termsCheck")
    public WebElement termsCheckBox;

    @FindBy(className = "headline")
    public WebElement cancelOrderMsg;

    @FindBy(xpath = "//span[contains(text(),'Onay bekleyen siparişiniz bulunmamaktadır.')]")
    public WebElement consCancelledMsg;

    @FindBy(xpath = "//button[@data-formurl='siparisEkOrder']")
    public WebElement additionalOrderButton;

    @FindBy(css = "#refOrderNoForEkSiparisText")
    public WebElement verifyAdditionalOrderMsg;

    @FindBy(css = "button[class='btn btn-primary js-add-to-cart js-add-to-cart-product-detail']")
    public WebElement addToSubmitButtonPDP;

    @FindBy(css = "#cboxLoadedContent")
    public WebElement warningTextMsg;

    @FindBy(css = ".addtoOrderWarningModalText")
    public WebElement waitToAddingMsg;

    @FindBy(css = ".col-sm-12.cart-summary-totals.minimum-cost.hidden-xs.hidden-sm")
    public WebElement orderTotalAmountMsg;

    @FindBy(css = "div[class='cartSubTotal'] span[class='count']")
    public WebElement productPriceForOrderAmount;










}
