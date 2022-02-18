package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BasketPage extends BasePage {
    ProductPage productPage=new ProductPage();
    PLPPage plpPage=new PLPPage();

    HomePage homePage = new HomePage();

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

    @FindBy(css = ".remove-cart-item-link")
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

    @FindBy(xpath = "//a[@class='name']")
    public WebElement productNameInMiniCart;

    @FindBy(css = ".alert-text")
    public WebElement maximumProductAmountMsg;

    @FindBy(css = "p[id='warning-text'] p")
    public WebElement PDPmaximumProductMsg;

    @FindBy(css = ".name")
    public static List<WebElement> MiniCartList;

    @FindBy(css = ".d-sm-none.js-minicart-total-price")
    public WebElement emptyCartValue;

    @FindBy(css = "a[class='btn btn-primary btn-lg']")
    public WebElement goBackHomePageFromBasketButton;

    @FindBy(css = ".checkmark")
    public WebElement touchlessDeliveryCheckmark;

    @FindBy(css = "div[class='col-xs-12 col-sm-4 col-md-3 col-md-offset-1 part'] div[class='row m-0'] div")
    public WebElement verifyTouchlessDeliveryText;

    @FindBy(css = "label[for='NORMAL'] span[class='radiomark']")
    public WebElement selectNormalBag;

    @FindBy(css = "label[for='BEZ'] span[class='radiomark']")
    public WebElement selectClothBag;

    @FindBy(xpath = "//div[contains(text(),'Alışveriş Poşeti')]")
    public WebElement verifyNormalBag;

    @FindBy(xpath = "//div[contains(text(),'Online Alışveriş Çantası')]")
    public WebElement verifyClothBag;


    public void verifyClothBag(){
        String verifyClothBagText = verifyClothBag.getText();
        System.out.println("verifyClothBagMsg= " + verifyClothBagText);
        Assert.assertTrue(verifyClothBag.isDisplayed());
    }

    public void verifyNormalBag(){
        String verifyNormalBagText = verifyNormalBag.getText();
        System.out.println("verifyNormalBagMsg= " + verifyNormalBagText);
        Assert.assertTrue(verifyNormalBag.isDisplayed());
    }

    public void verifyTouchlessDelivery(){
        String deliveryText = verifyTouchlessDeliveryText.getText();
        System.out.println("touchlessDeliveryMsg = " + deliveryText);
        Assert.assertTrue(verifyTouchlessDeliveryText.isDisplayed());
    }

    public void removeAllCart (){
        homePage.homePageButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(homePage.myBasket);
        ReusableMethods.waitFor(2);
        miniCartRemoveAllLink.click();
        emptyCartComfirmButton.click();
    }

    public void verifyIncreaseQuantyInMiniCart() {

        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        String expected = "2";
        Assert.assertEquals(expected, quantity);
    }

    public void verifydecreaseQuantyInMiniCart() {

        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        String expected = "1";
        Assert.assertEquals(expected, quantity);
    }

    public void miniCartRemoveProduct() {
        miniCartRemoveLink.click();
    }

    public void removeAllProducts() {
        try {

            List<String> listOfProducts = new ArrayList<>();
            for (WebElement productlist : MiniCartList) {
                listOfProducts.add(productlist.getText());
            }

            System.out.println("listOfProducts.size() = " + listOfProducts.size());
            if (emptyCartValue.getText().contains("0,00 TL")){
                productPage.searchProduct(Constants.certainProductIdForPDP);
                plpPage.addToBasketButton();
            }

            else if (!emptyCartValue.getText().contains("0,00 TL")){

                ReusableMethods.hover(homePage.myBasket);
                ReusableMethods.waitFor(2);
                miniCartRemoveAllLink.click();
                emptyCartComfirmButton.click();
                productPage.searchProduct(Constants.certainProductIdForPDP);
                plpPage.addToBasketButton();
            }
        } catch (Exception e) {
            System.out.println("Sepette urun bulunmamaktadir");
        }
        Driver.getDriver().navigate().refresh();

    }
}
