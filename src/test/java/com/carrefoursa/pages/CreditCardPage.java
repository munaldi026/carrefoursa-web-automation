package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCardPage extends BasePage{


    @FindBy(css = "img[title='Carrefour Ayçiçek Yağı 5 lt']")
    public WebElement selectedProduct;

    @FindBy(css = "div[class='details'] a[class='pr-name']")
    public WebElement productInBasket;

    @FindBy(css = "#masterpass")
    public WebElement payByCreditCard;

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
}
