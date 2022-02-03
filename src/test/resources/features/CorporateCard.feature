Feature: US_014 Corporate Card Tests

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
      And Kullanici sayfanin sag alt tarafinda bulunan Kurumsal Kart secenegine tiklar
      And Acilan Kurumsal Kart kutucuguna gecerli bir kart numarasi girer


      Scenario: TC_1401 Kurumsal Kart-Miktar-boş

      When Puan Tutari kutucuguna hic bir deger girmez
      Then Sistemin kabul etmedigini kontrol eder

      Scenario: TC_1401 Kurumsal Kart-Miktar-Sifir

      And Puan Tutari kutucuguna 0 kurus degerini girer
      When Kullan butonuna tiklar
      Then Sistemin kabul etmedigini kontrol eder

      Scenario: TC_1401 Kurumsal Kart-Miktar-Minimum-Puan
      And Puan Tutari kutucuguna 1 Kurus deger girer
      When Kullan butonuna tiklar
      Then Sistemin minumum deger olarak kabul ettigini kontrol eder

      Scenario: TC_1401 Kurumsal Kart-Miktar-Maximum-Puan
      And Puan Tutari kutucuguna Kart puanindan fazla bir deger girer
      When Kullan butonuna tiklar
      Then Sistemin kart puanini maximum deger olarak kabul ettigini kontrol eder

      Scenario: TC_1401 Kurumsal Kart-Miktar-Maximum Tutar
      And Puan Tutari kutucuguna sepetteki toplam tutardan fazla bir deger girer
      When Kullan butonuna tiklar
      Then Sistemin sepet toplam tutarini maximum deger olarak kabul ettigini kontrol eder

      Scenario: TC_1401 Kurumsal Kart-Geri Al
      And Puan Tutari kutucuguna gecerli bir deger girer
      And Kullan butonuna tiklar
      And Yaptigi islemin gecerli oldugunu kontrol eder
      When Geri Al butonuna tiklar
      Then Yaptigi islemi geri aldigini kontrol eder

