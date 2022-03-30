@regression
Feature: US_016_Our_Stores_Test

      Scenario: TC_1601 Magazalarimiz

        Given Kullanici sisteme giris yapar
        And Kullanici Ana Sayfadaki En Yakin CarrefourSa linkine tiklar
        And Sayfanin acildigini kontrol eder
        And Kullanici Bu sayfadaki il textbox'ina yasadigi ilin adini secer
        And ilce textbox'ina yasadigi ilcenin adini secer
        And Magaza Turunu Seciniz bolumunde ilgili checkbox'i secer
        And Hizmet Turunu Seciniz bolumunde ilgili checkbox'i secer
        When Sonuclari Goster butonuna tiklanir
        Then Secilen en yakin magazanin goruntulendigini kontrol eder

      Scenario: TC_2807 Siparis Detayi-Magaza Bilgileri

        Given Kullanici Hesabim butonuna tiklar
        And Hesabim sayfasindaki Siparislerim butonuna tiklar
        When Siparislerim sayfasindaki Siparis Detayi butonuna tiklar
        Then Siparis Detayi sayfasinda secilen magazaya ait bilgilerin bulundugunu kontrol eder


       Scenario:11
         Given Kullanici login olmus durumdadir
         And Ana Sayfadaki Hesabim linkine tiklar
         And Hesaplarim linklerini kontrol eder


        Scenario:12
          Given Kullanici login olmus durumdadir
          And Sayfa sonuna gider
          Then Footer Linklerini kontrol eder

