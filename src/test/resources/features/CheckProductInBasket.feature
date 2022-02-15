
Feature: US_017_Check_Product_In_Basket_Tests

      Background:

        Given Kullanici login olmus durumdadir
        And Kullanici herhangi bir urunu aratir
        Then PLP sayfasindaki Sepete ekle butonuna tiklar


        Scenario: TC_1701 Sepette Urun Miktari Artirma

        And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
        When Sepette urun adedi artirilir
        Then Artma durumu kontrol edilir


        Scenario: TC_1702 Sepette Urun Miktari Azaltma

        And Kullanici Ana Sayfadaki Sepetim butonuna hover yapar
        And Sepette urun adedi artirilir
        When Sepette urun adedi azaltilir
        Then Azalma durumu kontrol edilir

        Scenario: TC_1703 Sepette Maximum Satinalma

        And Kullanici Ana Sayfadaki Sepetim butonuna tiklar
        And Sepette urun adedini maximum oranda artirir
        When Maximum satinalma limitine ulastigini kontrol eder

