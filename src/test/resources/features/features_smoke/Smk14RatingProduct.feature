
Feature: US_14 Rating Products Tests

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici herhangi bir urunu aratir
    When Kullanici arattigi urunune tiklar
    Then PDP sayfasindaki Degerlendir linkine tiklar

    Scenario: TC_14001_urun_degerlendirme_positive

    Given Gelen sayfada puaniniz kismina bir deger isaretler
    When Adiniz kismindaki default gelen ismi silmeden degerlendir butonuna tiklar
    Then Degerlendirmenin basarili oldugunu kontrol eder

    Scenario: TC_14002_urun_degerlendirme_positive-1

      Given Gelen sayfada puaniniz kismina bir deger isaretler
      When Adiniz kismindaki default gelen ismi siler ve bir isim girer
      And Degerlendir butonuna tiklar
      Then Degerlendirmenin basarili oldugunu kontrol eder

    Scenario: TC_14003_urun_degerlendirme_negative

      Given Gelen sayfada puaniniz kismina bir deger isaretler
      When Adiniz kismindaki default gelen ismi siler
      And Degerlendir butonuna tiklar
      Then Degerlendirmenin basarisiz oldugunu kontrol eder

    Scenario: TC_14004_urun_degerlendirme_negative-1

      Given Gelen sayfada puaniniz kismina herhangi bir deger isaretlemez
      When Adiniz kismindaki default gelen ismi siler ve bir isim girer
      And Degerlendir butonuna tiklar
      Then Yapilan degerlendirmenin basarisiz oldugunu kontrol eder











