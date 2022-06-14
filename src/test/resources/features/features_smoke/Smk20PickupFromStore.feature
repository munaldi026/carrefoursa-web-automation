Feature: US_33 PickupFromStore Test

  Scenario: TC_33001 Magazadan_al

  Given Kullanici login olmus durumdadir
  And Ana sayfadaki Teslimat Seceneginiz linkine tiklar
  And Cikan pop-up uzerinde Magazadan Alin tercihini yapar
  And Teslim alinacak magazayi secer
  And Bu sayfada Devam et butonu tiklanir
  And Kullanici KG'li bir urunu aratir
  And PLP sayfasindaki Sepete ekle butonuna tiklar
  And Indirimli bir urun aratir
  And PLP sayfasindaki Sepete ekle butonuna tiklar
  And Promosyonlu bir urun aratir
  And PLP sayfasindaki Sepette ekle butonuna tiklar
  And Ana Sayfadaki Sepetim butonuna tiklar
  And Tum urunlerin sepete eklendigini kontrol eder
  And Kullanici sepette Siparisi tamamla butonuna tiklar
  And Adres secimi sayfasinda Devam Et butonuna tiklar
  And Gelen sayfada teslimat zamanini secer
  And Teslimat zamani sayfasinda Devam Et butonuna tiklar
  And Odeme sekli olarak Kredi Karti secenegine tiklar
  And Kredi Karti bilgilerini doldurur
  And Gelen pop-up uzerine gecerli guvenlik kodu girilir
  And Kullanici Kredi Kartiyla odemenin gerceklestigini kontrol eder
  And Kullanici Siparis Onay sayfasindaki Siparisimi iptal Etmek istiyorum butonuna tiklar
  And Siparis iptali ile ilgili cikan Pop-up uzerinde Evet butonuna tiklar
  And Kullanici siparisin iptal edildigini kontrol eder
  And Ana sayfadaki Teslimat Seceneginiz linkine tiklar
  And Cikan pop-up uzerinde Size Getirelim tercihini yapar
  When Bu sayfada Devam et butonu tiklanir
  Then Secimin gerceklestigi kontrol edilir