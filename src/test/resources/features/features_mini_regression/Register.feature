@regression
Feature: US_001_Register_Tests

      Scenario: TC_001 PositiveRegister
        And Kullanici uye ol buttonuna tiklar
        And Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer
        And Email bolumune email girilir
        And Iletişim izni checkbox tiklanir
        And Uyelik beyani checkbox tiklanir
        And Aydintlatma beyani checkbox tiklanır
        And Kullanici uye olun buttonuna tiklar
        And SMS Onay Kodu bolumune otp kodu girilir
        When Kullanici bulundugu sehiri girer
        And Kullanici bulundugu ilceyi girer
        And Kullanici bulundugu mahalleyi girer
        And Kullanici devam buttonuna tiklar
        Then Kullanici hosgeldiniz pop-up gorur

      Scenario: TC_102 NegativeRegister Eksik Numara ile Giris
        And Kullanici uye ol buttonuna tiklar
        And Cep Telefonu Numaraniz bolumune gecersiz bir numara girilir
        And Email bolumune email girilir
        And Iletişim izni checkbox tiklanir
        And Uyelik beyani checkbox tiklanir
        And Aydintlatma beyani checkbox tiklanır
        And Kullanici uye olun buttonuna tiklar
        Then Gecersiz numara girildiginde cikan hata mesaji ekranda gorulur

      Scenario: TC_103 NegativeRegister
        And Kullanici uye ol buttonuna tiklar
        And Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer
        And Email bolumune email girilir
        And Iletişim izni checkbox tiklanir
        And Uyelik beyani checkbox tiklanir
        And Aydintlatma beyani checkbox tiklanır
        And Kullanici uye olun buttonuna tiklar
        And Kullanici sms bolumune gecersiz otp girilir
        Then Kullanici gecersiz SMS onay hata mesaji gorulur

      Scenario: TC_104 NegativeRegister
        And Kullanici uye ol buttonuna tiklar
        And Email bolumune email girilir
        And Iletişim izni checkbox tiklanir
        And Uyelik beyani checkbox tiklanir
        And Aydintlatma beyani checkbox tiklanır
        And Kullanici uye olun buttonuna tiklar
        Then Lutfen telefon numarasi giriniz yazisi gorulur


      Scenario: TC_105 NegativeRegister
        And Kullanici uye ol buttonuna tiklar
        And Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer
        And Email bolumune email girilir
        And Iletişim izni checkbox tiklanir
        And Uyelik beyani checkbox tiklanir
        And Aydintlatma beyani checkbox tiklanır
        And Kullanici uye olun buttonuna tiklar
        And SMS Onay Kodu bolumune otp kodu bos birakilir
        Then Sms kodunu eksik girdiniz yazisi gorulur

      Scenario: TC_106 Hatali Email Register
        And Kullanici uye ol buttonuna tiklar
        And Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer
        And Hatali bir email adresi girilir
        And Iletişim izni checkbox tiklanir
        And Uyelik beyani checkbox tiklanir
        And Aydintlatma beyani checkbox tiklanır
        And Kullanici uye olun buttonuna tiklar
        Then Gecerli bir email girilmeli yazisi gorulur