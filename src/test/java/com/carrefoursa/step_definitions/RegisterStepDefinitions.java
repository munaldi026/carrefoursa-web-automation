package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.pages.RegisterPage;
import com.carrefoursa.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import com.carrefoursa.utilities.ReusableMethods;

public class RegisterStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    LoginPage loginPage=new LoginPage();



    @Given("Kullanici uye ol buttonuna tiklar")
    public void kullanici_uye_ol_buttonuna_tiklar() {
        registerPage.registerButton.click();
    }

    @Given("Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer")
    public void cep_telefonu_numaraniz_kayitli_olmayan_bir_numara_girer() {
        int phonenumber=801111149;
        String phonenumber2=Integer.toString(phonenumber);
        registerPage.registerPhoneNumber.sendKeys(phonenumber2);


    }

    @Given("Email bolumune email girilir")
    public void email_bolumune_email_girilir() {

        registerPage.registerEmail.sendKeys(ConfigReader.getProperty("unregistered_email"));
        ReusableMethods.waitFor(3);
    }

    @Given("SMS Onay Kodu bolumune otp kodu girilir")
    public void sms_onay_kodu_bolumune_gecerli_bir_otp_kodu() {
        registerPage.registerotp.sendKeys(ConfigReader.getProperty("otp_code"));
        ReusableMethods.waitFor(2);
        registerPage.registerOtpConfirmButton.click();
    }

    @Given("Iletişim izni checkbox tiklanir")
    public void iletisim_izni_checkbox_tiklanir() {
        registerPage.generalCheckbox.click();
        ReusableMethods.waitFor(3);

    }

    @Given("Uyelik beyani checkbox tiklanir")
    public void uyelik_beyani_checkbox_tiklanir() {
        registerPage.kvkkAgreementCheckbox.click();
        ReusableMethods.waitFor(3);
    }
    @Given("Aydintlatma beyani checkbox tiklanır")
    public void aydintlatma_beyani_checkbox_tiklanir() {
        registerPage.clarificationtextCheckbox.click();
        ReusableMethods.waitFor(3);
    }
    @Given("Kullanici uye olun buttonuna tiklar")
    public void kullanici_uye_ol_tiklanir() {
        registerPage.signUpButton.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici eksik numara hata mesajini gorur")
    public void kullanici_eksik_numara_hata_mesaji() {
        loginPage.GecersizNumaraHataMesaji.isDisplayed();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici bulundugu sehiri girer")
    public void kullanici_bulundugu_sehiri_girer() {
        registerPage.cityCode.click();
        registerPage.cityselectcode.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici bulundugu ilceyi girer")
    public void kullanici_bulundugu_ilceyi_girer() {
        registerPage.townCode.click();
        registerPage.townselectcode.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici bulundugu mahalleyi girer")
    public void kullanici_bulundugu_mahalleyi_girer() {
        registerPage.districtCode.click();
        registerPage.districtselectcode.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici devam buttonuna tiklar")
    public void kullanici_devam_buttonuna_tiklar() {
        registerPage.contiueButton.click();
        ReusableMethods.waitFor(2);
    }



    @Given("Kullanici hosgeldiniz pop-up gorur")
    public void kullanici_hosgeldiniz_pop_gorur() {
        loginPage.wellcomePop_up.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Cep Telefonu Numaraniz bolumune gecersiz bir numara girilir")
    public void cep_telefonu_numaraniz_bolumune_gecersiz_bir_numara() {
        registerPage.registerPhoneNumber.sendKeys(ConfigReader.getProperty("register_invalid_phone_number"));
    }

    @Given("Gecersiz numara girildiginde cikan hata mesaji ekranda gorulur")
    public void Gecersiz_numara_girildiginde_cikan_hata_mesaji(){
        loginPage.GecersizNumaraHataMesaji.isDisplayed();
    }

    @Given("Kullanici sms bolumune gecersiz otp girilir")
    public void kullanici_gecersiz_otp_girer(){
        registerPage.registerotp.sendKeys("invalid_otp_code");
        ReusableMethods.waitFor(2);
    }
    @Given("Kullanici gecersiz SMS onay hata mesaji gorulur")
    public void gecersiz_SMS_onay_hata_mesaji_gorulur(){
        loginPage.HataliOtpMesaji.isDisplayed();
    }

    @Given("Lutfen telefon numarasi giriniz yazisi gorulur")
    public void lutfen_telefon_numarasi_giriniz(){
        loginPage.errorMsgText.isDisplayed();
    }



    @Given("Sms kodunu eksik girdiniz yazisi gorulur")
    public void sms_kodunu_eksik_girdiniz_yazisi_gorulur(){
        loginPage.HataliOtpMesaji.isDisplayed();
    }

    @Given("SMS Onay Kodu bolumune otp kodu bos birakilir")
    public void sms_onay_kodu_bolumune_gecerli_bir_otp_kodu_bos_birakilir() {
        registerPage.registerOtpConfirmButton.click();
    }

}
