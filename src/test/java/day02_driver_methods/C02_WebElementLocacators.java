package day02_driver_methods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocacators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
//        //search bölümünü locate edelim
//        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
//        //search bölümünde iphone id ile aratalım
//        aramakutusu.sendKeys("iphone", Keys.ENTER);
//        //search bölümünde iphone name ile aratalım
//        WebElement ara = driver.findElement(By.name("field-keywords"));
//        ara.sendKeys("samsung",Keys.ENTER);
//
//        driver.get("http://sahibinden.com");
//        WebElement arama = driver.findElement(By.id("searchText"));
//        arama.sendKeys("kia", Keys.ENTER);

/*
            Eğer bir webelementi (Web sayfasındaki herbir buton yada text/yazı) locate (konumunu belirleme)
        etmek istersek önce manuel olarak web sayfasını açıp sayfa üzerinde sağ click yapıp incele'ye tıklarız.
        Karşımıza çıkan HTML kodlarından locater'lardan (konum belirleyiciler) eşsiz olanı seçeriz.
        Genellikle id Attribute'u kullanılır. Seçtiğimiz attribute değerini findelement() metodu içine
        findelement(By.id("atribute değeri")) şeklinde yazarız.
         */

        //Amazon sayfasındaki <input> ve <a> taglarının sayısını yazdırın

        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("İnput Tag Sayısı = " + inputTags.size());

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı = " + linkList.size());

        for(WebElement w : linkList){

            System.out.print(w.getText() + " ");
        }

        driver.close();
    }
}