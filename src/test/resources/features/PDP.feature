
Feature: US_010_PDP_Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici belirli bir urunu aratir
        When Kullanici arattigi urunune tiklar


      Scenario: TC_1001 alisverisListeEkle
        And PDP sayfasindaki Alisveris listeme ekle linkine tiklar
        Then Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder


      Scenario: TC_1002 alisverisListeCikar
        And PDP sayfasindaki Alisveris listeme ekle linkine tiklar
        And Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder
        And Alisveris Listesindeki eklenmis olan urune tiklayarak PDP sayfasina doner
        And PDP sayfasindaki Alisveris listemden cikar linkine tiklar
        Then Urunun Alisveris listesinden cıkarildigini kontrol eder

      Scenario: TC_1003 PDPSepeteEkle
        And PDP sayfasindaki Sepete ekle butonuna tiklar
        And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
        Then Sectigi urunun sepete eklendigini kontrol eder

      @miniSmoke
      Scenario:  TC_1004 PDPSepette Maximum Satinalma
        And PDP urun adedini maximum oranda artirir
        When Maximum satin alma limitine ulastigini kontrol eder


