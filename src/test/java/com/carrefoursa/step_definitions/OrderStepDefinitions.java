package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class OrderStepDefinitions {
    HomePage homePage=new HomePage();
    AccountPage accountPage=new AccountPage();
    OrderPage orderPage=new OrderPage();
    ProductPage productPage=new ProductPage();
    PLPPage plpPage=new PLPPage();
    String orderNoText;

    @Given("Kullanici herhangi bir urunu aratir")
    public void kullaniciHerhangiBirUrunuAratir() {

        productPage.searchProduct();
    }

    @Given("PLP sayfasindaki Sepete ekle butonuna tiklar")
    public void plp_sayfasindaki_sepete_ekle_butonuna_tiklar() {

        plpPage.addToBasketButton();
    }

    @Given("Ana Sayfadaki Sepetim butonuna tiklar")
    public void ana_sayfadaki_sepetim_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        homePage.myBasket.click();
    }

    @Given("Kullanici sepette Siparisi tamamla butonuna tiklar")
    public void kullanici_sepette_siparisi_tamamla_butonuna_tiklar() {

        orderPage.continueButton.click();

    }

    @And("Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur")
    public void gelenSayfadaTeslimatSekliOlarakSizeGetirelimSecenegininSeciliOldugunuGorur() {
        orderPage.pickUpInStoreButton.isDisplayed();

    }

    @Given("Teslimat adresi secer")
    public void teslimat_adresi_secer() {
        orderPage.selectDeliveryAdresButton.click();

    }

    @And("Adres secimi sayfasinda Devam Et butonuna tiklar")
    public void adresSecimiSayfasindaDevamEtButonunaTiklar() {

        orderPage.continueButton.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Gelen sayfada teslimat zamanini secer")
    public void gelen_sayfada_teslimat_zamanini_secer() {

        orderPage.deliveryTime.click();

    }

    @And("Teslimat zamani sayfasinda Devam Et butonuna tiklar")
    public void teslimatZamaniSayfasindaDevamEtButonunaTiklar() {
        //Driver.getDriver().navigate().refresh();
        orderPage.continueButton.click();
        //orderPage.deliverySlotSubmitButton.click();

    }

    @And("Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer")
    public void odemeSekliOlarakKapidaKrediKartiVeyaNakitSeceneginiSecer() {

        orderPage.payByCCAtDelivery.click();
    }

    @When("Kullanici odemede Siparisi tamamla butonuna tiklar")
    public void kullaniciOdemedeSiparisiTamamlaButonunaTiklar() {
        ReusableMethods.waitFor(1);
        //orderPage.onlinePaySubmitButton.click();
        orderPage.continueButton.click();
    }

    @Then("Kullanici siparisin tamamlandigini kontrol eder")
    public void kullanici_siparisin_tamamlandigini_kontrol_eder() {


        String verifyOrderMsg = orderPage.cancelOrderMsg.getText();
        System.out.println("COMPLETE ORDER MESSAGE = " + verifyOrderMsg.toUpperCase(Locale.ROOT));
        orderNoText = orderPage.orderNo.getText();
        System.out.println("COMPLETED ORDER NO = " + orderNoText.toUpperCase(Locale.ROOT));
        orderPage.cancelOrderMsg.isDisplayed();



    }

    @Given("Kullanici Hesabim butonuna tiklar")
    public void kullanici_hesabim_butonuna_tiklar() {
        homePage.myAccount.click();

    }

    @Given("Hesabim sayfasindaki Siparislerim butonuna tiklar")
    public void hesabim_sayfasindaki_siparislerim_butonuna_tiklar() {
        accountPage.orderListIcon.click();

    }

    @Given("Siparislerim sayfasindaki Siparisi iptal Et butonuna tiklar")
    public void siparislerim_sayfasindaki_siparisi_iptal_et_butonuna_tiklar() {
        orderPage.cancelOrderButton.click();


    }
    @And("Kullanici Siparis Onay sayfasindaki Siparisimi iptal Etmek istiyorum butonuna tiklar")
    public void kullaniciSiparisOnaySayfasindakiSiparisimiiptalEtmekistiyorumButonunaTiklar() {
        orderPage.cancelOrderButton.click();

    }

    @Given("Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar")
    public void siparis_iptali_ile_ilgili_cikan_pop_up_uzerinde_evet_butonuna_tiklar() {
        orderPage.orderCancelConfirmButton.click();
        ReusableMethods.waitFor(5);
    }

    @Then("Kullanici siparisin iptal edildigini kontrol eder")
    public void kullanici_siparisin_iptal_edildigini_kontrol_eder() {

        orderPage.verifyDeleteOrder();
        System.out.println("orderNoText = " + orderNoText);

    }

    }

