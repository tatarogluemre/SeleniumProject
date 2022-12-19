package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Amazon Sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //techproeducation sayfasına gidelim
        try {
            Thread.sleep(3000);//--> bu method sayfada verilen (3sn) beklemeyi sağlıyor.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://techproeducation.com");
        //Tekrar Amazon sayfasına dönelim
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        //Tekrar techproeducation sayfasına gidelim
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        driver.navigate().forward();
        //Son sayfayı yenileyelim(refresh)
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        //ve sayfayı kapatalım
        driver.close();
    }
}
