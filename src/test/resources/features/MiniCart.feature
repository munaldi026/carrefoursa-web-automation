@regression
Feature: US_008_MiniCart_Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici herhangi bir urunu aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        When Kullanici Ana Sayfadaki Sepetim butonuna hover yapar

      Scenario: TC_801 MC Sepete urun Ekle

        Then Sectigi urunun mini sepete eklendigini kontrol eder

      Scenario:  TC_802 MC Sepette Urunu Sil-1

        Then Sepette bulunan urunleri kontrol eder
        When Mini sepetteki Urunu Sil butonuna tiklar
        When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
        Then Sectigi urunun sepetten kaldirildigini kontrol eder

      Scenario:  TC_803 MC Sepeti Bosalt

        Then Sepette bulunan urunleri kontrol eder
        When Sepetteki Sepeti Bosalt butonuna tiklar
        Then Cikan Popup uzerindeki Evet butonuna tiklar
        When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
        Then Sectigi urunun sepetten kaldirildigini kontrol eder



