@filter
Feature: US_006 Filter Tests

  Background:

      Given Kullanici Ana Sayfadaki Arama kutusuna tiklar
      When Aramak istedigi urunun adini yazar
      Then Arama butonuna tiklar



     Scenario: TC_Filter-1 In Stock

        And Urun listelemede Stokta Var checkbox ina tiklar
        Then Sadece stokta olan urunlerin listelendigini kontrol eder

    Scenario: TC_Filter-2 In Discount

        And Urun listelemede Indirimli checkbox ina tiklar
        Then Sadece Indirmli urunlerin listelendigini kontrol eder


    Scenario: TC_Filter-1 Brand


        And Urun listelemede Marka checkbox ina tiklar
        Then Sadece secili markali urunlerin listelendigini kontrol eder
