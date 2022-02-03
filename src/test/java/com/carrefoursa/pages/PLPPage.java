package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class PLPPage extends BasePage{
    @FindBy(css = ".form-control.cat-sorting-option")
    public WebElement smartSortOptions;
    @FindBy(xpath = "(//button[@class='btn btn-default btn-block js-add-to-cart js-add-to-cart-product-item'])[1]")
    public WebElement sepeteEklePLP;



    @FindBy(xpath = "//div[@class='hover-box']")
    public WebElement products;

    public String getValidationMessage() {
        WebElement username = Driver.getDriver().findElement(By.cssSelector(".added-to-cart-info"));
        String validationMessage = username.getAttribute("validationMessage");
        System.out.println("validationMessage = " + validationMessage);
        return validationMessage;
    }

    public void addToFirstProduct(){
        List<WebElement>products=Driver.getDriver().findElements(By.xpath("//div[@class='hover-box']"));
        products.get(0).click();

    }
    public void addToBasketButton(){
        List<WebElement>products=Driver.getDriver().findElements(By.cssSelector("#addToCartButton"));
        products.get(0).click();
    }

}
