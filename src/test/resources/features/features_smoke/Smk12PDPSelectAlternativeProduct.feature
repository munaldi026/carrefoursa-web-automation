
Feature: US_12 PDP Select Alternative Product Test


  Scenario: TC_12001_sepette_alternatif_urun_sec

    Given Kullanici login olmus durumdadir
    And Kullanici alternatif seciminin yapilabilecegi uygun bir urun aratir
    And PLP sayfasindaki Sepete ekle butonuna tiklar
    And Ana Sayfadaki Sepetim butonuna tiklar
    And Sepette  Alternatif urununu sececegim secimini tiklar
    And Cikan Alternatif Urun Secimi pop-up'i uzerindeki urunu secer
    And Secimimi Kaydet butonuna tiklar
    When Secimin basarili oldugunu kontrol eder
    Then Sepetteki urunu silerek Anasayfaya doner

