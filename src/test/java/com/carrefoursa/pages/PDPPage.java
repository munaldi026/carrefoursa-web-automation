package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PDPPage extends BasePage {

    HomePage homePage = new HomePage();
    AccountPage accountPage=new AccountPage();
    String selectedProductText = null;

    @FindBy(xpath = "//a[@id='sm-16432698024011057-63']//span[@class='wrapper-menu-line']//span[1]")
    public WebElement subMenuWashingUP;

    @FindBy(xpath = "//a[contains(text(),'Bulaşık Deterjanları')]")
    public WebElement subMenuDishDetergents;

    @FindBy(xpath = "//span[contains(@class,'black-color')][normalize-space()='Temizlik Ürünleri']")
    public WebElement subMenuCleaningProducts;

    @FindBy(xpath = "//span[contains(@class,'black-color')][contains(text(),'Katalog Ürünleri, Fırsatlar')]")
    public WebElement subMenuCatalogProducts1;

    @FindBy(xpath = "//span[@class='black-color font-bold'][normalize-space()='Katalog Ürünleri']")
    public WebElement subMenuCatalogProducts;

    @FindBy(xpath = "//a[contains(text(),'Algida')]")
    public WebElement promotionFlagTrue;

    @FindBy(xpath = "//a[normalize-space()='false']")
    public WebElement promotionFlagFalse;

    @FindBy(xpath = "//span[@class='facet-val']")
    public WebElement verifyFalseFlag;

    @FindBy(className = "camp-badge")
    public static List<WebElement>flags;

    @FindBy(xpath = "(//div[@class='hover-box'])[1]")
    public WebElement selectedProduct;


    @FindBy(xpath = "//h1[normalize-space()='Carrefour Wc Tropikal Blok 40 g']")
    public WebElement PDPProductName;

    @FindBy(css = "#productFavorite")
    public WebElement addShoppingListLink;

    @FindBy(css = ".thumb")
    public WebElement productInShoppingList;

    @FindBy(css = ".emptyFavoriteList")
    public WebElement emptyFavoriteList;

    @FindBy(css = "#productFavorite")
    public WebElement removeShoppingListLink;

    @FindBy(xpath = "//button[@class='btn btn-primary js-add-to-cart js-add-to-cart-product-detail']")
    public WebElement addToBasketButton;

    @FindBy(css = "div[class='details'] a[class='pr-name']")
    public WebElement productInBasket;

    @FindBy(css = "#link_30207311")
    public WebElement shoppingProductClose;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
    public WebElement plusIconInPDP;

    @FindBy(css = "a[class='name']")
    public WebElement sacrificialInMiniCart;

    @FindBy(css = "li[class='yCmsComponent'] a[title='Katalog Ürünleri, Fırsatlar']")
    public WebElement opportunitiesLink;

    @FindBy(xpath = "//h2[contains(text(),'Fırsatlar')]")
    public WebElement opportunitiesAllLink;



    @FindBy(css = ".product_click")
    public List<WebElement> shoppingList;





    public List<String> getFlagList(){
        List<String>flagList=new ArrayList<>();

        for (WebElement element:flags
        ) {
            flagList.add(element.getText());
        }
        System.out.println("flagList.size() = " + flagList.size());
        System.out.println("flagList = " + flagList);

        return flagList;
    }

    public String getProductCodeFromPLP(){
        String productCode=null;
        productCode=Driver.getDriver().findElement(By.cssSelector(".item-name")).getAttribute("content");
        return productCode;

    }

    public String getSacrificialFromMiniCart(){

        String sacrificialName=sacrificialInMiniCart.getText();
        return sacrificialName;

    }


    public int getIntProductCodeFromPLP(){
        String productCode=null;
        productCode=Driver.getDriver().findElement(By.cssSelector(".item-name")).getAttribute("content");
        int code =Integer.parseInt(productCode);
        return code;

    }
    public List<String> getShoppingList(){
        List<String>newShoppingList=new ArrayList<>();
        for (WebElement element:shoppingList
        ) {
            newShoppingList.add(element.getText());
        }
        System.out.println("newShoppingList.size() = " + newShoppingList.size());
        System.out.println("newShoppingList = " + newShoppingList);
        return newShoppingList;
    }

    public void verifyAddProductInShoppingList(){
        ReusableMethods.clickFunction(homePage.myAccount);
        ReusableMethods.clickFunction(accountPage.ShoppingListIcon);
        Driver.getDriver().navigate().refresh();
        selectedProductText = Constants.certainProductIdForPDP;
        Assert.assertTrue(getShoppingList().toString().contains(selectedProductText));
    }

        }




