package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import com.carrefoursa.utilities.SmkConstants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "//h2[normalize-space()='Adreslerim']")
    public WebElement addressPageTitle;


    @FindBy(xpath = "(//a[@class='editAddressLink'])[1]")
    public WebElement addresseditbutton;

    @FindBy(id="address_addnew_button")
    public WebElement editbutton;

    @FindBy(xpath = "//*[contains(text(),'NttData2')]")
    public WebElement editaddress;

    @FindBy(xpath = "(//a[@class='removeAddressFromBookButton'])[2]")
    public WebElement addressdeletbutton;

    @FindBy(xpath = "(//a[@class='btn btn-default deleteAddressLink'])[2]")
    //a[@class='btn btn-default deleteAddressLink']
    //a[@class='btn btn-default deleteAddressLink'])[2]
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

    @FindBy(id = "addressCustomerTypeEnterprise")
    public WebElement corporate;

    @FindBy(css = ".form-control[id='address.companyName']")
    public WebElement companyname;

    @FindBy(css = ".form-control[id='address.taxNumber']")
    public WebElement taxidentificationnumber;

    @FindBy(id = "companyName.errors")
    public WebElement companyNameErrors;

    @FindBy(id = "taxNumber.errors")
    public WebElement taxNumberErrors;

    @FindBy(css = "#addressCustomerTypeEnterprise")
    public WebElement corporateAddressType;

    @FindBy(css = "#addressCustomerTypeConsumer")
    public WebElement individualAddressType;

    @FindBy(className = "removeAddressFromBookButton")
    public List<WebElement> deleteAddressList;

    @FindBy(xpath = "//a[@class='btn btn-default deleteAddressLink']")
    public List<WebElement> deleteConfirmButtonList;

    @FindBy(css = ".editAddressLink")
    public List<WebElement> editAddressList;



    public void getDeleteConfirmButtonList(){
//        List<String>confirmList=new ArrayList<>();
//        for (WebElement element:deleteConfirmButtonList
//        ) {
//            confirmList.add(element.getText());
//        }
//        System.out.println("confirmList.size() = " + confirmList.size());
//        System.out.println("confirmList = " + confirmList);
        deleteConfirmButtonList.get(1).click();

    }


    public void getDeleteAddressList(){
//        List<String>deleteList=new ArrayList<>();
//        for (WebElement element:deleteAddressList
//             ) {
//            deleteList.add(element.getText());
//        }
//        System.out.println("addressList.size() = " + deleteList.size());
//        System.out.println("addressList = " + deleteList);
//        if (deleteAddressList.size()==1){
//            deleteAddressList.get(0).click();
//        }deleteAddressList.get(1).click();
deleteAddressList.get(0).click();
    }
    public void fillCorporateAddressForm(){
        addresstype.clear();
        addresstype.sendKeys(SmkConstants.corporateAddressType);
        companyname.clear();
        companyname.sendKeys(SmkConstants.companyName);
        taxidentificationnumber.clear();
        taxidentificationnumber.sendKeys(SmkConstants.taxIdentificationNumber);
        addresscityCode.click();
        addresstownCode.click();
        addressdistrictCode.click();
        address.clear();
        address.sendKeys(SmkConstants.corporateAddress);
        email.clear();
        email.sendKeys(SmkConstants.corporateEmail);
        phonenumber.clear();
        phonenumber.sendKeys(SmkConstants.corporatePhone);
        ReusableMethods.waitFor(3);
    }
    public void fillIndividualAddressForm(){
        addresstype.clear();
        addresstype.sendKeys(SmkConstants.individualAddressType);
        firstname.clear();
        firstname.sendKeys(SmkConstants.firstName);
        lastname.clear();
        lastname.sendKeys(SmkConstants.lastName);
        addresscityCode.click();
        addresstownCode.click();
        addressdistrictCode.click();
        address.clear();
        address.sendKeys(SmkConstants.corporateAddress);
        email.clear();
        email.sendKeys(SmkConstants.corporateEmail);
        phonenumber.clear();
        phonenumber.sendKeys(SmkConstants.corporatePhone);

    }
    public void getChangedFirstName(){
        System.out.println("expectedFirstName = " + SmkConstants.changedFirstName);
        String  actualFirstName = Driver.getDriver().findElement(By.id("address.firstName")).getAttribute("value");
        System.out.println("actualFirstName = " + actualFirstName);
        Assert.assertEquals(SmkConstants.changedFirstName,actualFirstName);

    }


}
