Feature:

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: TC_1101 Popüler Ürünler
    And Kullanici kategori tiklar yapar
    And Kullanici herhangi bir kategoriye hover yapar
    Then Kullanici populer urunleri gorur

  Scenario:  TC_1102 Tüm Kategoriler



  Scenario: TC_1103  Sub Kategoriler
    And Kullanici kategori tiklar yapar
    And Kullanici herhangi bir kategoriye hover yapar
    Then Kullanici alt kategori urunleri gorur

  @ignore
    #Test case bölgesel stok olmadığından uygulamıyor
  Scenario:  TC_1104 Bölgesel Stok Kontrolü

  @ignore
    #Pre Prod ortamında kampanyalar sayfası açılmamaktadır
  Scenario:  TC_1105 Kampanyalar
    And Kullanici kategori tiklar yapar
    And Kullanici kampanyalar kategorisine tiklar
    And Kullanici kampanyalari ekranda gorur

  @ignore
    #Pre Prod ortamında kampanyalar sayfası açılmamaktadır
  Scenario:  TC_1106 Kampanyalar-1
    And Kullanici kategori tiklar yapar
    And Kullanici kampanyalar kategorisine tiklar
    And Kullanici indirimli urunlere tiklar
    Then Kullanici kampanyalari ekranda gorur
