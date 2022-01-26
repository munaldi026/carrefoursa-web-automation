package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class PDPStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("Kullanici login olmus durumdadir")
    public void kullaniciLoginOlmusDurumdadir() {
        loginPage.successLogin();
    }

    @Given("Herhangi bir ürünü seçer")
    public void herhangi_bir_ürünü_seçer() throws InterruptedException {



    }

    @When("Kullanici seçtiği ürünün üzerine tıklar")
    public void kullanici_seçtiği_ürünün_üzerine_tıklar() {

    }

    @Then("PDP sayfasına geldiğini kontrol eder")
    public void pdp_sayfasına_geldiğini_kontrol_eder() {

    }

    @Then("PDP sayfasındaki {string} linkine tıklar")
    public void pdp_sayfasındaki_linkine_tıklar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanıcı seçtiği ürünün {string} eklendiğini kontrol eder")
    public void kullanıcı_seçtiği_ürünün_eklendiğini_kontrol_eder(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Sepete ekle butonuna tıklar")
    public void pdp_sayfasındaki_sepete_ekle_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanici Ana Sayfadaki Sepetim butonuna tıklar")
    public void kullanici_ana_sayfadaki_sepetim_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Seçtiği ürünün sepete eklendiğini kontrol eder")
    public void seçtiği_ürünün_sepete_eklendiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Alışveriş listeme ekle linkine tıklar")
    public void pdp_sayfasındaki_alışveriş_listeme_ekle_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanıcı seçtiği ürünün Alışveriş listesine eklendiğini kontrol eder")
    public void kullanıcı_seçtiği_ürünün_alışveriş_listesine_eklendiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Alışveriş listemden çıkar linkine tıklar")
    public void pdp_sayfasındaki_alışveriş_listemden_çıkar_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Ürünün Alışveriş listesinden çıkarıldığını kontrol eder")
    public void ürünün_alışveriş_listesinden_çıkarıldığını_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Ürün Bilgileri linkine tıklar")
    public void pdp_sayfasındaki_ürün_bilgileri_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanıcı seçtiği ürünün, ürün bilgilerinin geldiğini kontrol eder")
    public void kullanıcı_seçtiği_ürünün_ürün_bilgilerinin_geldiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Ürün Açıklaması linkine tıklar")
    public void pdp_sayfasındaki_ürün_açıklaması_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanıcı PDP sayfasında,seçtiği ürünün, ürün açıklamasının geldiğini kontrol eder")
    public void kullanıcı_pdp_sayfasında_seçtiği_ürünün_ürün_açıklamasının_geldiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Yorum yazın linkine tıklar")
    public void pdp_sayfasındaki_yorum_yazın_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Çıkan Yorum yaz formunu doldurur")
    public void çıkan_yorum_yaz_formunu_doldurur() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanıcı Yorumu gönder butonuna tıklar")
    public void kullanıcı_yorumu_gönder_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Yapılan yorumun gönderildiğini kontrol eder")
    public void yapılan_yorumun_gönderildiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Taksit Bilgileri linkine tıklar")
    public void pdp_sayfasındaki_taksit_bilgileri_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Kullanıcı PDP sayfasında,seçtiği ürünle ilgili Taksit bilgilerinin geldiğini kontrol eder")
    public void kullanıcı_pdp_sayfasında_seçtiği_ürünle_ilgili_taksit_bilgilerinin_geldiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("PDP sayfasındaki Garanti&İade linkine tıklar")
    public void pdp_sayfasındaki_garanti_i̇ade_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("İade süreçlerimiz butonuna tıklar")
    public void i̇ade_süreçlerimiz_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Açılan sayfada Market Alışverişlerinde linkine tıklar")
    public void açılan_sayfada_market_alışverişlerinde_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("İlgili bilgilerin geldiğini kontrol eder")
    public void i̇lgili_bilgilerin_geldiğini_kontrol_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Açılan sayfada İnternet Alışverişlerinde linkine tıklar")
    public void açılan_sayfada_i̇nternet_alışverişlerinde_linkine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
