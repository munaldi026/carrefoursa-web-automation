package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    HomePage homePage = new HomePage();
    PDPPage pdpPage = new PDPPage();
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

    @FindBy(partialLinkText = "İade Süreçlerimiz")
    public WebElement returnProcessButton;

    @FindBy(xpath = "(//a[@title='Market Alışverişlerinde'])[1]")
    public WebElement marketProcessLink;

    @FindBy(xpath = "(//a[@title='İnternet Alışverişlerinde'])[1]")
    public WebElement internetProcessLink;

    @FindBy(css = "#tabreview")
    public WebElement reviews;

    @FindBy(css = ".js-no-review")
    public WebElement reviewButton;

    @FindBy(xpath = "//input[@name='headline']")
    public WebElement reviewHeadlineTextBox;

    @FindBy(xpath = "//textarea[@name='comment']")
    public WebElement commentTextAreaBox;

    @FindBy(css = "span:nth-child(6)")
    public WebElement starsOfComment;

    @FindBy(css = "#alias")
    public WebElement nameTextAreaBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
    public WebElement reviewSubmitButton;

    @FindBy(xpath = "//div[@class='alert alert-info alert-dismissable']")
    public WebElement verifyComment;

    @FindBy(xpath = "//div[@id='alternativeProductOptions_0']//span[@class='radiomark']")
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

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
    public WebElement plusButtonInCart;


    public int getPriceFromBasket() {
        String priceInBasketText = priceInBasket.getText();
        System.out.println("priceInBasketText = " + priceInBasketText);
        String priceInBasketText1 = priceInBasketText.replace(",", "")
                .replace("TL", "").trim();
        int price = Integer.parseInt(priceInBasketText1);
        return price;
    }
    public void searchSupplierProductSame1(String productName) {
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.soldAloneProductSame1);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void searchSacrificialName() {
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.sacrificialName);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void searchSupplierProductSame2(String productName) {
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.soldAloneProductSame2);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }
    public void soldAloneProductDifferent(String productName) {
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.soldAloneProductDifferent);
        homePage.searchButton.click();

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
        ReusableMethods.waitForPageToLoad(1);
        homePage.searchField.click();
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
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.certainProductIdForPDP);
        homePage.searchButton.click();

//        try {
//            homePage.informationPop_up.click();
//        } catch (Exception e) {
//            System.out.println("Bilgilendirme Pop-up yok");
//        }
    }

    public void searchAlternativeProduct() {
        //ReusableMethods.waitForPageToLoad(5);
        homePage.searchField.click();
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
            plusButtonInCart.click();
            ReusableMethods.waitFor(1);
            plusButtonInCart.click();
            ReusableMethods.waitFor(1);
            plusButtonInCart.click();
            ReusableMethods.waitFor(1);
            plusButtonInCart.click();
            ReusableMethods.waitFor(1);
            plusButtonInCart.click();
        }


    }
