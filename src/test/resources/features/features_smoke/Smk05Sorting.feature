@smoke
Feature: US_05 Sorting Tests

  Background:
    Given Kullanici Ana Sayfadaki Arama kutusuna tiklar
    And Aramak istedigi urunun adini yazar
    And Arama butonuna tiklar

  Scenario: TC_5001_artan_siralama_testi
    When Urun listelemede Akilli Siralama da En Yuksek Fiyat secimini tiklar
    Then Urunlerin yuksek fiyattan dusuk fiyata dogru siralandigini kontrol eder

  Scenario: TC_5002_azalan_siralama_testi
    When Urun listelemede Akilli Siralama da En Dusuk Fiyat secimini tiklar
    Then Urunlerin dusuk fiyattan yuksek fiyata dogru siralandigini kontrol eder
