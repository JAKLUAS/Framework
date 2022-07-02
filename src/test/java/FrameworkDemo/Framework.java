package FrameworkDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Framework extends baseClass{

    @Test(priority=1)
    public void goToTheWebsite(){

        driver.get("https://www.delta.com/");

        System.out.println("Test");

    }

    @Test (priority=2)
    public void Book() {

        driver.get("https://www.delta.com/");
        driver.findElement(By.id("headPrimary1")).click();
        driver.findElement(By.xpath("//span[.='From']")) .click();
        driver.findElement(By.id("search_input")).sendKeys("LGA", Keys.ENTER);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("BUR", Keys.ENTER);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("selectTripType-val")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("ui-list-selectTripType1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='13 July 2022, Wednesday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='23 July 2022, Saturday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("passengers-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("ui-list-passengers0")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("btn-book-submit")));









    }





}
