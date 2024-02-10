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

public class SignInValidate {



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
        System.out.println("I am learning TestNG");
        WebElement ele = null;
        Actions action = new Actions(driver);
        ele = driver.findElement(By.xpath("//a[text()='Sign In'][1]"));
        ele.click();
        Thread.sleep(10000);

        WebElement elementSignIn = driver.findElement(By.xpath(" //h1[@class='c6e09ac9a c6f4a1c53']"));
        if(elementSignIn.isDisplayed()){
            System.out.println("Sign In text present");
        }



        WebElement elementUsername = driver.findElement(By.id("username"));
        if(elementUsername.isDisplayed()){
            System.out.println("Username text area present");
        }

        WebElement elementContinue = driver.findElement(By.xpath("//div/button[@type ='submit']"));
        if(elementContinue.isDisplayed()){
            System.out.println("Continue Button present");
        }

        WebElement elementGoogle = driver.findElement(By.xpath("//button//span[text()='Continue with Google']"));
        if(elementGoogle.isDisplayed()){
            System.out.println("Google Button present");
        }

        WebElement elementGit = driver.findElement(By.xpath("//button//span[text()='Continue with GitHub']"));
        if(elementGit.isDisplayed()){
            System.out.println("Github Button present");
        }











    }





}
