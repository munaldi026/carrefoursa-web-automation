Feature: US_002 Login Testleri
    @positiveLogin
    Scenario: TC_201 Positive Login
      Given Kullanici carrefoursa.com anasayfasina gider.
      And Anasayfadaki Giris Yap butonuna tiklar.
      And Cep Telefonu Numaranız bolumune gecerli bir numara girer
      And Giriş Yapın butonuna tıklar
      And SMS Onay Kodu bolumune geçerli bir Otp kodu girer
      When Tamam butonuna tıklar
      Then Basarili bir giris yaptigini control eder





