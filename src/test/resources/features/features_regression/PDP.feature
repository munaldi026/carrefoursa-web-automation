@reg
Feature: US_010_PDP_Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici belirli bir urunu aratir
    When Kullanici arattigi urunune tiklar


  Scenario: TC_1001_alisveris_listesine_ekle ve_cikar

    And PDP sayfasindaki Alisveris listeme ekle linkine tiklar
    And Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder
    And Alisveris Listesindeki eklenmis olan urune tiklayarak PDP sayfasina doner
    And PDP sayfasindaki Alisveris listemden cikar linkine tiklar
    Then Urunun Alisveris listesinden cıkarildigini kontrol eder

  Scenario: TC_1002_PDP_sepete_ekle

    And PDP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    Then Sectigi urunun sepete eklendigini kontrol eder


  Scenario:  TC_1003_PDP_maximum_satinalma

    And PDP urun adedini maximum oranda artirir
    When Maximum satin alma limitine ulastigini kontrol eder

