package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.pages.CreditCardPage;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import com.carrefoursa.utilities.SmkConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Locale;

public class PaymentStepDefinitions {

    OrderPage orderPage=new OrderPage();

    CreditCardPage creditCardPage=new CreditCardPage();
    BasketPage basketPage=new BasketPage();
    HomePage homePage=new HomePage();



    @And("Arattigi urunun sepete eklendigini kontrol eder")
    public void arattigiUrununSepeteEklendiginiKontrolEder() {

        creditCardPage.verifyCartList();

//        String expectedProductName=null;
//        expectedProductName=Constants.searchOrderProductName;
//        System.out.println("expectedProductName = " + expectedProductName);
//        String actualProductName=creditCardPage.productInBasket.getText();
//        System.out.println("actualProductName = " + actualProductName);
//        Assert.assertTrue(actualProductName.contains(expectedProductName));

    }

    @Given("Odeme sekli olarak Kredi Karti secenegine tiklar")
    public void odeme_sekli_olarak_kredi_karti_secenegine_tiklar() {
        creditCardPage.payByCreditCard.click();

    }

    @Given("Kredi Karti bilgilerini doldurur")
    public void kredi_karti_bilgilerini_doldurur() {
        //creditCardPage.creditCardRadioButton.click();

        creditCardPage.fillCreditCardInformations();
        ReusableMethods.waitFor(1);
        orderPage.continueButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder")
    public void kullaniciKrediKartiylaOdemeninGerceklestiginiKontrolEder() {


        String url=Driver.getDriver().getCurrentUrl();
        System.out.println("url = " + url);

        String verifyOrderMsg = orderPage.completeOrderMsg.getText();
        System.out.println("COMPLETE ORDER MESSAGE = " + verifyOrderMsg.toUpperCase(Locale.ROOT));
        SmkConstants.orderNoText = orderPage.orderNo.getText();

        System.out.println("COMPLETED ORDER NO = " + SmkConstants.orderNoText.toUpperCase(Locale.ROOT));
        orderPage.completeOrderMsg.isDisplayed();

//        String creditCartMsgText = creditCardPage.verifyCreditCartMsg.getText();
//        System.out.println("creditCartMsgText = " + creditCartMsgText);
//        Assert.assertTrue(creditCardPage.verifyCreditCartMsg.isDisplayed());
    }


    @And("Odeme sekli olarak Kapida Nakit secenegine tiklar")
    public void odemeSekliOlarakKapidaNakitSecenegineTiklar() {
        creditCardPage.payByCashAtDelivery.click();

    }

    @And("Kapida nakit odeyin seceneginin secildigini kontrol eder")
    public void kapidaNakitOdeyinSecenegininSecildiginiKontrolEder() {
        creditCardPage.verifyPayByCashAtDelivery();

    }

    @And("Gelen pop-up uzerine gecerli guvenlik kodu girilir")
    public void gelenPopUpUzerineGecerliGuvenlikKoduGirilir() {

        Constants.securityCode=creditCardPage.getSecurityCodeFromPupup();
        ReusableMethods.waitFor(2);
        creditCardPage.securityPasswordBox.sendKeys(Constants.securityCode);
        creditCardPage.securityCodeSubmitButton.click();


    }
}
