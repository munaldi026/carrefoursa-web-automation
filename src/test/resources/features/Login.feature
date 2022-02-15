
Feature: US_002_Login_Tests

      Background:
       Given Anasayfadaki Giris Yap butonuna tiklar.

      Scenario: TC_201 Positive Login
        And Cep Telefonu Numaraniz bolumune gecerli bir numara girer
        And Giris Yapin butonuna tiklar
        And SMS Onay Kodu bolumune gecerli bir Otp kodu girer
        When Tamam butonuna tiklar
        Then Basarili bir giris yaptigini control eder

      Scenario: TC_202 Hatali Numara Girilmesi
        And Cep Telefonu Numaraniz bolumune gecersiz bir numara girer
        And Giris Yapin butonuna tiklar
        Then Gecersiz numara girildiginde cikan hata mesaji gorulur

      Scenario: TC_203 Hatali Otp Girilmesi
        And Cep Telefonu Numaraniz bolumune gecerli bir numara girer
        And Giris Yapin butonuna tiklar
        And SMS Onay Kodu bolumune gecersiz bir Otp kodu girer
        When Tamam butonuna tiklar
        Then Gecersiz SMS onay hata mesaji gorulur

      Scenario: TC_204 LogOut
        And Cep Telefonu Numaraniz bolumune gecerli bir numara girer
        And Giris Yapin butonuna tiklar
        And SMS Onay Kodu bolumune gecerli bir Otp kodu girer
        When Tamam butonuna tiklar
        Then Basarili bir giris yaptigini control eder
        And Kullanici Hesabim butonuna tiklar
        And Kullanıcı cikis yap buttonuna tiklar
        Then Kullanıcı cikis yaptigini gorur




