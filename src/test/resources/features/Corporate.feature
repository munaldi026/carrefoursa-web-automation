@regression
Feature: US_012_Corporate_Tests

      Background:
        Given Kullanici login olmus durumdadir

      Scenario: TC_1201 Kurumsal

        And Ana Sayfadaki Kurumsal linkine tiklar
        And ilgili sayfanin acildigini kontrol eder
        When Kullanici Bu sayfadaki Carrefoursa.com'a git linkine tiklar
        Then Ana sayfaya geldigini kontrol eder


      Scenario: TC_1202 En Yakin Magazalarimiz
        And Kullanici Ana Sayfadaki En Yakin CarrefourSa linkine tiklar
        And Sayfanin acildigini kontrol eder


      Scenario: TC_1203 Sizi Dinliyoruz
        When Kullanici Ana Sayfadaki Sizi Dinliyoruz linkine tiklar
        Then Bu sayfanin acildigini kontrol eder