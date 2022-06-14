@reg
Feature: US_017_Check_Product_In_Basket_Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici mini cart icin bir urunu aratir
    When PLP sayfasindaki Sepete ekle butonuna tiklar


  Scenario: TC_1701_sepette_urun_miktari_artirma
    And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    When Sepette urun adedi artirilir
    Then Artma durumu kontrol edilir

  Scenario: TC_1702_sepette_urun_miktari_azaltma
    And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    And Sepette urun adedi artirilir
    When Sepette urun adedi azaltilir
    Then Azalma durumu kontrol edilir



