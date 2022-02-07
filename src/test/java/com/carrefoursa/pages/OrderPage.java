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

    @FindBy(css = "#cart-btn")
    public WebElement continueOrderButton;

    @FindBy(css = ".js-pickupinstore-cargo-choice")
    public WebElement pickUpInStoreButton;

    @FindBy(css = "a[id='selectDeliveryAddressBtn0'] span")
    public WebElement selectDeliveryAdresButton;

    @FindBy(xpath = "//span[normalize-space()='Fatura adresi olarak seçtiniz']")
    public WebElement selectBillingAdresButton;

    @FindBy(id = "deliveryAddressSubmit")
    public WebElement deliveryAddressSubmitButton;

    @FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
    public WebElement deliveryTime;

    @FindBy(css = "#deliverySlotSubmit")
    public WebElement deliverySlotSubmitButton;

    @FindBy(css= "#cc_at_delivery")
    public WebElement payByCCAtDelivery;

    @FindBy(css = "#shopping_loan")
    public WebElement payByShoppingLoan;

    @FindBy(id = "btnCcAtDelivery")
    public WebElement onlinePaySubmitButton;

    @FindBy(css = "#termsCheck")
    public WebElement termsCheckBox;

    @FindBy(className = "headline")
    public WebElement cancelOrderMsg;

    @FindBy(xpath = "(//span[@class='info'])[1]")
    public WebElement orderNumberInConfirmationPage;

    @FindBy(xpath = "//a[@href='/my-account/order/132549041']")
    public WebElement orderDetailButton;

    @FindBy(xpath = "//span[contains(text(),'Onay bekleyen siparişiniz bulunmamaktadır.')]")
    public WebElement consCancelledMsg;





}
