
Feature: US_017 Check Product In Basket

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici herhangi bir urunu aratir
    Then PLP sayfasindaki Sepete ekle butonuna tiklar


  Scenario:  TC_1701 Sepette Urun Miktari Artirma
    And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    When Sepette urun adedi artirilir
    Then Artma durumu kontrol edilir


  Scenario:  TC_1702 Sepette Urun Miktari Azaltma
    And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    And Sepette urun adedi artirilir
    When Sepette urun adedi azaltilir
    Then Azalma durumu kontrol edilir