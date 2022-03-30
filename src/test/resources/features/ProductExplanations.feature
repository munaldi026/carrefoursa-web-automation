@regression
Feature: US_015_Product_Explanations_Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici herhangi bir urunu aratir
        When Kullanici arattigi urunune tiklar


        Scenario: TC_1501 Urun Aciklamalari Gorunurlugu Testi
          Then Kullanici sectigi urunun, urun aciklamalarinin gorunur oldugunu kontrol eder


        Scenario: TC_1502 Urunlere Yorum Gonderilmesi Testi
          Given PDP sayfasindaki Degerlendir linkine tiklar
          And Cikan Yorum yaz formunu doldurur
          When Kullanici Yorumu gonder butonuna tiklar
          Then Yapilan yorumun gonderildigini kontrol eder


          Scenario: TC_1503 Urun Taksit Bilgileri Gorunurlugu Testi
          And PDP sayfasindaki Taksit Bilgileri linkine tiklar
          Then Kullanici PDP sayfasinda,sectigi urunle ilgili Taksit bilgilerinin geldigini kontrol eder


          Scenario: TC_1504 Market Urunlerinde Garanti&Iade process Testi
          Given PDP sayfasindaki Garanti&Iade linkine tiklar
          And Iade sureclerimiz butonuna tiklar
          When Acilan sayfada Market Alisverislerinde linkine tiklar
          Then Market process bilgilerinin geldigini kontrol eder


          Scenario: TC_1505 Internet Urunlerinde Garanti&Iade process Testi
          Given PDP sayfasindaki Garanti&Iade linkine tiklar
          And Iade sureclerimiz butonuna tiklar
          When Acilan sayfada Internet Alisverislerinde linkine tiklar
          Then Internet process bilgilerin geldigini kontrol eder
