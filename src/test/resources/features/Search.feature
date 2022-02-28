@search
Feature: US_004_Search_Tests

      Background:
        Given Kullanici login olmus durumdadir

          # Canli ortamda bu test run yapildiginda
          # LoginPage'de bulunan
          # wellcomePop_upClose.click();
          # ReusableMethods.closeCerez(); kapatilmalidir


      Scenario: TC_401 Arama-1
        And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
        Then Kullanici Arama Yaptigi Urun Tiplerini Gorur


      Scenario: TC_402 Arama-2
        And Kullanici Arama Kismina Aranacak Kelimeyi Girer
        And Kullanici Ara Buttonuna Tiklar
        Then Arama Yaptigi Urun Tiplerini Gorur


      Scenario: TC_403 Arama-3
        And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
        And Kullanici Ara Buttonuna Tiklar
        Then Kullanici Populer Basligini Gorur

      @miniSmoke
      Scenario: TC_404 Arama-Bos

        Given Kullanici Ana Sayfadaki Arama kutusuna tiklar
        And Arama kutusuna hicbir sey yazmaz
        When Kullanici Ara Buttonuna Tiklar
        Then Arama yapilamayacagini kontrol eder

      @miniSmoke
      Scenario: TC_405 Arama-Tek Harf

        Given Kullanici Ana Sayfadaki Arama kutusuna tiklar
        And Arama kutusuna sadece tek bir harf yazar
        When Kullanici Ara Buttonuna Tiklar
        Then Arama yapilamayacagini kontrol eder