Feature: US_013 Payment By Credit Card Test
  @creditCard
  Scenario: TC_1303 Payment By Credit Card
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
      Then Kullanici Odeme Tipi olarak Kredi Karti seceneginin secildigini kontrol eder

