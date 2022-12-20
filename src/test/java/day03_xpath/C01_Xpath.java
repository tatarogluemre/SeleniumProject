package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
         driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//        2- Add Element butonuna basin
           //driver.findElement(By.className("example")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
//        3 Delete butonu’nun gorunur oldugunu test edin
            boolean visible = driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).isDisplayed();
          if(visible){
              System.out.println("Tast PASSED");
          }else System.out.println("Test FAILED");
//        4 Delete tusuna basin
        driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();
//        5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
       WebElement addRemove = driver.findElement(By.xpath("//h3"));
         //2.Yol: attribute kullanmadan text kullanarak xpath kullanma
       WebElement addRemoveYazi = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
       if(addRemove.isDisplayed()){
           System.out.println("Test Passed");
       }else System.out.println("Test Failed");

       driver.close();
    }
}
