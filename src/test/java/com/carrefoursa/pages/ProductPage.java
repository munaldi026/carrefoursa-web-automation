package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import com.carrefoursa.utilities.SmkConstants;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {
    HomePage homePage = new HomePage();
    PDPPage pdpPage = new PDPPage();
    OrderPage orderPage=new OrderPage();
    Actions actions=new Actions(Driver.getDriver());

    @FindBy(xpath = "//span[contains(@class,'black-color')][contains(text(),'Gıda, Şekerleme')]")
    public WebElement subMenuSweet;

    @FindBy(css = "(//li[@class='col-xs-4 col-sm-3 col-md-3 col-lg-2 product-listing-item'])[1]")
    public WebElement selectedProduct;

    @FindBy(css = ".product-details-tab.tab-details")
    public WebElement explanationsOfProduct;

    @FindBy(css = "#tabinstallment")
    public WebElement installmentLink;

    @FindBy(css = "#no_installment")
    public WebElement verifyInstallment;

    @FindBy(xpath = "//a[@class='js-payment-tabs-head undefined'][contains(text(),'Garanti & İade')]")
    public WebElement guaranteeLink;

    @FindBy(css = "a[class='btn btn-primary']")
    public WebElement returnProcessButton;

    @FindBy(xpath = "(//a[@title='Market Alışverişlerinde'])[1]")
    public WebElement marketProcessLink;

    @FindBy(xpath = "(//a[@title='İnternet Alışverişlerinde'])[1]")
    public WebElement internetProcessLink;



    @FindBy(css = "div[id='alternativeProductOptions_0'] span[class='radiomark']")
    public WebElement radioButtonInBasket;


    @FindBy(xpath = "//input[@name='alternativeProductItemCheckbox']")
    public WebElement alternativeItemCheckbox;

    @FindBy(xpath = "//button[@id='setSelectedProduct']")
    public WebElement selectAlternativeProductButton;

    @FindBy(css = "#selectedSubstituteProduct_0")
    public WebElement selectedAlternativeProductName;

    @FindBy(css = ".price.one")
    public WebElement priceInBasket;

    @FindBy(css = "//b[contains(text(),'Carrefour Bulaşık Makinesi Tableti 50 li')]")
    public WebElement searchFieldFirsItem;

    @FindBy(xpath = "//button[@class='btn btn-primary vuejs-qty-selector-plus']//span[@class='glyphicon glyphicon-plus']")
    public WebElement plusButtonInCart;

    @FindBy(xpath = "//button[@class='btn btn-primary js-qty-selector-plus']")
    public WebElement plusButtonInPDP;

    @FindBy(xpath = "//table[@class='installment-item__table table']")
    public List<WebElement> installmentTableList;








    public String getInstallmentTableList(){
        List<String>newInstallmentTableList=new ArrayList<>();
        for (WebElement element:installmentTableList
        ) {
            newInstallmentTableList.add(element.getText());
        }
        System.out.println("newInstallmentTableList.size() = " + newInstallmentTableList.size());
        System.out.println("newInstallmentTableList = " + newInstallmentTableList);
        String installmentTable = newInstallmentTableList.get(0);
        System.out.println("installmentTable = " + installmentTable);

        return installmentTable;

    }





    public int getPriceFromBasket() {
        String priceInBasketText = priceInBasket.getText();
        System.out.println("priceInBasketText = " + priceInBasketText);
        String priceInBasketText1 = priceInBasketText.replace(",", "")
                .replace("TL", "").trim();
        int price = Integer.parseInt(priceInBasketText1);
        return price;
    }
    public void searchSupplierProductSame1(String productName) {

        ReusableMethods.retryingFindClick();
        ReusableMethods.waitForClickablility(homePage.searchButton,3);
        homePage.searchField.sendKeys(Constants.soldAloneProductSame1);
        ReusableMethods.waitFor(1);
        homePage.searchButton.click();
        ReusableMethods.waitFor(1);

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void searchSacrificialName() {
        ReusableMethods.retryingFindClick();
        ReusableMethods.waitForClickablility(homePage.searchButton,3);
        homePage.searchField.sendKeys(Constants.sacrificialName);
        homePage.searchButton.click();
        ReusableMethods.waitFor(1);

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void searchSupplierProductSame2(String productName) {
        ReusableMethods.waitForClickablility(homePage.searchButton,3);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.soldAloneProductSame2);
        homePage.searchButton.click();
        ReusableMethods.waitFor(1);

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void soldAloneProductDifferent(String productName) {
        ReusableMethods.waitForClickablility(homePage.searchButton,3);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.soldAloneProductDifferent);
        homePage.searchButton.click();
        ReusableMethods.waitFor(1);

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }


    public void selectProduct() {
        ReusableMethods.scrollToElement(homePage.category);
        ReusableMethods.hover(homePage.category);
        ReusableMethods.scrollToElement(pdpPage.subMenuCleaningProducts);
        pdpPage.subMenuCleaningProducts.click();
        try {
            homePage.informationPop_up.click();
        } catch (Exception e) {
            System.out.println("Bilgilendirme Pop-up yok");
        }
    }

    public void searchProduct() {

        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.searchOrderProductName);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }

    }

    public void searchCertainProduct(String productName) {
        ReusableMethods.waitForPageToLoad(5);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.certainProductIdForPDP);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }

    public void searchAlternativeProduct() {

        ReusableMethods.waitForPageToLoad(5);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.alternativeproductForPDP);
        homePage.searchButton.click();
//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }

            public void maxSearchCertainProduct () {
            ReusableMethods.waitFor(1);
            plusButtonInPDP.click();
            ReusableMethods.waitFor(1);
            plusButtonInPDP.click();
            ReusableMethods.waitFor(1);
            plusButtonInPDP.click();
            ReusableMethods.waitFor(1);
            plusButtonInPDP.click();
        }


    public void searchInstallmentProduct() {

        ReusableMethods.waitFor(1);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(SmkConstants.searchInstallmentProduct);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void verifyMinimumAmountPlus(){
        String priceTotalAmount="60,00 TL";
        System.out.println("priceTotalAmount = " + priceTotalAmount);
        String strPrice =priceTotalAmount.replace(",00 TL","").trim();
        int endPrice=Integer.parseInt(strPrice);
        System.out.println("endPrice = " + endPrice);
        String price = orderPage.productPriceForOrderAmount.getText();
        System.out.println("price = " + price);
        String strPrice1 =price.replace(",","").replace("TL","").substring(0,2).trim();
        int endPrice1=Integer.parseInt(strPrice1);
        System.out.println("Default Total Price = " + endPrice);
        System.out.println("Current Total Price = " + endPrice1);
        Assert.assertTrue(endPrice<endPrice1);

           }
    public void verifyMinimumAmount(){
        String priceTotalAmount="60,00 TL";
        System.out.println("priceTotalAmount = " + priceTotalAmount);
        String price = orderPage.productPriceForOrderAmount.getText();
        System.out.println("price = " + price);
        String totalAmountMsgText = orderPage.orderTotalAmountMsg.getText();
        System.out.println("totalAmountMsgText = " + totalAmountMsgText);
        Assert.assertTrue(orderPage.orderTotalAmountMsg.isDisplayed());
    }


    }
