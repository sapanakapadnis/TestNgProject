package pageObjectModel;

import org.openqa.selenium.By;

public class LoginSauceLab {

    public By username(){
        return By.id("user-name");
    }

    public By password(){
        return By.id("password");
    }

    public By loginButton(){
        return By.id("login-button");
    }
}

