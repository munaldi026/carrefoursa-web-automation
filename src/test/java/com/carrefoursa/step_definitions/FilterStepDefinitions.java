package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.FilterPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FilterStepDefinitions {
        FilterPage filterPage=new FilterPage();
        Actions actions=new Actions(Driver.getDriver());

        @Then("Urun listelemede Stokta Var checkbox ina tiklar")
        public void urun_listelemede_stokta_var_checkbox_ina_tiklar() {
            filterPage.instockCheckbox.click();

        }
        @Then("Sadece stokta olan urunlerin listelendigini kontrol eder")
        public void sadece_stokta_olan_urunlerin_listelendigini_kontrol_eder() {
            filterPage.instockCheckbox.isSelected();
            ReusableMethods.waitFor(1);

        }
    @And("Urun listelemede Firsatlar checkbox ina tiklar")
    public void urunListelemedeFirsatlarCheckboxInaTiklar() {
            filterPage.opportunitiesCheckbox.click();
            ReusableMethods.waitFor(1);

        }
    @Then("Sadece Firsatlar urunlerinin listelendigini kontrol eder")
    public void sadeceFirsatlarUrunlerininListelendiginiKontrolEder() {
            filterPage.opportunitiesCheckbox.isSelected();

        }
        @Then("Urun listelemede Marka checkbox ina tiklar")
        public void urun_listelemede_marka_checkbox_ina_tiklar() {
            filterPage.activia.click();
            ReusableMethods.waitFor(3);
        }
        @Then("Sadece secili markali urunlerin listelendigini kontrol eder")
        public void sadece_secili_markali_urunlerin_listelendigini_kontrol_eder() {
            String displayText = filterPage.activiaIsDisplay.getText();
            System.out.println("FILTERED BRAND = " + displayText);
            Assert.assertTrue(filterPage.activiaIsDisplay.isDisplayed());
        }

        @Given("Urun listelemede Stokta Var ve indirimli secimlerinin disinda herhangi bir secim yapar")
        public void urunListelemedeStoktaVarVeIndirimliSecimlerininDisindaHerhangiBirSecimYapar() {
            actions.moveToElement(filterPage.activiaLink);
            filterPage.activiaLink.click();
        }

        @When("Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar")
        public void filitreleriTemizleKismindaYapmisOlduguSeciminYanindakiXATiklar() {
            filterPage.removeFilterIcon.click();        }

        @Then("Yaptigi secimin temizlendigini kontrol eder")
        public void yaptigiSeciminTemizlendiginiKontrolEder() {
            actions.moveToElement(filterPage.activiaLink);
            Assert.assertTrue(!filterPage.activiaLink.isSelected());
            System.out.println("Selected filter option is removed");
        }

    }


