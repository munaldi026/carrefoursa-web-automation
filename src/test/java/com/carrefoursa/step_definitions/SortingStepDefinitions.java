package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.PLPPage;
import com.carrefoursa.pages.SortingPage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SortingStepDefinitions {
    HomePage homePage =new HomePage();
    PLPPage plpPage=new PLPPage();
    SortingPage sortingPage=new SortingPage();

    @Given("Kullanici Ana Sayfadaki Arama kutusuna tiklar")
    public void kullanici_ana_sayfadaki_arama_kutusuna_tiklar() {
        homePage.searchField.click();
    }
    @Given("Aramak istedigi urunun adini yazar")
    public void aramak_istedigi_urunun_adini_yazar() {
        homePage.searchField.sendKeys(Constants.searchProduct);
    }
    @Given("Arama butonuna tiklar")
    public void arama_butonuna_tiklar() {

        homePage.searchButton.click();
        try {
            homePage.informationPop_up.click();
        } catch (Exception e) {
            System.out.println("Bilgilendirme Pop-up yok");
        }
    }
    @When("Urun listelemede Akilli Siralama da En Yuksek Fiyat secimini tiklar")
    public void urun_listelemede_akilli_siralama_da_en_yuksek_fiyat_secimini_tiklar() {
        Select sl=new Select(plpPage.smartSortOptions);
        sl.selectByVisibleText("En Yüksek Fiyat");
    }
    @Then("Urunlerin yuksek fiyattan dusuk fiyata dogru siralandigini kontrol eder")
    public void urunlerin_yuksek_fiyattan_dusuk_fiyata_dogru_siralandigini_kontrol_eder() {

        try {
            sortingPage.compareDescendingPrice();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @When("Urun listelemede Akilli Siralama da En Dusuk Fiyat secimini tiklar")
    public void urun_listelemede_akilli_siralama_da_en_dusuk_fiyat_secimini_tiklar() {
        Select sl=new Select(plpPage.smartSortOptions);
        sl.selectByVisibleText("En Düşük Fiyat");
    }
    @Then("Urunlerin dusuk fiyattan yuksek fiyata dogru siralandigini kontrol eder")
    public void urunlerin_dusuk_fiyattan_yuksek_fiyata_dogru_siralandigini_kontrol_eder() {
        try {
            sortingPage.compareAscendingPrice();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
