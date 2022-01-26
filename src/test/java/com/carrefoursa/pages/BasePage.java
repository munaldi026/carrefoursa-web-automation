package com.carrefoursa.pages;

import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
LoginPage login=new LoginPage();
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void closeCerez(){
       Driver.getDriver().findElement(By.cssSelector(".glyphicon.glyphicon-remove")).click();
    }

    public void successLogin(){

        login.myAccountBtn.click();
        login.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("phone_number"));
        login.loginBtn.click();
        login.otpCodeTextBox.sendKeys(ConfigReader.getProperty("otp_code"));
        login.otpConfirmBtn.click();
    }

}