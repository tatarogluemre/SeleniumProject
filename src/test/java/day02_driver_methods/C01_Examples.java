package day02_driver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
//    1)Browser'ı maximize yapalım
        driver.manage().window().maximize();
//    2)tüm sayfa için max. bekleme süresi olarak 15 sn. belirleyelim
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    3)Sırasıyla Amazon facebook ve youtube sayfalarına gidelim
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");
//    4)Amazon Sayfasına tekrar dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().back();
//    5)Amazon sayfasının Url'nin https://www.amazon.com adresine eşit olduğunu test edelim
        String url = driver.getCurrentUrl();
        if(url.equalsIgnoreCase("https://www.amazon.com")){
            System.out.println("Url Test Passed");
        }else System.out.println("Url Test Failed");
//    6)Sayfanın konumunu ve pozisyonunu yazdıralım
        System.out.println("Sayfanın Konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Size'ı : "+ driver.manage().window().getSize());
//    7)Sayfanın konumu size ın ı istediğimiz şekilde ayarlayalım
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(120,120));
//    8) istediğimiz şekilde olduğunu test edelim
        Dimension actualNewSize = driver.manage().window().getSize();
        if(actualNewSize.getHeight()==120 && actualNewSize.getWidth()==120){
            System.out.println("Size Test Passed");
        }else System.out.println("Size Test Failed");
        Point actualNewPosition = driver.manage().window().getPosition();
        if(actualNewPosition.getX()==600 && actualNewPosition.getY()==600){
            System.out.println("Position Test Passed");
        }else System.out.println("Position Test Failed");
//    9)Sayfayı kapatalım
        Thread.sleep(3000);
        driver.close();





    }
}
