package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAddressPage {

    @FindBy(id = "addressClass.errors")
    public WebElement addressErrMsg;

    @FindBy(id = "firstName.errors")
    public WebElement firstNameErrMsg;

    @FindBy(id = "lastName.errors")
    public WebElement lastNameErrMsg;

    @FindBy(id = "streetname.errors")
    public WebElement streetnameErrMsg;

    @FindBy(id = "email.errors")
    public WebElement emailErrMsg;

    @FindBy(id = "mobilePhoneNumber.errors")
    public WebElement mobilePhoneNumberErrMsg;
}
