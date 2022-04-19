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

    @And("^Kullanıcı 2 al 1 öde ürününü aratır$")
    public void kullanciUrunAratir()  {
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
    public void sepetim_sayfasnda_alt_ksmnda_sar_uyar_yazs_grlr(){
        basketPromotionInformationPage.yellowwarning.isDisplayed();
    }

}
