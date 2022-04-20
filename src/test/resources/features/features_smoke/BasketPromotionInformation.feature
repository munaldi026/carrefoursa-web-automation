Feature:Basket Promotion Information Page

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: TC_3000 Promosyon Ürün 2 al 1 öde 1 adet Ürün Alınır
    And Kullanıcı 2 al 1 öde ürününü aratır
    And Sepete 1 ürün eklenir
    And Sepetim Tiklanir
    Then Sepetim Sayfasında Alt kısmında Sarı uyarı yazısı görülür

  Scenario: TC_3001 Promosyon Ürün 2 al 1 öde 2 adet Ürün Alınır
    And Kullanıcı 2 al 1 öde ürününü aratır
    And Sepete 1 ürün eklenir
    And Sepetim Tiklanir
    Then Sepetim Sayfasında Alt kısmında Sarı uyarı yazısı görülür
    And Urun Sayisi iki Yapilir
    Then Sari Uyari Yazisi Kaybolur

  Scenario: TC_3002 Promosyon Ürün Alınır Sepete Limiti Karşılanmaz
    And Kullanıcı 2 al 1 öde ürününü aratır
    And Sepete 1 ürün eklenir
    And Sepetim Tiklanir
    Then Sepet Limiti Karsilanmadigi Gorulur


  Scenario: TC_3003 Promosyon Ürün Alınır Sepete Limiti Karşılanır
    And Kullanıcı 2 al 1 öde ürününü aratır
    And Sepete 1 ürün eklenir
    And Sepetim Tiklanir
    Then Sepetim Sayfasında Alt kısmında Sarı uyarı yazısı görülür
    And Urun Sayisi iki Yapilir
    Then Sari Uyari Yazisi Kaybolur