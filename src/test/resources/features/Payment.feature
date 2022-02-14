Feature: US_013_Payment_Tests

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
        And Gelen sayfada teslimat zamanini secer
        And Teslimat zamani sayfasinda Devam Et butonuna tiklar

    Scenario: TC_1301 Payment By Credit Card

        And Odeme sekli olarak Kredi Karti secenegine tiklar
        And Kredi Karti bilgilerini doldurur
        When Teslimat zamani sayfasinda Devam Et butonuna tiklar
        Then Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder

    Scenario: TC_1302 Payment By Cash At Delivery

        And Odeme sekli olarak Kapida Nakit secenegine tiklar
        And Kapida nakit odeyin seceneginin secildigini kontrol eder
        When Kullanici odemede Siparisi tamamla butonuna tiklar
        Then Kullanici siparisin tamamlandigini kontrol eder
