Feature: US_002 Login Testleri
    @Login
    Scenario: TC_201 Positive Login
      Given Kullanici carrefoursa.com anasayfasina gider.
      And Anasayfadaki Giris Yap butonuna tiklar.
      And Cep Telefonu Numaranız bolumune gecerli bir numara girer
      And Giriş Yapın butonuna tıklar
      And SMS Onay Kodu bolumune geçerli bir Otp kodu girer
      When Tamam butonuna tıklar
      Then Basarili bir giris yaptigini control eder

  @Login
    Scenario: TC_202 Hatali Numara Girilmesi
      And Anasayfadaki Giris Yap butonuna tiklar.
      And Cep Telefonu Numaranız bolumune gecersiz bir numara girer
      And Giriş Yapın butonuna tıklar
      Then Gecersiz numara girildiginde cikan hata mesaji gorulur



