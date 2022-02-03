package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Then;


public class CheckProductInBasketStepDefinitions {
    BasketPage basketPage=new BasketPage();

    @Then("Sepette urun adedi artirilir")
    public void sepetteUrunAdediArtirilir() {
        //basketPage.miniCartRemoveProduct();
        basketPage.miniCartPlusIcon.click();

    }
    @Then("Artma durumu kontrol edilir")
    public void artmaDurumuKontrolEdilir() {
        basketPage.verifyIncreaseQuantyInMiniCart();
    }

    @Then("Sepette urun adedi azaltilir")
    public void sepetteUrunAdediAzaltilir() {
        //basketPage.miniCartRemoveProduct();
        //basketPage.miniCartPlusIcon.click();
        ReusableMethods.waitFor(1);
        basketPage.miniCartMinusIcon.click();
    }

    @Then("Azalma durumu kontrol edilir")
    public void azalmaDurumuKontrolEdilir() {
        basketPage.verifydecreaseQuantyInMiniCart();
    }


}
