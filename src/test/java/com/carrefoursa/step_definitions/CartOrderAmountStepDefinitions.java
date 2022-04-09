package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.pages.ProductPage;
import com.carrefoursa.utilities.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartOrderAmountStepDefinitions {

    ProductPage productPage=new ProductPage();
    OrderPage orderPage=new OrderPage();

    @Given("Kullanici tutari {int} TL' den az olan bir urun aratir")
    public void kullanici_tutari_tl_den_az_olan_bir_urun_aratir(Integer int1) {
        productPage.searchAlternativeProduct();

    }
    @Then("Sepet tutarinin Minimum Siparis Tutarina ulasmadigini kontrol eder")
    public void sepet_tutarinin_minimum_siparis_tutarina_ulasmadigini_kontrol_eder() {

        productPage.verifyMinimumAmount();
    }
    @Given("Kullanici tutari {int} TL ya da uzeri olan bir urun arartir")
    public void kullanici_tutari_tl_ya_da_uzeri_olan_bir_urun_arartir(Integer int1) {
        productPage.searchProduct();
    }

    @Then("Sepet tutarinin Minimum Siparis Tutarina ulasmis oldugunu kontrol eder")
    public void sepet_tutarinin_minimum_siparis_tutarina_ulasmis_oldugunu_kontrol_eder() {

        productPage.verifyMinimumAmountPlus();
    }


}
