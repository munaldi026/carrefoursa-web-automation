Feature:US_031_Form_Test

  Background:
    Given Kullanici login olmus durumdadir
    And Kullanici Sizi Dinliyoruma Tiklar

  @ignore #Captcha Çözülme sorunu nedeniyle ignorlanmıştır
  Scenario: TC_4000 Form Sayfasında Ad-Soyad Bölümü Boş Bırakılır
    And Gönder Buttonuna Kadar Swipe Yapılır
    And Diğer Alanlar uygun Bir Şekilde Doldurulur
    And Müsteri Adı Soyadı Alanı Boş Bırakılır
    And Gönder Buttonuna Tıklanır
    Then Ad soyad alanıın doldurulması zorunludur yazısı görülür


  @ignore #Captcha Çözülme sorunu nedeniyle ignorlanmıştır
  Scenario: TC_4001 Form Sayfasında Bildirim Bölümü Boş Bırakılır
    And Gönder Buttonuna Kadar Swipe Yapılır
    And Butun Alanlar uygun Bir Şekilde Doldurulur
    And Captcha alanı tıklanır
    And Gönder Buttonuna Tıklanır
    Then Bildirim Alanı doldurulması zorunludur yazısı görülür


  @ignore #Captcha Çözülme sorunu nedeniyle ignorlanmıştır
  Scenario: TC-4002 Form Sayfasında Açıklama Bölümü Boş Bırakılır
    And Gönder Buttonuna Kadar Swipe Yapılır
    And Diğer Alanlar uygun Bir Şekilde Doldurulur
    And Aciklama Alani Bos Birakilir
    And Captcha alanı tıklanır
    And Gönder Buttonuna Tıklanır
    Then Açıklama alanıın doldurulması zorunludur yazısı görülür


  Scenario: TC-4003 Form Sayfasında Captcha Bölümü Boş Bırakılır
    And Gönder Buttonuna Kadar Swipe Yapılır
    And Diğer Alanlar uygun Bir Şekilde Doldurulur
    And Gönder Buttonuna Tıklanır
    Then Kimlik Doğruama Hatası Görülür

  Scenario: TC-4004 Form Sayfasında Tüm Bölümler Boş Bırakılır
    And Gönder Buttonuna Kadar Swipe Yapılır
    And Gönder Buttonuna Tıklanır
    Then Kimlik Doğruama Hatası Görülür


  Scenario: TC-4005 Form Sayfasında Kurumsal E-Posta Alanına Gidilir
    And Kurumsal e-posta tıklanır
    Then Outllok sayfasına gittiği görülür

  Scenario: TC-4006 Form Sayfasında Aydınlatma Metnine Gidilir
    And KVKK Aydıntlatma metnine burdan ulaşabilirsiniz tıklanır
    Then Aydıtlatma metnine gidildiği görülür

  Scenario: TC-4007 Kiralık Yerler Sayfasında Dosya Yükleme Kontrolü
    And Kullanıcı kiralik Yerler Sayfasına gider
    And Dosya seç buttonu tıklanır
    Then Dosya yüklenebildiği görülür


  Scenario: TC-4008 Kiralık Yerler Sayfasında İsim Kısmı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And SoyAdi Alanini Girirniz
    And CepTelefonunu Giriniz
    And Email Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Semt Giriniz
    And Cadde Giriniz
    And Sokak Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen İsim Girin Yazısı Görülür


  Scenario: TC-4009 Kiralık Yerler Sayfasında Soyİsim Kısmı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And Adiniz Alanini Giriniz
    And CepTelefonunu Giriniz
    And Email Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Semt Giriniz
    And Cadde Giriniz
    And Sokak Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen soyisim girin Yazısı Görülür


  Scenario: TC-4010 Kiralık Yerler Sayfasında Cep Telefonu Alanı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And Adiniz Alanini Giriniz
    And SoyAdi Alanini Girirniz
    And Email Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Semt Giriniz
    And Cadde Giriniz
    And Sokak Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen Cep Telefonu Giriniz Yazısı Görülür


  Scenario: TC-4011 Kiralık Yerler Sayfasında E-Posta Alanı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And Adiniz Alanini Giriniz
    And SoyAdi Alanini Girirniz
    And CepTelefonunu Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Semt Giriniz
    And Cadde Giriniz
    And Sokak Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen Eposta Giriniz Yazısı Görülür

  Scenario: TC-4012 Kiralık Yerler Sayfasında Semt/Mahalle Alanı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And Adiniz Alanini Giriniz
    And SoyAdi Alanini Girirniz
    And CepTelefonunu Giriniz
    And Email Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Cadde Giriniz
    And Sokak Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen semt-mahalle bilgisi girin Yazısı Görülür


  Scenario: TC-4013 Kiralık Yerler Sayfasında Cadde/Bulvar Alanı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And Adiniz Alanini Giriniz
    And SoyAdi Alanini Girirniz
    And CepTelefonunu Giriniz
    And Email Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Semt Giriniz
    And Sokak Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen cadde-bulvar bilgisi girin Yazısı Görülür

  Scenario: TC-4014 Kiralık Yerler Sayfasında Sokak Alanı Boş Bırakılır
    And Kullanıci Kiralık Yeriniz Var mı tıklar
    And Adiniz Alanini Giriniz
    And SoyAdi Alanini Girirniz
    And CepTelefonunu Giriniz
    And Email Giriniz
    And il Seçiniz
    And ilce Seciniz
    And Semt Giriniz
    And Cadde Giriniz
    And Kiralik Sayfasinda Gönder Buttonuna Tıklanır
    Then Lütfen sokak bilgisi girin Yazısı Görülür

