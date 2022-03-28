package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCases_HW {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testCase2() throws InterruptedException {

        WebElement checkBoxText = driver.findElement(By.id("txtAge"));
        System.out.println("checkBoxText.isDisplayed() = " + checkBoxText.isDisplayed());
        Assert.assertFalse(checkBoxText.isDisplayed(),"verify the text NOT to be shown");

        Thread.sleep(2000);

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        checkBox.click();
        System.out.println("checkBoxText.isDisplayed() = " + checkBoxText.isDisplayed());
        Assert.assertTrue(checkBox.isDisplayed(),"verify the text is to be shown");
    }

    @Test
    public void testCase3(){

        WebElement checkAllText = driver.findElement(By.cssSelector("input[value='Check All']"));
        Assert.assertTrue(checkAllText.isDisplayed(), "bidaha bak olmadi");

        String actual= checkAllText.getAttribute("value");

        Assert.assertTrue(actual.equals("Check All"),"ayni degil");

        checkAllText.click();

        List<WebElement>options = driver.findElements(By.cssSelector("input.cb1-element"));
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println("option.isSelected() = " + option.isSelected());
            Assert.assertTrue(option.isSelected(), "boxes are not selected. Verify again u asshol");
        }

        WebElement uncheck = driver.findElement(By.cssSelector("input#check1.btn.btn-primary"));
        Assert.assertTrue(uncheck.getAttribute("value").equals("Uncheck All"), "ayni degil. Verify");










    }


}
