package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.AddressPage;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class AddressStepDefinitions {
    AddressPage addressPage = new AddressPage();
    HomePage homePage = new HomePage();


    @Given("Kullanici hesabim buttonuna tiklar")
    public void hesabim_buttonu_tiklanir() {
        homePage.myAccount.click();
    }

    @Given("Kullanici adresim buttonuna tiklar")
    public void adresim_buttonu_tiklanir() {
        addressPage.addressButton.click();
        ReusableMethods.waitFor(3);

    }

    @Given("Yeni adres olustur buttonuna tiklar")
    public void yeni_adres_buttonu_tiklanir() {
        addressPage.newAddress.click();
        ReusableMethods.waitFor(3);

    }

    @Given("Adres tipi girilir")
    public void adres_tipi_girilir() {
        addressPage.addresstype.sendKeys(ConfigReader.getProperty("address_type"));

    }

    @Given("Kullanici ismi girilir")
    public void kullanici_isimi_girilir() {
        addressPage.firstname.sendKeys("NttData");

    }

    @Given("Kullanici soyismi girilir")
    public void soy_isimi_girilir() {
        addressPage.lastname.sendKeys("Automation");
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici kimlik numarasi girilir")
    public void tc_no_girilir() {
        addressPage.tc.click();
        addressPage.tc.sendKeys(ConfigReader.getProperty("address_Tc"));

    }

    @Given("Kullanici sehiri girer")
    public void adres_ili_girilir() {
        addressPage.addresscityCode.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici ilceyi girer")
    public void ilceyi_girer() {
        addressPage.addresstownCode.click();
        ReusableMethods.waitFor(3);


    }

    @Given("Kullanici mahalleyi girer")
    public void mahalleyi_girer() {
        addressPage.addressdistrictCode.click();
        ReusableMethods.waitFor(3);

    }

    @Given("Kullanici adresi girilir")
    public void adres_girilir() {
        addressPage.address.sendKeys("Barbaros, Begonya Sk., 34746 Ataşehir/İstanbul");

    }

    @Given("Kullanici epostasi girilir")
    public void email_girilir() {
        addressPage.email.clear();
        addressPage.email.sendKeys(ConfigReader.getProperty("unregistered_email"));
    }

    @Given("Kullanici telefon numarasi girilir")
    public void tel_no_girilir() {
        addressPage.phonenumber.clear();
        addressPage.phonenumber.sendKeys(ConfigReader.getProperty("phone_number"));

    }

    @Given("Bu adresi kaydet buttonuna basılır")
    public void adres_kaydet_buttonu_tiklanir() {
        addressPage.addresssavebutton.click();

    }

    @Given("Adresin basarili sekilde kayıtedildiği gorulur")
    public void adres_kayit_edildigi_gorulur() {
        addressPage.saveaddressname.isDisplayed();

    }

    @Given("Kullanici duzenle buttonuna tiklar")
    public void duzenle_buttonu_tiklanir() {
        addressPage.addresseditbutton.click();

    }

    @Given("Kullanici adres ismini degistirir")
    public void adres_ismi_degistirilir() {
        addressPage.addresstype.clear();
        addressPage.addresstype.sendKeys(ConfigReader.getProperty("address_type_edit"));
    }

    @Given("Adresi guncelle buttonu tiklanir")
    public void adres_guncelle_tiklanir() {
        addressPage.editbutton.click();

    }

    @Given("Adresi ismi basarili bir sekilde degistigi gorulur")
    public void adres_isimi_degistigi_gorulur() {
        addressPage.editaddress.isDisplayed();

    }


    @Given("Kullanici sil buttonuna tiklar")
    public void sil_tiklanir() {
        addressPage.addressdeletbutton.click();
    }

    @Given("Popup uzerinde evet tiklanir")
    public void evet_tiklanir() {
        addressPage.yespopupbutton.click();
    }

    @Given("Adresin silindigi gorulur")
    public void adres_silinir() {

    }

    @Given("Bu Alanı Doldurmanız Zorunlu Yazısı Gorulur")
    public void alaniDoldurmalisiniz() {
        addressPage.addressErrorsMessage.isDisplayed();

    }

    @Given("Lutfen isim giriniz yazısını gorursunuz")
    public void isimAlani() {
        addressPage.firstNameError.isDisplayed();
    }


    @Given("Lutfen soyisim giriniz yazısını gorursunuz")
    public void soyIsimAlani() {
        addressPage.lastNameError.isDisplayed();
    }

    @Given("Lutfen ilce giriniz yazısını gorursunuz")
    public void ilceAlani() {
        addressPage.townError.isDisplayed();
    }

    @Given("Lutfen Mahalle giriniz yazısını gorursunuz")
    public void mahalleAlani() {
        addressPage.districtError.isDisplayed();
    }

    @Given("Adresin silinmedigi gorulur")
    public void adresSilinmez() {

    }

    @Given("Popup uzerinde hayir tiklanir")
    public void hayirTiklanir() {

    }


    @Given("Lutfen Adres giriniz yazısını gorursunuz")
    public void adresAlani() {
        addressPage.addressError.isDisplayed();
    }

    @Given("Lutfen Email giriniz yazısını gorursunuz")
    public void emailAlani() {
        addressPage.emailError.isDisplayed();
    }

    @Given("Lutfen Cep Telefonu giriniz yazısını gorursunuz")
    public void cepTelefonuAlani() {
        addressPage.phoneNumberError.isDisplayed();
    }

    @Given("Kurumsal Adres buttonu tiklanir")
    public void kurumsalButton() {
        addressPage.corporate.click();
    }

    @Given("Sirket ismi girilir")
    public void companyName() {
        addressPage.companyname.sendKeys(ConfigReader.getProperty("address_type"));
    }

    @Given("Vergi kimlik numarası girilir")
    public void taxIdentificationNumber() {
        addressPage.taxidentificationnumber.sendKeys(ConfigReader.getProperty("tax_identification_number"));
    }


    @Given("Vergi kimlik numarası girmeniz gerek yazısı gorulur")
    public void taxNumberErrors() {
        addressPage.taxNumberErrors.isDisplayed();
    }


    @Given("Please enter a company name yazısı gorulur")
    public void companyNameErrors() {
        addressPage.taxNumberErrors.isDisplayed();
    }


}
