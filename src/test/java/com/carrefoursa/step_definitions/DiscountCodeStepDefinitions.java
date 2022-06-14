package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.DiscountCodePage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Locale;

public class DiscountCodeStepDefinitions {

    DiscountCodePage discountCodePage=new DiscountCodePage();
    @Then("Kullanici sayfanin sag alt tarafinda bulunan indirim kodu seçenegine tiklar")
    public void kullanici_sayfanin_sag_alt_tarafinda_bulunan_indirim_kodu_secenegine_tiklar() {

        ReusableMethods.scrollToElement(discountCodePage.discountCodeButton);
        discountCodePage.discountCodeButton.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Açilan indirim kodu kutucuguna geçerli bir indirim  kodu girer")
    public void acilan_indirim_kodu_kutucuguna_gecerli_bir_indirim_kodu_girer() {
        discountCodePage.discountCodeTexField.clear();
        discountCodePage.discountCodeTexField.sendKeys(Constants.discountCode);
    }
    @And("indirim kodu kullan butonuna tiklar" )
    public void indirimKoduKullanButonunaTiklar() {

        discountCodePage.discountCodeUseButton.click();
        ReusableMethods.waitFor(1);


//        try {
//            discountCodePage.discountCodeUseButton.click();
//        }catch (Exception e){
//            System.out.println("Second usage not allowed for discountCode");
//            discountCodePage.releaseButton.click();
//        }


    }
    @Then("indirim yapildigini verify eder")
    public void indirim_yapildigini_verify_eder() {

        discountCodePage.discountCodeButton.click();
        //ReusableMethods.waitFor(2);

        String succesMessageText = discountCodePage.succesMessage.getText();
        System.out.println("SUCCESS DISCOUNT MESSAGE = " + succesMessageText.toUpperCase(Locale.ROOT));
        Assert.assertTrue(discountCodePage.succesMessage.isDisplayed());
        discountCodePage.releaseButton.click();
        Driver.getDriver().navigate().refresh();


    }
    @Given("Açilan indirim kodu kutucuguna geçersiz bir indirim  kodu girer")
    public void acilan_indirim_kodu_kutucuguna_gecersiz_bir_indirim_kodu_girer() {
        discountCodePage.discountCodeTexField.clear();
        discountCodePage.discountCodeTexField.sendKeys(Constants.invalidDiscountCode);

    }
    @Then("indirim yapilmadigini verify eder")
    public void indirim_yapilmadigini_verify_eder() {
        String invalidMessageText = discountCodePage.invalidMessage.getText();
        System.out.println("INVALID DISCOUNT MESSAGE = " + invalidMessageText.toUpperCase(Locale.ROOT));
        Assert.assertTrue(discountCodePage.invalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();

    }

}
