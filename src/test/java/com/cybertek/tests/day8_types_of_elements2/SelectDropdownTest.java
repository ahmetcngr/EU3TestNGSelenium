package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

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
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate your dropdown just like any other element
        WebElement dropDownElement = driver.findElement(By.id("state"));

        //2. crate Select object by passing that element as a constracter
        Select stateDropdown = new Select(dropDownElement);

        //getOptions--> returns all the available options from the drowpdown
        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());

        // prints options one by one
        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());
        }
    }

    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate your dropdown just like any other element
        WebElement dropDownElement = driver.findElement(By.id("state"));

        //2. crate Select object by passing that element as a constracter
        Select stateDropdown = new Select(dropDownElement);

        // verify that first selection is "Select a state"

        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");


    }


}
