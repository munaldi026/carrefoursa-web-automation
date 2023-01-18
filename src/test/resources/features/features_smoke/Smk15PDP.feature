@upgradeSmoke
Feature: US_15 PDP Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici belirli bir urunu aratir
    When Kullanici arattigi urunune tiklar

  Scenario: TC_15001_alisveris_listesine_ekle ve_cikar

    And PDP sayfasindaki Alisveris listeme ekle linkine tiklar
    And Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder
    And Alisveris Listesindeki eklenmis olan urune tiklayarak PDP sayfasina doner
    And PDP sayfasindaki Alisveris listemden cikar linkine tiklar
    Then Urunun Alisveris listesinden cıkarildigini kontrol eder

  Scenario: TC_15002_PDP_sepete_ekle

    And PDP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Sectigi urunun sepete eklendigini kontrol eder
    Then Kullanici sepeti temizler


#  Scenario:  TC_15003_PDP_maximum_satinalma
#
#    And PDP urun adedini maximum oranda artirir
#    When Maximum satin alma limitine ulastigini kontrol eder


