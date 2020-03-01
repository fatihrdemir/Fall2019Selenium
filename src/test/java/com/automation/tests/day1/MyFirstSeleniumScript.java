package com.automation.tests.day1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstSeleniumScript {
    public static void main(String[] args) throws Throwable {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        //create chrome driver
        ChromeDriver driver = new ChromeDriver();
        //open some website
        driver.get("http://google.com");
    }
}
