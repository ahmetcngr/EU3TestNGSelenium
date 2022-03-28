package com.cybertek.tests.reviews;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class review1 {

    public static void main(String[] args) throws InterruptedException {
        //open cybertekschool.com with chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cybertekschool.com");
        Thread.sleep(2000);
        driver.close();

    }
}
