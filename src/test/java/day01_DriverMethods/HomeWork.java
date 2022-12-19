package day01_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://youtube.com");
//        Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
//        Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
//        Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
//        Sayfayi Refresh(yenile) yapalim.
        Thread.sleep(3000);
        driver.navigate().refresh();
//        Sayfayi kapatalim / Tum sayfalari kapatalim
        Thread.sleep(3000);
        driver.close();

    }
}
