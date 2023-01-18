@upgradeSmoke
Feature: US_17 Change Delivery Options Tests

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: US_17001_teslimat_tercih_degisikligi_magazadan_alin


    And Kullanici herhangi bir urunu aratir
    And PLP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Sectigi urunun sepete eklendigini kontrol eder
    And Ana sayfadaki Teslimat Seceneginiz linkine tiklar
    And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
    And Teslim alinacak magazayi secer
    When Bu sayfada Devam et butonu tiklanir
    Then Bu tercih sonucunda urunlerde degisiklik olacagi ile ilgili uyari aldigini kontrol eder.
    Then Pop-up uzerindeki devam edin butonuna tiklanir



  Scenario: US_17002_teslimat_tercih_degisikligi_size_getirelim

    And Ana sayfadaki Teslimat Seceneginiz linkine tiklar
    And Cikan pop-up uzerinde Size Getirelim tercihini yapar
    When Bu sayfada Devam et butonu tiklanir
    When Secimin gerceklestigi kontrol edilir

