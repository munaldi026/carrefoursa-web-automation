Feature: US_003 Basket Tests

      Background:
            Given Kullanici login olmus durumdadir
            And Kullanici herhangi bir urunu aratir
            Then PLP sayfasindaki Sepete ekle butonuna tiklar

      Scenario: TC_301 Sepete urun Ekle
            When Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
            Then Sectigi urunun sepete eklendigini kontrol eder


      Scenario:  TC_302 Sepette Urunu Sil-1
            And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
            When Sepetteki Urunu Sil butonuna tiklar
            When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
            Then Sectigi urunun sepetten kaldirildigini kontrol eder

      Scenario:  TC_303 Sepete Urunu Sil-2
            And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
            When Sepetteki Urunu Sil butonuna tiklar
            Then Sectigi urunun sepetten kaldirildigini kontrol eder

      Scenario:  TC_304 Sepeti Bosalt
            And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
            When Sepetteki Sepeti Bosalt butonuna tiklar
            Then Cikan Popup uzerindeki Evet butonuna tiklar
            When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
            Then Sectigi urunun sepetten kaldirildigini kontrol eder

      Scenario:  TC_305 Sepete Not Ekle ve Sil
            And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
            And Sepetteki Not eklemek istiyorum linkine tiklar
            And Cikan Notunuz baslikli Pop-up uzerindeki ilgili kisma istedigi notu yazar
            And Kaydet butonuna tiklar
            And Ekledigin notu gor veya guncelle linkine tiklar
            And Notun eklendigini kontrol eder
            And Ekledigi notu silmek icin sil butonuna tiklar
            And Sepetteki Not eklemek istiyorum linkine tiklar
            Then Notun silinmis oldugunu kontrol eder

