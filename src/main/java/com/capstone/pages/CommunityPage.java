package com.capstone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CommunityPage {
    private WebDriver driver;
	private By photoDirectory = By.xpath("//span[text()='Photo Directory']");
	private By Community = By.xpath("//span[text()='Community']");


    public CommunityPage(WebDriver driver) {
        this.driver = driver;
    }

	public void clickCommunity() {
		driver.findElement(Community).click();
	}

    public void clickPhotoDirectory() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(photoDirectory)).perform();
        driver.findElement(photoDirectory).click();
    }
}
