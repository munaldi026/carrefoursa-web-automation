package com.carrefoursa.step_definitions;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.pages.SearchPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchStepDefinitions {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Given("Kullanici Arama Kismina Aranacak Kelimeyi Girer")
    public void Kullanici_Arama_Kismina_Aranacak_Kelimeyi_Girer() {
        homePage.searchField.click();
        ReusableMethods.waitFor(3);
        homePage.searchField.sendKeys(Constants.searchProduct1);
        ReusableMethods.waitFor(1);
    }
    @Given("Kullanici Arama Yaptigi Urun Tiplerini Gorur")
    public void kullanici_arama_yaptigi_urun_tiplerini_gorur() {
        searchPage.searchdisplay.isDisplayed();
        ReusableMethods.waitFor(3);
    }

    @Given("Kullanici Ara Buttonuna Tiklar")
    public void kullanici_ara_buttonuna_tiklar() {
        ReusableMethods.clickFunction(homePage.searchButton);
        ReusableMethods.waitFor(3);
    }
    @Then("Arama Yaptigi Urun Tiplerini Gorur")
    public void aramaYaptigiUrunTipleriniGorur() {
        searchPage.getSearchdisplay1.isDisplayed();
    }

    @Given("Kullanici Populer Basligini Gorur")
    public void kullanici_populer_urun_basligini_gorur() {
        searchPage.popularproducttitle.isDisplayed();
        ReusableMethods.waitFor(3);
    }

}


