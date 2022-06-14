package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.SmkConstants;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CreditCardPage extends BasePage {
    PDPPage pdpPage = new PDPPage();

    @FindBy(xpath = "//li[@class='product-item product-item']")
    public static List<WebElement> cartList;

    @FindBy(css = "img[title='Carrefour Ayçiçek Yağı 5 lt']")
    public WebElement selectedProduct;

    @FindBy(css = "div[class='details'] a[class='pr-name']")
    public WebElement productInBasket;

    @FindBy(css = ".name")
    public List<WebElement> miniCartList;

    @FindBy(xpath = "//a[@class='name']")
    public List<WebElement> miniCartList1;
    @FindBy(css = ".remove-cart-item-link")
    public List<WebElement> removeItemListMiniCart;
    @FindBy(css = "#masterpass")
    public WebElement payByCreditCard;
    @FindBy(css = "#cash_at_delivery")
    public WebElement payByCashAtDelivery;
    @FindBy(css = "div[class='pay-with-cash'] span[class='description']")
    public WebElement verifyByCashAtDelivery;
    @FindBy(css = ".other.form-control.rtaPan")
    public WebElement creditCardNumberField;
    @FindBy(css = "input[name='cardHolderName']")
    public WebElement creditCardHolderNameField;
    @FindBy(css = "select[name='expiryMonth']")
    public WebElement creditCardExpiryMonth;
    @FindBy(css = "select[name='expiryYear']")
    public WebElement creditCardExpiryYear;
    @FindBy(css = "input[placeholder='000']")
    public WebElement creditCardCVVField;
    @FindBy(css = "#mpSaveCard")
    public WebElement mpSaveCardCheckBox;
    @FindBy(xpath = "//label[@for='mpFormEnable']//span[@class='radiomark']")
    public WebElement creditCardRadioButton;
    @FindBy(css = "#accountAliasName2")
    public WebElement creditCardNameField;
    @FindBy(css = ".message")
    public WebElement verifyCreditCartMsg;

    @FindBy(id = "lblRandomNum")
    public WebElement securityCode;

    @FindBy(css = "#txtPwd")
    public WebElement securityPasswordBox;

    @FindBy(css = "#submitBtn")
    public WebElement securityCodeSubmitButton;



    public String verifyPayByCashAtDelivery() {
        String deliveryText = verifyByCashAtDelivery.getText();
        System.out.println("deliveryText = " + deliveryText);
        Assert.assertTrue(verifyByCashAtDelivery.isDisplayed());
        return deliveryText;

    }


    public String getSecurityCodeFromPupup(){

        String codeText = securityCode.getText();
        System.out.println("SECURITY CODE = " + codeText);
        return codeText;

    }

    public void verifyCartList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement productlist : cartList) {
            listOfProducts.add(productlist.getText());        }

        String expectedProductName = null;
        expectedProductName = listOfProducts.get(0);
        System.out.println("expectedProductName = " + expectedProductName);
        System.out.println("listOfProducts = " + listOfProducts);
        Assert.assertTrue(listOfProducts.toString().contains(expectedProductName));
        System.out.println("True product is added to cart successfully");
    }
    public void verifyCartProductMultiList(){

        List<String>expectedList=new ArrayList<>();
        expectedList.add("Dana Strogonof");
        expectedList.add("İthal Norveç Somon Dilim kg");
        expectedList.add("Johnson's Baby Şampuan 750 ml");

        List<String>listOfProducts=new ArrayList<>();
        for (WebElement productlist:cartList) {
            listOfProducts.add(productlist.getText());
        }
        System.out.println("listOfProducts.size() = " + listOfProducts.size());
        System.out.println("expectedList = " + expectedList);
        System.out.println("listOfProducts = " + listOfProducts);


    }



    public List<String> getMiniCartList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement productlist : miniCartList) {
            listOfProducts.add(productlist.getText());
        }
        System.out.println("BEFORE REMOVING ALL PRODUCTS");
        //System.out.println("pdpPage.getProductCodeFromPLP() = " + pdpPage.getProductCodeFromPLP());
        //System.out.println("pdpPage.getIntProductCodeFromPLP() = " + pdpPage.getIntProductCodeFromPLP());
        System.out.println("listOfProducts.size() = " + listOfProducts.size());
        System.out.println("listOfProducts = " + listOfProducts);
        System.out.println("AFTER REMOVING ALL PRODUCTS");
        return listOfProducts;
    }

    public List<String> verifyMiniCartList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement productlist : miniCartList1) {
            listOfProducts.add(productlist.getText());
        }
            System.out.println("listOfProducts.size() = " + listOfProducts.size());
            String expectedProductName = null;

            expectedProductName = listOfProducts.get(0);
            System.out.println("expectedProductName = " + expectedProductName);
        System.out.println("listOfProducts = " + listOfProducts);
        Assert.assertTrue(listOfProducts.toString().contains(expectedProductName));
            System.out.println("The Product is added to Minicart successfully");
            return listOfProducts;
        }

    public void verifyRemoveMiniCartList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement productlist : miniCartList1) {
            listOfProducts.add(productlist.getText());
        }

        String deletedProductName = null;
        System.out.println("True product is deleted from Minicart successfully");
        deletedProductName = SmkConstants.miniCartProductName;
        System.out.println("deletedProductName = " + deletedProductName);
        System.out.println("listOfProducts.size() = " + listOfProducts.size());

        Assert.assertFalse(listOfProducts.toString().contains(deletedProductName));


    }

        public List<WebElement> getRemoveItemListMiniCart () {
            List<WebElement> listOfRemoveLinks = new ArrayList<>();
            for (WebElement removeItemList : removeItemListMiniCart) {
                listOfRemoveLinks.add(removeItemList);
            }
            return listOfRemoveLinks;
        }

        public void fillCreditCardInformations () {
            creditCardNumberField.sendKeys(Constants.creditCardNumber);
            creditCardHolderNameField.sendKeys(Constants.creditCardHolderName);
            Select month = new Select(creditCardExpiryMonth);
            month.selectByVisibleText(Constants.creditCardExpiryMonth);
            Select year = new Select(creditCardExpiryYear);
            year.selectByVisibleText(Constants.creditCardExpiryYear);
            creditCardCVVField.sendKeys(Constants.creditCardCVV);
        }

    }
