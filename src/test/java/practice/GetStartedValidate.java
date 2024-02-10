
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

public class GetStartedValidate {

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
        ele = driver.findElement(By.xpath("//a[@class='header_button'][1]"));
        ele.click();
        Thread.sleep(10000);

        WebElement elementHeader = driver.findElement(By.xpath("//h1[text()='Get Started with Docker']"));
        if(elementHeader.isDisplayed()){
            System.out.println("Docker header..");
        }

        WebElement elementInstallDockerButton = driver.findElement(By.xpath("//a[text()='Learn how to install Docker']"));
        if(elementInstallDockerButton.isDisplayed()){
            System.out.println("Learn how to install button is present");
        }

        WebElement elementDownloadFor = driver.findElement(By.id("dkr_dd_hp_mac_apple"));
        if(elementDownloadFor.isDisplayed()){
            System.out.println("Download for button is present");
        }

    }
}
