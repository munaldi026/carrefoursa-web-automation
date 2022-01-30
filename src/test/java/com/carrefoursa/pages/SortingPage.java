package com.carrefoursa.pages;

import com.carrefoursa.utilities.Driver;
import com.carrefoursa.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPage extends BasePage{

    public static void compareDescendingPrice() throws IOException {

        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector(".item-price.js-variant-discounted-price"));
        System.out.println("products.size() = " + products.size());

        for (WebElement tumUrunlerListesi : products) {
            //System.out.println("Urun Fiyati = " + tumUrunlerListesi.getText());
        }
        List<Integer> productNumbers1 = new ArrayList<>();
        List<Integer> productNumbers2 = new ArrayList<>();

        if (products.size() < 2) {
            //Reporter.log("Stokta olan ürün sayısı 2'den azdır. Kıyaslama yapılamadı");
            System.out.println("Stokta olan ürün sayısı 2'den azdır. Kıyaslama yapılamadı");
        }

        for (WebElement product : products) {
            String priceText1 = product.getText().trim();

            String priceText2 = priceText1.replace(",", "")
                    .replace("TL", "").trim();


            int price = Integer.parseInt(priceText2);
            productNumbers1.add(price);
            productNumbers2.add(price);
        }

        System.out.println("productNumbers1 = " + productNumbers2);
        Collections.sort(productNumbers1);
        Collections.reverse(productNumbers1);
        System.out.println("productNumbers1 = " + productNumbers1);
        Assert.assertEquals("Azalan Sıralama özelliği çalışmamaktadır: FAIL", productNumbers2, productNumbers1);
        System.out.println("Azalan Sıralama özelliği çalışmaktadır");
    }
    public static void compareAscendingPrice() throws IOException {

        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector(".item-price.js-variant-discounted-price"));
        System.out.println("products.size() = " + products.size());

        for (WebElement tumUrunlerListesi : products) {
            //System.out.println("Urun Fiyati = " + tumUrunlerListesi.getText());
        }

        List<Integer> productNumbers1 = new ArrayList<>();
        List<Integer> productNumbers2 = new ArrayList<>();

        if (products.size() < 2) {
            //Reporter.log("Stokta olan ürün sayısı 2'den azdır. Kıyaslama yapılamadı");
            System.out.println("Stokta olan ürün sayısı 2'den azdır. Kıyaslama yapılamadı");

        }

        for (WebElement product : products) {
            String priceText1 = product.getText().trim();
            String priceText2 = priceText1.replace(",", "")
                    .replace("TL", "").trim();

            int price = Integer.parseInt(priceText2);
            productNumbers1.add(price);
            productNumbers2.add(price);
        }

        System.out.println("productNumbers1 = " + productNumbers2);
        Collections.sort(productNumbers1);
        System.out.println("productNumbers1 = " + productNumbers1);
        Assert.assertEquals("Artan Sıralama özelliği çalışmamaktadır: FAIL", productNumbers2, productNumbers1);
        System.out.println("Artan Sıralama özelliği çalışmaktadır");
        //ReusableMethods.closeCerez();
    }

}
