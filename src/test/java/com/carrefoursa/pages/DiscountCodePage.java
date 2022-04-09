package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountCodePage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='Kampanya Kodu']")
    public WebElement discountCodeButton;

    @FindBy(css = "#assecoVoucherInput")
    public WebElement discountCodeTexField;

    @FindBy(css = "#masterpassVoucherBtn")
    public WebElement discountCodeUseButton;

    @FindBy(css = "#succesMessage")
    public WebElement succesMessage;

    @FindBy(css = "div[id='cboxLoadedContent'] div p")
    public WebElement invalidMessage;

    @FindBy(css = "#releaseVoucherbtn")
    public WebElement releaseButton;


}
