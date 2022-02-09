package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    HomePage homePage=new HomePage();
    PDPPage pdpPage=new PDPPage();
    OrderPage orderPage=new OrderPage();

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

    @FindBy(xpath= "(//a[@title='İnternet Alışverişlerinde'])[1]")
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


    public void selectProduct(){
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
    public void searchProduct(String productName){
        ReusableMethods.waitForPageToLoad(5);
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.searchOrderProductName);
        homePage.searchButton.click();

        try {
            homePage.informationPop_up.click();
        } catch (Exception e) {
            System.out.println("Bilgilendirme Pop-up yok");
        }

    }
}
