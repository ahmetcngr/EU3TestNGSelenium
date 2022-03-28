package com.cybertek.tests.day5_xpath;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    /* TASK:
    Go to amazon.com
    search for selenium
    click search button
    verify 1-28 of 304 results for "selenium"
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchBox.sendKeys("Selenium");

        //click search button
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText = result.getText();

        System.out.println("resultText = " + resultText);

        String expectedResult = "1-48 of 186 results for";

        if (expectedResult.equals(resultText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected result = " + expectedResult);
            System.out.println("Result = " + resultText);
        }

        driver.quit();


    }


}
