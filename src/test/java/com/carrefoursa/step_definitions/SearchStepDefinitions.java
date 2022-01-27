package com.carrefoursa.step_definitions;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.pages.SearchPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class SearchStepDefinitions {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Given("Kullanıcı Arama Kısmına Aranacak Kelimeyi Girer")
    public void Kullanıcı_Arama_Kısmına_Aranacak_Kelimeyi_Girer() {
        homePage.searchField.click();
        homePage.searchField.sendKeys("et");
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanıcı Ara Buttonuna Tıklar")
    public void kullanıcı_ara_buttonuna_tiklar() {
        homePage.searchButton.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanıcı Arama Yaptığı Ürün Tiplerini Görür")
    public void kullanıcı_arama_yaptığı_urun_tiplerini_görür() {
        searchPage.searchdisplay.isDisplayed();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanıcı Popüler Başlığını Görür")
    public void kullanıcı_populer_urun_basligini_gorur() {
        searchPage.popularproducttitle.isDisplayed();
        ReusableMethods.waitFor(3);
    }

}


