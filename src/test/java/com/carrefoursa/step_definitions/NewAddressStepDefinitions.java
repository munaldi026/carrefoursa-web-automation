package com.carrefoursa.step_definitions;

import com.carrefoursa.pages.AddressPage;
import com.carrefoursa.pages.NewAddressPage;
import com.carrefoursa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NewAddressStepDefinitions {
    AddressPage addressPage = new AddressPage();
    NewAddressPage newAddressPage = new NewAddressPage();

    @And("Adres tipi girilir {string}")
    public void adresTipiGirilir(String addressType) {
        if (addressType.equals("empty")) {
            addressType = "";
        }
        addressPage.addresstype.sendKeys(addressType);
    }

    @And("Kullanici ismi girilir {string}")
    public void kullaniciIsmiGirilir(String firstName) {
        if (firstName.equals("empty")) {
            firstName = "";
        }
        addressPage.firstname.sendKeys(firstName);
    }

    @And("Kullanici soyismi girilir {string}")
    public void kullaniciSoyismiGirilir(String lastName) {
        if (lastName.equals("empty")) {
            lastName = "";
        }
        addressPage.lastname.sendKeys(lastName);

    }

    @And("Kullanici adresi girilir {string}")
    public void kullaniciAdresiGirilir(String address) {
        if (address.equals("empty")) {
            address = "";
        }
        addressPage.address.sendKeys(address);
    }

    @And("Kullanici epostasi girilir {string}")
    public void kullaniciEpostasiGirilir(String email) {
        if (email.equals("empty")) {
            email = "";
        }
        addressPage.email.clear();
        addressPage.email.sendKeys(email);
    }

    @And("Kullanici telefon numarasi girilir {string}")
    public void kullaniciTelefonNumarasiGirilir(String phoneNumber) {

        if (phoneNumber.equals("empty")) {
            phoneNumber = "";
        }
        addressPage.phonenumber.clear();
        addressPage.phonenumber.sendKeys(phoneNumber);
    }

    @Then("Hata mesaji alinir {string}")
    public void hataMesajiAlinir(String expectedErrorMsg) {

        String actualErrorMsg;

        ReusableMethods.waitFor(1);

        if (expectedErrorMsg.contains("Doldurmanız zorunludur")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            actualErrorMsg = newAddressPage.addressErrMsg.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        } else if (expectedErrorMsg.contains("Lütfen isim giriniz")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            actualErrorMsg = newAddressPage.firstNameErrMsg.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        } else if (expectedErrorMsg.contains("Soyisim")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
           actualErrorMsg = newAddressPage.lastNameErrMsg.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        } else if (expectedErrorMsg.contains("Lütfen adres giriniz")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            actualErrorMsg = newAddressPage.streetnameErrMsg.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        }else if (expectedErrorMsg.contains("Geçerli bir e-posta adresi girin")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
            actualErrorMsg = newAddressPage.emailErrMsg.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        }else if (expectedErrorMsg.contains("Geçerli bir telefon numarası girin")) {
            System.out.println("expectedErrorMsg = " + expectedErrorMsg);
           actualErrorMsg = newAddressPage.mobilePhoneNumberErrMsg.getText();
            System.out.println("actualErrorMsg = " + actualErrorMsg);
            Assert.assertTrue("Error mesaj gösterimi: FAIL", actualErrorMsg.contains(expectedErrorMsg));

        }


        }
    }

