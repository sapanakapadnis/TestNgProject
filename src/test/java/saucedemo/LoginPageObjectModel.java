package saucedemo;

import action.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjectModel.*;

public class LoginPageObjectModel extends Action {

    private WebDriver driver=null;
    LoginSauceLab loginSauceLabObj;
    HomeSauceLab homeSauceLabObj;
    CheckoutSauceLab checkoutSauceLabObj;
    CartSauceLab cartSauceLabObj;

    @Parameters("url")
    @BeforeClass
    public void launchBrowser(String url){

        loginSauceLabObj = new LoginSauceLab();
        homeSauceLabObj = new HomeSauceLab();
        checkoutSauceLabObj =new CheckoutSauceLab();
        cartSauceLabObj = new CartSauceLab();
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get(url);


    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void loginCreds() throws Exception{

        //login page
        Assert.assertTrue(validateElementPresent(loginSauceLabObj.username()));
        //driver.findElement(loginSauceLabObj.username()).sendKeys("standard_user");
        typeInaTextBox(loginSauceLabObj.username(),"standard_user");

        Assert.assertTrue(validateElementPresent(loginSauceLabObj.password()));
        //driver.findElement(loginSauceLabObj.password()).sendKeys("secret_sauce");
        typeInaTextBox(loginSauceLabObj.password(),"secret_sauce");
        //driver.findElement(loginSauceLabObj.loginButton()).click();


        clickButtonsandImplictWait(loginSauceLabObj.loginButton());

        //homepage

        int totalInventoryCount = driver.findElements(By.xpath("//div[@class='inventory_list']/div")).size();

        Assert.assertEquals(totalInventoryCount,6);

        for(int i = 1;i <=totalInventoryCount; i++){
            String productName = driver.findElement(By.xpath("(//div[@class='inventory_list']/div//div[@class='inventory_item_name '])["+i+"]")).getText();
            String productPrice = driver.findElement(By.xpath("(//div[@class='inventory_list']/div//div[@class='pricebar'])["+i+"]/div")).getText();
            System.out.println(productName+":"+productPrice);

        }
        //driver.findElement(homeSauceLabObj.addBackpack()).click();
        clickButtonsandExplicitWait(homeSauceLabObj.addBackpack(),30);
        //driver.findElement(homeSauceLabObj.addTshirt()).click();
        mouseHover(homeSauceLabObj.hamburger());
        clickButtonsandExplicitWait(homeSauceLabObj.addTshirt(),1000);
        clickButtonsandImplictWait(homeSauceLabObj.ShoppingCart());


        //Cart page
        //driver.findElement(cartSauceLabObj.removeItem()).click();
        clickButtonsandExplicitWait(cartSauceLabObj.removeItem(),30);
        //driver.findElement(cartSauceLabObj.checkOutButton()).click();
        clickButtonsandImplictWait(cartSauceLabObj.checkOutButton());


        //Checkout Page
        //driver.findElement(checkoutSauceLabObj.firstName()).sendKeys("xyz");
        typeInaTextBox(checkoutSauceLabObj.firstName(),"xyz");
        //driver.findElement(checkoutSauceLabObj.lastName()).sendKeys("abd");
        typeInaTextBox(checkoutSauceLabObj.lastName(),"abc");
        //driver.findElement(checkoutSauceLabObj.postalCode()).sendKeys("02121");
        typeInaTextBox(checkoutSauceLabObj.postalCode(),"02122");

        //driver.findElement(checkoutSauceLabObj.continueButton()).click();
        clickButtonsandImplictWait(checkoutSauceLabObj.continueButton());
    }
}
