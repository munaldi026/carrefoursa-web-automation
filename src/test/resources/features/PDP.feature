Feature: US_010 PDP Testleri

    Background:
      Given Kullanici login olmus durumdadir
      And Herhangi bir urunu secer
      When Kullanici sectigi urunun uzerine tiklar

    @alisverisListeEkle
    Scenario:
      And PDP sayfasindaki Alisveris listeme ekle linkine tiklar
      Then Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder

    @alisverisListeCikar
    Scenario:
      And PDP sayfasindaki Alisveris listeme ekle linkine tiklar
      And Kullanici sectigi urunun Alisveris listesine eklendigini kontrol eder
      And Alisveris Listesindeki eklenmis olan urune tiklayarak PDP sayfasina doner
      And PDP sayfasindaki Alisveris listemden cikar linkine tiklar
      Then Urunun Alisveris listesinden cıkarildigini kontrol eder
    @pdpSepeteEkle
    Scenario:
    And PDP sayfasindaki Sepete ekle butonuna tiklar
    And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    Then Sectigi urunun sepete eklendigini kontrol eder


