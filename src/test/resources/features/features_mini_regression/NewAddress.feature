@cc
Feature:US_11005_Address_Tests

  Background:
    Given Kullanici login olmus durumdadir
    When Kullanici hesabim buttonuna tiklar
    And Kullanici adresim buttonuna tiklar
    Then Yeni adres olustur buttonuna tiklar


  Scenario Outline: Kullanıcı Eksik Bilgilerle Giriş Yapamaz.Adres Tipi: <addressType>,Isim: <firstName>,Soyisim:<lastName>Adres:<address>,E-posta:<email>,CepTel:<phoneNumber>

    And  Adres tipi girilir "<addressType>"
    And Kullanici ismi girilir "<firstName>"
    And Kullanici soyismi girilir "<lastName>"
    And Kullanici adresi girilir "<address>"
    And Kullanici epostasi girilir "<email>"
    And Kullanici telefon numarasi girilir "<phoneNumber>"
    And Bu adresi kaydet buttonuna basılır
    Then Hata mesaji alinir "<message>"

  Examples:

  | addressType | firstName | lastName | address               | email                       | phoneNumber | message                            |

  | empty       | NTTDATA   | BUSINESS | Barbaros, Begonya Sk. | test5801111151@csa-load.com | 800000047   | Doldurmanız zorunludur             |
  | Carrefoursa | empty     | BUSINESS | Barbaros, Begonya Sk. | test5801111151@csa-load.com | 800000047   | Lütfen isim giriniz                |
  | Carrefoursa | NTTDATA   | empty    | Barbaros, Begonya Sk. | test5801111151@csa-load.com | 800000047   | Soyisim                            |
  | Carrefoursa | NTTDATA   | BUSINESS | empty                 | test5801111151@csa-load.com | 800000047   | Lütfen adres giriniz               |
  | Carrefoursa | NTTDATA   | BUSINESS | Barbaros, Begonya Sk. | empty                       | 800000047   | Geçerli bir e-posta adresi girin   |
  | Carrefoursa | NTTDATA   | BUSINESS | Barbaros, Begonya Sk. | test5801111151@csa-load.com | empty       | Geçerli bir telefon numarası girin |


