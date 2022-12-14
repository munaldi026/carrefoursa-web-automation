@reg
Feature: US_027_DeliveryOptions_Tests

      Background:

      Given Kullanici login olmus durumdadir
      And Kullanici herhangi bir urunu aratir
      And PLP sayfasindaki Sepete ekle butonuna tiklar
      And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
      And Sectigi urunun sepete eklendigini kontrol eder

      Scenario: US_2701 Tercih Degisikligi

      Given Ana sayfadaki Teslimat Seceneginiz linkine tiklar
      And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
      And Teslim alinacak magazayi secer
      When Bu sayfada Devam et butonu tiklanir
      Then Bu tercih sonucunda urunlerde degisiklik olacagi ile ilgili uyari aldigini kontrol eder.


      Scenario: US_2702 Adres adiminda Magaza Degisimi

      Given Sepetim Sayfasindaki Siparisi Tamamla butonuna tiklar
      And Adres secimi sayfasinda  Magazadan Al tercihini yapar
      And Adres sayfasindaki Teslim alinacak magazayi secer
      And Bu tercih sonucunda urunlerde degisiklik olacagi ile ilgili uyari aldigini kontrol eder.
      When Gelen pop-up kapatilir
      Then Kullanici sepeti temizler

#      Scenario: US_17002_teslimat_tercih_degisikligi_size_getirelim
#
#      And Ana sayfadaki Teslimat Seceneginiz linkine tiklar
#      And Cikan pop-up uzerinde Size Getirelim tercihini yapar
#      When Bu sayfada Devam et butonu tiklanir
#      When Secimin gerceklestigi kontrol edilir