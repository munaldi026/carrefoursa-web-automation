
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