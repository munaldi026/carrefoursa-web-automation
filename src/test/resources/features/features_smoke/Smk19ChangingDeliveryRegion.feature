@upgradeSmoke
Feature: US_29 Changing Delivery Region

  Scenario: TC_29001 Teslimat Bolgesi Degistirme

  Given Kullanici login olmus durumdadir
  And Kullanici Lokal bolgede iken herhangi bir taze gida aratir
  And PLP sayfasindaki Sepete ekle butonuna tiklar
  And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
  And Sepete eklemis oldugu urunun dogru urun oldugunu kontrol eder
  And Teslimat bolgesi olarak Lokalden, Globale gecilir
  And Cikan pop-up uzerinde,konumdaki magazada olmayan urunlerin sepetten kaldirildigi uyarisi alinir
  And Devam edilerek Global bolgede yeni bir urun eklenir
  And PLP sayfasindaki Sepete ekle butonuna tiklanir
  And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
  And Sepete eklemis oldugu urunun dogru urun oldugunu kontrol eder
  When Teslimat bolgesi olarak Globalden, Lokale gecilir
  And Teslimat tipi degisikligi durumunda sepetteki urunlerin degisebilecegi uyarisi alinir
  And Sepetteki urunlerin degistigi uyarisi alinir
  And Urunun sepette kaldigi kontrol edilir
    Then Kullanici sepeti temizler