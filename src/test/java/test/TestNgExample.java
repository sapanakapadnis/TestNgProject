package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;


public class TestNgExample {

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
    public void doDevLabHeaderMenuValidation()throws InterruptedException{
        System.out.println("I am learning TestNG");
        WebElement ele = null;
        Actions action = new Actions(driver);
        ele = driver.findElement(By.xpath("//span[text()='Courses']"));

        if(ele.isDisplayed()){
            System.out.println("The DevLab Courses Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Consulting Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Consulting']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Consulting Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Enterprises Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Enterprises Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Enterprises Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Enterprises Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Certification Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Certification']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Certification Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }


        // Mouse Hover into Resources Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Resources']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Resources Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
        }
    }


    @Test
    public void doDevLabFooterValidation(){
        System.out.println("I am learning TestNG with selenium");


        WebElement footerCountry = driver.findElement(By.xpath("//p[text() ='USA']"));
        if(footerCountry.isDisplayed()){
            System.out.println(footerCountry);
        }

    }


}
