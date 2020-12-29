package com.citibanktest;

import com.citibank.pages.BuyAHomePage;
import com.citibank.pages.CitigoldPage;
import com.citibank.pages.CreditCardPage;
import com.citibank.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void validateHomePageURLAndSetUpPageFactory() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateURLForHomePage();
    }

    @Test(enabled = false)
    public void validateUserIsNotAbleToLogInWithIncorrectUserNameAndPassword() {
        homePage.typeInUsernameInUsernameField();
        homePage.typeInPasswordInPasswordField();
        homePage.clickOnSignOnButton();
        homePage.validateErrorMessageIsDisplayed();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverCreditCardsAndSelectViewAllCreditCardsFromTheDropDown() {
        CreditCardPage creditCardPage = PageFactory.initElements(driver, CreditCardPage.class);
        homePage.hoverOverCreditCardsTab();
        homePage.clickOnAllCreditCardsButton();
        creditCardPage.validateURLForCreditCardPage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverLendingAndClickOnBuyAHome() {
        BuyAHomePage buyAHomePage = PageFactory.initElements(driver, BuyAHomePage.class);
        homePage.hoverOverLending();
        homePage.clickOnBuyAHomeButton();
        buyAHomePage.validateURLForBuyAHomePage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverWealthManagementAndSelectCitigold() {
        CitigoldPage citigoldPage = PageFactory.initElements(driver, CitigoldPage.class);
        homePage.hoverOverWealthManagement();
        homePage.clickOnCitigold();
        citigoldPage.validateURLForCitigoldPage();
    }


}
