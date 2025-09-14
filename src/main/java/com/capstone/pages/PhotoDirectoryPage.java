package com.capstone.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotoDirectoryPage {
    private WebDriver driver;
	private By searchBox = By.xpath("//input[@placeholder='Search photos']");
    private By searchButton = By.cssSelector("button[type='submit']");
    private By photoResults = By.cssSelector("figure");

    public PhotoDirectoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchPicture(String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search);
		search.clear();
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
    }

    public boolean arePicturesDisplayed() {
        List<WebElement> pics = driver.findElements(photoResults);
        return pics.size() > 0;
    }
}
