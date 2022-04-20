package com.carrefoursa.step_definitions;
import com.carrefoursa.pages.BasketPromotionInformationPage;
import com.carrefoursa.utilities.ConfigReader;
import com.carrefoursa.utilities.ReusableMethods;
import com.carrefoursa.utilities.SmkConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BasketPromotionInformationStepDefinitions {
        BasketPromotionInformationPage basketPromotionInformationPage=new BasketPromotionInformationPage();
        ReusableMethods reusableMethods=new ReusableMethods();


    @And("Kullanıcı 2 al 1 öde ürününü aratır")
    public void kullanciUrunAratir()  {
        basketPromotionInformationPage.searchFieldBasketPromotionInformation.click();
        basketPromotionInformationPage.searchFieldBasketPromotionInformation.sendKeys(ConfigReader.getProperty("promotional_product"));
        ReusableMethods.waitFor(2);
        basketPromotionInformationPage.searchButtonBasketPromotionInformation.click();
    }

    @And("^Sepete 1 ürün eklenir$")
    public void sepeteBirUrunklenir(){
        basketPromotionInformationPage.addToBasketPromotionInformation.click();
    }

    @And("^Sepetim Tiklanir$")
    public void sepetim_tiklanir(){
        basketPromotionInformationPage.myBasketBasketPromotionInformation.click();
    }

    @And("^Sepetim Sayfasında Alt kısmında Sarı uyarı yazısı görülür$")
    public void sepetim_sayfasnda_alt_kisimnda_sari_uyari_yazsi_gorulur(){
        basketPromotionInformationPage.yellowwarning.isDisplayed();
    }

    @And("^Urun Sayisi iki Yapilir$")
    public void urun_sayisi_iki_yapilir() {
        basketPromotionInformationPage.plusIconInPDPBasketPromotionInformation.click();
        ReusableMethods.waitFor(2);

    }

    @Then("^Sari Uyari Yazisi Kaybolur$")
    public void sari_uyari_yazisi_kaybolur(){
        reusableMethods.verifyelementNotDisplayed(basketPromotionInformationPage.yellowwarning);

    }

    @Then("^Sepet Limiti Karsilanmadigi Gorulur$")
    public void sepet_limiti_karsilanmadigi_gorulur(){
        basketPromotionInformationPage.orderTotalAmountMsgasketPromotionInformation.isDisplayed();
    }

    @Then("^Uygun Urun Tiklanir$")
    public void uygunUrunTiklanir(){
        basketPromotionInformationPage.searchFirstItemBasketPromotionInformation.click();
    }

    @Then("^Urunun 2 al 1 ode yazısı gorulur$")
    public void ikiAlBirOdeYazisi(){
        basketPromotionInformationPage.searchFirstItemdetail.isDisplayed();
    }

    @And("^Kullanıci promosyonlu urun aratır$")
    public void kullanci_promosyonlu_urun_aratr(){
        basketPromotionInformationPage.searchFieldBasketPromotionInformation.click();
        basketPromotionInformationPage.searchFieldBasketPromotionInformation.sendKeys(ConfigReader.getProperty("promotional_product"));
        ReusableMethods.waitFor(2);
        basketPromotionInformationPage.searchButtonBasketPromotionInformation.click();
    }

    @And("^Alt Kisimda Promosyon yazisini gorur$")
    public void alt_kisimda_promosyon_yazisini_gorur(){
        basketPromotionInformationPage.searchFirstItemdetail.isDisplayed();
    }






}
