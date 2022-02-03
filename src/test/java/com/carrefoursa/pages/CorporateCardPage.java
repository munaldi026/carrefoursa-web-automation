package com.carrefoursa.pages;

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

//    @FindBy(css = "input[placeholder='Puan Tutarı']")
//    public WebElement corporateCardPointField;
//
//    @FindBy(css = "input[placeholder='Puan Tutarı']")
//    public WebElement corporateCardPointField;

}
