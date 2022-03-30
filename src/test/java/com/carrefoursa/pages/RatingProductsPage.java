package com.carrefoursa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RatingProductsPage extends BasePage{

    @FindBy(css = ".thxforreview")
    public WebElement verifyRatingMsgText;

    @FindBy(css = "#tabreview")
    public WebElement ratingProductTitle;

    @FindBy(css = ".js-no-review")
    public WebElement ratingButton;

    @FindBy(xpath = "//input[@name='headline']")
    public WebElement reviewHeadlineTextBox;

    @FindBy(xpath = "//textarea[@name='comment']")
    public WebElement commentTextAreaBox;

    @FindBy(xpath = "//span[6]")
    public WebElement starsOfRating;

    @FindBy(css = "#alias")
    public WebElement nameTextAreaBox;

    @FindBy(xpath = "//span[@id='alias.errors']")
    public WebElement aliasErrorMsg;

    @FindBy(id = "rating.errors")
    public WebElement ratingErrorMsg;

    @FindBy(css = "button[value='Değerlendir']")
    public WebElement ratingSubmitButton;

    @FindBy(xpath = "//div[@class='alert alert-info alert-dismissable']")
    public WebElement verifyComment;

    @FindBy(css = ".alert.alert-danger.alert-dismissable")
    public WebElement alert_DismissableOfRating;




    public String successVerifyRatingProductText(){
        String ratingMsgText = verifyRatingMsgText.getText();
        System.out.println("ratingMsgText = " + ratingMsgText);
        Assert.assertTrue(verifyRatingMsgText.isDisplayed());
        return ratingMsgText;

        }
    public String unSuccessVerifyRatingProductAlias(){
        String aliasErrorMsgText = aliasErrorMsg.getText();
        System.out.println("aliasErrorMsgText = " + aliasErrorMsgText);
        Assert.assertTrue(aliasErrorMsg.isDisplayed());
        return aliasErrorMsgText;
    }
    public String unSuccessVerifyRatingProductRating(){
        String ratingErrorMsgText = ratingErrorMsg.getText();
        System.out.println("ratingErrorMsgText = " + ratingErrorMsgText);
        Assert.assertTrue(ratingErrorMsg.isDisplayed());
        return ratingErrorMsgText;
    }
}
