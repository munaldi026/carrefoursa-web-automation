package com.carrefoursa.pages;

import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "(//a[@class='js-login-popup'])[2]")
    public WebElement loginButton;

    @FindBy(css = "a[class='csa-logout js-logout col-xs-12 col-sm-6 col-md-3 col-lg-3'] em[class='icon']")
    public WebElement logoutIcon;

    @FindBy(css = ".alert.alert-warning.alert-dismissable")
    public WebElement verifyLogoutMsg;

    @FindBy(id = "login_personal_phoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "loginBtn")
    public WebElement loginButton2;

    @FindBy(id = "confirmationCode")
    public WebElement otpCodeTextBox;

    @FindBy(xpath = "(//button[@id='confirmOTPBtn'])[1]")
    public WebElement otpConfirmButton;

    @FindBy(xpath = "//span[@class='error-message']")
    public WebElement errorMsgText;
    @FindBy(css = ".welcome-modal__container")
    public WebElement wellcomePop_up;

    @FindBy(css = ".welcome-modal__link")
    public WebElement discoverButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement wellcomePop_upClose;
    @FindBy(css = "span[class='error-message']")
    public WebElement GecersizNumaraHataMesaji;
    @FindBy(css = "div[class='login-error-message error-message']")
    public WebElement HataliOtpMesaji;
    @FindBy(className = "d-block")
    public WebElement welcome;

    @FindBy(css = ".forgotten-password[id='validEmail']")
    public WebElement confirmationmessage;

    @FindBy(xpath = "//a[@class='js-password-forgotten']")
    public WebElement notLoginButton;

    @FindBy(css = ".form-control[id='forgottenPwd.email']")
    public WebElement notLoginEmail;

    @FindBy(id = "forgottenPassword")
    public WebElement verificationLink;



    public void successLogin() {
        loginButton.click();
        phoneNumberTextBox.sendKeys(ConfigReader.getProperty("phone_number"));
        loginButton2.click();
        otpCodeTextBox.sendKeys(ConfigReader.getProperty("otp_code"));
        otpConfirmButton.click();
        ReusableMethods.waitFor(5);
//        wellcomePop_upClose.click();
//        ReusableMethods.closeCerez();

    }
}

