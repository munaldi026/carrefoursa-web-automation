
Feature:

    Background:
    Given Kullanici login olmus durumdadir

    @Search
  Scenario: TC_401 Arama-1
    And Kullanıcı Arama Kısmına Aranacak Kelimeyi Girer
    Then Kullanıcı Arama Yaptığı Ürün Tiplerini Görür

  @Search
  Scenario: TC_402 Arama-2
      And Kullanıcı Arama Kısmına Aranacak Kelimeyi Girer
      And Kullanıcı Ara Buttonuna Tıklar
      Then Kullanıcı Arama Yaptığı Ürün Tiplerini Görür

  @Search
  Scenario: TC_403 Arama-3
      And Kullanıcı Arama Kısmına Aranacak Kelimeyi Girer
      And Kullanıcı Ara Buttonuna Tıklar
      Then Kullanıcı Popüler Başlığını Görür