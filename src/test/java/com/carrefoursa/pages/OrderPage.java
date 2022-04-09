package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Locale;

public class OrderPage extends BasePage{


    HomePage homePage=new HomePage();
    AccountPage accountPage=new AccountPage();

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

    @FindBy(css = "#monthOptions1")
    public WebElement selectMonth;
    @FindBy(css = "#yearOptions1")
    public WebElement selectYear;
    @FindBy(css = ".text-white")
    public List<WebElement> orderDetailButtonList;
    @FindBy(css = ".cons-cancelled")
    public WebElement deleteOrderMsg;

    @FindBy(xpath = "(//span[@class='info'])[1]")
    public WebElement orderNo;

    @FindBy(css = "a[href='/my-account/order/132558247']")
    public WebElement oldOrderDetailButtonForStore;


    public String verifyDeleteOrder(){
        Driver.getDriver().navigate().refresh();
        homePage.myAccount.click();
        accountPage.orderListIcon.click();
        Select select=new Select(selectMonth);
        select.selectByVisibleText("Mart");
        Select select1=new Select(selectYear);
        select1.selectByVisibleText("2022");
        orderDetailButtonList.get(0).click();
        String str=Driver.getDriver().getCurrentUrl();//https://wpp.birdamlabal.com/my-account/order/132557079
        String str1=str.replaceAll("[^\\d]", "");
        String deleteOrderText = deleteOrderMsg.getText();
        System.out.println("DELETE ORDER MESSAGE = " + deleteOrderText.toUpperCase(Locale.ROOT));
        System.out.println("DELETED ORDER NO = " + str1.toUpperCase(Locale.ROOT));
        Assert.assertTrue(deleteOrderMsg.isDisplayed());
        System.out.println("str1 = " + str1);
        return str1;
    }

    public void goToOldOrder(){
        Driver.getDriver().navigate().refresh();
        homePage.myAccount.click();
        accountPage.orderListIcon.click();
        Select select=new Select(selectMonth);
        select.selectByVisibleText("Nisan");
        Select select1=new Select(selectYear);
        select1.selectByVisibleText("2022");
        oldOrderDetailButtonForStore.click();
    }










}
