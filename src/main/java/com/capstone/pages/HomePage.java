package com.capstone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By getWordPress = By.linkText("Get WordPress");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

	public void ClickGetWP() {
        driver.findElement(getWordPress).click();
    }
}
