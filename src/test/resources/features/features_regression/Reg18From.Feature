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