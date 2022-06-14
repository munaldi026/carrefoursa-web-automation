@reg
Feature: US_022_Cart_Order_Amount_Tests

      Background:
      Given Kullanici login olmus durumdadir


      Scenario: TC_2201 Sepette Minimum Siparis Tutari

      Given Kullanici tutari Altmis TL' den az olan bir urun aratir
      And PLP sayfasindaki Sepete ekle butonuna tiklar
      When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
      Then Sepet tutarinin Minimum Siparis Tutarina ulasmadigini kontrol eder

      Scenario: TC_2202 Sepette Minimum Siparis Tutari-1

      Given Kullanici tutari Altmis TL ya da uzeri olan bir urun arartir
      And PLP sayfasindaki Sepete ekle butonuna tiklar
      When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
      Then Sepet tutarinin Minimum Siparis Tutarina ulasmis oldugunu kontrol eder

