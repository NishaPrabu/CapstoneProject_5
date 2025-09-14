package com.capstone.stepdefs;

import org.testng.Assert;

import com.capstone.base.BaseTest;
import com.capstone.pages.CommunityPage;
import com.capstone.pages.GetWordPressPage;
import com.capstone.pages.HomePage;
import com.capstone.pages.PhotoDirectoryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WordPressSteps extends BaseTest {
    HomePage home;
    GetWordPressPage getWP;
    CommunityPage community;
    PhotoDirectoryPage photoDir;

    @Given("I launch the WordPress homepage")
    public void i_launch_homepage() {
        initDriver();
        getDriver().get("https://wordpress.org/");
        home = new HomePage(getDriver());
        getWP = new GetWordPressPage(getDriver());
        community = new CommunityPage(getDriver());
        photoDir = new PhotoDirectoryPage(getDriver());
    }

    @Then("I verify the page title is {string}")
    public void i_verify_title(String expected) {
		String actual = home.getTitle();
		Assert.assertEquals(actual, expected, "Page title mismatch");

    }

	@When("I click on Get WordPress")
	public void i_click_on_Get_WordPress() {
		home.ClickGetWP();
    }

    @Then("I verify the middle page text is {string}")
    public void i_verify_middle_text(String expected) {
        String header = getWP.getHeaderText();
        Assert.assertEquals(header, expected, "Header text mismatch");
    }

    @When("I click on {string} and then {string}")
    public void i_click_community_and_photo(String c, String photo) {
        // click Community
		community.clickCommunity();
        community.clickPhotoDirectory();
    }

    @When("I search for picture named {string}")
    public void i_search_for_picture(String name) {
        photoDir.searchPicture(name);
    }

    @Then("I verify pictures are displayed")
    public void i_verify_pictures_displayed() {
        Assert.assertTrue(photoDir.arePicturesDisplayed(), "Pictures not displayed");
        quitDriver();
    }
}
