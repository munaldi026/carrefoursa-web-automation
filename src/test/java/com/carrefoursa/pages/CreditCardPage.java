package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CreditCardPage extends BasePage{


    @FindBy(css = "img[title='Carrefour Ayçiçek Yağı 5 lt']")
    public WebElement selectedProduct;

    @FindBy(css = "div[class='details'] a[class='pr-name']")
    public WebElement productInBasket;

    @FindBy(className = "pr-name")
    public static List<WebElement>cartList;

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

    public String verifyPayByCashAtDelivery(){
        String deliveryText = verifyByCashAtDelivery.getText();
        System.out.println("deliveryText = " + deliveryText);
        Assert.assertTrue(verifyByCashAtDelivery.isDisplayed());
        return deliveryText;

    }

    public void verifyCartList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement productlist : cartList) {

            listOfProducts.add(productlist.getText());        }

        String expectedProductName=null;
        expectedProductName= Constants.searchOrderProductName;
        System.out.println("expectedProductName = " + expectedProductName);
        System.out.println("listOfProducts.size() = " + listOfProducts.size());
        System.out.println("listOfProducts = " + listOfProducts);
        Assert.assertTrue(listOfProducts.contains(expectedProductName));
        System.out.println("Product is added to cart");
    }

    public void fillCreditCardInformations(){
        creditCardNumberField.sendKeys(Constants.creditCardNumber);
        creditCardHolderNameField.sendKeys(Constants.creditCardHolderName);
        Select month =new Select(creditCardExpiryMonth);
        month.selectByVisibleText(Constants.creditCardExpiryMonth);
        Select year =new Select(creditCardExpiryYear);
        year.selectByVisibleText(Constants.creditCardExpiryYear);
        creditCardCVVField.sendKeys(Constants.creditCardCVV, Keys.TAB);
    }

}
