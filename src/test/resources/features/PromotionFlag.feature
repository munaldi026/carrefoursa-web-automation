@miniSmoke
Feature: US_023_Promotion_Flag_Tests


      Background:
          Given Kullanici login olmus durumdadir
          When Kullanici Ana Sayfadaki hamburger menu iconuna hover yapar
          Then Katalog urunleri ,Firsatlar linkine tiklar


          Scenario: TC_2301 Promotion Flag-True

          Given PromotionFlag linki altindaki true linkine tiklar
          And Promotion flag tasiyan urunlerin listelendigini kontrol eder
          When Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar


          Scenario: TC_2302 Promotion Flag-False

          Given PromotionFlag linki altindaki false linkine tiklar
          And Promotion flag tasiyan urunlerin listelenmedigini kontrol eder
          When Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar

