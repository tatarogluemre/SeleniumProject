package day03_xpath;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//    -Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
//    -Arama kutusunu locate ediniz
        WebElement aramakutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
//    -Arama kutusunun tagName'inin input olduğunu test ediniz
        String tagName = aramakutusu.getTagName();
        if(tagName.equals("input")){
            System.out.println("TagName Test Passed");
        }else System.out.println("TagName Test Failed");
//    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        boolean attr = aramakutusu.getAttribute("name").equals("field-keywords");
        if(attr){
            System.out.println("Atrribute Test Passed");

        }else System.out.println("Atrribute Test Failed");


        aramakutusu.sendKeys("citybike", Keys.ENTER);
//    -Sayfayı kapatınız

        driver.close();



   }
}
