@smoke
Feature: US_01 Register Tests

  Background:
    Given Kullanici uye ol buttonuna tiklar

#    Scenario: TC_1001_positive_register
#
#    And Cep Telefonu Numaraniz bolumune bir numara girer
#    And Email bolumune bir email girilir
#    And Iletişim izni checkbox tiklanir
#    And Uyelik beyani checkbox tiklanir
#    And Aydintlatma beyani checkbox tiklanır
#    And Kullanici uye olun buttonuna tiklar
#    And SMS Onay Kodu bolumune otp kodu girilir
#    And Kullanici bulundugu sehiri girer
#    And Kullanici bulundugu ilceyi girer
#    And Kullanici bulundugu mahalleyi girer
#    And Kullanici devam buttonuna tiklar
#    Then Kullanici hosgeldiniz pop-up gorur


  Scenario Outline: TC_1002_1003_1004_1005_kullanıcı_yanlıs_bilgilerle_uye_olamaz:<phone_number>,<email>

    And Register Cep Telefonu Numaraniz bolumune bir numara girer"<phoneNumber>"
    And Email bolumune email girilir"<email>"
    And Iletişim izni checkbox tiklanir
    And Uyelik beyani checkbox tiklanir
    And Aydintlatma beyani checkbox tiklanır
    And Kullanici uye olun buttonuna tiklar
    Then kullanici hata mesaji alir "<message>"

    Examples:

    | phoneNumber | email                       | message                                                      |
    | empty       | test5801111151@csa-load.com | Lütfen cep telefonu numaranızı giriniz.                      |
    | 800000047   | empty                       | Lütfen e-posta adresinizi giriniz.                           |
    | 800000047   | wrongEmail@gmail.com        | Girdiğiniz cep telefonu numarası sistemimizde kayıtlıdır.    |
    | 444558877   | test5801111151@csa-load.com | Bu e-posta adresi ile bir kullanıcı sistemimizde kayıtlıdır. |



