package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;

public class BasketStepDefinitions {


    HomePage homePage = new HomePage();
    ProductPage productPage=new ProductPage();
    BasketPage basketPage=new BasketPage();
    CreditCardPage creditCardPage=new CreditCardPage();
    PDPPage pdpPage=new PDPPage();
    OrderPage orderPage=new OrderPage();
    String deletedProductName=null;


    @Given("Kullanici herhangi bir urunu secer")
    public void kullanici_herhangi_bir_urunu_secer() {
        productPage.selectProduct();
    }

    @When("Kullanici Ana Sayfadaki Sepetim butonuna hover yapar")
    public void kullanici_ana_sayfadaki_sepetim_butonuna_hover_yapar() {
        ReusableMethods.waitFor(1);
        ReusableMethods.hover(homePage.myBasket);
        ReusableMethods.waitFor(1);

    }    @When("Mini sepetteki Urunu Sil butonuna tiklar")
    public void miniSepettekiUrunuSilButonunaTiklar() {

        creditCardPage.verifyMiniCartList();
        deletedProductName = creditCardPage.getRemoveItemListMiniCart().get(0).getText();
        creditCardPage.getRemoveItemListMiniCart().get(0).click();
        ReusableMethods.waitFor(1);
    }
    @When("Sepetteki Urunu Sil butonuna tiklar")
    public void sepetteki_urunu_sil_butonuna_tiklar() {
       basketPage.removeProductButtonInBasket.click();
       ReusableMethods.waitFor(1);
    }
    @Then("Sectigi urunun sepetten kaldirildigini kontrol eder")
    public void sectigi_urunun_sepetten_kaldirildigini_kontrol_eder() {
        ReusableMethods.waitFor(1);
        String miniCartEmptyMsg = basketPage.miniCartEmptyMsg.getText();
        System.out.println("MINI CART EMPTY MESSAGE = " + miniCartEmptyMsg.toUpperCase(Locale.ROOT));
        basketPage.miniCartEmptyMsg.isDisplayed();
    }
    @When("Sepetteki Sepeti Bosalt butonuna tiklar")
    public void sepetteki_sepeti_bosalt_butonuna_tiklar() {
        basketPage.miniCartRemoveAllLink.click();
    }
    @Then("Cikan Popup uzerindeki Evet butonuna tiklar")
    public void cikan_popup_uzerindeki_evet_butonuna_tiklar() {
        basketPage.emptyCartComfirmButton.click();
        ReusableMethods.waitFor(1);
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
        System.out.println("CUSTOMER NOTE :"+Constants.customerNote);
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
        System.out.println("Customer note is deleted.Any message hasn't been written yet. = " + noMessageYet);
    }

    @Then("Sepette bulunan urunleri kontrol eder")
    public void sepetteBulunanUrunleriKontrolEder() {
        ReusableMethods.waitFor(1);
        creditCardPage.getMiniCartList();
    }

    @Then("Sepete eklemis oldugu urunun dogru urun oldugunu kontrol eder")
    public void sepeteEklemisOlduguUrununDogruUrunOldugunuKontrolEder() {
        creditCardPage.verifyCartList();


    }
    @Given("Siparis ozetinde Temassiz Teslimat checkbox ini tiklar")
    public void siparisOzetindeTemassizTeslimatCheckboxIniTiklar() {
        basketPage.touchlessDeliveryCheckmark.click();

    }

    @Then("Temassiz teslimat oldugunu kontrol eder")
    public void temassizTeslimatOldugunuKontrolEder() {
        basketPage.verifyTouchlessDelivery();
        ReusableMethods.waitFor(1);
        orderPage.deleteOrder();

    }

    @Given("Siparis ozetinde Poset ile teslim edilmesini istiyorum secimini tiklar")
    public void siparisOzetindePosetIleTeslimEdilmesiniIstiyorumSeciminiTiklar() {

            basketPage.selectNormalBag.click();
        }

    @Then("Siparis ozetinde poset eklenmis oldugunu kontrol eder")
    public void siparisOzetindePosetEklenmisOldugunuKontrolEder() {
            basketPage.verifyNormalBag();
            ReusableMethods.waitFor(1);
            orderPage.deleteOrder();
    }

    @Given("Siparis ozetinde Bez Poset ile teslim edilmesini istiyorum secimini tiklar")
    public void siparisOzetindeBezPosetIleTeslimEdilmesiniIstiyorumSeciminiTiklar() {
            basketPage.selectClothBag.click();
    }

    @Then("Siparis ozetinde bez poset eklenmis oldugunu kontrol eder")
    public void siparisOzetindeBezPosetEklenmisOldugunuKontrolEder() {
            basketPage.verifyClothBag();
            ReusableMethods.waitFor(1);
            orderPage.deleteOrder();

    }

    @And("Kullanici sepeti bosaltir")
    public void kullaniciSepetiBosaltir() {
        basketPage.removeAllProduct();

    }

    @Then("Urunun mini sepetten silindigini kontrol eder")
    public void urununMiniSepettenSilindiginiKontrolEder() {
        creditCardPage.verifyRemoveMiniCartList();
    }

    @And("Kullanici sepeti tamamen bosaltir")
    public void kullaniciSepetiTamamenBosaltir() {
        homePage.homePageButton.click();
        basketPage.removeMiniCart();

    }

    }

