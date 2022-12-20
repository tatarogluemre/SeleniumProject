package day02_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        amazon.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        Search(ara) “city bike”
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("citybike", Keys.ENTER);
//        Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonuc = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonuc.getText());

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramasonuclari = driver.findElements(By.className("sg-col-inner"));
         String aramaSonucu = aramasonuclari.get(0).getText();
        System.out.println(aramaSonucu);
        String [] aramaSonucArr = aramaSonucu.split(" ");
        System.out.println(Arrays.toString(aramaSonucArr));
        System.out.println("Arama sonucu = " + aramaSonucArr[2]);
        //sonuc sayısını Lambda ile yapınız
        Arrays.stream(aramasonuclari.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List <WebElement> firstImg = driver.findElements(By.className("s-image"));
        firstImg.get(0).click();
        //Sayfayı kapatın
        driver.close();
    }
}
