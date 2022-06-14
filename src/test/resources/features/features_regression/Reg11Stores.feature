@reg
Feature: US_016_Our_Stores_Test

    Background:
      Given Kullanici login olmus durumdadir

      Scenario: TC_1601 Magazalarimiz

        And Kullanici Ana Sayfadaki En Yakin CarrefourSa linkine tiklar
        And Sayfanin acildigini kontrol eder
        And Kullanici Bu sayfadaki il textbox'ina yasadigi ilin adini secer
        And ilce textbox'ina yasadigi ilcenin adini secer
        And Magaza Turunu Seciniz bolumunde ilgili checkbox'i secer
        And Hizmet Turunu Seciniz bolumunde ilgili checkbox'i secer
        When Sonuclari Goster butonuna tiklanir
        Then Secilen en yakin magazanin goruntulendigini kontrol eder


      Scenario: TC_1602 Siparis Detayi-Magaza Bilgileri

        Given Kullanici magazadan al tercihli bir siparise gider
        Then Siparis Detayi sayfasinda secilen magazaya ait bilgilerin bulundugunu kontrol eder