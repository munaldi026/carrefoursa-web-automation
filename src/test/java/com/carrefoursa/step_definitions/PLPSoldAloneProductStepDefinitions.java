package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class PLPSoldAloneProductStepDefinitions {
    SearchPage searchPage=new SearchPage();
    HomePage homePage=new HomePage();
    PDPPage pdpPage=new PDPPage();
   PLPSoldAloneProduct plpSoldAloneProduct=new PLPSoldAloneProduct();


    @Given("Kullanici arama yapacagi urunu girer")
    public void kullaniciAramaYapacagiUrunuGirer() {
       homePage.searchField.sendKeys(Constants.searchProduct);
       ReusableMethods.waitFor(3);

    }

    @Given("Kullanici arama buttonuna tiklar")
    public void kullaniciAramaTiklar() {
        homePage.searchButton.click();
        ReusableMethods.waitFor(3);

    }

        @Given("Herhangi bir urun sepete eklenir")
       public void kullaniciSepeteEklenir() {
        pdpPage.addToBasketButton.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici tek basina satilan ve ayni tedarikciye ait baska bir urun adini yazar")
    public void tekBasinaSatilan() {
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.itemSoldAlone);
    }

    @Given("Devam et popup tiklanir")
    public void devamPopupTiklanir() {
        plpSoldAloneProduct.goOnnButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Kullanici sepetime tiklar")
    public void sepeteTiklar() {
       homePage.myBasket.click();
       ReusableMethods.waitFor(2);
    }

    @Given("Sepete eklenen urun sepetten cikarildigini gorulur")
    public void urunSepetenCikarilir() {

    }

    @Given("Vazgec popup tiklanir")
    public void vazgecTiklanir() {
    plpSoldAloneProduct.giveupButton.click();
    ReusableMethods.waitFor(2);
    }

    @Given("Urun sepeten cikarilmadigi gorulur")
    public void urunSepettenCikarilmaz() {

    }


}
