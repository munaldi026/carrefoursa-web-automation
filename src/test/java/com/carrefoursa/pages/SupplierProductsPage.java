package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SupplierProductsPage extends BasePage{


    @FindBy(css = ".item-name")
    public WebElement productNameFirstSupplier;


    @FindBy(xpath = "(//div[@class='modal-body'])[1]")
    public WebElement soldAloneProductMsg;

    @FindBy(xpath = "//button[@class='js-positive-btn btn btn-primary pull-right']")
    public WebElement goOnButton;

    @FindBy(xpath = "//button[normalize-space()='Vazgeç']")
    public WebElement giveUpButton;

    @FindBy(css = ".pr-name")
    public WebElement productInCartSecondSupplier;

    @FindBy(css = ".item-name")
    public WebElement productNameSecondSupplier;

    @FindBy(className = "pr-name")
    public static List<WebElement>cartList;

      public void verifyCartProductSameList(){

          List<String>expectedList=new ArrayList<>();
          expectedList.add("FOSSIL FES4610 Kadın Kol Saati");
          expectedList.add("FOSSIL FFS5517 Erkek Kol Saati");

          List<String>listOfProducts=new ArrayList<>();
          //System.out.println("cartList.size() = " + cartList.size());
          for (WebElement productlist:cartList) {
              listOfProducts.add(productlist.getText());
          }
          System.out.println("listOfProducts.size() = " + listOfProducts.size());
          System.out.println("expectedList = " + expectedList);
          System.out.println("listOfProducts = " + listOfProducts);
          Assert.assertEquals(expectedList,listOfProducts);

      }


       }





