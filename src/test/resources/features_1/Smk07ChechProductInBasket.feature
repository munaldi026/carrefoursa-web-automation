@smoke
Feature: US_07 Check Product In Basket Tests

  Background:

    Given Kullanici login olmus durumdadir
    And Kullanici sepeti bosaltir
    And Kullanici herhangi bir urunu aratir
    Then PLP sayfasindaki Sepete ekle butonuna tiklar

  Scenario: TC_7001_sepette_urun_miktari_artirma
    And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    When Sepette urun adedi artirilir
    Then Artma durumu kontrol edilir

  Scenario: TC_7002_sepette_urun_miktari_azaltma
    And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    And Sepette urun adedi artirilir
    When Sepette urun adedi azaltilir
    Then Azalma durumu kontrol edilir

  Scenario: TC_7003_sepette_maximum_satinalma
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Sepette urun adedini maximum oranda artirir
    When Maximum satinalma limitine ulastigini kontrol eder

