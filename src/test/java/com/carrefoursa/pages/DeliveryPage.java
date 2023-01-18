package com.carrefoursa.pages;

import com.carrefoursa.utilities.Constants;
import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DeliveryPage extends BasePage {

    HomePage homePage = new HomePage();


    @FindBy(css = "span[class='hidden-xs']")
    public WebElement deliveryOptionsLink;

    @FindBy(css = ".delivery-time-text")
    public WebElement deliveryTimeLink;

    @FindBy(css = "span[class='d-sm-none']")
    public WebElement areaOfDeliveryLink;

    @FindBy(css = "div[id='cboxTitle'] span[class='headline-text']")
    public WebElement areaOfDeliveryPopup;

    @FindBy(css = ".pickupChoice__pickup ")
    public WebElement pickupFromStore;


    @FindBy(id = "selectDeliveryChoice")
    public WebElement verifySelection;

    @FindBy(css = ".pickupChoice__cargo ")
    public WebElement pickupFromCargo;

    @FindBy(xpath = "//span[contains(text(),'Teslim alacağınız mağazayı değiştirmeniz sonucunda')]")
    public WebElement changeOrderAlert;

    @FindBy(className = "pickupChoice__address-name")
    public List<WebElement> addressOfStores;

    @FindBy(css = "button[class='btn btn-primary pickupChoice__submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@class='btn btn-primary pickup-info-submit']")
    public WebElement pickupFromStoreSubmitButton;

    @FindBy(css = "button[class='btn btn-primary pickup-info-submit']")
    public WebElement pickupFromDeliveryOptionsSubmitButton;

    @FindBy(xpath = "//button[normalize-space()='Devam Et']")
    public WebElement deliveryOptionsContinueButton;



    @FindBy(css = ".pickupChoice__pickup-desc")
    public WebElement pickupChoiseMsg;

    @FindBy(css = "li[id='accessibletabsnavigation0-1'] span[class='address-tab']")
    public WebElement pickupFromStoreOnAddressPage;

    @FindBy(css = "a[id='selectPickUpBaseStoreAddressBtn0'] span")
    public WebElement selectedStoreOnAddressPage;

    @FindBy(xpath = "//div[@class='pickupChoice__address active']//a[contains(text(),'Haritada Gör')]")
    public WebElement onMapLink;

    @FindBy(css = "div[data-desc-class] span")
    public List<WebElement> deliveryOptionsList;

    @FindBy(css = "div[id='cboxTitle'] span[class='headline-text']")
    public WebElement deliveryTimeOptionsText;

    @FindBy(css = ".deliverySlotNewBlock.hidden-xs.hidden-sm")
    public WebElement slotTableText;

    @FindBy(css = "#cityCode")
    public WebElement deliveryCity;

    @FindBy(css = "#townCode")
    public WebElement deliveryTown;

    @FindBy(css = "#districtCode")
    public WebElement deliveryDistrict;

    @FindBy(css = "#selectStoreSubmit")
    public WebElement selectStoreSubmitButton;

    @FindBy(css = "button[class='btn btn-primary pickupChoice__submit']")
    public WebElement pickupChoiseSubmitButton;


    @FindBy(xpath = "//span[@id='selectStoreCanvasText']")
    public WebElement selectedStoreCanvasOnHomePage;

    @FindBy(css = "#warning-text")
    public WebElement failedToAddText;

    @FindBy(xpath = "//div[@class='row m-0 order-detail-row order-flex-row']//p[1]")
    public WebElement infoStoreOnOrderDetailsPage;

    @FindBy(xpath = "(//a[@class='btn btn-primary'])[1]")
    public WebElement orderDetailsButton;

    @FindBy(xpath = "(//input[@class='deliverySlotRadio'])[10]")
    public WebElement slotTimeRadioButton;

    @FindBy(css = "div[id='cboxLoadedContent'] caption")
    public WebElement freshFoodAlertMsg;

    @FindBy(css = "div[id='cboxLoadedContent'] button[class='btn btn-primary btn-lg btn-block']")

    public WebElement continueShoppingButton;

    @FindBy(css = "button[class='btn btn-primary pickup-info-submit']")
    public WebElement changeDeliveryTypeButton;

    @FindBy(xpath = "//div[@id='cboxLoadedContent']//caption[contains(text(),'Seçili konumunuzda bulunmayan ürünler sepetinizden')]")
    public WebElement deletedProductInCurrentCart;

    @FindBy(css = "div[id='cboxLoadedContent'] button[class='btn btn-primary btn-lg btn-block'] devam butonu")
    public WebElement continueToShoppingButton;

    @FindBy(css = ".headline-text")
    public WebElement changedProductInYourCart;




    public void fillDeliveyAreaInformation() {

        Select select = new Select(deliveryCity);
        select.selectByVisibleText("Amasya");
        ReusableMethods.waitFor(1);
        Select select1 = new Select(deliveryTown);
        select1.selectByVisibleText("Merzifon");
        ReusableMethods.waitFor(1);
        Select select2 = new Select(deliveryDistrict);
        select2.selectByVisibleText("Sofular Mh.");
        ReusableMethods.waitFor(1);

    }
    public void fillDeliveyNewAreaInformation() {

        Select select = new Select(deliveryCity);
        select.selectByVisibleText("Amasya");
        ReusableMethods.waitFor(1);
        Select select1 = new Select(deliveryTown);
        select1.selectByVisibleText("Merzifon");
        ReusableMethods.waitFor(1);
        Select select2 = new Select(deliveryDistrict);
        select2.selectByVisibleText("Sofular Mh.");
        ReusableMethods.waitFor(1);

    }
    public void fillDeliveyExAreaInformation() {

        areaOfDeliveryLink.click();
        Select select = new Select(deliveryCity);
        select.selectByVisibleText("İstanbul");
        ReusableMethods.waitFor(1);
        Select select1 = new Select(deliveryTown);
        select1.selectByVisibleText("Ataşehir");
        ReusableMethods.waitFor(1);
        Select select2 = new Select(deliveryDistrict);
        select2.selectByVisibleText("İçerenköy Mh.");
        ReusableMethods.waitFor(1);
        selectStoreSubmitButton.click();
        pickupChoiseSubmitButton.click();

    }



    public void verifyIsStoreOnMap() {

        ReusableMethods.switchToWindow("www.google.com/maps/place/40°57'49.0\"N+29°04'39.9\"E");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        String expectedWord = "www.google.com/maps";
        System.out.println("expectedWord = " + expectedWord);
        assertTrue(actualUrl.contains(expectedWord));
    }


    public String getPickupChoiseMsg() {
        String pickupChoiseMsgText = pickupChoiseMsg.getText();
        System.out.println("pickupChoiseMsgText = " + pickupChoiseMsgText);
        return pickupChoiseMsgText;
    }

    public void storeList() {

        List<String> addressList = new ArrayList<>();
        for (WebElement each : addressOfStores
        ) {
            addressList.add(each.getText());
        }
        System.out.println("List Of Store addresses = " + addressList);
        System.out.println("Selected Store = = " + addressList.get(0));
        addressOfStores.get(0).click();


    }

    public String selectedStore() {
        String firsStore = addressOfStores.get(0).getText();
        System.out.println("firsStore = " + firsStore);
        return firsStore;
    }

    public void storeList1() {

        List<String> addressList = new ArrayList<>();
        for (WebElement each : addressOfStores
        ) {
            addressList.add(each.getText());
        }
        System.out.println("addressList = " + addressList);
        addressOfStores.get(1).click();

    }

    public String selectedStore1() {
        String secondStore = addressOfStores.get(1).getText();
        System.out.println("secondStore = " + secondStore);
        return secondStore;
    }

    public List<String> veryfyDeliveryOptionsList() {
        List<String> deliveryList = new ArrayList<>();
        for (WebElement each : deliveryOptionsList
        ) {
            deliveryList.add(each.getText());
        }
        System.out.println("deliveryList = " + deliveryList);

        return deliveryList;
    }

    public String verifyAreaOfDelivery() {
        String deliveryPopupText = areaOfDeliveryPopup.getText();
        System.out.println("deliveryPopupText = " + deliveryPopupText);
        Assert.assertTrue(areaOfDeliveryPopup.isDisplayed());
        return deliveryPopupText;
    }

    public String verifyAreaOfDeliveryOnHomePage() {
        String selectedStoreOnHomePage = selectedStoreCanvasOnHomePage.getText();
        System.out.println("selectedStoreOnHomePage = " + selectedStoreOnHomePage);
        Assert.assertTrue(selectedStoreCanvasOnHomePage.isDisplayed());
        return selectedStoreOnHomePage;
    }

    public void noProductInStock() {
        ReusableMethods.waitForPageToLoad(5);
        homePage.searchField.click();
        homePage.searchField.sendKeys(Constants.noProductInStock);
        homePage.searchButton.click();

    }

    public void changeDeliveryOptions(){
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForPageToLoad(5);
        deliveryOptionsLink.click();
        pickupFromCargo.click();
        pickupFromStoreSubmitButton.click();

    }

    public void selectNewDeliveryRegion(){
        areaOfDeliveryLink.click();
        verifyAreaOfDelivery();
        fillDeliveyNewAreaInformation();
        selectStoreSubmitButton.click();
       // pickupChoiseSubmitButton.click();
        //verifyAreaOfDeliveryOnHomePage();
    }
    public void selectExDeliveryRegion(){
        areaOfDeliveryLink.click();
        verifyAreaOfDelivery();
        fillDeliveyExAreaInformation();
        selectStoreSubmitButton.click();
        pickupChoiseSubmitButton.click();
        //verifyAreaOfDeliveryOnHomePage();
    }
}