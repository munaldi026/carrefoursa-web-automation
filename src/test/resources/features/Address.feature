Feature:
Background:
  Given Kullanici login olmus durumdadir

  Scenario: TC_501 Adres Ekleme
    When Kullanici hesabim buttonuna tiklar
    And Kullanici adresim buttonuna tiklar
    And Yeni adres olustur buttonuna tiklar
    And Adres tipi girilir
    And Kullanici ismi girilir
    And Kullanici soyismi girilir
    And Kullanici kimlik numarasi girilir
    And Kullanici sehiri girer
    And Kullanici ilceyi girer
    And Kullanici mahalleyi girer
    And Kullanici adresi girilir
    And Kullanici epostasi girilir
    And Kullanici telefon numarasi girilir
    And Bu adresi kaydet buttonuna basılır
    Then Adresin basarili sekilde kayıtedildiği gorulur

    Scenario: TC_502 Adres Güncelleme
      When Kullanici hesabim buttonuna tiklar
      And Kullanici adresim buttonuna tiklar
      And Kullanici duzenle buttonuna tiklar
      And Kullanici adres ismini degistirir
      And Adresi guncelle buttonu tiklanir
      Then Adresi ismi basarili bir sekilde degistigi gorulur

  Scenario: TC_502 Adres Silme
    When Kullanici hesabim buttonuna tiklar
    And Kullanici adresim buttonuna tiklar
    And Kullanici sil buttonuna tiklar
    And Popup uzerinde evet tiklanir
    Then Adresin silindigi gorulur
