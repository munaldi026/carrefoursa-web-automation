@regression
Feature: US_006_Filter_Tests

      Background:

      Given Kullanici Ana Sayfadaki Arama kutusuna tiklar
      When Aramak istedigi urunun adini yazar
      Then Arama butonuna tiklar


      Scenario: TC_601 Filter-1 In Stock

        And Urun listelemede Stokta Var checkbox ina tiklar
        Then Sadece stokta olan urunlerin listelendigini kontrol eder

      Scenario: TC_602 Filter-2 In Discount

        And Urun listelemede Indirimli checkbox ina tiklar
        Then Sadece Indirmli urunlerin listelendigini kontrol eder


      Scenario: TC_603 Filter-3 Brand

        And Urun listelemede Marka checkbox ina tiklar
        Then Sadece secili markali urunlerin listelendigini kontrol eder

      @miniSmoke
      Scenario: TC_604 Filter-4 Remove Filter

         Given Urun listelemede Stokta Var ve indirimli secimlerinin disinda herhangi bir secim yapar
         When Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar
         Then Yaptigi secimin temizlendigini kontrol eder



