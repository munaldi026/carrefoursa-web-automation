@regression
Feature: US_022_Cart_Order_Amount_Tests

      Background:

      Given Kullanici login olmus durumdadir

      Scenario: TC_2201 Sepette Minumum Siparis Tutari

      Given Kullanici tutari 60 TL' den az olan bir urun aratir
      And PLP sayfasindaki Sepete ekle butonuna tiklar
      When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
      Then Sepet tutarinin Minimum Siparis Tutarina ulasmadigini kontrol eder

      Scenario: TC_2202 Sepette Minumum Siparis Tutari-1

      Given Kullanici tutari 60 TL ya da uzeri olan bir urun arartir
      And PLP sayfasindaki Sepete ekle butonuna tiklar
      When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
      Then Sepet tutarinin Minimum Siparis Tutarina ulasmis oldugunu kontrol eder
