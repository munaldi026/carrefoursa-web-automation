package com.carrefoursa.step_definitions;


import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("Kullanici carrefoursa.com anasayfasina gider.")
    public void kullanici_carrefoursa_com_anasayfasina_gider() {
    }
    @Given("Anasayfadaki Giris Yap butonuna tiklar.")
    public void anasayfadaki_giris_yap_butonuna_tiklar() {
       loginPage.loginButton.click();
    }

    @Given("Cep Telefonu Numaraniz bolumune gecerli bir numara girer")
    public void cep_telefonu_numaraniz_bolumune_gecerli_bir_numara_girer() {

        loginPage.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("phone_number"));
    }
    @Given("Giris Yapin butonuna tiklar")
    public void giris_yapin_butonuna_tiklar() {
        loginPage.loginButton2.click();
    }
    @Given("SMS Onay Kodu bolumune gecerli bir Otp kodu girer")
    public void sms_onay_kodu_bolumune_gecerli_bir_otp_kodu_girer() {
        loginPage.otpCodeTextBox.sendKeys(ConfigReader.getProperty("otp_code"));
    }
    @When("Tamam butonuna tiklar")
    public void tamam_butonuna_tiklar() {
        loginPage.otpConfirmButton.click();

        ReusableMethods.waitFor(3);
    }
    @Then("Basarili bir giris yaptigini control eder")
    public void basariliBirGirisYaptiginiControlEder() {
        ReusableMethods.clickFunction(loginPage.wellcomePop_upClose);
        ReusableMethods.closeCerez();
        String expectedMsgOnMainPage = "Hoş geldiniz,";
        System.out.println("expectedMsgOnMainPage = " + expectedMsgOnMainPage);
        String actualMsgOnMainPage = homePage.myAccount.getText();
        System.out.println("actualMsgOnMainPage = " + actualMsgOnMainPage);
        Assert.assertTrue(actualMsgOnMainPage.contains(expectedMsgOnMainPage));

    }
    @Given("Cep Telefonu Numaraniz bolumune gecersiz bir numara girer")
    public void cep_telefonu_numaraniz_bolumune_gecersiz_bir_numara_girer() {
        loginPage.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("invalid_phone_number"));
    }
    @Given("Gecersiz numara girildiginde cikan hata mesaji gorulur")
    public void Gecersiz_numara_girildiginde_cikan_hata_mesaji_gorulur(){
        loginPage.GecersizNumaraHataMesaji.isDisplayed();
    }
    @Given("SMS Onay Kodu bolumune gecersiz bir Otp kodu girer")
    public void SMS_Onay_Kodu_bolumune_gecersiz_bir_Otp_kodu_girer() {
        loginPage.otpCodeTextBox.sendKeys(ConfigReader.getProperty("invalid_otp_code"));
    }
    @Given("Gecersiz SMS onay hata mesaji gorulur")
    public void Gecersiz_SMS_onay_hata_mesaji_gorulur(){
        loginPage.HataliOtpMesaji.isDisplayed();
    }
}

