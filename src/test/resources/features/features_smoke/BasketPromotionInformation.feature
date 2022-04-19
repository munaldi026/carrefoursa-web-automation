Feature:

  Background:
    Given Kullanici login olmus durumdadir

    Scenario: TC_3000 Promosyon Ürün 2 al 1 öde 1 adet Ürün Alınır
      And Kullanıcı 2 al 1 öde ürününü aratır
      And Sepete 1 ürün eklenir
      And Sepetim Tiklanir
      Then Sepetim Sayfasında Alt kısmında Sarı uyarı yazısı görülür

