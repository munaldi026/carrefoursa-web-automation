package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

    public class PDPStepDefinitions {
        LoginPage loginPage = new LoginPage();
        PDPPage pdpPage = new PDPPage();
        HomePage homePage = new HomePage();
        AccountPage accountPage = new AccountPage();
        ProductPage productPage=new ProductPage();
        String selectedProductText = null;

        @Given("Kullanici login olmus durumdadir")
        public void kullaniciLoginOlmusDurumdadir() {
            loginPage.successLogin();
        }
        @Given("Herhangi bir urunu secer")
        public void herhangi_bir_urunu_secer() throws InterruptedException {
            productPage.selectProduct();
        }
        @When("Kullanici sectigi urunun uzerine tiklar")
        public void kullanici_sectigi_urunun_uzerine_tiklar () {
            String selectedProductText = pdpPage.selectedProduct.getText();
            System.out.println("selectedProductText = " + selectedProductText);
            pdpPage.selectedProduct.click();
        }
        @And("PDP sayfasindaki Alisveris listeme ekle linkine tiklar")
        public void pdpSayfasindakiAlisverisListemeEkleLinkineTiklar () {
            pdpPage.addShoppingListLink.click();
        }
        @Then("Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder")
        public void kullaniciSectigiUrununAlisverisListesineEklendiginiKontrolEder () {
            String expectedTitle = Driver.getDriver().getTitle();
            System.out.println("expectedTitle = " + expectedTitle);
            ReusableMethods.clickFunction(homePage.myAccount);
            ReusableMethods.clickFunction(accountPage.ShoppingListIcon);
            String actualUrunIsmi = accountPage.productInShoppingList.getText();
            System.out.println("actualUrunIsmi = " + actualUrunIsmi);
            Assert.assertTrue(expectedTitle.contains(actualUrunIsmi));
        }
        @And("Alisveris Listesindeki eklenmis olan urune tiklayarak PDP sayfasina doner")
        public void alisverisListesindekiEklenmisOlanUruneTiklayarakPDPSayfasinaDoner() {
            pdpPage.productInShoppingList.click();
        }
        @Then("PDP sayfasindaki Alisveris listemden cikar linkine tiklar")
        public void pdp_sayfasindaki_alisveris_listemden_cikar_linkine_tiklar() {
        pdpPage.removeShoppingListLink.click();
        }
        @Then("Urunun Alisveris listesinden cıkarildigini kontrol eder")
        public void urunun_alisveris_listesinden_cikarildigini_kontrol_eder() {
            ReusableMethods.clickFunction(homePage.myAccount);
            ReusableMethods.clickFunction(accountPage.ShoppingListIcon);
            String emptyFavoriteListText = pdpPage.emptyFavoriteList.getText();
            System.out.println("emptyFavoriteListText = " + emptyFavoriteListText);
            Assert.assertTrue(pdpPage.emptyFavoriteList.isDisplayed());
        }
        @Then("PDP sayfasindaki Sepete ekle butonuna tiklar")
        public void pdp_sayfasindaki_sepete_ekle_butonuna_tiklar() {
        pdpPage.addToBasketButton.click();
        }
        @Then("Kullanici Ana Sayfadaki Sepetim butonuna tiklar")
        public void kullanici_ana_sayfadaki_sepetim_butonuna_tiklar() {
        homePage.myBasket.click();
        }
        @Then("Sectigi urunun sepete eklendigini kontrol eder")
        public void sectigi_urunun_sepete_eklendigini_kontrol_eder() {
            ReusableMethods.waitFor(3);
            String productInBasketText = pdpPage.productInBasket.getText();
            System.out.println("productInBasketText = " + productInBasketText);
            Assert.assertTrue(pdpPage.productInBasket.isDisplayed());
        }
    }
