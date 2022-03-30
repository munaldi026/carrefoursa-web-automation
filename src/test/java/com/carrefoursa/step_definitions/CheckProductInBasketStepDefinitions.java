package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.pages.ProductPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class CheckProductInBasketStepDefinitions {
    BasketPage basketPage=new BasketPage();
    OrderPage orderPage=new OrderPage();
    ProductPage productPage=new ProductPage();

    @Then("Sepette urun adedi artirilir")
    public void sepetteUrunAdediArtirilir() {
        ReusableMethods.waitFor(2);
        String quantity = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        System.out.println("First quantity = " + quantity);
        ReusableMethods.waitFor(1);
        basketPage.miniCartPlusIcon.click();
        String quantity1 = Driver.getDriver().findElement(By.id("quantity_0")).getAttribute("value");
        System.out.println("Increased Actual quantity = " + quantity1);

    }
    @Then("Artma durumu kontrol edilir")
    public void artmaDurumuKontrolEdilir() {
        basketPage.verifyIncreaseQuantyInMiniCart();    }

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
        productPage.plusButtonInCart.click();
        ReusableMethods.waitFor(1);
        productPage.plusButtonInCart.click();
    }
    @When("Maximum satinalma limitine ulastigini kontrol eder")
    public void maximumSatinalmaLimitineUlastiginiKontrolEder() {
        String maximumProductAmountMsgText = basketPage.maximumProductAmountMsg.getText();
        System.out.println("maximumProductAmountMsgText = " + maximumProductAmountMsgText);
        Assert.assertTrue(basketPage.maximumProductAmountMsg.isDisplayed());

    }
}

