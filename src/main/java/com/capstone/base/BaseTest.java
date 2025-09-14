package com.capstone.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        tlDriver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
    }

    public void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            tlDriver.remove();
        }
    }
}
