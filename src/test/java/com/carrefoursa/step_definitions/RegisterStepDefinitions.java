package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.pages.RegisterPage;
import com.carrefoursa.utilities.ConfigReader;
import io.cucumber.java.en.Given;

public class RegisterStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    LoginPage loginPage=new LoginPage();


    @Given("Kullanici uye ol buttonuna tiklar")
    public void kullanici_uye_ol_buttonuna_tiklar() {
        registerPage.registerButton.click();
    }

    @Given("Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer")
    public void cep_telefonu_numaraniz_kayitli_olmayan_bir_numara_girer() {
        registerPage.registerPhoneNumber.sendKeys(ConfigReader.getProperty("unregistered_number"));
    }

    @Given("Email bolumune email girilir")
    public void email_bolumune_email_girilir() {

        registerPage.registerEmail.sendKeys(ConfigReader.getProperty("unregistered_email"));
    }

    @Given("Iletişim izni checkbox tiklanir")
    public void iletişim_izni_checkbox_tiklanir() {
    registerPage.generalCheckbox.click();

    }

    @Given("Uyelik beyani checkbox tiklanir")
    public void uyelik_beyani_checkbox_tiklanir() {
        registerPage.kvkkAgreementCheckbox.click();

    }
    @Given("Aydintlatma beyani checkbox tiklanır")
    public void aydintlatma_beyani_checkbox_tiklanır() {
        registerPage.clarificationtextCheckbox.click();
    }

    @Given("Kullanici eksik numara hata mesajini gorur")
    public void kullanici_eksik_numara_hata_mesaji() {
        loginPage.GecersizNumaraHataMesaji.isDisplayed();
    }




}
