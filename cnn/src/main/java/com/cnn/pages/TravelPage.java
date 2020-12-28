package com.cnn.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TravelPage {
    @FindBy(linkText = "Destinations")
    private WebElement destinationsButton;

    public void validateURLForTravelPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "cnn.com/travel";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Travel page");
    }

    public void clickOnDestinationsButton() {
        destinationsButton.click();
        ExtentTestManager.log("Clicked on Destinations Button");
    }

    public void validateURLForDestinationPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "cnn.com/travel/destinations";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for the Destinations Page");
    }
}
