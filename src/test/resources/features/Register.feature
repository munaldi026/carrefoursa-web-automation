Feature:

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

  Scenario: TC_102 NegativeRegister
    And Kullanici uye ol buttonuna tiklar
    And Cep Telefonu Numaraniz bolumune gecersiz bir numara girilir
    And Email bolumune email girilir
    And Iletişim izni checkbox tiklanir
    And Uyelik beyani checkbox tiklanir
    And Aydintlatma beyani checkbox tiklanır
    And Kullanici uye olun buttonuna tiklar
    Then Gecersiz numara girildiginde cikan hata mesaji ekranda gorulur

  Scenario: TC_104 NegativeRegister
    And Kullanici uye ol buttonuna tiklar
    And Cep Telefonu Numaraniz bolumune kayitli olmayan bir numara girer
    And Email bolumune email girilir
    And Iletişim izni checkbox tiklanir
    And Uyelik beyani checkbox tiklanir
    And Aydintlatma beyani checkbox tiklanır
    And Kullanici uye olun buttonuna tiklar
    And Kullanici sms bolumune gecersiz otp girilir
    Then Kullanici gecersiz SMS onay hata mesaji gorulur