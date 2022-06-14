Feature: US_26 Plp Price

  Background:
    Given Kullanici login olmus durumdadir


  Scenario: TC_2601 FiyatEnAz
    And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
    And Kullanici Ara Buttonuna Tiklar
    And Kullanıcı filitre kısmındaki en az kısmına fiyat girer
    And Kullanıcı uygulama buttonuna tiklanir
    Then Fiyatlarin, girilen fiyat degeri minimum olmak uzere gelmis oldugunu kontrol eder

  Scenario: TC_2602 FiyatEnFazla
    And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
    And Kullanici arama buttonuna tiklar
    And Kullanıcı filitre kısmındaki en fazla kısmına fiyat girer
    And Kullanıcı uygulama buttonuna tiklanir
    Then Fiyatlarin girilen fiyat degeri maximum olmak uzere gelmis oldugunu kontrol eder


  Scenario: TC_2603 FiyatEnAzEnCok
    And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
    And Kullanici arama buttonuna tiklar
    And Kullanıcı filitre kısmındaki en az kısmına fiyat girer
    And Kullanıcı filitre kısmındaki en fazla kısmına fiyat girer
    And Kullanıcı uygulama buttonuna tiklanir
    Then Fiyatlarin girilen fiyat degeri maximum olmak uzere gelmis oldugunu kontrol eder


  Scenario: TC_2604 FiltreTemizle
    And  Kullanici Arama Kismina Aranacak Kelimeyi Girer
    And Kullanici arama buttonuna tiklar
    And Kullanıcı filitre kısmındaki en az kısmına fiyat girer
    And Kullanıcı filitre kısmındaki en fazla kısmına fiyat girer
    And Kullanıcı uygulama buttonuna tiklanir
    Then Fiyatlarin girilen fiyat degeri maximum olmak uzere gelmis oldugunu kontrol eder




