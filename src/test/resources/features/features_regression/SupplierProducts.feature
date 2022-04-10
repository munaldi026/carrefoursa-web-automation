@reg10
Feature: US_020_Supplier_Products_Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici sepeti bosaltir
    And Tek basina satilan bir urun adi yazar
    When PLP sayfasindaki Sepete ekle butonuna tiklar
    Then Kullanici Ana Sayfadaki Arama kutusuna tiklar


  Scenario: TC_2001_same_supplier

    Given Tek basina satilan ve ayni tedarikciye ait baska bir urun adi yazar
    And PLP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    When Her iki urununde sepete eklendigini konrtol eder

  Scenario: TC_2002_different_supplier-go_on

    Given  Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar
    And PLP sayfasindaki Sepete ekle butonuna tiklar
    And PLP sayfasinda cikan pop_up uzerindeki Devam Et butonuna tiklar
    When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    Then Farkli iki tedarikciye ait olan yeni urunlerin eklenemedigini kontrol eder


  Scenario: TC_2003_different_supplier-give_up

    Given  Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar
    And PLP sayfasindaki Sepete ekle butonuna tiklar
    And PLP sayfasinda cikan pop_up uzerindeki Vazgec butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    When Farkli iki tedarikciden ilki tercih edildigi icin ilk urunun sepetten silinmedigini kontrol eder








