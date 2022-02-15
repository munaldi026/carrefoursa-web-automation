@miniSmoke
Feature:US_019_PLP_Sold_Alone_Product_Tests

  Background:
    Given Kullanici login olmus durumdadir
    #And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
    #Then Sepetteki Sepeti Bosalt butonuna tiklar
    #And Cikan Popup uzerindeki Evet butonuna tiklar


  Scenario: TC_1901 Tek Basina Satilan Urun-Ekle
    When Kullanici arama yapacagi urunu girer
    And Kullanici arama buttonuna tiklar
    And Herhangi bir urun sepete eklenir
    And Kullanici tek basina satilan ve ayni tedarikciye ait baska bir urun adini yazar
    And Kullanici arama buttonuna tiklar
    And Herhangi bir urun sepete eklenir
    And Devam et popup tiklanir
    Then Sectigi urunun sepetten kaldirildigini kontrol eder

  Scenario: TC_1902 Tek Basina Satilan Urun-Vazgec
    When Kullanici arama yapacagi urunu girer
    And Kullanici arama buttonuna tiklar
    And Herhangi bir urun sepete eklenir
    And Kullanici tek basina satilan ve ayni tedarikciye ait baska bir urun adini yazar
    And Kullanici arama buttonuna tiklar
    And Herhangi bir urun sepete eklenir
    And Vazgec popup tiklanir
    Then Urun sepeten cikarilmadigi gorulur