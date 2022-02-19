package com.carrefoursa.pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Carrefour Eski Kaşar')]//b[contains(text(),'Peynir')]")
    public WebElement searchdisplay;
    @FindBy(css = "li[class='active']")
    public WebElement getSearchdisplay1;
    @FindBy(className = "seg-qa-title")
    public WebElement popularproducttitle;

    @FindBy(id = "closePopupSearchEmpty")
    public WebElement informationAboutsearchButton;

    @FindBy(css= "div[id='cboxLoadedContent'] p")
    public WebElement informationAboutsearchMsg;

    public void searchMsg(){
        String aboutsearchMsgText = informationAboutsearchMsg.getText();
        System.out.println("aboutsearchMsgText = " + aboutsearchMsgText);
        Assert.assertTrue(informationAboutsearchMsg.isDisplayed());
    }


}