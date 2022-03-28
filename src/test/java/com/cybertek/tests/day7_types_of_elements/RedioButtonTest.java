package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedioButtonTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating radia buttons
        WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadiaBtn = driver.findElement(By.id("red"));

        //how to check radiio button is selected
        System.out.println(blueRadioBtn.isSelected());
        System.out.println(redRadiaBtn.isSelected());

        //verify blue is selected red is not selected
        //blue -->true
        Assert.assertTrue(blueRadioBtn.isSelected(), "verify that blue is selected");
        //red-->false
        Assert.assertFalse(redRadiaBtn.isSelected(), "verify that red is NOT selected");

        //how to click radia button
        redRadiaBtn.click();

        Assert.assertFalse(blueRadioBtn.isSelected(), "verify that blue is NOT selected");
        //red-->false
        Assert.assertTrue(redRadiaBtn.isSelected(), "verify that red is  selected");

        Thread.sleep(3000);
        driver.quit();


    }

    @Test
    public void test2(){

    }
}
