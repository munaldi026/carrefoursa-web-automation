Feature: US_007 Siralama Testleri

  Background:
    Given Kullanıcı Ana Sayfadaki Arama kutusuna tıklar
    And Aramak istediği ürünün adını yazar
    And Arama butonuna tıklar
  @descending
  Scenario: TC_701 Artan Siralama Testi
    When Ürün listelemede Akıllı Sıralama da En Yuksek Fiyat secimini tıklar
    Then Ürünlerin yüksek fiyattan düşük fiyata doğru sıralandığını kontrol eder
  @ascending
  Scenario: TC_702 Azalan Siralama Testi
    When Ürün listelemede Akıllı Sıralama da En Dusuk Fiyat secimini tıklar
    Then Ürünlerin düşük fiyattan yüksek fiyata doğru sıralandığını kontrol eder