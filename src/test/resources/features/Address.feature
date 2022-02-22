
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


  Scenario: TC_505 Bireysel Adres Tipi Alani Bos Birakilir

    And Yeni adres olustur buttonuna tiklar
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
    Then Bu Alanı Doldurmanız Zorunlu Yazısı Gorulur

  Scenario: TC_506 Bireysel Adres İsim Alani Bos Birakilir

    And Yeni adres olustur buttonuna tiklar
    And Adres tipi girilir
    And Kullanici soyismi girilir
    And Kullanici kimlik numarasi girilir
    And Kullanici sehiri girer
    And Kullanici ilceyi girer
    And Kullanici mahalleyi girer
    And Kullanici adresi girilir
    And Kullanici epostasi girilir
    And Kullanici telefon numarasi girilir
    And Bu adresi kaydet buttonuna basılır
    Then Lutfen isim giriniz yazısını gorursunuz


  Scenario: TC_507 Bireysel Adres Soyisim Alani Bos Birakilir

    And Yeni adres olustur buttonuna tiklar
    And Adres tipi girilir
    And Kullanici ismi girilir
    And Kullanici kimlik numarasi girilir
    And Kullanici sehiri girer
    And Kullanici ilceyi girer
    And Kullanici mahalleyi girer
    And Kullanici adresi girilir
    And Kullanici epostasi girilir
    And Kullanici telefon numarasi girilir
    And Bu adresi kaydet buttonuna basılır
    Then Lutfen soyisim giriniz yazısını gorursunuz


  Scenario: TC_508 Bireysel Adres sehir Alani Bos Birakilir

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

  Scenario: TC_509 Bireysel Adres İlce Alani Bos Birakilir

    And Yeni adres olustur buttonuna tiklar
    And Adres tipi girilir
    And Kullanici ismi girilir
    And Kullanici soyismi girilir
    And Kullanici kimlik numarasi girilir
    And Kullanici sehiri girer
    And Kullanici adresi girilir
    And Kullanici epostasi girilir
    And Kullanici telefon numarasi girilir
    And Bu adresi kaydet buttonuna basılır
    Then Lutfen ilce giriniz yazısını gorursunuz


  Scenario: TC_510 Bireysel Adres Mahelle Alani Bos Birakilir

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
    Then Lutfen Mahalle giriniz yazısını gorursunuz

  Scenario: TC_511 Bireysel Adreste Adres Alani Bos Birakilir

    And Yeni adres olustur buttonuna tiklar
    And Adres tipi girilir
    And Kullanici ismi girilir
    And Kullanici soyismi girilir
    And Kullanici kimlik numarasi girilir
    And Kullanici sehiri girer
    And Kullanici ilceyi girer
    And Kullanici mahalleyi girer
    And Kullanici epostasi girilir
    And Kullanici telefon numarasi girilir
    And Bu adresi kaydet buttonuna basılır
    Then Lutfen Adres giriniz yazısını gorursunuz


  Scenario: TC_512 Bireysel Adres Eposta Alani Bos Birakilir

    And Yeni adres olustur buttonuna tiklar
    And Adres tipi girilir
    And Kullanici ismi girilir
    And Kullanici soyismi girilir
    And Kullanici kimlik numarasi girilir
    And Kullanici sehiri girer
    And Kullanici ilceyi girer
    And Kullanici mahalleyi girer
    And Kullanici adresi girilir
    And Kullanici telefon numarasi girilir
    And Bu adresi kaydet buttonuna basılır
    Then Lutfen Email giriniz yazısını gorursunuz
