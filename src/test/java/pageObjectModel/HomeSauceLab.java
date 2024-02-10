package pageObjectModel;

import org.openqa.selenium.By;

public class HomeSauceLab {

    public By addBackpack(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    public By addTshirt(){
        return By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    }

    public By ShoppingCart(){
        return By.xpath("//a[@class='shopping_cart_link']");
    }

    public By hamburger(){
        return By.xpath("//div[@class ='bm-burger-button']");
    }
}
