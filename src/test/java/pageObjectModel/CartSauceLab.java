package pageObjectModel;

import org.openqa.selenium.By;

public class CartSauceLab {

    public By removeItem(){
        return By.id("remove-sauce-labs-backpack");
    }

    public By checkOutButton(){
        return By.id("checkout");
    }
}
