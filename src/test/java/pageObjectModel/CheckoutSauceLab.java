package pageObjectModel;

import org.openqa.selenium.By;

public class CheckoutSauceLab {

    public By firstName(){
        return By.id("first-name");
    }

    public By lastName(){
        return By.id("last-name");
    }

    public By postalCode(){
        return By.id("postal-code");
    }

    public By continueButton(){
        return By.id("continue");
    }
}
