package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.PDPPage;
import com.carrefoursa.pages.PLPPage;
import com.carrefoursa.pages.SearchPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class PLPStepDefinitions {
    PLPPage plpPage=new PLPPage();
    HomePage homePage=new HomePage();
    PDPPage pdpPage=new PDPPage();
   SearchPage searchPage=new SearchPage();

    @Given("Kullanici kategori tiklar yapar")
    public void kullaniciKategoriTiklar() {
        homePage.category.click();
    }

    @Given("Kullanici herhangi bir kategoriye hover yapar")
    public void kullaniciHerhangiKategoriTiklar() {
        plpPage.subMenuMeatandFishProducts.click();
        ReusableMethods.waitFor(5);
    }

    @Given("Kullanici herhangi bir alt kategoriye hover yapar")
    public void kullaniciHerhangiAltKategoriTiklar() {
        plpPage.category.click();
        ReusableMethods.waitFor(2);
    }



    @Given("Kullanici populer urunleri gorur")
    public void kullaniciPopulerUrunleriGorur() {
        searchPage.popularproducttitle.isDisplayed();
        ReusableMethods.waitFor(4);

    }

    @Given("Kullanici alt kategori urunleri gorur")
    public void kullaniciAltKategoriUrunleriGorur() {
        plpPage.meatandFishSubProducts.isDisplayed();

    }

    @Given("Kullanici kampanyalara hover yapar")
    public void kullaniciKampanyalaraHoverYapar() {
        plpPage.campaigns.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Kullanici kampanyalara urunleri gorur")
    public void kullaniciKampanyalaraUrunleriGorur() {
        plpPage.campaignstitle.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    @Given("Kullanici indirimli urunlere tiklar")
    public void kullaniciindirimliurunetiklar() {
        plpPage.discountedproducts.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Kullanici bir markaya tiklar")
    public void kullanicimarkayatiklar() {
        plpPage.apikogluproducts.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Kullanici tiklanan markaya ait urunleri listelendigi gorur")
    public void kullanicimarkalistelenir() {
        plpPage.apikogluproduct.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Kullanici fiyat araligini secer")
    public void kullaniciFiyatAraliginiSecer() {
        ReusableMethods.scrollToElement(plpPage.price);
        plpPage.price.click();
    }

    @Given("Kullanici fiyat araligini ekranda gorur")
    public void kullaniciFiyatAraliginiEkrandaGorur() {
        plpPage.price.isDisplayed();
        ReusableMethods.waitFor(3);
    }



}

