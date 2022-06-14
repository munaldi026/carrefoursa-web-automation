package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChangingDeliveryRegionStepDefinitions {
    ProductPage productPage=new ProductPage();
    PLPPage plpPage=new PLPPage();
    CreditCardPage creditCardPage=new CreditCardPage();
    DeliveryPage deliveryPage=new DeliveryPage();
    HomePage homePage=new HomePage();

    @And("Kullanici Lokal bolgede iken herhangi bir taze gida aratir")
    public void kullaniciLokalBolgedeIkenHerhangiBirTazeGidaAratir() {

        productPage.searchFreshFood();
    }
    @Given("Taze gidanin sepete eklendigi kontrol edilir")
    public void taze_gidanin_sepete_eklendigi_kontrol_edilir() {
        creditCardPage.verifyCartList();    }

    @Given("Teslimat bolgesi olarak Lokalden, Globale gecilir")
    public void teslimat_bolgesi_olarak_lokalden_globale_gecilir() {
        deliveryPage.selectNewDeliveryRegion();
        ReusableMethods.waitFor(1);
    }
    @Given("Global bolgeye gecildiginde, sepetteki taze gida urunlerinin sepetten cikarildigina dair uyarinin geldigi kontrol edilir")
    public void global_bolgeye_gecildiginde_sepetteki_taze_gida_urunlerinin_sepetten_cikarildigina_dair_uyarinin_geldigi_kontrol_edilir() {
        ReusableMethods.waitFor(2);
        String freshFoodMsg = deliveryPage.freshFoodAlertMsg.getText();
        System.out.println("freshFoodMsg = " + freshFoodMsg);
        Assert.assertTrue(deliveryPage.freshFoodAlertMsg.isDisplayed());
    }
    @Given("Devam edilerek Global bolgede bir urun eklenir")
    public void devam_edilerek_global_bolgede_bir_urun_eklenir() {
        deliveryPage.continueShoppingButton.click();
        deliveryPage.fillDeliveyExAreaInformation();
        productPage.searchProduct();
        plpPage.addToBasketButton();
        Driver.getDriver().navigate().refresh();
        homePage.myBasket.click();
        ReusableMethods.waitFor(3);

    }
    @Given("Urunun sepete eklendigi kontrol edilir")
    public void urunun_sepete_eklendigi_kontrol_edilir() {

    }
    @When("Teslimat bolgesi olarak Globalden, Lokale gecilir")
    public void teslimat_bolgesi_olarak_globalden_lokale_gecilir() {
        deliveryPage.fillDeliveyExAreaInformation();
        ReusableMethods.waitFor(1);
        deliveryPage.pickupFromDeliveryOptionsSubmitButton.click();

    }
    @Then("Urunun sepette kaldigi kontrol edilir")
    public void urunun_sepette_kaldigi_kontrol_edilir() {
    creditCardPage.verifyCartList();

    }


}
