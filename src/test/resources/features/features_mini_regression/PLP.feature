@regression
Feature: US_011_PLP_Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici kategori tiklar yapar

      Scenario: TC_1101 Populer Urunler

        And Kullanici herhangi bir kategoriye tiklar
        Then Kullanici populer urunleri gorur

      Scenario:  TC_1102 Tum Kategoriler



      Scenario: TC_1103  Sub Kategoriler

        And Kullanici herhangi bir kategoriye tiklar
        Then Kullanici alt kategori urunleri gorur

      @ignore
        #Test case bölgesel stok olmadığından uygulamıyor
      Scenario:  TC_1104 Bolgesel Stok Kontrolu

      @ignore
        #Pre Prod ortamında kampanyalar sayfası açılmamaktadır
      Scenario:  TC_1105 Kampanyalar

        And Kullanici kampanyalar kategorisine tiklar
        And Kullanici kampanyalari ekranda gorur

      @ignore
        #Pre Prod ortamında kampanyalar sayfası açılmamaktadır
      Scenario:  TC_1106 Kampanyalar-1

        And Kullanici kampanyalar kategorisine tiklar
        And Kullanici indirimli urunlere tiklar
        Then Kullanici kampanyalari ekranda gorur

      Scenario:  TC_1107 PLP Marka

        And Kullanici herhangi bir kategoriye tiklar
        And Kullanici bir markaya tiklar
        Then Kullanici tiklanan markaya ait urunleri listelendigi gorur

      Scenario:  TC_1108 PLP Fiyat

        And Kullanici herhangi bir kategoriye tiklar
        And Kullanici fiyat araligini secer
        And Kullanici fiyat araligini ekranda gorur
