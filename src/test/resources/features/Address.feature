
Feature:US_005_Address_Tests

      Background:
        Given Kullanici login olmus durumdadir
        When Kullanici hesabim buttonuna tiklar
        And Kullanici adresim buttonuna tiklar

        Scenario: TC_501 Adres Ekleme

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

            And Kullanici duzenle buttonuna tiklar
            And Kullanici adres ismini degistirir
            And Adresi guncelle buttonu tiklanir
            Then Adresi ismi basarili bir sekilde degistigi gorulur

          Scenario: TC_503 Adres Silme

            And Kullanici sil buttonuna tiklar
            And Popup uzerinde evet tiklanir
            Then Adresin silindigi gorulur

  Scenario: TC_504 Adres Silme Hayir Popup Secilir
    And Kullanici sil buttonuna tiklar
    And Popup uzerinde hayir tiklanir
    Then Adresin silinmedigi gorulur