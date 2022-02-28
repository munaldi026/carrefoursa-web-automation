package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.BasketPage;
import com.carrefoursa.pages.CreditCardPage;
import com.carrefoursa.pages.HomePage;
import com.carrefoursa.pages.OrderPage;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

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
        ReusableMethods.waitFor(3);

//        creditCardPage.creditCardNumberField.sendKeys(Constants.creditCardNumber);
//        creditCardPage.creditCardHolderNameField.sendKeys(Constants.creditCardHolderName);
//        Select month =new Select(creditCardPage.creditCardExpiryMonth);
//        month.selectByVisibleText(Constants.creditCardExpiryMonth);
//        Select year =new Select(creditCardPage.creditCardExpiryYear);
//        year.selectByVisibleText(Constants.creditCardExpiryYear);
//        creditCardPage.creditCardCVVField.sendKeys(Constants.creditCardCVV,Keys.TAB);

        //creditCardPage.creditCardNameField.sendKeys(Constants.creditCardName);
        //creditCardPage.mpSaveCardCheckBox.click();
    }

    @Then("Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder")
    public void kullaniciKrediKartiylaOdemeninGerceklestiginiKontrolEder() {

        String creditCartMsgText = creditCardPage.verifyCreditCartMsg.getText();
        System.out.println("creditCartMsgText = " + creditCartMsgText);
        Assert.assertTrue(creditCardPage.verifyCreditCartMsg.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();
        homePage.homePageButton.click();
    }


    @And("Odeme sekli olarak Kapida Nakit secenegine tiklar")
    public void odemeSekliOlarakKapidaNakitSecenegineTiklar() {
        creditCardPage.payByCashAtDelivery.click();

    }

    @And("Kapida nakit odeyin seceneginin secildigini kontrol eder")
    public void kapidaNakitOdeyinSecenegininSecildiginiKontrolEder() {
        creditCardPage.verifyPayByCashAtDelivery();

    }
}
