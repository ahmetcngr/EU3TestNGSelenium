package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {


    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueBut = driver.findElement(By.id("blue"));
        blueBut.getAttribute("value");

        //get the value of type attribute
        System.out.println("blueBut.getAttribute(\"type\") = " + blueBut.getAttribute("type"));
        //get the value of name attribute
        System.out.println("blueBut.getAttribute(\"name\") = " + blueBut.getAttribute("name"));
        //get the value of check attribute
        System.out.println("blueBut.getAttribute(\"checked\") = " + blueBut.getAttribute("checked"));

        //trying to get attribute that doies not exist
        //when non-exist attribute, it will return NULL
        System.out.println("blueBut.getAttribute(\"href\") = " + blueBut.getAttribute("href"));

        System.out.println("blueBut.getAttribute(\"outerHTML\") = " + blueBut.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));
        System.out.println("button2.getAttribute(\"outerHTML\") = " + button2.getAttribute("outerHTML"));
        System.out.println("button2.getAttribute(\"innerHTML\") = " + button2.getAttribute("innerHTML"));



        //driver.quit();


    }
}
