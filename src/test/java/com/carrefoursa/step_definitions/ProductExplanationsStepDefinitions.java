package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductExplanationsStepDefinitions {

    ProductPage productPage=new ProductPage();

    @Then("Kullanici sectigi urunun, urun aciklamalarinin gorunur oldugunu kontrol eder")
    public void kullanici_sectigi_urunun_urun_aciklamalarinin_gorunur_oldugunu_kontrol_eder() {
            String explanationsOfProductText = productPage.explanationsOfProduct.getText();
            System.out.println("explanationsOfProductText = " + explanationsOfProductText);
            Assert.assertTrue(productPage.explanationsOfProduct.isDisplayed());
        }
    @Given("PDP sayfasindaki Yorum yazin linkine tiklar")
    public void pdp_sayfasindaki_yorum_yazin_linkine_tiklar() {
            productPage.reviewButton.click();
        }
    @Given("Cikan Yorum yaz formunu doldurur")
    public void cikan_yorum_yaz_formunu_doldurur() {
            ReusableMethods.waitForClickablility(productPage.reviewHeadlineTextBox,2);
            productPage.reviewHeadlineTextBox.sendKeys(Constants.headline);
            productPage.commentTextAreaBox.sendKeys(Constants.comment);
            productPage.starsOfComment.click();
            productPage.nameTextAreaBox.clear();
            productPage.nameTextAreaBox.sendKeys(Constants.name);
        }
    @When("Kullanici Yorumu gonder butonuna tiklar")
    public void kullanici_yorumu_gonder_butonuna_tiklar() {
            productPage.reviewSubmitButton.click();
        }
    @Then("Yapilan yorumun gonderildigini kontrol eder")
    public void yapilan_yorumun_gonderildigini_kontrol_eder() {
            String commentText = productPage.verifyComment.getText();
            System.out.println("commentText = " + commentText);
            Assert.assertTrue(productPage.verifyComment.isDisplayed());
        }
    @When("PDP sayfasindaki Taksit Bilgileri linkine tiklar")
    public void pdp_sayfasindaki_taksit_bilgileri_linkine_tiklar() {
            productPage.installmentLink.click();
        }
    @Then("Kullanici PDP sayfasinda,sectigi urunle ilgili Taksit bilgilerinin geldigini kontrol eder")
    public void kullanici_pdp_sayfasinda_sectigi_urunle_ilgili_taksit_bilgilerinin_geldigini_kontrol_eder() {
            String installmentText = productPage.verifyInstallment.getText();
            System.out.println("installmentText = " + installmentText);
            Assert.assertTrue(productPage.verifyComment.isDisplayed());
        }
    @Given("PDP sayfasindaki Garanti&Iade linkine tiklar")
    public void pdp_sayfasindaki_garanti_iade_linkine_tiklar() {
            productPage.guaranteeLink.click();
        }
    @Given("Iade sureclerimiz butonuna tiklar")
    public void iade_sureclerimiz_butonuna_tiklar() {
            productPage.returnProcessButton.click();
        }
    @When("Acilan sayfada Market Alisverislerinde linkine tiklar")
    public void acilan_sayfada_market_alisverislerinde_linkine_tiklar() {
            productPage.marketProcessLink.click();
            ReusableMethods.closeCerez();
        }
    @Then("Market process bilgilerinin geldigini kontrol eder")
    public void market_process_bilgilerinin_geldigini_kontrol_eder() {
            String expectedTitle="İade Değişim Koşulları | Market";
            System.out.println("expectedTitle = " + expectedTitle);
            String actualTitle = Driver.getDriver().getTitle();
            System.out.println("actualTitle = " + actualTitle);
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        }
    @When("Acilan sayfada Internet Alisverislerinde linkine tiklar")
    public void acilan_sayfada_internet_alisverislerinde_linkine_tiklar() {
            productPage.internetProcessLink.click();
            ReusableMethods.closeCerez();
            }
    @Then("Internet process bilgilerin geldigini kontrol eder")
    public void internet_process_bilgilerin_geldigini_kontrol_eder() {
            String expectedTitle="İade Değişim Koşulları | E-ticaret ";
            System.out.println("expectedTitle = " + expectedTitle);
            String actualTitle = Driver.getDriver().getTitle();
            System.out.println("actualTitle = " + actualTitle);
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        }

}

