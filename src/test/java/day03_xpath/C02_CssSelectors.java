package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelectors {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//      https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //Sayfayi "refresh" yapin
        driver.navigate().refresh();
//      Sayfa basliginin “Spend less” ifadesi icerdigini test edin
         String actualTitle = driver.getTitle();
         if(actualTitle.contains("Spend less")){
             System.out.println("Title Test Passed");
         }else System.out.println("Title Test Failed");
//      Gift Cards sekmesine basin (cssSelector kullanarak yaptık)
         driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
//      Birthday butonuna basin
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();
//      Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> ilk = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        ilk.get(0).click();
//      Gift card details’den 25 $’i secin
        List<WebElement> sec = driver.findElements(By.cssSelector("button[id='gc-mini-picker-amount-1']"));
        sec.get(0).click();
//      Urun ucretinin 25$ oldugunu test edin
        String dolar = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']")).getText();
        System.out.println("dolar = " + dolar);
        if(dolar.equals("$25.00")){
            System.out.println("Ücret Test Passed");
        }else System.out.println("Ücret Test Failed");
//      Sayfayi kapatin
        driver.close();
    }

}

