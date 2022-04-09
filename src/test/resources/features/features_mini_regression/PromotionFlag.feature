@regression
Feature: US_023_Promotion_Flag_Tests


#      Background:
#          Given Kullanici login olmus durumdadir
#          When Kullanici Ana Sayfadaki Katalog urunleri ,Firsatlar linkine tiklar
#          Then Gelen sayfada Firsatlar tumunu goster linkine tiklar


          Scenario: TC_2301 Promotion Flag-True

              Given Kullanici login olmus durumdadir
              When Kullanici Ana Sayfadaki Katalog urunleri ,Firsatlar linkine tiklar
              Then Gelen sayfada Firsatlar tumunu goster linkine tiklar
          Given PromotionFlag linki altindaki true linkine tiklar
          And Promotion flag tasiyan urunlerin listelendigini kontrol eder
          When Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar


          Scenario: TC_2302 Promotion Flag-False

          Given PromotionFlag linki altindaki false linkine tiklar
          And Promotion flag tasiyan urunlerin listelenmedigini kontrol eder
          When Filitreleri temizle kisminda yapmis oldugu secimin yanindaki x'a  tiklar

