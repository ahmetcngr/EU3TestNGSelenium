package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest {

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
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        //how to switch frmes
        // 1. Switch using by name or ID attribute of frame
        driver.switchTo().frame("mce_0_ifr");

        //clear before sendkeys - its not about iframe issue. We can use it anytime we need
        driver.findElement(By.cssSelector("#tinymce")).clear();

        // after 2 seconds then send keys
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith");

        //going back to first frame (main html). Its useful when we have multiple frames
        driver.switchTo().defaultContent();

        //2. Switching with INDEX
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH INDEX");


        //second way to switch back
        driver.switchTo().parentFrame();

        //3.way of switching USING WEB ELEMENT
        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframeElement);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH WEBELEMENT");

    }

    @Test
    public void test2(){
       driver.get("http://practice.cybertekschool.com/nested_frames");

       //switchong to frame top
       driver.switchTo().frame("frame-top");
        // top has 3 frame under left, middle, and right
        //switch to frame middle
       driver.switchTo().frame("frame-middle");
       System.out.println("driver.findElement(By.id(\"content\")).getText() = " + driver.findElement(By.id("content")).getText());

       //goes back to top frame
        driver.switchTo().parentFrame();

        //switch right with index
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());

        //go to main htmö to switch to bottom
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());




    }
}
