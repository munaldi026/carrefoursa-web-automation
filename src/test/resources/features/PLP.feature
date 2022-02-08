Feature:

  Background:
    Given Kullanici login olmus durumdadir

  Scenario: TC_1101 Popüler Ürünler
    And Kullanici kategori tiklar yapar
    And Kullanici herhangi bir kategoriye hover yapar
    Then Kullanici populer urunleri gorur