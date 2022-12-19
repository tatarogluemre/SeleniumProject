package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {



    public static void main(String[] args) {
          WebDriver driver = new ChromeDriver();

//    Yeni bir package olusturalim : day01
//    Yeni bir class olusturalim : C03_GetMethods
//    Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
//    Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Title : "+driver.getTitle());
//    Sayfa basliginin “Amazon” icerdigini test edin
        String title = driver.getTitle();
        if(title.contains("Amazon")){
            System.out.println("Title test passed");
        }else System.out.println("Title tes failed");
//    Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url : "+driver.getCurrentUrl());
//    Sayfa url’inin “amazon” icerdigini test edin.
        String url = driver.getCurrentUrl();
        if(url.contains("amazon")){
            System.out.println("Sayfa url test passed");
        }else System.out.println("Sayfa url test failed");
//    Sayfa handle degerini yazdirin
        System.out.println("Sayfa Handle Değeri : "+driver.getWindowHandle());
//    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Test Passed");
        }else System.out.println("Source Code Test Failed");
//    Sayfayi kapatin.
        driver.close();









    }


}
