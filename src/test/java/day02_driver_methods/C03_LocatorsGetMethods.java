package day02_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //search bölümünü locate edip iphone aratalım
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("iphone", Keys.ENTER);
        //Arama sonuç yazısında iphone yazısını locate edip konsola yazdıralım
        WebElement sonuc = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonuc.getText());
        //sayfayı kapatalım.
        driver.close();

    }
}
