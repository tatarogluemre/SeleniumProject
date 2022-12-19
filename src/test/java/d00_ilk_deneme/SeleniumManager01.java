package d00_ilk_deneme;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManager01 {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
        driver.quit();

        SeleniumManager.getInstance().getDriverPath("IEDriverServer");
        InternetExplorerDriver driver1 = new InternetExplorerDriver();
        driver1.get("https://www.amazon.com");
    }
}
