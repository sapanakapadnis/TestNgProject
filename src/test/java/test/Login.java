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

public class Login {
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
    public void loginValidation()throws Exception{

        driver.findElement(By.xpath("//button[@id='header_Button']")).click();
        if(driver.findElement(By.xpath("//span[text()='Email ID']")).isDisplayed());
        System.out.println("Email ID text is present");
        if (driver.findElement(By.xpath("//div/input[@name='email']")).isDisplayed());
        System.out.println("Email ID input box is present");
        if(driver.findElement(By.xpath("//span[text()='Password']")).isDisplayed());
        System.out.println("Password text is present");
        if (driver.findElement(By.xpath("//div/input[@name='password']")).isDisplayed());
        System.out.println("Password input box is present");

    }

}
