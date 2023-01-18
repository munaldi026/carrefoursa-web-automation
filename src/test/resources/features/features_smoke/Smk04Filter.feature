@upgradeSmoke
Feature: US_04 Filter Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici Ana Sayfadaki Arama kutusuna tiklar
    When Aramak istedigi urunun adini yazar
    Then Arama butonuna tiklar


  Scenario: TC_4001_filter_in_stock
    And Urun listelemede Stokta Var checkbox ina tiklar
    Then Sadece stokta olan urunlerin listelendigini kontrol eder

  Scenario: TC_4002_filter_in_opportunities
    And Urun listelemede Firsatlar checkbox ina tiklar
    Then Sadece Firsatlar urunlerinin listelendigini kontrol eder

  Scenario: TC_4003_filter_brand
    And Urun listelemede Marka checkbox ina tiklar
    Then Sadece secili markali urunlerin listelendigini kontrol eder

  Scenario: TC_4004_remove_filter
    Given Urun listelemede Stokta Var ve indirimli secimlerinin disinda herhangi bir secim yapar
    When Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar
    Then Yaptigi secimin temizlendigini kontrol eder
