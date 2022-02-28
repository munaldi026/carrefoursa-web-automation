package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;


public class SacrificialStepDefinitions {
    ProductPage productPage=new ProductPage();
    PLPPage plpPage=new PLPPage();
    BasketPage basketPage=new BasketPage();
    HomePage homePage=new HomePage();
    SacrificialPage sacrificialPage=new SacrificialPage();


    @Given("Kurbanlik icin arama yapmak uzere urunun adini yazar")
    public void kurbanlik_icin_arama_yapmak_uzere_urunun_adini_yazar() {

        productPage.searchSacrificialName();

    }
    @And("Kullanici arattigi kurbanlik urunune tiklar")
    public void kullaniciArattigiKurbanlikUrununeTiklar() {
        plpPage.addToSartificialButton();

    }
    @Given("Kurbanligin sepete eklendigini kontrol eder.")
    public void kurbanligin_sepete_eklendigini_kontrol_eder() {
        ReusableMethods.hover(homePage.myBasket);
        sacrificialPage.getItemInMiniCart();
    }
    @Given("Vekalet & Bagis sayfasina geldigini kontrol eder")
    public void vekalet_bagis_sayfasina_geldigini_kontrol_eder() {

    sacrificialPage.verifygrantorAndDonationPage();
    }
    @Given("Bu sayfada Vekalet vermek istedigi kisiyi secer")
    public void bu_sayfada_vekalet_vermek_istedigi_kisiyi_secer() {
        sacrificialPage.grantorNameField.clear();
        ReusableMethods.waitFor(1);
        sacrificialPage.grantorNameField.sendKeys(Constants.grantorName);
    }
//    @And("Bagis yapmak istiyorum checkbox'ini isaretler")
//    public void bagisYapmakIstiyorumCheckboxIniIsaretler() {
//        if (sacrificialPage.donatedCheckBox.isSelected()){
//            sacrificialPage.donatedCheckBox.click();
//        }
//        Driver.getDriver().navigate().refresh();
//        }

    @And("Bagis yapmak istedigi Kurumu secer")
    public void bagisYapmakIstedigiKurumuSecer() {

        Select select=new Select(sacrificialPage.selectDropdownMenu);
        select.selectByVisibleText(Constants.donationOrganization);
        ReusableMethods.waitFor(1);
    }
    @Given("Vekalet & Bagis sayfasindaki Devam et butonuna tiklar")
    public void vekalet_bagis_sayfasindaki_devam_et_butonuna_tiklar() {
            ReusableMethods.clickContinueButton();
    }
    @And("Bagis icin sectigi kurumun dogrulugunu kontrol eder")
    public void bagisIcinSectigiKurumunDogrulugunuKontrolEder() {
        String organizationNameText = sacrificialPage.verifyDonatedOrganizationName.getText();
        organizationNameText="Siparişiniz CarrefourSA tarafından Türkiye Omurilik Felçlileri Derneği adlı kuruma teslim edilecektir.  Devam Et butonu ile bir sonraki adıma geçebilirsiniz.";
        String organizationName=organizationNameText.replace("Devam Et butonu ile bir sonraki adıma geçebilirsiniz.","").trim().toUpperCase(Locale.ROOT);
        System.out.println("organizationName = " + organizationName);
        Assert.assertTrue(sacrificialPage.verifyDonatedOrganizationName.isDisplayed());
    }

    @And("Teslimat sayfasindaki siparis notu bolumune not yazilir")
    public void teslimatSayfasindakiSiparisNotuBolumuneNotYazilir() {

        sacrificialPage.orderNoteField.clear();
        ReusableMethods.waitFor(1);
        sacrificialPage.orderNoteField.sendKeys(Constants.orderNoteText);
    }
    @Given("Teslimat sayfasindaki Devam et butonuna tiklar")
    public void teslimat_sayfasindaki_devam_et_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        ReusableMethods.clickContinueButton();
    }
    @Given("Odeme sayfasinda kapida nakit odeme tercihini secer")
    public void odeme_sayfasinda_kapida_nakit_odeme_tercihini_secer() {
        sacrificialPage.cashAtDeliveryLink.click();
        ReusableMethods.waitFor(1);

    }
    @Given("Bu sayfada tahsilat saatini secer")
    public void bu_sayfada_tahsilat_saatini_secer() {
        ReusableMethods.hover(sacrificialPage.paymentSlotRadio);
        sacrificialPage.paymentSlotRadio.click();

    }
    @When("Odeme sekli sayfasinda Siparisi Tamamla butonuna tiklar")
    public void odeme_sekli_sayfasinda_siparisi_tamamla_butonuna_tiklar() {
        ReusableMethods.clickContinueButton();    }


    @And("Bu sayfada Devam et butonuna tiklar")
    public void buSayfadaDevamEtButonunaTiklar() {
        ReusableMethods.clickContinueButton();
    }

    @And("Bu sayfada Vekalet vermek icin bir kisi secer")
    public void buSayfadaVekaletVermekIcinBirKisiSecer() {
        sacrificialPage.grantorNameField.clear();
        ReusableMethods.waitFor(1);
        sacrificialPage.grantorNameField.sendKeys(Constants.grantorName);
        ReusableMethods.waitFor(1);
    }

    @And("Bagis yapmak istiyorum checkbox'ini kontrol eder")
    public void bagisYapmakIstiyorumCheckboxIniKontrolEder() {

        if (sacrificialPage.donatedCheckBox.isSelected()){
            sacrificialPage.donatedCheckBox.click();
        } sacrificialPage.getDonatedCheckBoxLine.click();
        }


    @Then("Sepetteki urunu siler")
    public void sepettekiUrunuSiler() {
        basketPage.removeMiniCart();
    }

    @When("Bu sayfada Vekalet vermek istedigi kisi ismini bos birakir ve Devam et butonuna tiklar")
    public void buSayfadaVekaletVermekIstedigiKisiIsminiBosBirakirVeDevamEtButonunaTiklar() {
        sacrificialPage.grantorNameField.clear();
        ReusableMethods.waitFor(1);
        sacrificialPage.grantorNameField.sendKeys(Constants.grantorNameEmpty);
        ReusableMethods.waitFor(1);
        sacrificialPage.getDonatedCheckBoxLine.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.clickContinueButton();
    }

    @Then("Eksik Bilgilerle devam edemeyecegini kontrol eder")
    public void eksikBilgilerleDevamEdemeyeceginiKontrolEder() {
        sacrificialPage.getVerifyMissingInformation();

    }

    @Then("Sepette kurbanlik urun varken baska bir urun eklenemeyecegini kontrol eder")
    public void sepetteKurbanlikUrunVarkenBaskaBirUrunEklenemeyeceginiKontrolEder() {
        sacrificialPage.getVerifySoldAloneSacrificial();
    }

    @When("Cikan pop-up uzerindeki vazgec butonuna tiklar")
    public void cikanPopUpUzerindekiVazgecButonunaTiklar() {
        sacrificialPage.giveUPButtonForSacrificial.click();
    }
}


