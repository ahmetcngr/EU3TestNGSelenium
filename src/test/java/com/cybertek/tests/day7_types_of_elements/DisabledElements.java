package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenBut = driver.findElement(By.id("green"));


        //lets learn how to check any web element is enable or not...
        System.out.println("greenBut.isEnabled() = " + greenBut.isEnabled());
        Assert.assertFalse(greenBut.isEnabled(), "verify green button NOT enable");

        greenBut.click();

    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement disabledBut = driver.findElement(By.cssSelector("#input-example>input"));
        disabledBut.sendKeys("some message");

    }

}
