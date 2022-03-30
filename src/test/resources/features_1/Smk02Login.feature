@smoke
Feature: US_02 Login Tests

  Background:
    Given Anasayfadaki Giris Yap butonuna tiklar.

  Scenario: TC_2001_positive_login
    And Cep Telefonu Numaraniz bolumune gecerli bir numara girer
    And Giris Yapin butonuna tiklar
    And SMS Onay Kodu bolumune gecerli bir Otp kodu girer
    When Tamam butonuna tiklar
    Then Basarili bir giris yaptigini control eder

  Scenario: TC_2002_giris_yapamiyorum
    And Kullanıcı giris yapamiyorum buttonuna tiklar
    And Dogrulama kodu icin bir email adresi girilir
    And Dogrulama baglantisi gonder buttonu tiklanir
    Then Ekranda dogrulama mesaji gonderildi mesajı gorulur

  Scenario: TC_2003_success_logout
    And Cep Telefonu Numaraniz bolumune gecerli bir numara girer
    And Giris Yapin butonuna tiklar
    And SMS Onay Kodu bolumune gecerli bir Otp kodu girer
    When Tamam butonuna tiklar
    Then Basarili bir giris yaptigini control eder
    And Kullanici Hesabim butonuna tiklar
    And Kullanıcı cikis yap buttonuna tiklar
    Then Kullanıcı cikis yaptigini gorur

  Scenario Outline: TC_2004_2005_2006_kullanıcı_yanlıs_telefon_numarasi_ile_giris_yapamaz: <phone_number>

    And Cep Numaraniz bolumune bir numara girer"<phoneNumber>"
    And Giris Yapin butonuna tiklar
    Then kullanici hata mesaji alir "<message>"

    Examples:
      | phoneNumber | message                                                                          |
      | empty       | Lütfen cep telefonu numaranızı giriniz.                                          |
      | 50007474    | Geçerli bir telefon numarası girmelisiniz.                                       |
      | 500074740   | Lütfen girdiğiniz cep telefonu numarasını kontrol ederek tekrar deneyiniz.                                       |

  Scenario Outline: TC_2007_2008_kullanıcı_yanlıs_otp_koduyla_giris_yapamaz: <otpCode>
    And Cep Telefonu Numaraniz bolumune gecerli bir numara girer
    And Giris Yapin butonuna tiklar
    And SMS Onay Kodu bolumune bir Otp kodu girer"<otpCode>"
    When Tamam butonuna tiklar
    Then kullanici hata mesaji alir "<message>"

    Examples:

      | otpCode   | message                                                                          |
      | 123458    | Girdiğiniz kod hatalıdır, lütfen kontrol ederek tekrar deneyiniz.                |
      | empty     | Kodu eksik girdiniz. Lütfen size SMS ile gönderdiğimiz 6 haneli kodu giriniz.    |
