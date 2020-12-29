package com.citibank.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BuyAHomePage extends TestBase {

    @FindBy(xpath = "//span[text()='1-800-248-4638']")
    private WebElement phoneNumberForAgentButton;

    @FindBy(id = "Rates")
    private WebElement ratesTab;

    @FindBy(xpath = "//header/div[@id='subnav']/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement mortgageRateButton;

    public void validateURLForBuyAHomePage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "ID=mortgage_buy_home";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Buy A Home Page");
    }

    public void callTheNumberOnThePage() {
        phoneNumberForAgentButton.click();
        ExtentTestManager.log("Clicked on the phone number listed on the page to initiate a call");
    }

    public void clickOnRates() {
        ratesTab.click();
        ExtentTestManager.log("Clicked on the Rates tab");
    }

    public void clickOnMortgageRate() {
        mortgageRateButton.click();
        ExtentTestManager.log("Selected Mortgage Rates from the Rates tab");
    }

    public void validateURLForMortgageRatePage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "ID=todays_mortgage_rates";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Mortgage Rates " + actualURL);
    }
}
