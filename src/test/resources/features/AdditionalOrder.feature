@add
Feature: US_021 Additional Order Test

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici herhangi bir urunu aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Sepette urun adedini maximum sayida artirir
        And Kullanici sepette Siparisi tamamla butonuna tiklar
        And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
        And Teslimat adresi secer
        And Adres secimi sayfasinda Devam Et butonuna tiklar
        And Gelen sayfada teslimat zamanini secer
        And Teslimat zamani sayfasinda Devam Et butonuna tiklar
        And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
        And Kullanici odemede Siparisi tamamla butonuna tiklar
        And Kullanici siparisin tamamlandigini kontrol eder

      Scenario: TC_2101 Ek Siparis Olusturmada Limit ve Sure
        Given Siparis Onayi sayfasindaki Siparisime ek yapmak istiyorum butonuna tiklar
        Then Siparis olusturulma suresini beklemeden ek siparis yapilamayacagini kontrol eder

      Scenario: TC_2102 Ek Siparis Olusturmada Limit
        Given Siparis sayfasindaki Siparisime ek yapmak istiyorum butonuna tiklar
        And Ek siparis icin verify yapar
        And Kullanici herhangi bir urunu aratir
        And Kullanici arattigi urunune tiklar
        When PDP sayfasinda Sepete Ekle butonuna tiklar
        Then Daha once maksimum miktar siparis yaptigi icin ek siparis yapilamayacagini kontrol eder