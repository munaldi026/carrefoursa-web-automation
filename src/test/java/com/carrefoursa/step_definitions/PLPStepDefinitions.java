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
    }


    @Given("Kullanici populer urunleri gorur")
    public void kullaniciPopulerUrunleriGorur() {
        searchPage.popularproducttitle.isDisplayed();

    }



}

