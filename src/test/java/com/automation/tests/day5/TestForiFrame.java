package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForiFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement editor = driver.findElement(By.tagName("p"));
        editor.clear();
        editor.sendKeys("Besiktaslidir");
        editor.sendKeys(Keys.CONTROL + "a");
        driver.switchTo().parentFrame();
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//i[@class='mce-ico mce-i-indent']")).click();
        }
        driver.findElement(By.id("mceu_3")).click();
        Thread.sleep(1500);
        driver.quit();
    }
}
