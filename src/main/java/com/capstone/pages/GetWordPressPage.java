package com.capstone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetWordPressPage {
    private WebDriver driver;
	private By header = By.tagName("h1");

    public GetWordPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return driver.findElement(header).getText().trim();
    }
}
