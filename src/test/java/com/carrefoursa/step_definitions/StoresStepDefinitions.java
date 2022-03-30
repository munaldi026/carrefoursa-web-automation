package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.AccountPage;
import com.carrefoursa.pages.CorporatePage;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.LoginPage;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class StoresStepDefinitions {

    CorporatePage corporatePage=new CorporatePage();
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    AccountPage accountPage=new AccountPage();

    @Given("Kullanici sisteme giris yapar")
    public void kullaniciSistemeGirisYapar() {
        loginPage.successLogin();

    }

    @Given("Kullanici Ana Sayfadaki En Yakin CarrefourSa linkine tiklar")
    public void kullanici_ana_sayfadaki_en_yakin_carrefour_sa_linkine_tiklar() {

        ReusableMethods.clickFunction(homePage.locationsLink);
        ReusableMethods.switchToWindow("En Yakın Carrefoursa | CarrefourSa");
        ReusableMethods.waitFor(1);

    }

    @Given("Sayfanin acildigini kontrol eder")
    public void sayfanin_acildigini_kontrol_eder() {

        ReusableMethods.closeCerez();
        String expectedTitle= (corporatePage.displayTitle.getText());
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(corporatePage.displayTitle.isDisplayed());
        Driver.getDriver().switchTo().frame(corporatePage.iFrame);
    }

    @Given("Kullanici Bu sayfadaki il textbox'ina yasadigi ilin adini secer")
    public void kullanici_bu_sayfadaki_il_textbox_ina_yasadigi_ilin_adini_secer() {



        Select select=new Select(corporatePage.cityNameSelect);
        select.selectByVisibleText("Eskişehir");
        //ReusableMethods.selectRandomTextFromDropdown(select);


    }
    @Given("ilce textbox'ina yasadigi ilcenin adini secer")
    public void ilce_textbox_ina_yasadigi_ilcenin_adini_secer() {
        Select select=new Select(corporatePage.townNameSelect);
        select.selectByVisibleText("Odunpazarı");
        //ReusableMethods.selectRandomTextFromDropdown(select);

    }

    @Given("Magaza Turunu Seciniz bolumunde ilgili checkbox'i secer")
    public void magaza_turunu_seciniz_bolumunde_ilgili_checkbox_i_secer() {
        corporatePage.selectAllStoreLink.click();

    }

    @Given("Hizmet Turunu Seciniz bolumunde ilgili checkbox'i secer")
    public void hizmet_turunu_seciniz_bolumunde_ilgili_checkbox_i_secer() {
        corporatePage.selectServiceType.click();

    }

    @When("Sonuclari Goster butonuna tiklanir")
    public void sonuclari_goster_butonuna_tiklanir() {
        corporatePage.resultsButton.click();

    }

    @Then("Secilen en yakin magazanin goruntulendigini kontrol eder")
    public void secilen_en_yakin_magazanin_goruntulendigini_kontrol_eder() {

        String mallsListText = corporatePage.mallsList.getText();
        System.out.println("mallsListText = " + mallsListText);

    }


    @And("Hesaplarim linklerini kontrol eder")
    public void hesaplarimLinkleriniKontrolEder() {
        accountPage.getMyAccountList();
    }

    @And("Ana Sayfadaki Hesabim linkine tiklar")
    public void anaSayfadakiHesabimLinkineTiklar() {
        ReusableMethods.clickFunction(homePage.myAccount);
    }

    @Then("Footer Linklerini kontrol eder")
    public void footerLinkleriniKontrolEder() {
        accountPage.getFooterLinkList();
        //ReusableMethods.getElementsText(accountPage.footerLinkLists);
    }

    @And("Sayfa sonuna gider")
    public void sayfaSonunaGider() {
        ReusableMethods.scrollToElement(accountPage.bottomWebElement);
    }


}
