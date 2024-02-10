package test;

import org.testng.annotations.Test;

public class TagUnderstanding {


    @Test(groups = {"smoke"})
    public void tc001(){
        System.out.println("This is tc001");
    }

    @Test(groups = {"smoke"})
    public void tc002(){
        System.out.println("This is tc002");
    }

    @Test(groups = {"smoke"})
    public void tc003(){
        System.out.println("This is tc003");
    }

    @Test(groups = {"regression"})
    public void tc004(){
        System.out.println("This is tc004");
    }

    @Test(groups = {"regression"})
    public void tc005(){
        System.out.println("This is tc005");
    }

    @Test(groups = {"regression"})
    public void tc006(){
        System.out.println("This is tc006");
    }

    @Test(groups = {"endtoend"})
    public void tc007(){
        System.out.println("This is tc007");
    }

    @Test(groups = {"endtoend"})
    public void tc008(){
        System.out.println("This is tc008");
    }

    @Test(groups = {"endtoend"})
    public void tc009(){
        System.out.println("This is tc009");
    }

    @Test(groups = {"endtoend"})
    public void tc0010(){
        System.out.println("This is tc0010");
    }

}
