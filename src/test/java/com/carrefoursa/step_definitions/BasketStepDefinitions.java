package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;

public class BasketStepDefinitions {
    LoginPage loginPage = new LoginPage();
    PDPPage pdpPage = new PDPPage();
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    ProductPage productPage=new ProductPage();
    BasketPage basketPage=new BasketPage();

    @Given("Kullanici herhangi bir urunu secer")
    public void kullanici_herhangi_bir_urunu_secer() {
        productPage.selectProduct();
    }

    @When("Kullanici Ana Sayfadaki Sepetim butonuna hover yapar")
    public void kullanici_ana_sayfadaki_sepetim_butonuna_hover_yapar() {

        ReusableMethods.hover(homePage.myBasket);
        ReusableMethods.waitFor(2);

    }

    @When("Sepetteki Urunu Sil butonuna tiklar")
    public void sepetteki_urunu_sil_butonuna_tiklar() {
        basketPage.removeProductButtonInBasket.click();
        ReusableMethods.waitFor(3);

    }

    @Then("Sectigi urunun sepetten kaldirildigini kontrol eder")
    public void sectigi_urunun_sepetten_kaldirildigini_kontrol_eder() {

        String miniCartEmptyMsg = basketPage.miniCartEmptyMsg.getText();
        System.out.println("miniCartEmptyMsg = " + miniCartEmptyMsg);
        basketPage.miniCartEmptyMsg.isDisplayed();

    }

    @When("Sepetteki Sepeti Bosalt butonuna tiklar")
    public void sepetteki_sepeti_bosalt_butonuna_tiklar() {
        basketPage.miniCartRemoveAllLink.click();

    }

    @Then("Cikan Popup uzerindeki Evet butonuna tiklar")
    public void cikan_popup_uzerindeki_evet_butonuna_tiklar() {
        basketPage.emptyCartComfirmButton.click();

    }


    @Given("Sepetteki Not eklemek istiyorum linkine tiklar")
    public void sepetteki_not_eklemek_istiyorum_linkine_tiklar() {
        basketPage.addNoteLinkInBasket.click();


    }

    @Given("Cikan Notunuz baslikli Pop-up uzerindeki ilgili kisma istedigi notu yazar")
    public void cikan_notunuz_baslikli_pop_up_uzerindeki_ilgili_kisma_istedigi_notu_yazar() {
        ReusableMethods.waitForClickablility(basketPage.notPop_up,3);
        basketPage.customerNoteTextField.click();
        basketPage.customerNoteTextField.sendKeys(Constants.customerNote);

    }

    @Given("Kaydet butonuna tiklar")
    public void kaydet_butonuna_tiklar() {
        basketPage.customerNoteSaveButton.click();

    }

    @Given("Ekledigin notu gor veya guncelle linkine tiklar")
    public void ekledigin_notu_gor_veya_guncelle_linkine_tiklar() {
        basketPage.cartPageAddNoteLink.click();

    }

    @And("Notun eklendigini kontrol eder")
    public void notunEklendiginiKontrolEder() {
        String note = basketPage.noMsgTextField.getText();
        System.out.println("note = " + note);

    }


    @And("Ekledigi notu silmek icin sil butonuna tiklar")
    public void ekledigiNotuSilmekIcinSilButonunaTiklar() {
        basketPage.getCustomerNoteDeleteButton.click();
    }

    @Then("Notun silinmis oldugunu kontrol eder")
    public void notunSilinmisOldugunuKontrolEder() {
        String noMessageYet = basketPage.noMsgTextField.getText();
        System.out.println("NoMessageYet = " + noMessageYet);

    }


    @Given("Sectigi urunun altindaki Sepete Ekle butonuna tiklar")
    public void sectigi_urunun_altindaki_sepete_ekle_butonuna_tiklar() {

    }





}
