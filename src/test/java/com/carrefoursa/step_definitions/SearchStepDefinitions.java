package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.SearchPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import com.carrefoursa.utilities.SmkConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchStepDefinitions {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Given("Kullanici Arama Kismina Aranacak Kelimeyi Girer")
    public void Kullanici_Arama_Kismina_Aranacak_Kelimeyi_Girer() {
        ReusableMethods.retryingFindClick();
        ReusableMethods.waitFor(1);
        homePage.searchField.sendKeys(Constants.searchProduct1);
        //ReusableMethods.waitFor(1);
    }
    @Given("Kullanici Arama Yaptigi Urun Tiplerini Gorur")
    public void kullanici_arama_yaptigi_urun_tiplerini_gorur() {

        searchPage.getSearchItemList();
    }

    @Given("Kullanici Ara Buttonuna Tiklar")
    public void kullanici_ara_buttonuna_tiklar() {
        ReusableMethods.clickFunction(homePage.searchButton);
        ReusableMethods.waitFor(1);
    }
    @Then("Arama Yaptigi Urun Tiplerini Gorur")
    public void aramaYaptigiUrunTipleriniGorur() {
        //searchPage.getSearchDisplay1.isDisplayed();
        searchPage.getSearchItemList1();
    }

    @Given("Kullanici Populer Basligini Gorur")
    public void kullanici_populer_urun_basligini_gorur() {
        searchPage.popularproducttitle.isDisplayed();
        ReusableMethods.waitFor(3);
    }
    @Given("Kullanici Ana Sayfadaki arama kutusuna tiklar")
    public void kullanici_ana_sayfadaki_arama_kutusuna_tiklar() {
        homePage.searchField.click();
        ReusableMethods.waitFor(3);

    }
    @Given("Arama kutusuna hicbir sey yazmaz")
    public void arama_kutusuna_hicbir_sey_yazmaz() {
        homePage.searchField.sendKeys("");
    }
    @Then("Arama yapilamayacagini kontrol eder")
    public void arama_yapilamayacagini_kontrol_eder() {
        searchPage.searchMsg();
    }
//    @Given("Arama kutusuna sadece tek bir harf yazar")
//    public void arama_kutusuna_sadece_tek_bir_harf_yazar() {
//        homePage.searchField.sendKeys(Constants.singleLetter);
//    }

    @Given("Kullanici Arama Kismina Aranacak Tek Bir Harf Girer")
    public void kullaniciAramaKisminaAranacakTekBirHarfGirer() {
        searchPage.searchProductBySingleLetter();
    }
}


