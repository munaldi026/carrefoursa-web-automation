package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(partialLinkText = "Giriş Yap")
    public WebElement myAccountBtn;
    @FindBy(id = "login_personal_phoneNumber")
    public WebElement phoneNumberTextBox;
    @FindBy(id = "loginBtn")
    public WebElement loginBtn;
    @FindBy(id = "confirmationCode")
    public WebElement otpCodeTextBox;
    @FindBy(css = ".js-otp-btn-process")
    public WebElement otpConfirmBtn;
    @FindBy(css = ".text-left.d-sm-none")
    public WebElement getMyAccountBtn;
    @FindBy(xpath = "//span[@class='error-message']")
    public WebElement errorMsgText;
    @FindBy(css = ".welcome-modal__container")
    public WebElement hosGeldinizPopup;


}
