package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.DeliveryPage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class DeliveryOptionsStepDefinitions {

    DeliveryPage deliveryPage=new DeliveryPage();
    OrderPage orderPage=new OrderPage();

    @Given("Ana sayfadaki Teslimat Seceneginiz linkine tiklar")
    public void ana_sayfadaki_teslimat_seceneginiz_linkine_tiklar() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForPageToLoad(5);
        deliveryPage.deliveryOptionsLink.click();


    }
    @Given("Cikan pop-up uzerinde Magazadan Alin tercihini yapar")
    public void cikan_pop_up_uzerinde_magazadan_alin_tercihini_yapar() {
        deliveryPage.pickupFromStore.click();
    }
    @Then("Teslim alinacak magazayi secer")
    public void teslim_alinacak_magazayi_secer() {
        ReusableMethods.waitFor(1);
        String selectionText = deliveryPage.verifySelection.getText();
        System.out.println("DELIVERY SELECTION  = " + selectionText.toUpperCase(Locale.ROOT));
        deliveryPage.storeList();
    }
    @When("Bu sayfada Devam et butonu tiklanir")
    public void buSayfadaDevamEtButonuTiklanir() {
        deliveryPage.continueButton.click();
    }
    @Then("Bu tercih sonucunda urunlerde degisiklik olacagi ile ilgili uyari aldigini kontrol eder.")
    public void bu_tercih_sonucunda_urunlerde_degisiklik_olacagi_ile_ilgili_uyari_aldigini_kontrol_eder() {

        ReusableMethods.waitFor(3);
        String changeOrderAlertText = deliveryPage.changeOrderAlert.getText();
        System.out.println("changeOrderAlertText = " + changeOrderAlertText);

    }
    @And("Adres secimi sayfasinda  Magazadan Al tercihini yapar")
    public void adresSecimiSayfasindaMagazadanAlTercihiniYapar() {

        deliveryPage.pickupFromStoreOnAddressPage.click();
    }

    @When("Adres sayfasindaki Teslim alinacak magazayi secer")
    public void adresSayfasindakiTeslimAlinacakMagazayiSecer() {
        deliveryPage.selectedStoreOnAddressPage.click();


    }

    @Given("Sepetim Sayfasindaki Siparisi Tamamla butonuna tiklar")
    public void sepetimSayfasindakiSiparisiTamamlaButonunaTiklar() {
        orderPage.continueButton.click();
    }

    @And("Cikan pop-up uzerinde Size Getirelim tercihini yapar")
    public void cikanPopUpUzerindeSizeGetirelimTercihiniYapar() {
        deliveryPage.pickupFromCargo.click();
    }

    @When("Secimin gerceklestigi kontrol edilir")
    public void seciminGerceklestigiKontrolEdilir() {
        Driver.getDriver().navigate().refresh();
        String selectionText = deliveryPage.verifySelection.getText();
        System.out.println("DELIVERY SELECTION  = " + selectionText.toUpperCase(Locale.ROOT));
        Assert.assertTrue(deliveryPage.verifySelection.isDisplayed());
    }

    @When("Gelen pop-up kapatilir")
    public void gelenPopUpKapatilir() {
        orderPage.alertPop_UpButton.click();
        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();

    }

    @And("Magaza secimi devam butonuna tiklanir")
    public void magazaSecimiDevamButonunaTiklanir() {
        deliveryPage.pickupFromStoreSubmitButton.click();
    }

    @Then("Pop-up uzerindeki devam edin butonuna tiklanir")
    public void popUpUzerindekiDevamEdinButonunaTiklanir() {
        deliveryPage.deliveryOptionsContinueButton.click();
    }
}
