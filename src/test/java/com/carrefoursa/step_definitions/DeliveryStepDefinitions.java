package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.DeliveryPage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class DeliveryStepDefinitions {

    DeliveryPage deliveryPage=new DeliveryPage();
    OrderPage orderPage=new OrderPage();

    @When("Secilen magaza icin haritada gor linkine tiklar")
    public void secilen_magaza_icin_haritada_gor_linkine_tiklar() {

        deliveryPage.onMapLink.click();

    }
    @Then("Yeni bir sekmede haritanin acildigini kontrol eder")
    public void yeni_bir_sekmede_haritanin_acildigini_kontrol_eder() {
        deliveryPage.verifyIsStoreOnMap();

    }
    @Given("Teslim alinabilecek magazalarin listelendigini kontrol eder")
    public void teslim_alinabilecek_magazalarin_listelendigini_kontrol_eder() {
        deliveryPage.storeList();

    }
    @Given("Magazalardan birini secer")
    public void magazalardan_birini_secer() {
        deliveryPage.selectedStore();

    }
    @When("Ilk secim aktif iken ikinci bir secim yapar")
    public void ilk_secim_aktif_iken_ikinci_bir_secim_yapar() {
        deliveryPage.storeList1();

    }
    @Then("Ikili secim yapamayacagini kontrol eder.")
    public void ikili_secim_yapamayacagini_kontrol_eder() {
        deliveryPage.selectedStore1();

    }

    @And("Cikan pop-up uzerinde Size Getirelim ve Magazadan Alin seceneklerinin goruldugunu kontrol eder")
    public void cikanPopUpUzerindeSizeGetirelimVeMagazadanAlinSeceneklerininGoruldugunuKontrolEder() {
        deliveryPage.veryfyDeliveryOptionsList();


    }
    @Given("Ana sayfadaki Teslimat saatleri linkine tiklar")
    public void ana_sayfadaki_teslimat_saatleri_linkine_tiklar() {
        ReusableMethods.waitForVisibility(deliveryPage.deliveryTimeLink,5);
        deliveryPage.deliveryTimeLink.click();

    }
    @Then("Cikan pop-up uzerinde Bolgenizin Teslimat saatleri seceneklerinin goruldugunu kontrol eder")
    public void cikan_pop_up_uzerinde_bolgenizin_teslimat_saatleri_seceneklerinin_goruldugunu_kontrol_eder() {
        String deliveryTimeOptions= deliveryPage.slotTableText.getText();
        System.out.println("DELIVERY SLOT OPTIONS = " + deliveryTimeOptions);
        Assert.assertTrue(deliveryPage.slotTableText.isDisplayed());

    }
    @Given("Ana sayfadaki Teslimat Bolgeniz linkine tiklar")
    public void anaSayfadakiTeslimatBolgenizLinkineTiklar() {
        deliveryPage.areaOfDeliveryLink.click();

    }
    @Given("Bolgenizi ogrenebilir miyiz pop-up'inin geldigi kontrol edilir")
    public void bolgenizi_ogrenebilir_miyiz_pop_up_inin_geldigi_kontrol_edilir() {

        deliveryPage.verifyAreaOfDelivery();

    }
    @Given("Pop-up uzerindeki bilgiler doldurulur")
    public void pop_up_uzerindeki_bilgiler_doldurulur() {

    deliveryPage.fillDeliveyAreaInformation();

    }
    @When("Devam et butonuna tiklanir")
    public void devam_et_butonuna_tiklanir() {
        deliveryPage.selectStoreSubmitButton.click();


    }
    @When("Gelen pop-up uzerindeki devam et butonuna tiklanir")
    public void gelenPopUpUzerindekiDevamEtButonunaTiklanir() {
        deliveryPage.pickupChoiseSubmitButton.click();

    }
    @Then("Yapilan secimin dogrulugu kontrol edilir")
    public void yapilan_secimin_dogrulugu_kontrol_edilir() {
        deliveryPage.verifyAreaOfDeliveryOnHomePage();

    }
    @Given("Kullanici yeni Teslimat bolgesi secer")
    public void kullaniciYeniTeslimatBolgesiSecer() {
        deliveryPage.fillDeliveyExAreaInformation();
    }
    @Given("Kullanici stokta olmayan bir urunu aratir")
    public void kullanici_stokta_olmayan_bir_urunu_aratir() {
        deliveryPage.noProductInStock();

    }
    @Then("Cikan pop-up uzerinde Yeterli stok olmadigi uyarisinin goruldugunu kontrol eder")
    public void cikan_pop_up_uzerinde_yeterli_stok_olmadigi_uyarisinin_goruldugunu_kontrol_eder() {

        System.out.println("deliveryPage.failedToAddText.getText() = " + deliveryPage.failedToAddText.getText());
    }

    @When("Siparislerim sayfasindaki Siparis Detayi butonuna tiklar")
    public void siparislerimSayfasindakiSiparisDetayiButonunaTiklar() {
        deliveryPage.orderDetailsButton.click();
    }

    @Then("Siparis Detayi sayfasinda secilen magazaya ait bilgilerin bulundugunu kontrol eder")
    public void siparisDetayiSayfasindaSecilenMagazayaAitBilgilerinBulundugunuKontrolEder() {
        String infoStoreOnOrderDetailsPage = deliveryPage.infoStoreOnOrderDetailsPage.getText();
        System.out.println("infoStoreOnOrderDetailsPage = " + infoStoreOnOrderDetailsPage);
        Assert.assertTrue(deliveryPage.infoStoreOnOrderDetailsPage.isDisplayed());
    }

    @Given("Kullanici magazadan al tercihli bir siparise gider")
    public void kullaniciMagazadanAlTercihliBirSipariseGider() {
        orderPage.goToOldOrder();
    }


}
