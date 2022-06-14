@demo
Feature: US_29 Changing Delivery Region

  Scenario: TC_29001 Teslimat Bolgesi Degistirme

  Given Kullanici login olmus durumdadir
  And Kullanici Lokal bolgede iken herhangi bir taze gida aratir
  And PLP sayfasindaki Sepete ekle butonuna tiklar
  And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
  And Sepete eklemis oldugu urunun dogru urun oldugunu kontrol eder
  And Teslimat bolgesi olarak Lokalden, Globale gecilir
  And Global bolgeye gecildiginde, sepetteki taze gida urunlerinin sepetten cikarildigina dair uyarinin geldigi kontrol edilir
  And Devam edilerek Global bolgede bir urun eklenir
  And Urunun sepete eklendigi kontrol edilir
  When Teslimat bolgesi olarak Globalden, Lokale gecilir
  Then Urunun sepette kaldigi kontrol edilir