package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SacrificialPage extends BasePage{

    BasketPage basketPage=new BasketPage();
    HomePage homePage=new HomePage();
    PDPPage pdpPage=new PDPPage();

    @FindBy(css = "a[class='name']")
    public WebElement sacrificialtemMiniCart;

    @FindBy(xpath = "//div[@class='checkout-headline']")
    public WebElement grantorAndDonationPage;

    @FindBy(xpath = "//input[@id='grantorName']")
    public WebElement grantorNameField;

    @FindBy(css = "#donated")
    public WebElement donatedCheckBox;

    @FindBy(xpath = "//span[contains(text(),'Bağış yapmak istiyorum')]")
    public WebElement getDonatedCheckBoxLine;

    @FindBy(css = "#organizationCode")
    public WebElement selectDropdownMenu;

    @FindBy(css = "#cash_at_delivery")
    public WebElement cashAtDeliveryLink;

    @FindBy(xpath = "(//input[@class='paymentSlotRadio'])[2]")
    public WebElement paymentSlotRadio;

    @FindBy(css = "#orderNote")
    public WebElement orderNoteField;

    @FindBy(xpath = "//span[contains(text(),'Siparişiniz CarrefourSA tarafından \"Türkiye Omuril')]")
    public WebElement verifyDonatedOrganizationName;

    @FindBy(id = "grantorName.errors")
    public WebElement grantorNameError;


    @FindBy(css = ".js-negative-btn")
    public WebElement giveUPButtonForSacrificial;

    public void getItemInMiniCart() {

        List<String> listOfProducts = new ArrayList<>();
        for (WebElement productlist : basketPage.miniCartList) {
            listOfProducts.add(productlist.getText());
        }
        System.out.println("listOfProducts.size() = " + listOfProducts.size());
        if (listOfProducts.contains(sacrificialtemMiniCart.getText())){
            System.out.println("Kurbanlik basariyla sepete eklenmistir");
        }else{
            System.out.println("Kurbanlik sepete eklenememistir");
        }

    }
    public void verifygrantorAndDonationPage(){
        String donationPageTitleText = grantorAndDonationPage.getText();
        System.out.println("grantorAndDonationPageTitle = " + donationPageTitleText);
        Assert.assertTrue(grantorAndDonationPage.isDisplayed());
    }
    public void getVerifyMissingInformation(){
        String nameEmptyText = grantorNameError.getText();
        System.out.println("nameEmptyText = " + nameEmptyText);
        Assert.assertTrue(grantorNameError.isDisplayed());
        System.out.println("Sistem Eksik Bilgilerle devam edilmesine izin vermemektedir");
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();
        homePage.homePageButton.click();
    }

    public void getVerifySoldAloneSacrificial() {

        ReusableMethods.hover(homePage.myBasket);
        String soldAloneSacrificial = pdpPage.getSacrificialFromMiniCart();
        System.out.println("soldAloneSacrificial = " + soldAloneSacrificial);
        String addedSecondProduct = Constants.certainProductIdForPDP;
        System.out.println("addedSecondProduct = " + addedSecondProduct);
        Assert.assertNotEquals(soldAloneSacrificial, (Constants.certainProductIdForPDP));
        System.out.println("Sepette bulunan ve Tek basina satilan urun olan Kurbanlik, silinememektedir.");
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();
        homePage.homePageButton.click();

    }

}
