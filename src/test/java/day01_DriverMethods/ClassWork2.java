package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork2 {
    //    driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSecond(10));
    //ilk olarak bu methodları kullanmak gerekir.Alışkanlık haline getirmeliyiz
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method herbir webelement için max bekleme süresini belirler.

//        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
           driver.get("https://facebook.com");
           String actualTitle = driver.getTitle();
           if(actualTitle.contains("facebook")){
               System.out.println("Title Test Passed");

           }else {System.out.println("Title Test Failed");
                  System.out.println("doğru Başlık : "+actualTitle);
           }
//        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
//        yazdirin.
        String actualUrl = driver.getCurrentUrl();
           if (actualUrl.contains("facebook")){
               System.out.println("Test Url Passed");
           }else{
               System.out.println("Test Url Failed");
               System.out.println("Doğru Url : "+ actualUrl);
           }
//        https://www.walmart.com/ sayfasina gidin.
           driver.get( "https://www.walmart.com");
//        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
          String actualTitleWallmart = driver.getTitle();
        if(actualTitleWallmart.contains("Walmart")){
            System.out.println("Title Test Passed");

        }else {System.out.println("Title Test Failed");
            System.out.println("doğru Başlık : "+actualTitleWallmart);
        }
//        Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//        Sayfayi yenileyin
        driver.navigate().refresh();
//        Sayfayi tam sayfa (maximize) yapin  Browser’i kapatin
        driver.manage().window().maximize();
        driver.close();

    }
}
