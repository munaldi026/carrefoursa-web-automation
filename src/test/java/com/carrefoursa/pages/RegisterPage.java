package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "js-register-popup")
    public WebElement registerButton;

    @FindBy(className = ".form-control[id='register_phoneNumber']")
    public WebElement registerPhoneNumber;

    @FindBy(className = ".form-control[id='email']")
    public WebElement registerEmail;

    @FindBy(className = ".generalAgreement[id='generalAgreement']")
    public WebElement generalCheckbox;

    @FindBy(className = ".generalAgreement[id='kvkkAgreement']")
    public WebElement kvkkAgreementCheckbox;

    @FindBy(className = ".generalAgreement[id='aydinlatmaMetni']")
    public WebElement clarificationtextCheckbox;

    @FindBy(id = "registerBtn")
    public WebElement signUpButton;

    @FindBy(css = ".confirmationCode")
    public WebElement otpRegisterTextBox;


    @FindBy(id = ".form-control[id='cityCode']")
    public WebElement cityCode;

    @FindBy(id = ".form-control[id='townCode']")
    public WebElement townCode;

    @FindBy(id = ".form-control[id='districtCode']")
    public WebElement districtCode;

    @FindBy(id = "selectStoreSubmit")
    public WebElement contiueButton;

}
