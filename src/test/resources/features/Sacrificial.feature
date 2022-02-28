
Feature: US_025_Sacrificial_Tests

    Background:
     Given Kullanici login olmus durumdadir
     And Kurbanlik icin arama yapmak uzere urunun adini yazar
     And Kullanici arattigi kurbanlik urunune tiklar
     And PDP sayfasindaki Sepete ekle butonuna tiklar
     And Kurbanligin sepete eklendigini kontrol eder.


  Scenario: TC_2501 Kurban-Bagissiz

    Given Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Teslimat adresi secer
    And Adres secimi sayfasinda Devam Et butonuna tiklar
    And Vekalet & Bagis sayfasina geldigini kontrol eder
    And Bu sayfada Vekalet vermek istedigi kisiyi secer
    And Teslimat zamani sayfasinda Devam Et butonuna tiklar
    And Teslimat sayfasindaki siparis notu bolumune not yazilir
    And Teslimat zamani sayfasinda Devam Et butonuna tiklar
    And Odeme sayfasinda kapida nakit odeme tercihini secer
    And Bu sayfada tahsilat saatini secer
    When Odeme sekli sayfasinda Siparisi Tamamla butonuna tiklar
    Then Kullanici siparisin tamamlandigini kontrol eder


  Scenario: TC_2502 Kurban-Bagis
    Given Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Teslimat adresi secer
    And Adres secimi sayfasinda Devam Et butonuna tiklar
    And Vekalet & Bagis sayfasina geldigini kontrol eder
    And Bu sayfada Vekalet vermek icin bir kisi secer
    And Bagis yapmak istiyorum checkbox'ini kontrol eder
    And Bagis yapmak istedigi Kurumu secer
    And Vekalet & Bagis sayfasindaki Devam et butonuna tiklar
    And Bagis icin sectigi kurumun dogrulugunu kontrol eder
    And Teslimat sayfasindaki siparis notu bolumune not yazilir
    And Bu sayfada Devam et butonuna tiklar
    And Odeme sekli olarak Kredi Karti secenegine tiklar
    And Kredi Karti bilgilerini doldurur
    When Teslimat zamani sayfasinda Devam Et butonuna tiklar
    Then Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder
    Then Sepetteki urunu siler


  Scenario: TC_2503 Kurban-Eksik Bilgiler

    Given Kullanici Ana Sayfadaki Sepetim butonuna tiklar
    And Teslimat adresi secer
    And Adres secimi sayfasinda Devam Et butonuna tiklar
    And Vekalet & Bagis sayfasina geldigini kontrol eder
    When Bu sayfada Vekalet vermek istedigi kisi ismini bos birakir ve Devam et butonuna tiklar
    Then Eksik Bilgilerle devam edemeyecegini kontrol eder
    Then Sepetteki urunu siler

  Scenario: TC_2504 Kurban-Tek basina satilan urun

    Given Kullanici belirli bir urunu aratir
    And Kullanici arattigi urunune tiklar
    And PDP sayfasindaki Sepete ekle butonuna tiklar
    When Cikan pop-up uzerindeki vazgec butonuna tiklar
    Then Sepette kurbanlik urun varken baska bir urun eklenemeyecegini kontrol eder
    Then Sepetteki urunu siler






