
Feature: US_18 MiniCart Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici mini cart icin bir urunu aratir
        When PLP sayfasindaki Sepete ekle butonuna tiklar
        When Kullanici Ana Sayfadaki Sepetim butonuna hover yapar

      Scenario: TC_18001_MC_sepete_urun_ekle
        Then Sectigi urunun mini sepete eklendigini kontrol eder

      Scenario:  TC_18002 MC Sepette Urunu Sil
        When Mini sepetteki Urunu Sil butonuna tiklar
        Then Urunun mini sepetten silindigini kontrol eder
      @demo
      Scenario: TC_18003_MC_sepette_urun_miktari_artirma
        And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
        When Sepette urun adedi artirilir
        Then Artma durumu kontrol edilir
      @demo
      Scenario: TC_18004_MC_sepette_urun_miktari_azaltma
        And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
        And Sepette urun adedi artirilir
        When Sepette urun adedi azaltilir
        Then Azalma durumu kontrol edilir

      Scenario:  TC_18005_MC_sepeti_bosalt
        And Kullanici belirli bir urunu aratir
        When PLP sayfasindaki Sepete ekle butonuna tiklar
        And Kullanici alternatif seciminin yapilabilecegi uygun bir urun aratir
        When PLP sayfasindaki Sepete ekle butonuna tiklar
        When Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
        Then Sepette bulunan urunleri kontrol eder
        When Sepetteki Sepeti Bosalt butonuna tiklar
        Then Cikan Popup uzerindeki Evet butonuna tiklar
        When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
        Then Sectigi urunun sepetten kaldirildigini kontrol eder

#      Scenario:  TC_18006_MC_sepette_bir_urun_sil
#
#        And Kullanici alternatif seciminin yapilabilecegi uygun bir urun aratir
#        When PLP sayfasindaki Sepete ekle butonuna tiklar
#        When Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
#        Then Sepette bulunan urunleri kontrol eder
#        When Mini sepetteki Urunu Sil butonuna tiklar
#        When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
#        Then Urunun mini sepetten silindigini kontrol eder

