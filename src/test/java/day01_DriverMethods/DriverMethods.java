package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa Başlığı = "+driver.getTitle());
        System.out.println("Sayfa Url = "+driver.getCurrentUrl());
        //System.out.println(driver.getPageSource()); //sayfa kaynak kodlarını verir.
        System.out.println(driver.getWindowHandle());//getWindowHandle() Bize o windowa ait hash değerini verir.
                               // Biz bu hash değerlerini bir stringe atayıp pencereler arası geçiş yapabiliriz.


    }
}
