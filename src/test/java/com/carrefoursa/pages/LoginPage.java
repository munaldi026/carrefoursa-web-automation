package com.carrefoursa.pages;

import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(partialLinkText = "Giriş Yap")
    public WebElement loginButton;
    @FindBy(id = "login_personal_phoneNumber")
    public WebElement phoneNumberTextBox;
    @FindBy(id = "loginBtn")
    public WebElement loginButton2;
    @FindBy(id = "confirmationCode")
    public WebElement otpCodeTextBox;
    @FindBy(css = ".js-otp-btn-process")
    public WebElement otpConfirmButton;
    @FindBy(xpath = "//span[@class='error-message']")
    public WebElement errorMsgText;
    @FindBy(css = ".welcome-modal__container")
    public WebElement wellcomePop_up;
    @FindBy(xpath = "//button[@class='close']")
    public WebElement wellcomePop_upClose;
    @FindBy(css = "span[class='error-message']")
    public WebElement GecersizNumaraHataMesaji;
    @FindBy(css = "div[class='login-error-message error-message']")
    public WebElement HataliOtpMesaji;

    public void successLogin(){
        ReusableMethods.clickFunction(loginButton);
        phoneNumberTextBox.sendKeys(ConfigReader.getProperty("phone_number"));
        loginButton2.click();
        otpCodeTextBox.sendKeys(ConfigReader.getProperty("otp_code"));
        otpConfirmButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickFunction(wellcomePop_upClose);
        ReusableMethods.closeCerez();


    }

}
