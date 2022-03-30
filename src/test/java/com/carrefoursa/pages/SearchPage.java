package com.carrefoursa.pages;
import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.messages.internal.com.google.common.collect.Range;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchPage extends BasePage {
    HomePage homePage=new HomePage();

    @FindBy(xpath = "//span[contains(text(),'Carrefour Eski Kaşar')]//b[contains(text(),'Peynir')]")
    public WebElement searchDisplay;

     @FindBy(css = ".ui-menu-item")
     public List<WebElement>searchItemList;

     @FindBy(css = ".item-name")
     public List<WebElement>searchItemList1;

    @FindBy(css = "li[class='active']")
    public WebElement getSearchDisplay1;

    @FindBy(className = "seg-qa-title")
    public WebElement popularproducttitle;

    @FindBy(id = "closePopupSearchEmpty")
    public WebElement informationAboutsearchButton;

    @FindBy(css= "div[id='cboxLoadedContent'] p")
    public WebElement informationAboutsearchMsg;


    public List<String> getSearchItemList(){
        List<String>itemList=new ArrayList<>();
        for (WebElement el:searchItemList
             ) {
            itemList.add(el.getText());
        }
        String searchProduct =Constants.searchProduct1;
        System.out.println("SearchProduct = " + searchProduct);
        System.out.println("First Item    = " + itemList.get(0));
        Assert.assertTrue(itemList.get(0).contains("Peynir"));

        return itemList;

    }

    public List<String> getSearchItemList1(){
        List<String>itemList1=new ArrayList<>();
        for (WebElement el:searchItemList1
        ) {
            itemList1.add(el.getText());
        }
        String searchProduct =Constants.searchProduct1;
        System.out.println("SearchProduct = " + searchProduct);
        System.out.println("First Item    = " + itemList1.get(0));
        Assert.assertTrue(itemList1.get(0).contains("Peynir"));

        return itemList1;

    }

    public void searchMsg(){
        String aboutSearchMsgText = informationAboutsearchMsg.getText();
        System.out.println("Single Letter for searching :"+Constants.singleLetter);
        System.out.println("aboutSearchMsgText = " + aboutSearchMsgText);
        Assert.assertTrue(informationAboutsearchMsg.isDisplayed());
    }
    public void searchProduct1(){
        ReusableMethods.waitFor(2);
        homePage.searchField.click();
        ReusableMethods.waitFor(1);
        homePage.searchField.sendKeys(Constants.searchProduct1);
        ReusableMethods.waitFor(1);

    }
    public void searchProductBySingleLetter(){
        ReusableMethods.waitFor(2);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.singleLetter);
        ReusableMethods.waitFor(1);
    }

}
