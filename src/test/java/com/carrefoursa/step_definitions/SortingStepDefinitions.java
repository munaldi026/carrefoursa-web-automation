package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.PLPPage;
import com.carrefoursa.pages.SortingPage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SortingStepDefinitions {
    HomePage homePage =new HomePage();
    PLPPage plpPage=new PLPPage();
    SortingPage sortingPage=new SortingPage();


    @Given("Kullanıcı Ana Sayfadaki Arama kutusuna tıklar")
    public void kullanıcı_ana_sayfadaki_arama_kutusuna_tıklar() {
        homePage.searchField.click();

    }
    @Given("Aramak istediği ürünün adını yazar")
    public void aramak_istediği_ürünün_adını_yazar() {
        homePage.searchField.sendKeys(ConfigReader.getProperty("aranan_urun"));


    }
    @Given("Arama butonuna tıklar")
    public void arama_butonuna_tıklar() {

        homePage.searchButton.click();
        try {
            homePage.informationPop_up.click();
        } catch (Exception e) {
            System.out.println("Bilgilendirme Pop-up yok");
        }

    }
    @When("Ürün listelemede Akıllı Sıralama da En Yuksek Fiyat secimini tıklar")
    public void ürün_listelemede_akıllı_sıralama_da_en_yuksek_fiyat_secimini_tıklar() {

        Select sl=new Select(plpPage.smartSortOptions);
        sl.selectByVisibleText("En Yüksek Fiyat");


    }
    @Then("Ürünlerin yüksek fiyattan düşük fiyata doğru sıralandığını kontrol eder")
    public void ürünlerin_yüksek_fiyattan_düşük_fiyata_doğru_sıralandığını_kontrol_eder() {
        try {
            sortingPage.compareDescendingPrice();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @When("Ürün listelemede Akıllı Sıralama da En Dusuk Fiyat secimini tıklar")
    public void ürün_listelemede_akıllı_sıralama_da_en_dusuk_fiyat_secimini_tıklar() {
        Select sl=new Select(plpPage.smartSortOptions);
        sl.selectByVisibleText("En Düşük Fiyat");

    }

    @Then("Ürünlerin düşük fiyattan yüksek fiyata doğru sıralandığını kontrol eder")
    public void ürünlerin_düşük_fiyattan_yüksek_fiyata_doğru_sıralandığını_kontrol_eder() {
        try {
            sortingPage.compareAscendingPrice();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
