@upgradeSmoke
Feature: US_07 Check Product In Basket Tests

  Scenario: TC_7001_sepette_maximum_satinalma

    Given Kullanici login olmus durumdadir
    And Kullanici herhangi bir urunu aratir
    Then PLP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Sepette urun adedini maximum oranda artirir
    When Maximum satinalma limitine ulastigini kontrol eder

