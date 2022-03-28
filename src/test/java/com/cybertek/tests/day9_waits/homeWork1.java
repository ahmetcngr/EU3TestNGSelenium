package com.cybertek.tests.day9_waits;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeWork1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input")).sendKeys("wrong_dob");

        WebElement wrongDob = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));

        Assert.assertTrue(wrongDob.isDisplayed());

    }

    @Test
    public void test2(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();

        WebElement languageOption1 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[1]/label"));
        Assert.assertTrue(languageOption1.isDisplayed());

        WebElement languageOption2 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[2]/label"));
        Assert.assertTrue(languageOption2.isDisplayed());

        WebElement languageOption3 = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[3]/label"));
        Assert.assertTrue(languageOption3.isDisplayed());
    }

    @Test
    public void test3(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input")).sendKeys("a");

        WebElement wrongFirstName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[2]"));

        Assert.assertTrue(wrongFirstName.isDisplayed());
    }

    @Test
    public void test4(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input")).sendKeys("a");

        WebElement wrongFirstName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[2]"));

        Assert.assertTrue(wrongFirstName.isDisplayed());

    }

    @Test
    public void test5(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input")).sendKeys("ahmet");
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input")).sendKeys("cingir");




    }


}
