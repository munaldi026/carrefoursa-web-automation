package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.FormPage;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FormStepDefinitions {
    HomePage homePage=new HomePage();
    FormPage formPage=new FormPage();

    @Then("^Ad soyad alanıın doldurulması zorunludur yazısı görülür$")
    public void ad_soyad_alann_doldurulmas_zorunludur_yazs_grlr(){
        formPage.nameErrorMessage.isDisplayed();

    }

    @Then("^Bildirim Alanı doldurulması zorunludur yazısı görülür$")
    public void bildirim_alan_doldurulmas_zorunludur_yazs_grlr() {
        formPage.nameErrorMessage.isDisplayed();
    }

    @Then("^Açıklama alanıın doldurulması zorunludur yazısı görülür$")
    public void aklama_alann_doldurulmas_zorunludur_yazs_grlr() {
        formPage.nameErrorMessage.isDisplayed();

    }

    @Then("^Kimlik Doğruama Hatası Görülür$")
    public void kimlik_doruama_hatas_grlr(){
        formPage.nameCaptchaError.isDisplayed();
    }

    @Then("^Outllok sayfasına gittiği görülür$")
    public void outllok_sayfasna_gittii_grlr() {

    }

    @Then("^Aydıtlatma metnine gidildiği görülür$")
    public void aydtlatma_metnine_gidildii_grlr() {
        formPage.youListingLightingTextPage.isDisplayed();
    }

    @Then("^Dosya yüklenebildiği görülür$")
    public void dosya_yklenebildii_grlr(){

    }

    @Then("^Diğer Alanlar Uygun Şekilde Doldurulur$")
    public void dier_alanlar_uygun_ekilde_doldurulur() {





    }

    @Then("^Lütfen İsim Girin Yazısı Görülür$")
    public void ltfen_sim_girin_yazs_grlr() {

    }

    @Then("^Lütfen soyisim girin Yazısı Görülür$")
    public void ltfen_soyisim_girin_yazs_grlr(){

    }

    @Then("^Lütfen Cep Telefonu Giriniz Yazısı Görülür$")
    public void ltfen_cep_telefonu_giriniz_yazs_grlr(){

    }

    @Then("^Lütfen Eposta Giriniz Yazısı Görülür$")
    public void ltfen_eposta_giriniz_yazs_grlr(){

    }

    @Then("^Lütfen semt-mahalle bilgisi girin Yazısı Görülür$")
    public void ltfen_semtmahalle_bilgisi_girin_yazs_grlr() {

    }

    @Then("^Lütfen cadde-bulvar bilgisi girin Yazısı Görülür$")
    public void ltfen_caddebulvar_bilgisi_girin_yazs_grlr()
    {


    }

    @Then("^Lütfen sokak bilgisi girin Yazısı Görülür$")
    public void ltfen_sokak_bilgisi_girin_yazs_grlr(){

    }

    @Then("^Kimlik Doğrulama Başarısız Yazısı Görülür$")
    public void kimlik_dorulama_baarsz_yazs_grlr(){

    }

    @And("^Kullanici Sizi Dinliyoruma Tiklar$")
    public void kullanici_sizi_dinliyoruma_tiklar(){
        homePage.youlisteningbutton.click();
    }

    @And("^Gönder Buttonuna Kadar Swipe Yapılır$")
    public void gnder_buttonuna_kadar_swipe_yaplr() {

    }

    @And("^Müsteri Adı Soyadı Alanı Boş Bırakılır$")
    public void msteri_ad_soyad_alan_bo_braklr() {
        formPage.youListingFullName.clear();
    }

    @And("^Diğer Alanlar uygun Bir Şekilde Doldurulur$")
    public void dier_alanlar_uygun_bir_ekilde_doldurulur()
    {
        formPage.youListingFullName.sendKeys(ConfigReader.getProperty("address_type_edit"));
        ReusableMethods.waitFor(3);
        formPage.youListingEmail.sendKeys(ConfigReader.getProperty("unregistered_email"));
        ReusableMethods.waitFor(3);
        formPage.youListingMobilPhone.sendKeys(ConfigReader.getProperty("phone_number"));
        ReusableMethods.waitFor(3);
        formPage.youListingNotification.click();
        ReusableMethods.waitFor(3);
        formPage.youListingNotificationType.click();
        ReusableMethods.waitFor(3);
        formPage.youListingDescription.sendKeys(ConfigReader.getProperty("address_type_edit"));
        ReusableMethods.waitFor(3);
    }


    @And("^Butun Alanlar uygun Bir Şekilde Doldurulur$")
    public void bildirimAlaniDisindaDigerAlanlarDoldurulur(){
        formPage.youListingFullName.sendKeys(ConfigReader.getProperty("address_type_edit"));
        ReusableMethods.waitFor(3);
        formPage.youListingEmail.sendKeys(ConfigReader.getProperty("unregistered_email"));
        ReusableMethods.waitFor(3);
        formPage.youListingMobilPhone.sendKeys(ConfigReader.getProperty("phone_number"));
        ReusableMethods.waitFor(3);
        formPage.youListingDescription.sendKeys(ConfigReader.getProperty("address_type_edit"));
        ReusableMethods.waitFor(3);
    }
    @And("^Captcha alanı tıklanır$")
    public void captcha_alan_tklanr(){
        formPage.youListingCaptcha.click();
        ReusableMethods.waitFor(7);
    }

    @And("^Gönder Buttonuna Tıklanır$")
    public void gnder_buttonuna_tklanr(){
        formPage.youListingSendButton.click();
    }

    @And("^Aciklama Alani Bos Birakilir$")
    public void aciklamaAlaniBosBirakilir(){
        formPage.youListingDescription.clear();

    }

    @And("^Kiralik Sayfasinda Gönder Buttonuna Tıklanır$")
    public void kiralik_sayfasinda_gnder_buttonuna_tklanr()  {
        ReusableMethods.scrollToElement(formPage.rentalPlaceCityCode);
      formPage.rentalPlaceSendButton.click();
    }

    @And("^Kurumsal e-posta tıklanır$")
    public void kurumsal_eposta_tklanr(){
        formPage.youListingCorporateEmail.click();

    }

    @And("^KVKK Aydıntlatma metnine burdan ulaşabilirsiniz tıklanır$")
    public void kvkk_aydntlatma_metnine_burdan_ulaabilirsiniz_tklanr()  {
        formPage.youListingLightingText.click();
    }

    @And("^Kullanıcı kiralik Yerler Sayfasına gider$")
    public void kullanc_kiralik_yerler_sayfasna_gider() {
        formPage.rentalPlace.click();

    }

    @And("^Dosya seç buttonu tıklanır$")
    public void dosya_se_buttonu_tklanr(){
        ReusableMethods.scrollToElement(formPage.rentalPlacePhoto);
        formPage.rentalPlacePhoto.click();

    }

    @And("^Kullanıci Kiralık Yeriniz Var mı tıklar$")
    public void kullanci_kiralk_yeriniz_var_m_y_tklar(){
        formPage.rentalPlace.click();

    }

    @And("^Adiniz Alanini Giriniz$")
    public void adiniz_alanini_giriniz(){
        formPage.rentalPlaceFirstName.sendKeys("Ntt");
        ReusableMethods.waitFor(2);
    }

    @And("^SoyAdi Alanini Girirniz$")
    public void soyadi_alanini_girirniz(){
        formPage.rentalPlaceLastName.sendKeys("Data");
        ReusableMethods.waitFor(2);

    }

    @And("^CepTelefonunu Giriniz$")
    public void ceptelefonunu_giriniz(){
        formPage.rentalPlacePhone.sendKeys(ConfigReader.getProperty("phone_number"));
        ReusableMethods.waitFor(2);
    }

    @And("^Email Giriniz$")
    public void email_giriniz(){
        formPage.rentalPlaceEmail.sendKeys(ConfigReader.getProperty("unregistered_email"));


    }

    @And("^il Seçiniz$")
    public void il_seiniz(){
        formPage.rentalPlaceCityCode.click();
        formPage.rentalPlaceCityCodeIstanbul.click();

    }

    @And("^ilce Seciniz$")
    public void ilce_seciniz(){
        formPage.rentalPlaceTownCode.click();
        formPage.rentalPlaceTownCodeAtasehir.click();
    }

    @And("^Semt Giriniz$")
    public void semt_giriniz(){
        ReusableMethods.scrollToElement(formPage.rentalPlaceDistrict);
        formPage.rentalPlaceDistrict.sendKeys("Ataşehir");
    }

    @And("^Cadde Giriniz$")
    public void cadde_giriniz(){
        formPage.rentalPlaceStreetName.sendKeys("NidaKule");
    }

    @And("^Sokak Giriniz$")
    public void sokak_giriniz(){
        formPage.rentalPlaceStreetNumber.sendKeys("0000");
    }



}
