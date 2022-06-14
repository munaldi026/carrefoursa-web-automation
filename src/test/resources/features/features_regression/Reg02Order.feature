
Feature: US_009_Order_Tests

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: TC_901_create_and_delete_order

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
    And Kullanici odemede Siparisi tamamla butonuna tiklar
    And Kullanici siparisin tamamlandigini kontrol eder
    And Kullanici Siparis Onay sayfasindaki Siparisimi iptal Etmek istiyorum butonuna tiklar
    When Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar
    Then Kullanici siparisin iptal edildigini kontrol eder