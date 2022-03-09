package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.PlpPriceFilterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.carrefoursa.utilities.ReusableMethods;
public class PlpPriceFilterStepDefinitions {

    PlpPriceFilterPage plpPriceFilterPage=new PlpPriceFilterPage();


    @And("Kullanıcı filitre kısmındaki en az kısmına fiyat girer")
    public void kullanci_filitre_ksmndaki_en_az_kismina_fiyat_girer()  {
        ReusableMethods.scrollToElement(plpPriceFilterPage.minpPice);
        plpPriceFilterPage.minpPice.click();
        plpPriceFilterPage.minpPice.sendKeys("7");
    }

    @And("Kullanıcı uygulama buttonuna tiklanir")
    public void kullanc_uygulama_buttonuna_tiklanir() {
        plpPriceFilterPage.applyButton.click();
    }

    @And("Fiyatlarin, girilen fiyat degeri minimum olmak uzere gelmis oldugunu kontrol eder")
    public void fiyatlarin_girilen_fiyat_degeri_minimum_olmak_uzere_gelmis_oldugunu_kontrol_eder()  {
        plpPriceFilterPage.filterValue.isDisplayed();
    }

    @And("Kullanıcı filitre kısmındaki en fazla kısmına fiyat girer")
    public void kullanc_filitre_ksmndaki_en_fazlaksmna_fiyat_girer() {
        ReusableMethods.scrollToElement(plpPriceFilterPage.maxPrice);
        plpPriceFilterPage.maxPrice.click();
        plpPriceFilterPage.maxPrice.sendKeys("70");
    }

    @And("Fiyatlarin girilen fiyat degeri maximum olmak uzere gelmis oldugunu kontrol eder")
    public void maxFiyat() {
        plpPriceFilterPage.maxPrice.isDisplayed();
    }

    @And("Filtre Temizle Buttonuna Tiklanir")
    public void filitreTemizle() {
        plpPriceFilterPage.deleteFilter.click();
    }


}
