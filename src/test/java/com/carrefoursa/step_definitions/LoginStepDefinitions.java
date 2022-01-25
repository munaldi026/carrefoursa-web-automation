package com.carrefoursa.step_definitions;


import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class LoginStepDefinitions {

    LoginPage login=new LoginPage();

    @Given("Kullanici carrefoursa.com anasayfasina gider.")
    public void kullanici_carrefoursa_com_anasayfasina_gider() {

        //Driver.getDriver().get(ConfigReader.getProperty("url_preProd"));
    }

    @Given("Anasayfadaki Giris Yap butonuna tiklar.")
    public void anasayfadaki_giris_yap_butonuna_tiklar() {
       login.myAccountBtn.click();
    }

    @Given("Cep Telefonu Numaranız bolumune gecerli bir numara girer")
    public void cep_telefonu_numaranız_bolumune_gecerli_bir_numara_girer() {

        login.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("phone_number"));

    }

    @Given("Giriş Yapın butonuna tıklar")
    public void giriş_yapın_butonuna_tıklar() {
        login.loginBtn.click();
    }

    @Given("SMS Onay Kodu bolumune geçerli bir Otp kodu girer")
    public void sms_onay_kodu_bolumune_geçerli_bir_otp_kodu_girer() {

        login.otpCodeTextBox.sendKeys(ConfigReader.getProperty("otp_code"));
    }

    @When("Tamam butonuna tıklar")
    public void tamam_butonuna_tıklar() {
        login.otpConfirmBtn.click();
    }

    @Then("Basarili bir giris yaptigini control eder")
    public void basarili_bir_giris_yaptigini_control_eder() {
        String expectedMsg="HOŞGELDİNİZ";
        WebElement hosGeldinizPopup = login.hosGeldinizPopup;
        String hosGeldinizMsg=hosGeldinizPopup.getText();
        System.out.println("hosGeldinizMsg = " + hosGeldinizMsg);
        Assert.assertTrue(hosGeldinizMsg.contains(expectedMsg));


    }

    @Given("Cep Telefonu Numaranız bolumune gecersiz bir numara girer")
    public void cep_telefonu_numaranız_bolumune_gecersiz_bir_numara_girer() {

        login.phoneNumberTextBox.sendKeys(ConfigReader.getProperty("invalid_phone_number"));

    }

    @Given("Gecersiz numara girildiginde cikan hata mesaji gorulur")
    public void Gecersiz_numara_girildiginde_cikan_hata_mesaji_gorulur(){
        login.GecersizNumaraHataMesaji.isDisplayed();
    }


    @Given("SMS Onay Kodu bolumune geçersiz bir Otp kodu girer")
    public void SMS_Onay_Kodu_bolumune_geçersiz_bir_Otp_kodu_girer() {
        login.otpCodeTextBox.sendKeys(ConfigReader.getProperty("invalid_otp_code"));
    }

    @Given("Gecersiz SMS onay hata mesaji gorlur")
    public void Gecersiz_SMS_onay_hata_mesaji_gorlur(){
        login.HataliOtpMesaji.isDisplayed();
    }

}

