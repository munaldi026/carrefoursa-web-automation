@reg
Feature: US_024_PDP_Select_Alternative_Product_Test

      
      Scenario: TC_2401 Sepette Alternatif Urun Sec

        Given Kullanici login olmus durumdadir
        And Kullanici alternatif seciminin yapilabilecegi uygun bir urun aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Sepette  Alternatif urununu sececegim secimini tiklar
        And Cikan Alternatif Urun Secimi pop-up'i uzerindeki urunu secer
        And Secimimi Kaydet butonuna tiklar
        When Secimin basarili oldugunu kontrol eder
        Then Sepetteki urunu silerek Anasayfaya doner

