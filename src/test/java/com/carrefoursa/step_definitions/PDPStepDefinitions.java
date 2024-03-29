package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
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
        PLPPage plpPage=new PLPPage();
        BasketPage basketPage=new BasketPage();
        ProductPage productPage=new ProductPage();
        CreditCardPage creditCardPage=new CreditCardPage();
        OrderPage orderPage=new OrderPage();
        String selectedProductText = null;

        @Given("Kullanici login olmus durumdadir")
        public void kullaniciLoginOlmusDurumdadir() {
            loginPage.successLogin();
        }

        @And("Kullanici belirli bir urunu aratir")
        public void kullaniciBelirliBirUrunuAratir() {
            productPage.searchCertainProduct();
        }

        @When("Kullanici arattigi urunune tiklar")
        public void kullaniciArattigiUrununeTiklar() {

            plpPage.addToFirstProduct();
        }
        @And("PDP sayfasindaki Alisveris listeme ekle linkine tiklar")
        public void pdpSayfasindakiAlisverisListemeEkleLinkineTiklar () {
            pdpPage.addShoppingListLink.click();
        }

        @Then("Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder")
        public void kullaniciSectigiUrununAlisverisListesineEklendiginiKontrolEder () {
        pdpPage.verifyAddProductInShoppingList();

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

            Driver.getDriver().navigate().refresh();
            homePage.myBasket.click();
            ReusableMethods.waitFor(3);
        }

        @Then("Sectigi urunun sepete eklendigini kontrol eder")
        public void sectigi_urunun_sepete_eklendigini_kontrol_eder() {

            Constants.searchOrderProductName=pdpPage.productInBasket.getText();
            System.out.println("Constants.searchOrderProductName = " + Constants.searchOrderProductName);
            Assert.assertTrue(pdpPage.productInBasket.isDisplayed());
            ReusableMethods.waitFor(1);

        }

        @Then("Sectigi urunun mini sepete eklendigini kontrol eder")
        public void sectigiUrununMiniSepeteEklendiginiKontrolEder() {
            creditCardPage.verifyMiniCartList();
        }

        @And("PDP urun adedini maximum oranda artirir")
        public void pdpUrunAdediniMaximumOrandaArtirir() {

            productPage.maxSearchCertainProduct();
        }

        @When("Maximum satin alma limitine ulastigini kontrol eder")
        public void maximumSatinAlmaLimitineUlastiginiKontrolEder() {
            String pdPmaximumProductMsgText = basketPage.PDPmaximumProductMsg.getText();
            System.out.println("pdPmaximumProductMsgText = " + pdPmaximumProductMsgText);
            Assert.assertTrue(basketPage.PDPmaximumProductMsg.isDisplayed());


        }

    @And("Kullanici mini cart icin bir urunu aratir")
    public void kullaniciMiniCartIcinBirUrunuAratir() {
        productPage.searchProductMiniCart();


    }

    @Then("Kullanici sepeti temizler")
    public void kullaniciSepetiTemizler() {
        ReusableMethods.waitFor(1);
        basketPage.removeProductButtonInBasket.click();
    }

    @When("Gelen pop-up kapatilirarak sepete hover yapilir")
    public void gelenPopUpKapatilirarakSepeteHoverYapilir() {
        orderPage.alertPop_UpButton.click();
        ReusableMethods.waitFor(1);
        pdpPage.addToBasketButton.click();
        ReusableMethods.hover(homePage.myBasket);
        ReusableMethods.waitFor(1);
        homePage.myBasket.click();
    }

//    public String getProductCode() {
//
//        sleep(2000);
//        String productCode = "---***---";
////        Ürün Kodu :2000030174
//        try {
//            sleep(1000);
//            String productCodeText = driver.findElement(By.cssSelector(".mr-auto.text-c2")).getText().trim();
//            System.out.println("productCodeText = " + productCodeText);
//            productCode = productCodeText.substring(productCodeText.indexOf(":") + 1);
//
//          /*  productCode=driver.findElement(By.cssSelector(".font-size-2 > .mr-auto")).getText();
//            System.out.println("ürün kodu: "+productCode);
//            productCode=productCode.substring(productCode.indexOf(":")+1);*/
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        sleep(2000);
//        return productCode;
//    }


    }
