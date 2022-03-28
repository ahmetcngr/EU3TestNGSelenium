package com.cybertek.tests.day5_xpath;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.xpath("//button[@onclick='button2()']"));
        Thread.sleep(2000);
        button2.click();
        Thread.sleep(2000);
        //driver.quit();
    }

}
