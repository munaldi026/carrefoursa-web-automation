
Feature: US_03 Search Tests

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: TC_3001_arama_kelime
    And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
    Then Kullanici Arama Yaptigi Urun Tiplerini Gorur
  @demo
  Scenario: TC_3002_arama_kelime_ara_buton
    And Kullanici Arama Kismina Aranacak Kelimeyi Girer
    And Kullanici Ara Buttonuna Tiklar
    Then Arama Yaptigi Urun Tiplerini Gorur
  @demo
  Scenario: TC_3003_arama_tek_harf
    Given Kullanici Arama Kismina Aranacak Tek Bir Harf Girer
    When Kullanici Ara Buttonuna Tiklar
    Then Arama yapilamayacagini kontrol eder