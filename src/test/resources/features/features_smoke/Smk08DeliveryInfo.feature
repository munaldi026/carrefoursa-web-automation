@smoke
Feature: US_08 Delivery Tests

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: TC_8001_teslimat-magaza_haritada_gor
    Given Ana sayfadaki Teslimat Seceneginiz linkine tiklar
    And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
    And Teslim alinacak magazayi secer
    When Secilen magaza icin haritada gor linkine tiklar
    Then Yeni bir sekmede haritanin acildigini kontrol eder

  Scenario: TC_8002_teslimat-magaza_tercihler
    Given Ana sayfadaki Teslimat Seceneginiz linkine tiklar
    And Cikan pop-up uzerinde Size Getirelim ve Magazadan Alin seceneklerinin goruldugunu kontrol eder

  Scenario: TC_8003_teslimat-teslimat_saatleri
    Given Ana sayfadaki Teslimat saatleri linkine tiklar
    Then Cikan pop-up uzerinde Bolgenizin Teslimat saatleri seceneklerinin goruldugunu kontrol eder




