package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.DeliveryPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeliveryOptionsStepDefinitions {

    DeliveryPage deliveryPage=new DeliveryPage();

    @Given("Ana sayfadaki Teslimat secenekleri linkine tiklar")
    public void ana_sayfadaki_teslimat_secenekleri_linkine_tiklar() {
         deliveryPage.deliveryOptionsLink.click();
    }
    @Given("Cikan pop-up uzerinde Magazadan Alin tercihini yapar")
    public void cikan_pop_up_uzerinde_magazadan_alin_tercihini_yapar() {

    }
    @Then("Teslim alinacak magazayi secer")
    public void teslim_alinacak_magazayi_secer() {
        deliveryPage.storeList();

    }
    @When("Bu sayfada Devam et butonu tiklanir")
    public void buSayfadaDevamEtButonuTiklanir() {
        deliveryPage.pickupFromStoreSubmitButton.click();

    }
    @Then("Bu tercih sonucunda urunlerde degisiklik olacagi ile ilgili uyari aldigini kontrol eder.")
    public void bu_tercih_sonucunda_urunlerde_degisiklik_olacagi_ile_ilgili_uyari_aldigini_kontrol_eder() {

        deliveryPage.getPickupChoiseMsg();
    }
    @And("Adres secimi sayfasinda  Magazadan Al tercihini yapar")
    public void adresSecimiSayfasindaMagazadanAlTercihiniYapar() {
        deliveryPage.pickupFromStoreOnAddressPage.click();
    }

    @When("Aadres sayfasindaki Teslim alinacak magazayi secer")
    public void aadresSayfasindakiTeslimAlinacakMagazayiSecer() {
        deliveryPage.selectedStoreOnAddressPage.click();
    }

    @Given("Sepetim Sayfasindaki Siparisi Tamamla butonuna tiklar")
    public void sepetimSayfasindakiSiparisiTamamlaButonunaTiklar() {
        ReusableMethods.clickContinueButton();
    }
}
