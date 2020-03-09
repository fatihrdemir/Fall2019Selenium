package com.automation.tests.day6;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public NavigationTests() {
    }

    public static void main(String[] args) throws InterruptedException {
        chromeTest();
        firefoxTest();
        edgeTest();

    }

    public static void chromeTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        System.out.println("googleTitle = " + googleTitle);
        Thread.sleep(2000L);
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle);
        Thread.sleep(2000L);
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), googleTitle);
        Thread.sleep(2000L);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), etsyTitle);
        driver.close();
    }

    public static void firefoxTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        System.out.println("googleTitle = " + googleTitle);
        Thread.sleep(2000L);
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle);
        Thread.sleep(2000L);
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), googleTitle);
        Thread.sleep(2000L);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), etsyTitle);
        driver.close();
    }
    public static void edgeTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        System.out.println("googleTitle = " + googleTitle);
        Thread.sleep(2000L);
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle);
        Thread.sleep(2000L);
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), googleTitle);
        Thread.sleep(2000L);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), etsyTitle);
        driver.close();
    }





}