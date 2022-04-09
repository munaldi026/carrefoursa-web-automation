@regression14
Feature: US_014_CorporateCard_Tests

      Background:
      Given Kullanici login olmus durumdadir
      Given Kullanici herhangi bir urunu aratir
      And PLP sayfasindaki Sepete ekle butonuna tiklar
      And Ana Sayfadaki Sepetim butonuna tiklar
      And Kullanici sepette Siparisi tamamla butonuna tiklar
      And Gelen sayfada,teslimat sekli olarak Size Getirelim seceneginin secili oldugunu gorur
      And Teslimat adresi secer
      And Adres secimi sayfasinda Devam Et butonuna tiklar
      And Gelen sayfada teslimat zamanini secer
      And Teslimat zamani sayfasinda Devam Et butonuna tiklar
      And Kullanici sayfanin sag alt tarafinda bulunan Kurumsal Kart secenegine tiklar
      And Acilan Kurumsal Kart kutucuguna gecerli bir kart numarasi girer


      Scenario: TC_1401 Kurumsal Kart-Miktar-Sifir
      And  Puan Tutari kutucuguna sifir kurus degerini girer
      When Kullan butonuna tiklar
      Then Sistemin sifir degerini kabul etmedigini kontrol eder

      Scenario: TC_1402 Kurumsal Kart-Success kullanim
      And  Puan Tutari kutucuguna belirli bir miktar girer
      When Kullan butonuna tiklar
      Then Girdigi miktarin basarili bir sekilde kullanildigini kontrol eder

      Scenario: TC_1403 Kurumsal Kart-Miktar-Maximum Tutar
      And Puan Tutari kutucuguna sepetteki toplam tutardan fazla bir deger girer
      When Kullan butonuna tiklar
      Then Sistemin sepet toplam tutarini maximum deger olarak kabul ettigini kontrol eder

