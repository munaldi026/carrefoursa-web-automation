package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.DiscountCodePage;
import com.carrefoursa.utilities.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DiscountCodeStepDefinitions {

    DiscountCodePage discountCodePage=new DiscountCodePage();
    @Then("Kullanici sayfanin sag alt tarafinda bulunan indirim kodu seçenegine tiklar")
    public void kullanici_sayfanin_sag_alt_tarafinda_bulunan_indirim_kodu_secenegine_tiklar() {
        discountCodePage.discountCodeButton.click();
    }
    @Given("Açilan indirim kodu kutucuguna geçerli bir indirim  kodu girer")
    public void acilan_indirim_kodu_kutucuguna_gecerli_bir_indirim_kodu_girer() {
        discountCodePage.discountCodeTexField.clear();
        discountCodePage.discountCodeTexField.sendKeys(Constants.discountCode);
    }
    @And("indirim kodu kullan butonuna tiklar" )
    public void indirimKoduKullanButonunaTiklar() {
        discountCodePage.discountCodeUseButton.click();
    }
    @Then("indirim yapildigini verify eder")
    public void indirim_yapildigini_verify_eder() {
        discountCodePage.discountCodeButton.click();
        String succesMessageText = discountCodePage.succesMessage.getText();
        System.out.println("succesMessageText = " + succesMessageText);
        Assert.assertTrue(discountCodePage.succesMessage.isDisplayed());
        discountCodePage.releaseButton.click();

    }
    @Given("Açilan indirim kodu kutucuguna geçersiz bir indirim  kodu girer")
    public void acilan_indirim_kodu_kutucuguna_gecersiz_bir_indirim_kodu_girer() {
        discountCodePage.discountCodeTexField.clear();
        discountCodePage.discountCodeTexField.sendKeys(Constants.invalidDiscountCode);

    }
    @Then("indirim yapilmadigini verify eder")
    public void indirim_yapilmadigini_verify_eder() {
        String invalidMessageText = discountCodePage.invalidMessage.getText();
        System.out.println("invalidMessageText = " + invalidMessageText);
        Assert.assertTrue(discountCodePage.invalidMessage.isDisplayed());

    }

}
