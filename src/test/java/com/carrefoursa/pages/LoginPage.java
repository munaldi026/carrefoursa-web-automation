package com.carrefoursa.pages;

import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "(//a[@class='js-login-popup'])[2]")
    public WebElement loginButton;

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

