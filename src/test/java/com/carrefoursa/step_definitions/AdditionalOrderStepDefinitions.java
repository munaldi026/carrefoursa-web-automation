package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.pages.ProductPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class AdditionalOrderStepDefinitions {

    OrderPage orderPage=new OrderPage();
    ProductPage productPage=new ProductPage();

    @And("Sepette urun adedini maximum sayida artirir")
    public void sepetteUrunAdediniMaximumSayidaArtirir() {

        productPage.plusButtonInCart.click();
    }

    @Given("Siparis Onayi sayfasindaki Siparisime ek yapmak istiyorum butonuna tiklar")
    public void siparis_onayi_sayfasindaki_siparisime_ek_yapmak_istiyorum_butonuna_tiklar() {
        orderPage.additionalOrderButton.click();
    }

    @And("Ek siparis icin verify yapar")
    public void ekSiparisIcinVerifyYapar() {
        String additionalOrderMsgText = orderPage.verifyAdditionalOrderMsg.getText();
        System.out.println("VERIFIED ORDER NUMBER = " + additionalOrderMsgText.toUpperCase(Locale.ROOT));
        Assert.assertTrue(orderPage.verifyAdditionalOrderMsg.isDisplayed());
    }

    @When("PDP sayfasinda Sepete Ekle butonuna tiklar")
    public void pdp_sayfasinda_sepete_ekle_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        orderPage.addToSubmitButtonPDP.click();
    }
    @Then("Siparis olusturulma suresini beklemeden ek siparis yapilamayacagini kontrol eder")
    public void siparisOlusturulmaSuresiniBeklemedenEkSiparisYapilamayacaginiKontrolEder() {
        ReusableMethods.waitFor(1);
        String waitToAddingMsgText = orderPage.waitToAddingMsg.getText();
        System.out.println("waitToAddingMsgText = " + waitToAddingMsgText);
        Assert.assertTrue(orderPage.waitToAddingMsg.isDisplayed());

    }

    @Then("Daha once maksimum miktar siparis yaptigi icin ek siparis yapilamayacagini kontrol eder")
    public void dahaOnceMaksimumMiktarSiparisYaptigiIcinEkSiparisYapilamayacaginiKontrolEder() {
        ReusableMethods.waitFor(1);
        String warningTextMsgText = orderPage.warningTextMsg.getText();
        System.out.println("warningTextMsgText = " + warningTextMsgText);
        Assert.assertTrue(orderPage.warningTextMsg.isDisplayed());

    }

    @Given("Siparis sayfasindaki Siparisime ek yapmak istiyorum butonuna tiklar")
    public void siparisSayfasindakiSiparisimeEkYapmakIstiyorumButonunaTiklar() {
        ReusableMethods.waitFor(50);
        orderPage.additionalOrderButton.click();

    }


}
