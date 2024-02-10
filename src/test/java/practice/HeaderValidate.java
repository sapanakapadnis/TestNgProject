package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HeaderValidate {

    WebDriver driver=null;

    @Parameters("url")
    @BeforeClass
    public void launchBrowser(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }


    @Test
    public void doDevLabHeaderMenuValidation()throws InterruptedException {
        WebElement ele = null;
        Actions action = new Actions(driver);
        Thread.sleep(3000);

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li[@class='logo']"));
        if(ele.isDisplayed()){
            System.out.println("Logo present..");
        }

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li/a[text()='Products']"));
        if(ele.isDisplayed()){
            System.out.println("Products present..");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li/a[text()='Developers']"));
        if(ele.isDisplayed()){
            System.out.println("Developers present..");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li/a[text()='Pricing']"));
        if(ele.isDisplayed()){
            System.out.println("Pricing Present..");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li/a[text()='Blog']"));
        if(ele.isDisplayed()){
            System.out.println("Blog present..");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li/a[text()='About Us']"));
        if(ele.isDisplayed()){
            System.out.println("About Us present..");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }

        ele = driver.findElement(By.xpath("//ul[@class='nav']/li/a[text()='Partners']"));
        if(ele.isDisplayed()){
            System.out.println("Partners present..");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }
    }
}
