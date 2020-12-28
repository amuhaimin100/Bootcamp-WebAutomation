package com.facebook.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(xpath = "(//input[@value=''])[2]")
    private WebElement searchBar;

    @FindBy(xpath = "//span[text()='Ami Real']")
    private WebElement profileButton;

    @FindBy(xpath = "//span[text()= 'See More']")
    private WebElement seeMoreButton;

    @FindBy(xpath = "//span[text()='News']")
    private WebElement newsButton;

    @FindBy(xpath = "//a[@aria-label= 'Friends']")
    private WebElement friendsTab;

    public static void validateHomePageURL() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/?sk=welcome";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for the Homepage " + actualURL);
    }

    public void clickOnFriendsTab() {
        friendsTab.click();

    }

    public void searchForChandlerBing() {
        searchBar.sendKeys("Chandler Bing");
        ExtentTestManager.log("Searched for Chandler Bing after logging into the account");

    }

    //this method can be used multiple times to search for names/groups/pages etc.
    public void hitEnterToShowSearchResults() {
        searchBar.sendKeys(Keys.ENTER);
        ExtentTestManager.log("Hit Enter After typing in the search box");
    }

    public void validateURLForSearchResults() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/search/people/?q=Chandler%20Bing";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Search Result Page " + actualURL);
    }

    public void clickOnViewProfile() {
        profileButton.click();
        ExtentTestManager.log("Clicked on profile name to view profile");
    }

    public void clickOnSeeMoreButton() {
        seeMoreButton.click();
        ExtentTestManager.log("Clicked On See More button from the menu");
    }


    public void clickOnNews() {
        newsButton.click();
        ExtentTestManager.log("Clicked On News Button");
    }

    public void validateURLForNews() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/fbnews";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for News " + actualURL);

    }
}
