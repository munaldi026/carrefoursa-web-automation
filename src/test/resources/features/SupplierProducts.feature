@miniSmoke
Feature: US_020_Supplier_Products_Tests

      Background:
        Given Kullanici login olmus durumdadir
        Then Tek basina satilan bir urun adi yazar
        When PLP sayfasindaki Sepete ekle butonuna tiklar
        Then Kullanici Ana Sayfadaki Arama kutusuna tiklar


        Scenario: TC_2001 Same Supplier

          Given Tek basina satilan ve ayni tedarikciye ait baska bir urun adi yazar
          And PLP sayfasindaki Sepete ekle butonuna tiklar
          And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
          When Her iki urununde sepete eklendigini konrtol eder
          Then Sepeti tamamen bosaltarak Anasayfaya doner


        Scenario: TC_2002 Different Supplier-Go On

          Given  Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar
          And PLP sayfasindaki Sepete ekle butonuna tiklar
          And PLP sayfasinda cikan pop_up uzerindeki Devam Et butonuna tiklar
          When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
          Then Farkli iki tedarikciye ait olan yeni urunlerin eklenemedigini kontrol eder

        Scenario: TC_2003 Different Supplier-Give Up

          Given  Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar
          And PLP sayfasindaki Sepete ekle butonuna tiklar
          And PLP sayfasinda cikan pop_up uzerindeki Vazgec butonuna tiklar
          When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
          Then Farkli iki tedarikciden ilki tercih edildigi icin ilk urunun sepetten silinmedigini kontrol eder








