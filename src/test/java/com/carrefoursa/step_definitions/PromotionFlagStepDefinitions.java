package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.PDPPage;
import com.carrefoursa.pages.ProductPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class PromotionFlagStepDefinitions {
    PDPPage pdpPage=new PDPPage();
    ProductPage productPage=new ProductPage();
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Kullanici Ana Sayfadaki hamburger menu iconuna hover yapar")
    public void kullanici_ana_sayfadaki_hamburger_menu_iconuna_hover_yapar() {
        ReusableMethods.scrollToElement(homePage.category);
        homePage.category.click();
        ReusableMethods.hover(homePage.category);
    }
    @Then("Katalog urunleri ,Firsatlar linkine tiklar")
    public void katalog_urunleri_firsatlar_linkine_tiklar() {
        ReusableMethods.scrollToElement(pdpPage.subMenuCatalogProducts1);
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(pdpPage.subMenuCatalogProducts1);
        pdpPage.subMenuCatalogProducts1.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(pdpPage.subMenuCatalogProducts);
        pdpPage.subMenuCatalogProducts.click();
    }
    @Given("PromotionFlag linki altindaki true linkine tiklar")
    public void promotion_flag_linki_altindaki_true_linkine_tiklar() {
        ReusableMethods.waitFor(1);
     //   ReusableMethods.scrollToElement(pdpPage.promotionFlagTrue);
     actions.moveToElement(pdpPage.promotionFlagTrue);
        pdpPage.promotionFlagTrue.click();


    }
    @Given("Promotion flag tasiyan urunlerin listelendigini kontrol eder")
    public void promotion_flag_tasiyan_urunlerin_listelendigini_kontrol_eder() {
        pdpPage.getFlagList();
    }
    @Given("PromotionFlag linki altindaki false linkine tiklar")
    public void promotion_flag_linki_altindaki_false_linkine_tiklar() {

        actions.moveToElement(pdpPage.promotionFlagFalse);
        pdpPage.promotionFlagFalse.click();
    }
    @Given("Promotion flag tasiyan urunlerin listelenmedigini kontrol eder")
    public void promotion_flag_tasiyan_urunlerin_listelenmedigini_kontrol_eder() {

        String falseText=pdpPage.verifyFalseFlag.getText();
        System.out.println("falseText = " + falseText);
        pdpPage.verifyFalseFlag.isDisplayed();

    }

    @Given("urune tiklar")
    public void uruneTiklar() {
        Driver.getDriver().findElement(By.cssSelector("img[title='Dana Tas Kebabı kg']")).click();
    }

    @When("Kullanici Ana Sayfadaki Katalog urunleri ,Firsatlar linkine tiklar")
    public void kullaniciAnaSayfadakiKatalogUrunleriFirsatlarLinkineTiklar() {
        ReusableMethods.waitFor(1);
        pdpPage.opportunitiesLink.click();


    }

    @Then("Gelen sayfada Firsatlar tumunu goster linkine tiklar")
    public void gelenSayfadaFirsatlarTumunuGosterLinkineTiklar() {
        ReusableMethods.waitFor(1);
        pdpPage.opportunitiesAllLink.click();
        ReusableMethods.waitFor(1);


    }
}
