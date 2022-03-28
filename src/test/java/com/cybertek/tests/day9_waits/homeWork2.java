package com.cybertek.tests.day9_waits;

import com.cybertek.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeWork2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
       driver = WebDriverFactory.getDriver("chrome");
       WebDriver driver = new EdgeDriver();
       driver = WebDriverFactory.getDriver("edge");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test6(){
        // to see if it works via Edge
        //WebDriverManager.edgedriver().setup();
        //WebDriver driver = new EdgeDriver();
        //driver.get("https://www.cybertekschool.com/program/%22");

        driver.get("https://www.fakemail.net/");

        String fakeEmail = driver.findElement(By.xpath("//span[@id='email']")).getText();

        System.out.println("fake email is : " + fakeEmail);

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.xpath("//a[.='Sign Up For Mailing List']")).click();

        driver.findElement(By.name("full_name")).sendKeys("Ahmet Cingir");

        driver.findElement(By.name("email")).sendKeys(fakeEmail);

        driver.findElement(By.name("wooden_spoon")).click();


    }

    @Test
    public void test7(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");
    }


}
