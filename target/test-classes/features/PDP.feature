Feature: US_010 PDP Testleri

    Background:
      Given Kullanici login olmus durumdadir
      And Herhangi bir ürünü seçer
      When Kullanici seçtiği ürünün üzerine tıklar
      Then PDP sayfasına geldiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Alışveriş listeme ekle linkine tıklar
      Then Kullanıcı seçtiği ürünün Alışveriş listesine eklendiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Sepete ekle butonuna tıklar
      And Kullanici Ana Sayfadaki Sepetim butonuna tıklar
      Then Seçtiği ürünün sepete eklendiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Alışveriş listeme ekle linkine tıklar
      And Kullanıcı seçtiği ürünün Alışveriş listesine eklendiğini kontrol eder
      And PDP sayfasındaki Alışveriş listemden çıkar linkine tıklar
      Then Ürünün Alışveriş listesinden çıkarıldığını kontrol eder

    Scenario:
      And PDP sayfasındaki Ürün Bilgileri linkine tıklar
      Then Kullanıcı seçtiği ürünün, ürün bilgilerinin geldiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Ürün Açıklaması linkine tıklar
      Then Kullanıcı PDP sayfasında,seçtiği ürünün, ürün açıklamasının geldiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Yorum yazın linkine tıklar
      And Çıkan Yorum yaz formunu doldurur
      And Kullanıcı Yorumu gönder butonuna tıklar
      Then Yapılan yorumun gönderildiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Taksit Bilgileri linkine tıklar
      Then Kullanıcı PDP sayfasında,seçtiği ürünle ilgili Taksit bilgilerinin geldiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Garanti&İade linkine tıklar
      And İade süreçlerimiz butonuna tıklar
      And Açılan sayfada Market Alışverişlerinde linkine tıklar
      Then İlgili bilgilerin geldiğini kontrol eder

    Scenario:
      And PDP sayfasındaki Garanti&İade linkine tıklar
      And İade süreçlerimiz butonuna tıklar
      And Açılan sayfada İnternet Alışverişlerinde linkine tıklar
      Then İlgili bilgilerin geldiğini kontrol eder