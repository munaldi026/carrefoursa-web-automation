
Feature: US_13 About Products Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici taksit oneren bir urunu aratir
    When Kullanici arattigi urunune tiklar


  Scenario: TC_13001_urun_aciklamalari
    Then Kullanici sectigi urunun, urun aciklamalarinin gorunur oldugunu kontrol eder


  Scenario: TC_13002_urun_taksit_bilgileri
    And PDP sayfasindaki Taksit Bilgileri linkine tiklar
    Then Kullanici PDP sayfasinda,sectigi urunle ilgili Taksit bilgilerinin geldigini kontrol eder


  Scenario: TC_13003_internet_urunlerinde_garanti&iade_proseduru
    Given PDP sayfasindaki Garanti&Iade linkine tiklar
    And Iade sureclerimiz butonuna tiklar
    When Acilan sayfada Internet Alisverislerinde linkine tiklar
    Then Internet process bilgilerin geldigini kontrol eder











