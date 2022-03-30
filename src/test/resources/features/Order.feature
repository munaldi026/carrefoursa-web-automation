@regression
Feature: US_009_Order_Tests

      Background:
        Given Kullanici login olmus durumdadir

      Scenario: TC_901 Create Order

       Given Kullanici herhangi bir urunu aratir
       And PLP sayfasindaki Sepete ekle butonuna tiklar
       And Ana Sayfadaki Sepetim butonuna tiklar
       And Kullanici sepette Siparisi tamamla butonuna tiklar
       And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
       And Teslimat adresi secer
       And Adres secimi sayfasinda Devam Et butonuna tiklar
       And Gelen sayfada teslimat zamanini secer
       And Teslimat zamani sayfasinda Devam Et butonuna tiklar
       And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
       When Kullanici odemede Siparisi tamamla butonuna tiklar
       Then Kullanici siparisin tamamlandigini kontrol eder

      Scenario: TC_902 Delete Order

        Given Kullanici Hesabim butonuna tiklar
        And Hesabim sayfasindaki Siparislerim butonuna tiklar
        And Siparislerim sayfasindaki Siparisi iptal Et butonuna tiklar
        When Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar
        Then Kullanici siparisin iptal edildigini kontrol eder

      Scenario: TC_903 Delete Order-1

        Given Kullanici herhangi bir urunu aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Kullanici sepette Siparisi tamamla butonuna tiklar
        And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
        And Teslimat adresi secer
        And Adres secimi sayfasinda Devam Et butonuna tiklar
        And Gelen sayfada teslimat zamanini secer
        And Teslimat zamani sayfasinda Devam Et butonuna tiklar
        And Odeme sekli olarak Kapida Kredi Karti veya Nakit secenegini secer
        When Kullanici odemede Siparisi tamamla butonuna tiklar
        And Kullanici Siparis Onay sayfasindaki Siparisimi iptal Etmek istiyorum butonuna tiklar
        When Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar
        Then Kullanici siparisin iptal edildigini kontrol eder