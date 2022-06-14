package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.pages.RegisterPage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
        registerPage.registerPhoneNumberBox.sendKeys(phonenumber2);
    }

    @Given("Email bolumune email girilir")
    public void email_bolumune_email_girilir() {

        registerPage.registerEmail.sendKeys(ConfigReader.getProperty("unregistered_email"));
        ReusableMethods.waitFor(1);
    }

    @Given("SMS Onay Kodu bolumune otp kodu girilir")
    public void sms_onay_kodu_bolumune_gecerli_bir_otp_kodu() {

        ReusableMethods.waitFor(1);
        registerPage.registerotp.click();
        ReusableMethods.waitFor(1);
        registerPage.registerotp.sendKeys(ConfigReader.getProperty("otp_code"));
        ReusableMethods.waitFor(1);
        registerPage.registerOtpConfirmButton.click();
        //ReusableMethods.waitFor(1);


//        registerPage.registerotp.sendKeys(ConfigReader.getProperty("otp_code"));
//        ReusableMethods.waitFor(2);
//        registerPage.registerOtpConfirmButton.click();
    }

    @Given("Iletişim izni checkbox tiklanir")
    public void iletisim_izni_checkbox_tiklanir() {
        registerPage.generalCheckbox.click();
        ReusableMethods.waitFor(1);

    }

    @Given("Uyelik beyani checkbox tiklanir")
    public void uyelik_beyani_checkbox_tiklanir() {
        registerPage.kvkkAgreementCheckbox.click();
        ReusableMethods.waitFor(1);
    }
    @Given("Aydintlatma beyani checkbox tiklanır")
    public void aydintlatma_beyani_checkbox_tiklanir() {
        registerPage.clarificationtextCheckbox.click();
        ReusableMethods.waitFor(1);
    }
    @Given("Kullanici uye olun buttonuna tiklar")
    public void kullanici_uye_ol_tiklanir() {
        registerPage.signUpButton.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici eksik numara hata mesajini gorur")
    public void kullanici_eksik_numara_hata_mesaji() {
        loginPage.gecersizNumaraHataMesaji.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici bulundugu sehiri girer")
    public void kullanici_bulundugu_sehiri_girer() {
        registerPage.cityCode.click();
        registerPage.cityselectcode.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici bulundugu ilceyi girer")
    public void kullanici_bulundugu_ilceyi_girer() {
        registerPage.townCode.click();
        registerPage.townselectcode.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici bulundugu mahalleyi girer")
    public void kullanici_bulundugu_mahalleyi_girer() {
        registerPage.districtCode.click();
        registerPage.districtselectcode.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici devam buttonuna tiklar")
    public void kullanici_devam_buttonuna_tiklar() {
        registerPage.contiueButton.click();
        ReusableMethods.waitFor(1);
    }



    @Given("Kullanici hosgeldiniz pop-up gorur")
    public void kullanici_hosgeldiniz_pop_gorur() {
        loginPage.wellcomePop_up.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @Given("Cep Telefonu Numaraniz bolumune gecersiz bir numara girilir")
    public void cep_telefonu_numaraniz_bolumune_gecersiz_bir_numara() {
        registerPage.registerPhoneNumberBox.sendKeys(ConfigReader.getProperty("register_invalid_phone_number"));
    }

    @Given("Gecersiz numara girildiginde cikan hata mesaji ekranda gorulur")
    public void Gecersiz_numara_girildiginde_cikan_hata_mesaji(){
        loginPage.gecersizNumaraHataMesaji.isDisplayed();
    }

    @Given("Kullanici sms bolumune gecersiz otp girilir")
    public void kullanici_gecersiz_otp_girer(){
        registerPage.registerotp.sendKeys("invalid_otp_code");
        ReusableMethods.waitFor(1);
    }
    @Given("Kullanici gecersiz SMS onay hata mesaji gorulur")
    public void gecersiz_SMS_onay_hata_mesaji_gorulur(){
        loginPage.HataliOtpMesaji.isDisplayed();
    }

    @Given("Lutfen telefon numarasi giriniz yazisi gorulur")
    public void lutfen_telefon_numarasi_giriniz(){
        //loginPage.errorMsgText.isDisplayed();
        loginPage.verifyUnSuccessLogin1();
    }

    @Given("Hatali bir email adresi girilir")
    public void hataliEmail(){
        registerPage.registerEmail.sendKeys(ConfigReader.getProperty("invalid_email"));
    }

    @Given("Gecerli bir email girilmeli yazisi gorulur")
    public void hataliEmailYazisi(){
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

    @And("Cep Telefonu Numaraniz bolumune bir numara girer{string}")
    public void cepTelefonuNumaranizBolumuneBirNumaraGirer(String phoneNumber) {

        if (phoneNumber.equals("empty")) {
            phoneNumber = "";
        }
        loginPage.loginPhoneNumberBox.sendKeys(phoneNumber);
    }

    @And("Email bolumune email girilir{string}")
    public void emailBolumuneEmailGirilir(String email) {
        if (email.equals("empty")) {
            email = "";
        }
        registerPage.registerEmail.sendKeys(email);
    }

    @Then("kullanici hata mesaji alir {string}")
    public void kullaniciHataMesajiAlir(String expectedErrorMsg) {

        if (expectedErrorMsg.contains("Lütfen cep telefonu numaranızı")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.errorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        } else if (expectedErrorMsg.contains("Lütfen e-posta")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.errorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        } else if (expectedErrorMsg.contains("Girdiğiniz cep telefonu")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.errorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        } else if (expectedErrorMsg.contains("Bu e-posta adresi")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.errorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        }else if (expectedErrorMsg.contains("Geçerli bir telefon numarası")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.errorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        }else if (expectedErrorMsg.contains("Girdiğiniz kod hatalıdır")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.otpErrorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        }else if (expectedErrorMsg.contains("Kodu eksik girdiniz")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.otpErrorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));
        }
        else if (expectedErrorMsg.contains("Hesabınız bloke olmuştur.")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            String actualErrorMsg = loginPage.otpErrorMsgText.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));
        }


        }

    @And("Cep Telefonu Numaraniz bolumune bir numara girer")
    public void cepTelefonuNumaranizBolumuneBirNumaraGirer() {
        ReusableMethods.waitFor(1);
        registerPage.registerPhoneNumberBox.click();
        registerPage.registerPhoneNumberBox.sendKeys(ReusableMethods.generatePhoneNumber1());
    }

    @And("Email bolumune bir email girilir")
    public void emailBolumuneBirEmailGirilir() {
        ReusableMethods.waitFor(1);
        registerPage.registerEmail.click();
        registerPage.registerEmail.sendKeys(ReusableMethods.getSaltString()+"@load-csa.com");
    }

    @And("Register Cep Telefonu Numaraniz bolumune bir numara girer{string}")
    public void registerCepTelefonuNumaranizBolumuneBirNumaraGirer(String phoneNumber) {
        if (phoneNumber.equals("empty")) {
            phoneNumber = "";
        }
        registerPage.registerPhoneNumberBox.sendKeys(phoneNumber);
    }


}




