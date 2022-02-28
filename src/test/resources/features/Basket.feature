@basket
Feature: US_003_Basket_Tests

      Background:
            Given Kullanici login olmus durumdadir
            And Kullanici herhangi bir urunu aratir
            When PLP sayfasindaki Sepete ekle butonuna tiklar
            Then Kullanici Ana Sayfadaki Sepetim butonuna tiklar

      Scenario: TC_301 Sepete Urun Ekle

            Then Sepete eklemis oldugu urunun dogru urun oldugunu kontrol eder

      Scenario:  TC_302 Sepete Urunu Sil

            When Sepetteki Urunu Sil butonuna tiklar
            Then Sectigi urunun sepetten kaldirildigini kontrol eder

      Scenario:  TC_303 Sepete Not Ekle ve Sil

            And Sepetteki Not eklemek istiyorum linkine tiklar
            And Cikan Notunuz baslikli Pop-up uzerindeki ilgili kisma istedigi notu yazar
            And Kaydet butonuna tiklar
            And Ekledigin notu gor veya guncelle linkine tiklar
            And Notun eklendigini kontrol eder
            And Ekledigi notu silmek icin sil butonuna tiklar
            And Sepetteki Not eklemek istiyorum linkine tiklar
            Then Notun silinmis oldugunu kontrol eder
      @basket-1
      Scenario:  TC_304 Sepete Temassiz Teslimat

            Given Siparis ozetinde Temassiz Teslimat checkbox ini tiklar
            And Kullanici sepette Siparisi tamamla butonuna tiklar
            And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
            And Teslimat adresi secer
            And Adres secimi sayfasinda Devam Et butonuna tiklar
            And Gelen sayfada teslimat zamanini secer
            And Teslimat zamani sayfasinda Devam Et butonuna tiklar
            And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
            When Kullanici odemede Siparisi tamamla butonuna tiklar
            Then Temassiz teslimat oldugunu kontrol eder
      @basket-2
      Scenario:  TC_305 Sepette Poset Secimi

            Given Siparis ozetinde Poset ile teslim edilmesini istiyorum secimini tiklar
            And Kullanici sepette Siparisi tamamla butonuna tiklar
            And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
            And Teslimat adresi secer
            And Adres secimi sayfasinda Devam Et butonuna tiklar
            And Gelen sayfada teslimat zamanini secer
            And Teslimat zamani sayfasinda Devam Et butonuna tiklar
            And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
            When Kullanici odemede Siparisi tamamla butonuna tiklar
            Then Siparis ozetinde poset eklenmis oldugunu kontrol eder
      @basket-3
      Scenario:  TC_306 Sepette Bez Poset Secimi

            Given Siparis ozetinde Bez Poset ile teslim edilmesini istiyorum secimini tiklar
            And Kullanici sepette Siparisi tamamla butonuna tiklar
            And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
            And Teslimat adresi secer
            And Adres secimi sayfasinda Devam Et butonuna tiklar
            And Gelen sayfada teslimat zamanini secer
            And Teslimat zamani sayfasinda Devam Et butonuna tiklar
            And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
            When Kullanici odemede Siparisi tamamla butonuna tiklar
            Then Siparis ozetinde bez poset eklenmis oldugunu kontrol eder
