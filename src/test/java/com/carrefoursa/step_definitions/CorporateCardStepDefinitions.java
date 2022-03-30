package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.CorporateCardPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CorporateCardStepDefinitions {

    CorporateCardPage corporateCardPage=new CorporateCardPage();

    @Given("Kullanici sayfanin sag alt tarafinda bulunan Kurumsal Kart secenegine tiklar")
    public void kullanici_sayfanin_sag_alt_tarafinda_bulunan_kurumsal_kart_secenegine_tiklar() {

        ReusableMethods.scrollToElement(corporateCardPage.corporateCartLink);
        corporateCardPage.corporateCartLink.click();
    }

    @Given("Acilan Kurumsal Kart kutucuguna gecerli bir kart numarasi girer")
    public void acilan_kurumsal_kart_kutucuguna_gecerli_bir_kart_numarasi_girer() {
        corporateCardPage.corporateCardNumberField.sendKeys(Constants.corporateCardNumber);
    }

    @And("Puan Tutari kutucuguna sifir kurus degerini girer")
    public void puanTutariKutucugunaSifirKurusDegeriniGirer() {

        corporateCardPage.corporateCardPointField.sendKeys(Constants.corporateCardPoint);

    }
    @Then("Sistemin sifir degerini kabul etmedigini kontrol eder" )
    public void sisteminSifirDegeriniKabulEtmediginiKontrolEder() {
        String verificationMsgText = corporateCardPage.zeroVerificationMsg.getText();
        System.out.println("verificationMsgText = " + verificationMsgText);
        Assert.assertTrue(corporateCardPage.zeroVerificationMsg.isDisplayed());
    }

    @Given("Puan Tutari kutucuguna sepetteki toplam tutardan fazla bir deger girer")
    public void puan_tutari_kutucuguna_sepetteki_toplam_tutardan_fazla_bir_deger_girer() {

        String priceInBasketText = corporateCardPage.priceInBasket.getText();
        System.out.println("priceInBasketText = " + priceInBasketText);

        String priceInBasket=priceInBasketText.replace(" TL","").replace(",","");
        System.out.println("priceInBasket = " + priceInBasket);

        int price=Integer.parseInt(priceInBasket);
        System.out.println("price = " + price);

        corporateCardPage.corporateCardPointField.sendKeys(Constants.corporateCardPoint2);
        String sendingPricetext=Constants.corporateCardPoint2;
        int sendingPrice=Integer.parseInt(Constants.corporateCardPoint2);
        System.out.println("sendingPrice = " + sendingPrice);
        ReusableMethods.waitFor(3);
        }
    @When("Kullan butonuna tiklar" )
    public void kullanButonunaTiklar() {
       ReusableMethods.scrollToElement(corporateCardPage.corporateCardUseButton);
       corporateCardPage.corporateCardUseButton.click();
       ReusableMethods.waitFor(3);
    }
    @Then("Sistemin sepet toplam tutarini maximum deger olarak kabul ettigini kontrol eder")
    public void sistemin_sepet_toplam_tutarini_maximum_deger_olarak_kabul_ettigini_kontrol_eder() {
        String orderCountMsgText = corporateCardPage.totalOrderCountMsg.getText();
        System.out.println("orderCountMsgText = " + orderCountMsgText);
        Assert.assertTrue(corporateCardPage.totalOrderCountMsg.isDisplayed());

    }

    @And("Puan Tutari kutucuguna belirli bir miktar girer" )
    public void puanTutariKutucugunaBelirliBirMiktarGirer() {
        corporateCardPage.corporateCardPointField.sendKeys(Constants.corporateCardPoint3);
    }

    @Then("Girdigi miktarun basarili bir sekilde kullanildigini kontrol eder" )
    public void girdigiMiktarunBasariliBirSekildeKullanildiginiKontrolEder() {
        String usingAmountInCardText = corporateCardPage.usingAmountInCard.getText();
        System.out.println("usingAmountInCardText = " + usingAmountInCardText);
        Assert.assertTrue(corporateCardPage.usingAmountInCard.isDisplayed());

    }
}
