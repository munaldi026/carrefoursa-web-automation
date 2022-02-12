
      Feature: US_020 Supplier Products Tests

      Background:
        Given Kullanici login olmus durumdadir
        And Kullanici Ana Sayfadaki Arama kutusuna tiklar
        Then Tek basina satilan bir urun adi yazar
        And Arama butonuna tiklar
        When PLP sayfasindaki Sepete ekle butonuna tiklar
        Then Kullanici Ana Sayfadaki Arama kutusuna tiklar


        Scenario: TC_2001 Same Supplier

          Given Tek basina satilan ve ayni tedarikciye ait baska bir urun adi yazar
          And Arama butonuna tiklar
          And PLP sayfasindaki Sepete ekle butonuna tiklar
          When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
          Then Her iki urununde sepete eklendigini konrtol eder

        Scenario: TC_2002 Different Supplier-Go On

          Given  Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar
          And  Arama butonuna tiklar
          And PLP sayfasindaki Sepete ekle butonuna tiklar
          And PLP sayfasinda cikan pop_up uzerindeki Devam Et butonuna tiklar
          When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
          Then Farkli iki tedarikciye ait olan yeni urunlerin eklenemedigini kontrol eder

        Scenario: TC_2003 Different Supplier-Give Up

          Given  Tek basina satilan ve baska bir tedarikciye ait yeni bir urun adi yazar
          And  Arama butonuna tiklar
          And PLP sayfasindaki Sepete ekle butonuna tiklar
          And PLP sayfasinda cikan pop_up uzerindeki Vazgec butonuna tiklar
          When Kullanici Ana Sayfadaki Sepetim butonuna tiklar
          Then Farkli iki tedarikciden ilki tercih edildigi icin ilk urunun sepetten silinmedigini kontrol eder








