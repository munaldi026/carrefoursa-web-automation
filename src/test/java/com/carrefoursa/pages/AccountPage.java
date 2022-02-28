package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountPage extends BasePage{

    @FindBy(css = "a[class='my-shoplist col-xs-12 col-sm-6 col-md-3 col-lg-3'] em[class='icon']")
    public WebElement ShoppingListIcon;
    @FindBy(xpath = "//span[@class='item-name']")
    public WebElement productInShoppingList;

    @FindBy(css = "a[class='my-orders col-xs-12 col-sm-6 col-md-3 col-lg-3'] em[class='icon']")
    public WebElement orderListIcon;

    @FindBy(css = ".box-title")
    public static List<WebElement>myAccountList;

    @FindBy(xpath = "//div[@class='f-link-block']/*/li")
    public List<WebElement>footerLinkLists;

    @FindBy(css = "div[class='container helperlinks-container'] div:nth-child(3) div:nth-child(1) div:nth-child(1)")
    public WebElement bottomWebElement;


    public List<String> getMyAccountList(){
        List<String>myAccountLinks=new ArrayList<>();

        for (WebElement each:myAccountList
             ) {
            myAccountLinks.add(each.getText());
        }
        System.out.println("MyAccontLinks.size() = " + myAccountLinks.size());
        System.out.println("MyAccountLinks = " + myAccountLinks);
        return myAccountLinks;

    }

    public List<String> getFooterLinkList(){
        List<String>FooterLinkList=new ArrayList<>();

        for (WebElement each:footerLinkLists
        ) {
            FooterLinkList.add(each.getText());

        }
        System.out.println("FooterLinkList.size() = " + FooterLinkList.size());
        System.out.println("FooterLinkList = " + FooterLinkList);
        return FooterLinkList;

    }

}
