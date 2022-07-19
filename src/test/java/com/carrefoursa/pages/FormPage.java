package com.carrefoursa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage{


    @FindBy(className = "text-danger")
    public WebElement nameErrorMessage;

    @FindBy(id = "js-mobile-phone")
    public WebElement mobilPhoneTextField;

    @FindBy(xpath = "(//i[@class='icon-call-center'])[2]")
    public WebElement youListing;

    @FindBy(xpath = "//input[@name='fullName']")
    public WebElement youListingFullName;

    @FindBy(xpath = "//input[@name='mobilePhone']")
    public WebElement youListingMobilPhone;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement youListingEmail;

    @FindBy(xpath = "//select[@name='notificationType']")
    public WebElement youListingNotification;

    @FindBy(xpath = "//*[contains(text(),'Şikayet')]")
    public WebElement youListingNotificationType;
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement youListingDescription;
    @FindBy(xpath ="//div[@class='recaptcha-checkbox-checkmark']")
    public WebElement youListingCaptcha;

    @FindBy(xpath = "//a[@href='mailto:bilgi@carrefoursa.com']")
    public WebElement youListingCorporateEmail;
    @FindBy(xpath = "//a[@href='/kvkk-dinliyoruz']")
    public WebElement youListingLightingText;

    @FindBy(xpath = "//*[contains(text(),'CARREFOURSA CARREFOUR SABANCI TİCARET MERKEZİ A.Ş. SİZİ DİNLİYORUZ İLETİŞİM FORMU AYDINLATMA METNİ')]")
    public WebElement youListingLightingTextPage;




    @FindBy(xpath = "//button[@class='btn btn-primary btn-block js-google-recaptcha']")
    public WebElement youListingSendButton;

    @FindBy(xpath = "(//li[@class='yCmsComponent  '])[3]")
    public WebElement rentalPlace;

    @FindBy(className = "captcha-error-field")
    public WebElement nameCaptchaError;


    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement rentalPlaceFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement rentalPlaceLastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement rentalPlaceEmail;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement rentalPlacePhone;

    @FindBy(xpath = "//select[@name='cityCode']")
    public WebElement rentalPlaceCityCode;
    @FindBy(xpath = "//*[contains(text(),'İstanbul')]")
    public WebElement rentalPlaceCityCodeIstanbul;


    @FindBy(xpath = "//select[@name='townCode']")
    public WebElement rentalPlaceTownCode;

    @FindBy(xpath = "//*[contains(text(),'Ataşehir')]")
    public WebElement rentalPlaceTownCodeAtasehir;

    @FindBy(xpath = "//input[@name='district']")
    public WebElement rentalPlaceDistrict;
    @FindBy(xpath = "//input[@name='streetName']")
    public WebElement rentalPlaceStreetName;


    @FindBy(xpath = "//input[@name='streetNumber']")
    public WebElement rentalPlaceStreetNumber;

    @FindBy(xpath = "//input[@name='firstFloorSqm']")
    public WebElement rentalPlaceFirstFloorSqm;

    @FindBy(xpath = "//input[@name='totalSqm']")
    public WebElement rentalPlacetotalSqm;

    @FindBy(xpath = "//input[@name='basementSqm']")
    public WebElement rentalPlaceBasementSqm;


    @FindBy(xpath = "//input[@name='price']")
    public WebElement rentalPlacePrice;


    @FindBy(xpath = "//input[@name='photo']")
    public WebElement rentalPlacePhoto;


    @FindBy(xpath = "//input[@name='note']")
    public WebElement rentalPlaceNote;

    @FindBy(xpath = "//input[@id='btnSubmitRentalForm']")
    public WebElement rentalPlaceSendButton;

    @FindBy(xpath = "//input[@id='licence']")
    public WebElement rentalPlaceLicence;








}





