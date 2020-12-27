package com.facebook.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//h1[contains(text(),'Ami Real')]")
    private WebElement profileName;

    @FindBy(xpath = "//div[@xpath='1']")
    private WebElement likeButton;

    @FindBy(xpath = "span[@xpath='1']")
    private WebElement thumbsUpSign;

    @FindBy(xpath = "//div[@aria-label= 'Write a comment']")
    private WebElement commentBox;

    public void validateURLForProfile() {
        Assert.assertTrue(profileName.isDisplayed());
        ExtentTestManager.log("Validated that the user is in the correct profile page");

    }

    public void clickOnLikeButton() {
        likeButton.click();
        ExtentTestManager.log("User Clicked on the like button on post");
    }

    public void validateLikeButtonHasBeenClicked() {
        Assert.assertTrue(thumbsUpSign.isDisplayed());
        ExtentTestManager.log("Validated clicked on like button has been successfull");
    }

    public void commentOnAPostAndHitEnter() {
        commentBox.sendKeys("Hello I am Blob");
        commentBox.sendKeys(Keys.ENTER);
        ExtentTestManager.log("Typed comment on a post and hit enter to post comment");

    }

    public void validateCommentIsPosted() {
    }
}
