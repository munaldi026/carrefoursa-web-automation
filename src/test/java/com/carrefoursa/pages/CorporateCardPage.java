package com.carrefoursa.pages;

import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class CorporateCardPage extends BasePage{


       @FindBy(xpath = "(//span[@class='headerText'])[3]")
       public WebElement corporateCartLink;

       @FindBy(xpath = "//input[@name='cardNumber']")
       public WebElement corporateCardNumberField;

       @FindBy(xpath = "//input[@placeholder='Puan Tutarı']")
       public WebElement corporateCardPointField;

       @FindBy(xpath = "//button[@class='btn btn-default form-control js-use-corporate-check']")
       public WebElement corporateCardUseButton;

       @FindBy(css = "div[class='form-group response-area response-error'] span")
       public WebElement zeroVerificationMsg;

       @FindBy(css = ".continue-btn-price")
       public WebElement priceInBasket;

       @FindBy(css = "div[class='form-group response-area response-error'] span")
       public WebElement verifyMoreThanTotolMsg;

       @FindBy(css = "div:nth-child(2) form:nth-child(1) div:nth-child(5) span:nth-child(1)")
       public WebElement usingAmountInCard;

       @FindBy(css = "button[class='btn btn-default form-control js-remove-corporate-check remove-corporate-check']")
       public WebElement releaseButton;

       @FindBy(css = "div[class='form-group response-area response-error'] span")
       public WebElement totalOrderCountMsg;

       @FindBy(xpath = "//a[@href='/cart']")
       public WebElement turnBackToBasket;

       public void moreThanTotalAmount(){
              String priceInBasketText = priceInBasket.getText();
              System.out.println("PRICE IN BASKET TEXT = " + priceInBasketText.toUpperCase(Locale.ROOT));

              String priceInBasket=priceInBasketText.replace(" TL","").replace(",","");
              System.out.println("PRICE IN BASKET NEW TEXT = " + priceInBasket.toUpperCase(Locale.ROOT));
              int price=Integer.parseInt(priceInBasket);
              System.out.println("PRICE = " + price);

              int actualPrice = price+100;
              String actualPrice1;
              actualPrice1=Integer.toString(actualPrice);
              System.out.println("LAST PRICE TO SEND = " + actualPrice1);

              corporateCardPointField.sendKeys(actualPrice1);

              ReusableMethods.waitFor(1);
       }
       }



