@reg
Feature: US_007_Sorting_Tests

      Background:
        Given Kullanici Ana Sayfadaki Arama kutusuna tiklar
        And Aramak istedigi urunun adini yazar
        And Arama butonuna tiklar

      Scenario: TC_701 Artan Siralama Testi
        When Urun listelemede Akilli Siralama da En Yuksek Fiyat secimini tiklar
        Then Urunlerin yuksek fiyattan dusuk fiyata dogru siralandigini kontrol eder

      Scenario: TC_702 Azalan Siralama Testi
        When Urun listelemede Akilli Siralama da En Dusuk Fiyat secimini tiklar
        Then Urunlerin dusuk fiyattan yuksek fiyata dogru siralandigini kontrol eder
