package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PLPPage extends BasePage {
    @FindBy(css = ".form-control.cat-sorting-option")
    public WebElement smartSortOptions;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-block js-add-to-cart js-add-to-cart-product-item'])[1]")
    public WebElement sepeteEklePLP;
    @FindBy(xpath = "//span[contains(@class,'black-color')][normalize-space()='Et, Balık, Kümes']")
    public WebElement subMenuMeatandFishProducts;

    @FindBy(xpath = "//span[contains(@class,'black-color')][normalize-space()='Kırmızı Etler']")
    public WebElement meatandFishSubProducts;

    @FindBy(xpath = "(//span[normalize-space()='Kampanyalar'])[1]")
    public WebElement campaigns;

    @FindBy(xpath = "(//h3[@class='campaign-title'])[1]")
    public WebElement campaignstitle;

    @FindBy(xpath = "//a[@href='#product-campaigns']")
    public WebElement discountedproducts;

    @FindBy(xpath = "(//*[contains(text(),'Api̇koğlu')])")
    public WebElement apikogluproducts;

    @FindBy(xpath = "(//*[contains(text(),'APİKOĞLU')])[4]")
    public WebElement apikogluproduct;

    @FindBy(xpath = "(//*[contains(text(),'Balık ve Deniz Mahsülleri')])[2]")
    public WebElement category;

    @FindBy(xpath = "(//*[contains(text(),'0 TL - 49,99 TL')])")
    public WebElement price;

    @FindBy(xpath = "//div[@class='hover-box']")
    public List<WebElement> products;

    @FindBy(css = "#addToCartButton")
    public List<WebElement> buttons;

    public String getValidationMessage() {
        WebElement username = Driver.getDriver().findElement(By.cssSelector(".added-to-cart-info"));
        String validationMessage = username.getAttribute("validationMessage");
        System.out.println("validationMessage = " + validationMessage);
        return validationMessage;
    }

    public void addToFirstProduct() {
        List<WebElement> products = Driver.getDriver().findElements(By.xpath("//div[@class='hover-box']"));
        products.get(0).click();
    }

    public void addToBasketButton() {
        List<WebElement> buttons = Driver.getDriver().findElements(By.cssSelector("#addToCartButton"));
        buttons.get(0).click();
        ReusableMethods.waitFor(1);
    }

    public void addToBasketButtonPromotion() {
        List<WebElement> buttons = Driver.getDriver().findElements(By.cssSelector("#addToCartButton"));
        buttons.get(1).click();
        ReusableMethods.waitFor(1);
    }
        public void addToSartificialButton () {
            //List<WebElement>products=Driver.getDriver().findElements(By.cssSelector("#addToCartButton"));
            products.get(2).click();
        }

    }

