@smoke
Feature: US_11 Payment Test

  Scenario: TC_11001_payment_by_credit_card

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
    And Odeme sekli olarak Kredi Karti secenegine tiklar
    And Kredi Karti bilgilerini doldurur
    When Teslimat zamani sayfasinda Devam Et butonuna tiklar
    Then Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder




