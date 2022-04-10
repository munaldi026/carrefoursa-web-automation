package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.ProductPage;
import com.carrefoursa.pages.SupplierProductsPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SupplierProductStepDefinitions {

    HomePage homePage=new HomePage();
    SupplierProductsPage supplierProductsPage=new SupplierProductsPage();
    BasketPage basketPage=new BasketPage();
    ProductPage productPage=new ProductPage();


    @Then("Tek basina satilan bir urun adi yazar")
    public void tek_basina_satilan_bir_urun_adi_yazar() {
        String soldAloneProductSame1=Constants.soldAloneProductSame1;
        System.out.println("soldAloneProductSame1 = " + soldAloneProductSame1);
        productPage.searchSupplierProductSame1(Constants.soldAloneProductSame1);
           }
    @Given("Tek basina satilan ve ayni tedarikciye ait baska bir urun adi yazar")
    public void tek_basina_satilan_ve_ayni_tedarikciye_ait_baska_bir_urun_adi_yazar() {
        String soldAloneProductSame2=Constants.soldAloneProductSame2;
        System.out.println("soldAloneProductSame2 = " + soldAloneProductSame2);
        productPage.searchSupplierProductSame2(Constants.soldAloneProductSame2);
    }
    @Then("Her iki urununde sepete eklendigini kontrol eder")
    public void her_iki_urununde_sepete_eklendigini_kontrol_eder() {
        supplierProductsPage.verifyCartProductSameList();
    }
    @Then("Sepeti tamamen bosaltarak Anasayfaya doner")
    public void sepetiTamamenBosaltarakAnasayfayaDoner() {
        basketPage.removeAllCart();

    }
    @Given("Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar")
    public void tek_basina_satilan_ve_baska_bir_tedarikciye_ait_yeni_bir_urun_adi_yazar() {
        String soldAloneProductDifferent=Constants.soldAloneProductDifferent;
        System.out.println("soldAloneProductDifferent = " + soldAloneProductDifferent);
        productPage.soldAloneProductDifferent(soldAloneProductDifferent);
    }
    @And("PLP sayfasinda cikan pop_up uzerindeki Devam Et butonuna tiklar")
    public void plpSayfasindaCikanPop_upUzerindekiDevamEtButonunaTiklar() {

        ReusableMethods.waitFor(1);
        supplierProductsPage.goOnButton.click();
        ReusableMethods.waitFor(1);
    }
    @And("PLP sayfasinda cikan pop_up uzerindeki Vazgec butonuna tiklar")
    public void plpSayfasindaCikanPop_upUzerindekiVazgecButonunaTiklar() {
        ReusableMethods.waitFor(1);
        supplierProductsPage.giveUpButton.click();
        ReusableMethods.waitFor(1);

    }
    @Then("Farkli iki tedarikciye ait olan yeni urunlerin eklenemedigini kontrol eder")
    public void farkli_iki_tedarikciye_ait_olan_yeni_urunlerin_eklenemedigini_kontrol_eder() {

        String productInCartSecondSupplierText = supplierProductsPage.productInCartSecondSupplier.getText();
        System.out.println("productInCartSecondSupplierText = " + productInCartSecondSupplierText);
        Assert.assertTrue(supplierProductsPage.productInCartSecondSupplier.isDisplayed());
        System.out.println("ilk urun silinerek yerine ikinci urun eklenmektedir");
        basketPage.getremoveProductButtonInBasket();

    }

    @Then("Farkli iki tedarikciden ilki tercih edildigi icin ilk urunun sepetten silinmedigini kontrol eder")
    public void farkliIkiTedarikcidenIlkiTercihEdildigiIcinIlkUrununSepettenSilinmediginiKontrolEder() {
        String productInCartSecondSupplierText = supplierProductsPage.productInCartSecondSupplier.getText();
        System.out.println("productInCartSecondSupplierText = " + productInCartSecondSupplierText);
        Assert.assertTrue(supplierProductsPage.productInCartSecondSupplier.isDisplayed());
        ReusableMethods.waitFor(3);
        basketPage.removeProductButtonInBasket.click();
        System.out.println("Farkli iki tedarikciden ilki tercih edildigi icin ilk urunun sepette kalmaktadir");
    }



}

