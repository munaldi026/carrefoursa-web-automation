@regression
Feature: US_018_DiscountCode_Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici herhangi bir urunu aratir
        And PLP sayfasindaki Sepete ekle butonuna tiklar
        And Ana Sayfadaki Sepetim butonuna tiklar
        And Arattigi urunun sepete eklendigini kontrol eder
        And Kullanici sepette Siparisi tamamla butonuna tiklar
        And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
        And Teslimat adresi secer
        And Adres secimi sayfasinda Devam Et butonuna tiklar
        And Teslimat zamani sayfasinda Devam Et butonuna tiklar
        And Kullanici sayfanin sag alt tarafinda bulunan Kurumsal Kart secenegine tiklar
        And Acilan Kurumsal Kart kutucuguna gecerli bir kart numarasi girer
        Then Kullanici sayfanin sag alt tarafinda bulunan indirim kodu seçenegine tiklar

        Scenario:TC_1801

        Given Açilan indirim kodu kutucuguna geçerli bir indirim  kodu girer
        And indirim kodu kullan butonuna tiklar
        Then indirim yapildigini verify eder

        Scenario: TC_1802

        Given Açilan indirim kodu kutucuguna geçersiz bir indirim  kodu girer
        And indirim kodu kullan butonuna tiklar
        Then indirim yapilmadigini verify eder

