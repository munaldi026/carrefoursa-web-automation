@smoke
Feature: US_12 Change Delivery Options Test

  Scenario: US_12001_teslimat_tercih_degisikligi_magazadan_alin

    Given Kullanici login olmus durumdadir
    And Kullanici herhangi bir urunu aratir
    And PLP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Sectigi urunun sepete eklendigini kontrol eder
    And Ana sayfadaki Teslimat Seceneginiz linkine tiklar
    And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
    And Teslim alinacak magazayi secer
    When Bu sayfada Devam et butonu tiklanir
    Then Bu tercih sonucunda urunlerde degisiklik olacagi ile ilgili uyari aldigini kontrol eder.


