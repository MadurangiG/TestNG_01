package first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTest {
    WebDriver webDriver;
    @BeforeMethod
    public void initBrowser(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

    }
    @Test
    public void searchDress() throws InterruptedException {
        System.out.println("Search Method is called.");

        webDriver.get("https://www.ebay.com/");
        webDriver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Party Dress");
        webDriver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void quitBrowser(){
        webDriver.quit();
    }
}
