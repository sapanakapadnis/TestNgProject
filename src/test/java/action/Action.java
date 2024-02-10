package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Action {

    public WebDriver driver = null;

    //this method is used to create driver instance headless
    public WebDriver getDriver(){
        //ChromeOptions opt = new ChromeOptions();
        //opt.addArguments("--headless");
        //driver = new ChromeDriver(opt);
        driver = new ChromeDriver();
        return driver;
    }

    //this method is used type something in text box
    public boolean typeInaTextBox(By by, String input){
        boolean flag = false;
        try{
            driver.findElement(by).sendKeys(input);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    //method to click buttons/links
    public boolean clickButtonsandImplictWait(By by){
        boolean flag = false;
        try{
            driver.findElement(by).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean clickButtonsandExplicitWait(By by, int time){
        boolean flag = false;
        try{
            driver.findElement(by).click();
            Thread.sleep(time);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }


    public boolean mouseHover(By by){

        Actions action = new Actions(driver);

        boolean flag = false;
        try{
            WebElement ele = driver.findElement(by);
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    public boolean validateElementPresent(By by){
        boolean flag = false;
        try{
            driver.findElement(by).isDisplayed();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}
