package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.pages.ProductPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartOrderAmountStepDefinitions {

    ProductPage productPage=new ProductPage();
    OrderPage orderPage=new OrderPage();

    @Given("Kullanici tutari {int} TL' den az olan bir urun aratir")
    public void kullanici_tutari_tl_den_az_olan_bir_urun_aratir(Integer int1) {
        productPage.searchCertainProduct(Constants.certainProductIdForPDP);

    }
    @Then("Sepet tutarinin Minimum Siparis Tutarina ulasmadigini kontrol eder")
    public void sepet_tutarinin_minimum_siparis_tutarina_ulasmadigini_kontrol_eder() {

        String priceTotalAmount="60,00 TL";
        System.out.println("priceTotalAmount = " + priceTotalAmount);
        String price = orderPage.productPriceForOrderAmount.getText();
        System.out.println("price = " + price);
        String totalAmountMsgText = orderPage.orderTotalAmountMsg.getText();
        System.out.println("totalAmountMsgText = " + totalAmountMsgText);
        Assert.assertTrue(orderPage.orderTotalAmountMsg.isDisplayed());
    }
    @Given("Kullanici tutari {int} TL ya da uzeri olan bir urun arartir")
    public void kullanici_tutari_tl_ya_da_uzeri_olan_bir_urun_arartir(Integer int1) {
        productPage.searchProduct(Constants.searchProduct);
    }
    @Then("Sepet tutarinin Minimum Siparis Tutarina ulasmis oldugunu kontrol eder")
    public void sepet_tutarinin_minimum_siparis_tutarina_ulasmis_oldugunu_kontrol_eder() {

        String priceTotalAmount="60,00 TL";
        System.out.println("priceTotalAmount = " + priceTotalAmount);
        String strPrice =priceTotalAmount.replace(",","").replace("TL","").trim();
        int endPrice=Integer.parseInt(strPrice);
        System.out.println("endPrice = " + endPrice);
        String price = orderPage.productPriceForOrderAmount.getText();
        System.out.println("price = " + price);
        String strPrice1 =price.replace(",","").replace("TL","").trim();
        int endPrice1=Integer.parseInt(strPrice1);
        System.out.println("endPrice = " + endPrice);
        System.out.println("endPrice1 = " + endPrice1);
        Assert.assertTrue(endPrice<endPrice1);

    }


}
