package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PDPPage extends BasePage {

    HomePage homePage = new HomePage();

    @FindBy(xpath = "//a[@id='sm-16432698024011057-63']//span[@class='wrapper-menu-line']//span[1]")
    public WebElement subMenuWashingUP;

    @FindBy(xpath = "//a[contains(text(),'Bulaşık Deterjanları')]")
    public WebElement subMenuDishDetergents;

    @FindBy(xpath = "//span[contains(@class,'black-color')][normalize-space()='Temizlik Ürünleri']")
    public WebElement subMenuCleaningProducts;

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


}