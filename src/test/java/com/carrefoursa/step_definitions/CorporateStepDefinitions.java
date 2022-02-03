package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.*;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CorporateStepDefinitions {

    HomePage homePage=new HomePage();
    CorporatePage corporatePage=new CorporatePage();

    @Given("Ana Sayfadaki Kurumsal linkine tiklar")
    public void ana_sayfadaki_kurumsal_linkine_tiklar() {
        homePage.corporateLink.click();
        ReusableMethods.waitFor(3);
    }

    @Given("ilgili sayfanin acildigini kontrol eder")
    public void ilgili_sayfanin_acildigini_kontrol_eder() {
        String expectedUrl="https://www.carrefoursa.com/kurumsal/anasayfa/";
        System.out.println("expectedUrl = " + expectedUrl);
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());

    }

    @When("Kullanici Bu sayfadaki Carrefoursa.com'a git linkine tiklar")
    public void kullanici_bu_sayfadaki_carrefoursa_com_a_git_linkine_tiklar() {
        corporatePage.csaHomePage.click();
        ReusableMethods.waitFor(2);

    }

    @Then("Ana sayfaya geldigini kontrol eder")
    public void ana_sayfaya_geldigini_kontrol_eder() {
        String expectedUrl="https://www.carrefoursa.com/";
        System.out.println("expectedUrl = " + expectedUrl);
        Assert.assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());

    }

    @When("Kullanici Ana Sayfadaki Sizi Dinliyoruz linkine tiklar")
    public void kullanici_ana_sayfadaki_sizi_dinliyoruz_linkine_tiklar() {
        homePage.callCenterLink.click();

    }

    @Then("Bu sayfanin acildigini kontrol eder")
    public void bu_sayfanin_acildigini_kontrol_eder() {
        String expectedTitle="Sizi Dinliyoruz | CarrefourSA";
        System.out.println("expectedTitle = " + expectedTitle);
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

    }


}
