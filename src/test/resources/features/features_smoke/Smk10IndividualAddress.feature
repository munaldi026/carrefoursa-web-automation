
Feature:US_10 Individual Address Tests

  Background:
    Given Kullanici login olmus durumdadir
    When Kullanici hesabim buttonuna tiklar
    And Kullanici adresim buttonuna tiklar

  Scenario: TC_10001_individual_adres_ekleme

    And Yeni adres olustur buttonuna tiklar
    And Adres tipi olarak Bireysel secilir
    And Gelen Bireysel form uygun sekilde doldurulur
    And Bu adresi kaydet buttonuna basılır
    Then Adresin basarili sekilde kaydedildigi gorulur
  @demo
  Scenario: TC_10002_individual_adres_guncelleme

    And Kullanici duzenle buttonuna tiklar
    And Kullanici ismini degistirir
    And Adresi guncelle buttonu tiklanir
    Then Kullanicinin ismi basarili bir sekilde degistigi gorulur

