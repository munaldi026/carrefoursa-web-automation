package com.carrefoursa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateCardPage extends BasePage{


       @FindBy(xpath = "//span[normalize-space()='Kurumsal Kart']")
       public WebElement corporateCartLink;

       @FindBy(css = "input[placeholder='Kart Numaranız']")
       public WebElement corporateCardNumberField;

       @FindBy(css = "input[placeholder='Puan Tutarı']")
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


}
