package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CheckProductInBasketStepDefinitions {
    BasketPage basketPage=new BasketPage();
    OrderPage orderPage=new OrderPage();

    @Then("Sepette urun adedi artirilir")
    public void sepetteUrunAdediArtirilir() {

        basketPage.miniCartPlusIcon.click();

    }
    @Then("Artma durumu kontrol edilir")
    public void artmaDurumuKontrolEdilir() {
        basketPage.verifyIncreaseQuantyInMiniCart();
    }

    @Then("Sepette urun adedi azaltilir")
    public void sepetteUrunAdediAzaltilir() {

        ReusableMethods.waitFor(1);
        basketPage.miniCartMinusIcon.click();
    }

    @Then("Azalma durumu kontrol edilir")
    public void azalmaDurumuKontrolEdilir() {
        basketPage.verifydecreaseQuantyInMiniCart();
    }


    @And("Sepette urun adedini maximum oranda artirir")
    public void sepetteUrunAdediniMaximumOrandaArtirir() {
        orderPage.plusButtonInCart.click();
        ReusableMethods.waitFor(1);
        orderPage.plusButtonInCart.click();

    }
    @When("Maximum satinalma limitine ulastigini kontrol eder")
    public void maximumSatinalmaLimitineUlastiginiKontrolEder() {
        String maximumProductAmountMsgText = basketPage.maximumProductAmountMsg.getText();
        System.out.println("maximumProductAmountMsgText = " + maximumProductAmountMsgText);
        Assert.assertTrue(basketPage.maximumProductAmountMsg.isDisplayed());

    }
}

