@upgradeSmoke
Feature: US_09 Order Tests


    Background:
      Given Kullanici login olmus durumdadir

      Scenario: TC_9001_Tek urun Kapida icin Kredi Karti veya Nakit secenegi ile create_and_delete_order

        And Kullanici herhangi bir urunu aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Kullanici sepette Siparisi tamamla butonuna tiklar
        And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
        And Teslimat adresi secer
        And Adres secimi sayfasinda Devam Et butonuna tiklar
        And Gelen sayfada teslimat zamanini secer
        And Teslimat zamani sayfasinda Devam Et butonuna tiklar
        And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
        And Kullanici odemede Siparisi tamamla butonuna tiklar
        And Kullanici siparisin tamamlandigini kontrol eder
        And Kullanici Siparis Onay sayfasindaki Siparisimi iptal Etmek istiyorum butonuna tiklar
        When Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar
        Then Kullanici siparisin iptal edildigini kontrol eder

      Scenario: TC_9002_Birden fazla ve farkli categorik urunler icin Kredi Karti ile odeme secenegi ile create_and_delete_order-1

        And Kullanici KG'li bir urunu aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Indirimli bir urun aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Promosyonlu bir urun aratir
        And PLP sayfasindaki Sepette ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Kullanici sepette Siparisi tamamla butonuna tiklar
        And Tum urunlerin sepete eklendigini kontrol eder
        And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
        And Teslimat adresi secer
        And Adres secimi sayfasinda Devam Et butonuna tiklar
        And Gelen sayfada teslimat zamanini secer
        And Teslimat zamani sayfasinda Devam Et butonuna tiklar
        And Odeme sekli olarak Kredi Karti secenegine tiklar
        And Kredi Karti bilgilerini doldurur
        And Gelen pop-up uzerine gecerli guvenlik kodu girilir
        And Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder
        And Kullanici Siparis Onay sayfasindaki Siparisimi iptal Etmek istiyorum butonuna tiklar
        When Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar
        Then Kullanici siparisin iptal edildigini kontrol eder


