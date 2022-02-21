package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage{
    @FindBy(xpath = "(//*[contains(text(),'Adreslerim')])[2]")
    public WebElement addressButton;

    @FindBy(id = "add-new-address")
    public WebElement newAddress;

    @FindBy(css = ".form-control[id='address.addressClass']")
    public WebElement addresstype;

    @FindBy(css = ".form-control[id='address.firstName']")
    public WebElement firstname;

    @FindBy(css = ".form-control[id='address.lastName']")
    public WebElement lastname;

    @FindBy(css = ".form-control[id='address.tckn']")
    public WebElement tc;

    @FindBy(css = ".form-control[id='address.cityCode']")
    public WebElement addresscityCode;

    @FindBy(css = ".form-control[id='address.townCode']")
    public WebElement addresstownCode;

    @FindBy(css = ".form-control[id='address.districtCode']")
    public WebElement addressdistrictCode;

    @FindBy(css = ".form-control[id='address.streetname']")
    public WebElement address;

    @FindBy(css = ".form-control[id='address.email']")
    public WebElement email;

    @FindBy(css = ".form-control[id='address.mobilePhoneNumber']")
    public WebElement phonenumber;

    @FindBy(css = ".btn-block[id='address_addnew_button']")
    public WebElement addresssavebutton;

    @FindBy(xpath = "//*[contains(text(),'NttData')]")
    public WebElement saveaddressname;

    @FindBy(xpath = "(//a[@class='editAddressLink'])[2]")
    public WebElement addresseditbutton;

    @FindBy(id="address_addnew_button")
    public WebElement editbutton;

    @FindBy(xpath = "//*[contains(text(),'NttData2')]")
    public WebElement editaddress;

    @FindBy(xpath = "(//a[@class='removeAddressFromBookButton'])[2]")
    public WebElement addressdeletbutton;

    @FindBy(xpath = "(//a[@class='btn btn-default deleteAddressLink'])[3]")
    public WebElement yespopupbutton;

    @FindBy(id = "addressClass.errors")
    public WebElement addressErrorsMessage;

    @FindBy(id = "firstName.errors")
    public WebElement firstNameError;

    @FindBy(id = "lastName.errors")
    public WebElement lastNameError;

    @FindBy(xpath = "(//span[@id='townCode.errors'])[2]")
    public WebElement townError;

    @FindBy(xpath = "(//span[@id='districtCode.errors'])[2]")
    public WebElement districtError;

    @FindBy(xpath = "(//span[@id='streetname.errors'])[2]")
    public WebElement addressError;

    @FindBy(id = "email.errors")
    public WebElement emailError;

    @FindBy(id = "mobilePhoneNumber.errors")
    public WebElement phoneNumberError;
}
