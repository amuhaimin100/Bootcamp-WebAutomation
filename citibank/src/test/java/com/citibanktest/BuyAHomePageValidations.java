package com.citibanktest;

import com.citibank.pages.BuyAHomePage;
import com.citibank.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BuyAHomePageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserIsAbleToInitiateACallFromThePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        BuyAHomePage buyAHomePage = PageFactory.initElements(driver, BuyAHomePage.class);
        homePage.hoverOverLending();
        homePage.clickOnBuyAHomeButton();
        buyAHomePage.validateURLForBuyAHomePage();
        buyAHomePage.callTheNumberOnThePage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnRatesAndSelectMortgageRate() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        BuyAHomePage buyAHomePage = PageFactory.initElements(driver, BuyAHomePage.class);
        homePage.hoverOverLending();
        homePage.clickOnBuyAHomeButton();
        buyAHomePage.validateURLForBuyAHomePage();
        buyAHomePage.clickOnRates();
        buyAHomePage.clickOnMortgageRate();
        buyAHomePage.validateURLForMortgageRatePage();
    }


}
