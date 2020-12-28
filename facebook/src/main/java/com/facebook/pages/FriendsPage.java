package com.facebook.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FriendsPage extends TestBase {
    @FindBy(xpath = "//span[text()=\"Confirm\"]")
    private WebElement confirmFriendRequestButton;

    public void validateURLForFriendsPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/friends";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Friends Page");
    }

    public void clickOnConfirmFriendRequest() {
        confirmFriendRequestButton.click();
        ExtentTestManager.log("Clicked on accept friend request button");
    }


}
