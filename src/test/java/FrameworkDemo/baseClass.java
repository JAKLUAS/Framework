package FrameworkDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseClass {

    WebDriver driver;
    @BeforeClass
    public void methodSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod

    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3L));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMessage() {
        driver.quit();
    }
}

