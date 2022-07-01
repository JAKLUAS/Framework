package FrameworkDemo;

import org.testng.annotations.Test;

public class Framework extends baseClass{

    @Test(priority=1)
    public void goToTheWebsite(){

        driver.get("https://www.delta.com/");

        System.out.println("Test");

    }






}
