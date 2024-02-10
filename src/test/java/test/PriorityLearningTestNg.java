package test;

import org.testng.annotations.Test;

public class PriorityLearningTestNg {


    @Test(priority = 0)
    public void tc001(){
        System.out.println("This is priority = 0");
    }

    @Test(priority = 1)
    public void tc002(){
        System.out.println("This is priority = 1");
    }

    @Test(priority = 2)
    public void tc003(){
        System.out.println("This is priority = 2");
    }

    @Test(priority = 0)
    public void tc004(){
        System.out.println("This is priority = 0");
    }

    @Test(priority = 1)
    public void tc005(){
        System.out.println("This is priority = 1");
    }

    @Test(priority = 2)
    public void tc006(){
        System.out.println("This is priority = 2");
    }

    @Test(priority = 0)
    public void tc007(){
        System.out.println("This is priority = 0");
    }

    @Test(priority = 1)
    public void tc008(){
        System.out.println("This is priority = 1");
    }

    @Test(priority = 2)
    public void tc009(){
        System.out.println("This is priority = 2");
    }

    @Test(priority = 3)
    public void tc0010(){
        System.out.println("This is priority = 3");
    }

}
