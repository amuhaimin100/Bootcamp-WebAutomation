package com.citibank.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreditCardPage extends TestBase {

    @FindBy(xpath = "//a[@aria-label='Citi Premier&reg; Card Learn More & Apply']")
    private WebElement citiPremierCardButton;

    @FindBy(xpath = "//a[@aria-label='Citi Rewards+ SM Card Learn More & Apply']")
    private WebElement citiRewardsPlusCardButton;

    public void validateURLForCreditCardPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "citi.com/credit-cards/compare/view-all-credit-cards";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for All Credit Cards Page");
    }

    public void clickOnLearnMoreApplyForCitiPremierCard() {
        citiPremierCardButton.click();
        ExtentTestManager.log("Clicked on Learn More & Apply on citi premier card");
    }

    public void validateURLForCitiPremierCard() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "ID=citi-premier-credit-card";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Citi Premier card " + actualURL);
    }

    public void clickOnLearnMoreApplyForCitiRewardsPlusCard() {
        citiRewardsPlusCardButton.click();
        ExtentTestManager.log("Clicked on Learn More & Apply for Citi Rewards+ Card");
    }

    public void validateURLForCitiRewardsPlusCard() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "ID=citi-rewards-plus-credit-card";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Citi Rewards+ card " + actualURL);
    }
}
