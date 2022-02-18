package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PDPSelectAlternativeProductStepDefinitions {

        ProductPage productPage=new ProductPage();
        PDPPage pdpPage=new PDPPage();
        BasketPage basketPage=new BasketPage();
        HomePage homePage=new HomePage();


        @Given("Kullanici alternatif seciminin yapilabilecegi uygun bir urun aratir")
        public void kullanici_alternatif_seciminin_yapilabilecegi_uygun_bir_urun_aratir() {

            productPage.searchAlternativeProduct();

        }
        @Given("Sepette  Alternatif urununu sececegim secimini tiklar")
        public void sepette_alternatif_urununu_sececegim_secimini_tiklar() {

            productPage.radioButtonInBasket.click();
        }

        @Given("Cikan Alternatif Urun Secimi pop-up'i uzerindeki urunu secer")
        public void cikan_alternatif_urun_secimi_pop_up_i_uzerindeki_urunu_secer() {
            productPage.alternativeItemCheckbox.click();
        }
        @When("Secimimi Kaydet butonuna tiklar")
        public void secimimi_kaydet_butonuna_tiklar() {
            productPage.selectAlternativeProductButton.click();

        }
        @Then("Secimin basarili oldugunu kontrol eder")
        public void secimin_basarili_oldugunu_kontrol_eder() {

            String selectedProductName= Constants.alternativepruductForPDP;
            System.out.println("selectedProductName = " + selectedProductName);
            String selectedAlternativeProductName = productPage.selectedAlternativeProductName.getText();
            System.out.println("AlternativeProductName = " + selectedAlternativeProductName);
            Assert.assertFalse(productPage.radioButtonInBasket.isSelected());

        }


    }


