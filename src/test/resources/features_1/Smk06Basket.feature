@smoke
Feature: US_06 Basket Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici herhangi bir urunu aratir
    When PLP sayfasindaki Sepete ekle butonuna tiklar
    Then Kullanici Ana Sayfadaki Sepetim butonuna tiklar

  Scenario: TC_6001_sepete_urun_ekle
    Then Sepete eklemis oldugu urunun dogru urun oldugunu kontrol eder

  Scenario: TC_6002_sepette_urunu_sil
    When Sepetteki Urunu Sil butonuna tiklar
    Then Sectigi urunun sepetten kaldirildigini kontrol eder

  Scenario: TC_6003_sepete_not_ekle_ve_sil
    And Sepetteki Not eklemek istiyorum linkine tiklar
    And Cikan Notunuz baslikli Pop-up uzerindeki ilgili kisma istedigi notu yazar
    And Kaydet butonuna tiklar
    And Ekledigin notu gor veya guncelle linkine tiklar
    And Notun eklendigini kontrol eder
    And Ekledigi notu silmek icin sil butonuna tiklar
    And Sepetteki Not eklemek istiyorum linkine tiklar
    Then Notun silinmis oldugunu kontrol eder

  Scenario:  TC_6004_sepette_temassiz_teslimat
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

  Scenario:  TC_6005_sepette_poset_secimi
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

