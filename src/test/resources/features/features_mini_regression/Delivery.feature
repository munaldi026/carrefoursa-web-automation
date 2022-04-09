@regression
Feature: US_028_Delivery_Tests

    Background:
      Given Kullanici login olmus durumdadir


    Scenario: TC_2801 Teslimat-Magaza Haritada Gor
      Given Ana sayfadaki Teslimat Seceneginiz linkine tiklar
      And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
      And Teslim alinacak magazayi secer
      When Secilen magaza icin haritada gor linkine tiklar
      Then Yeni bir sekmede haritanin acildigini kontrol eder

    Scenario: TC_2802 Teslimat-Magaza Tekli secim
      Given Ana sayfadaki Teslimat Seceneginiz linkine tiklar
      And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
      And Teslim alinabilecek magazalarin listelendigini kontrol eder
      And Magazalardan birini secer
      When Ilk secim aktif iken ikinci bir secim yapar
      Then Ikili secim yapamayacagini kontrol eder.

    Scenario: TC_2803 Teslimat-Magaza Tercihler
      Given Ana sayfadaki Teslimat Seceneginiz linkine tiklar
      And Cikan pop-up uzerinde Size Getirelim ve Magazadan Alin seceneklerinin goruldugunu kontrol eder

    Scenario: TC_2804 Teslimat-Teslimat Saatleri
      Given Ana sayfadaki Teslimat saatleri linkine tiklar
      Then Cikan pop-up uzerinde Bolgenizin Teslimat saatleri seceneklerinin goruldugunu kontrol eder

    Scenario: TC_2805 Teslimat-Teslimat Bolgesi

      Given Ana sayfadaki Teslimat Bolgeniz linkine tiklar
      And Bolgenizi ogrenebilir miyiz pop-up'inin geldigi kontrol edilir
      And Pop-up uzerindeki bilgiler doldurulur
      When Devam et butonuna tiklanir
      When Gelen pop-up uzerindeki devam et butonuna tiklanir
      Then Yapilan secimin dogrulugu kontrol edilir

    Scenario: TC_2806 Teslimat-Stokta Olmayan Urun
      Given Kullanici yeni Teslimat bolgesi secer
      Given Kullanici stokta olmayan bir urunu aratir
      When PLP sayfasindaki Sepete ekle butonuna tiklar
      Then Cikan pop-up uzerinde Yeterli stok olmadigi uyarisinin goruldugunu kontrol eder


