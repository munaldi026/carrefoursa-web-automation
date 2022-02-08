package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.FilterPage;
import io.cucumber.java.en.Then;

    public class FilterStepDefinitions {
        FilterPage filterPage=new FilterPage();

        @Then("Urun listelemede Stokta Var checkbox ina tiklar")
        public void urun_listelemede_stokta_var_checkbox_ina_tiklar() {


        }
        @Then("Sadece stokta olan urunlerin listelendigini kontrol eder")
        public void sadece_stokta_olan_urunlerin_listelendigini_kontrol_eder() {


        }
        @Then("Urun listelemede Indirimli checkbox ina tiklar")
        public void urun_listelemede_indirimli_checkbox_ina_tiklar() {
            filterPage.discountCheckbox.click();

        }
        @Then("Sadece Indirmli urunlerin listelendigini kontrol eder")
        public void sadece_indirmli_urunlerin_listelendigini_kontrol_eder() {
            filterPage.getDiscountProduct();


        }
        @Then("Urun listelemede Marka checkbox ina tiklar")
        public void urun_listelemede_marka_checkbox_ina_tiklar() {

        }
        @Then("Sadece secili markali urunlerin listelendigini kontrol eder")
        public void sadece_secili_markali_urunlerin_listelendigini_kontrol_eder() {

        }
    }
