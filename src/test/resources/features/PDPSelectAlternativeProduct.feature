@regression
Feature: US_24_PDP_Select_Alternative_Product_Test

      Background:
            Given Kullanici login olmus durumdadir

      Scenario: TC_2401 Sepette Alternatif Urun Sec

        Given Kullanici alternatif seciminin yapilabilecegi uygun bir urun aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Sepette  Alternatif urununu sececegim secimini tiklar
        And Cikan Alternatif Urun Secimi pop-up'i uzerindeki urunu secer
        And Secimimi Kaydet butonuna tiklar
        When Secimin basarili oldugunu kontrol eder
        Then Sepetteki urunu silerek Anasayfaya doner

