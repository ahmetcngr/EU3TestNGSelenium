package com.cybertek.selbstLernen;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsGiris {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://a.testaddressbook.com/sign_in");



        WebElement signIn = driver.findElement(By.id("sign-in"));
        signIn.click();




    }
}
