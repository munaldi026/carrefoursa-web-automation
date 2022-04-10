package com.carrefoursa.pages;

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

    @FindBy(tagName = "h1")
    public WebElement emptyCartValueMsg;

    @FindBy(css = ".js-empty-cart-link")
    public WebElement miniCartRemoveAllLink;

    @FindBy(css = ".empty-cart-confirm-btn")
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
    public List<WebElement> miniCartList;

    @FindBy(css = ".d-sm-none.js-minicart-total-price")
    public WebElement emptyCartValue;

    @FindBy(css = "a[class='btn btn-primary btn-lg']")
    public WebElement goBackHomePageFromBasketButton;

    @FindBy(css = ".checkmark")
    public WebElement touchlessDeliveryCheckmark;

    @FindBy(xpath = "//div[contains(text(),'BU SİPARİŞ TEMASSIZ TESLİMATTIR. LÜTFEN KAPIYA ASI')]")
    public WebElement verifyTouchlessDeliveryText;

    @FindBy(css = "label[for='NORMAL'] span[class='radiomark']")
    public WebElement selectNormalBag;

    @FindBy(css = "label[for='BEZ'] span[class='radiomark']")
    public WebElement selectClothBag;

    @FindBy(xpath = "//div[contains(text(),'Alışveriş Poşeti')]")
    public WebElement verifyNormalBag;

    @FindBy(xpath = "//div[contains(text(),'Online Alışveriş Çantası')]")
    public WebElement verifyClothBag;

    @FindBy(css = ".quantity")
    public WebElement firstCountityInCart;


    public void verifyClothBag(){
        String verifyClothBagText = verifyClothBag.getText();
        System.out.println("(Cloth bag is added successfully)verifyClothBagMsg= " + verifyClothBagText);
        Assert.assertTrue(verifyClothBag.isDisplayed());
    }

    public void verifyNormalBag(){
        String verifyNormalBagText = verifyNormalBag.getText();
        System.out.println("(Shopping bag is added successfully)verifyNormalBagMsg= " + verifyNormalBagText);
        Assert.assertTrue(verifyNormalBag.isDisplayed());
    }

    public void verifyTouchlessDelivery(){
        String deliveryText = verifyTouchlessDeliveryText.getText();
        System.out.println("TOUCHLESS DELIVERY MESSAGE: " + deliveryText);
        Assert.assertTrue(verifyTouchlessDeliveryText.isDisplayed());
    }

    public void getremoveProductButtonInBasket(){
        removeProductButtonInBasket.click();
    }

    public void removeAllCart (){
        //homePage.homePageButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(homePage.myBasket);
        ReusableMethods.waitFor(2);
        miniCartRemoveAllLink.click();
        emptyCartComfirmButton.click();
        Driver.getDriver().navigate().refresh();
    }
    public void removeAllProduct(){
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(homePage.myBasket);
        if(miniCartList.size()>0){
           miniCartRemoveAllLink.click();
           emptyCartComfirmButton.click();
        }
    }

    public void verifyIncreaseQuantyInMiniCart() {

        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        System.out.println("Increased Actual quantity = " + quantity);
        String expected = "2";
        System.out.println("expected quantity = " + expected);
        Assert.assertEquals(expected, quantity);
    }

    public void verifydecreaseQuantyInMiniCart() {
        ReusableMethods.waitFor(1);
        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        System.out.println("Decreased Actual quantity = " + quantity);
        String expected = "1";
        System.out.println("expected quantity = " + expected);
        Assert.assertEquals(expected, quantity);
    }

    public void miniCartRemoveProduct() {
        miniCartRemoveLink.click();
    }

    public void removeAllProducts() {

        try {

            List<String> listOfProducts = new ArrayList<>();
            for (WebElement productlist : miniCartList) {
                listOfProducts.add(productlist.getText());
            }
            System.out.println("listOfProducts.size() = " + listOfProducts.size());
            if (emptyCartValue.getText().contains("0,00 TL")){
                productPage.searchProduct();
                plpPage.addToBasketButton();
            }
            else if (!emptyCartValue.getText().contains("0,00 TL")){

                ReusableMethods.hover(homePage.myBasket);
                ReusableMethods.waitFor(2);
                miniCartRemoveAllLink.click();
                emptyCartComfirmButton.click();
                productPage.searchProduct();
                plpPage.addToBasketButton();
            }
        } catch (Exception e) {
            System.out.println("Sepette urun bulunmamaktadir");
        }
        Driver.getDriver().navigate().refresh();

    }

    public void removeMiniCart(){
        ReusableMethods.hover(homePage.myBasket);
        miniCartRemoveAllLink.click();
        emptyCartComfirmButton.click();
    }
}
