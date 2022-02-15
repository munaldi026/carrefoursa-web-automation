
Feature: US_004_Search_Tests

      Background:
        Given Kullanici login olmus durumdadir
        And  Kullanici Arama Kismina Aranacak Kelimeyi Girer

          # Canli ortamda bu test run yapildiginda
          # LoginPage'de bulunan
          # wellcomePop_upClose.click();
          # ReusableMethods.closeCerez(); kapatilmalidir


      Scenario: TC_401 Arama-1

        Then Kullanici Arama Yaptigi Urun Tiplerini Gorur


      Scenario: TC_402 Arama-2

        And Kullanici Ara Buttonuna Tiklar
        Then Arama Yaptigi Urun Tiplerini Gorur


      Scenario: TC_403 Arama-3

        And Kullanici Ara Buttonuna Tiklar
        Then Kullanici Populer Basligini Gorur