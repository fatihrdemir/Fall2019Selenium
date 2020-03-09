package com.automation.tests.day1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Hello World");
        String myString = "hello";
        System.out.println(myString);
        System.out.println(myString.toUpperCase());


        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());


        Thread.sleep(3000);

        driver.navigate().to("http://amazon.com");
        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);


        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();

    }
}
