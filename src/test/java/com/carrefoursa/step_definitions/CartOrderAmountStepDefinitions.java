package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CartOrderAmountStepDefinitions {

    ProductPage productPage=new ProductPage();
    OrderPage orderPage=new OrderPage();
    BasketPage basketPage=new BasketPage();

    @Given("Kullanici tutari Altmis TL' den az olan bir urun aratir")
    public void kullaniciTutariAltmisTLDenAzOlanBirUrunAratir() {

        productPage.searchAlternativeProduct();

    }
    @Then("Sepet tutarinin Minimum Siparis Tutarina ulasmadigini kontrol eder")
    public void sepet_tutarinin_minimum_siparis_tutarina_ulasmadigini_kontrol_eder() {

        productPage.verifyMinimumAmount();
        basketPage.removeProductButtonInBasket.click();
    }
    @Given("Kullanici tutari Altmis TL ya da uzeri olan bir urun arartir")
    public void kullaniciTutariAltmisTLYaDaUzeriOlanBirUrunArartir() {

         productPage.searchCartOrderAmountProduct();
    }

    @Then("Sepet tutarinin Minimum Siparis Tutarina ulasmis oldugunu kontrol eder")
    public void sepet_tutarinin_minimum_siparis_tutarina_ulasmis_oldugunu_kontrol_eder() {

        productPage.verifyMinimumAmountPlus();
        basketPage.removeProductButtonInBasket.click();
    }



}
