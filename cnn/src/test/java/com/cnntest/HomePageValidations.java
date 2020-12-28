package com.cnntest;

import com.cnn.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    private HomePage homePage;

    @BeforeMethod
    public void setupPageFactoryAndValidateURL() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateURLForCNN();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnAccountButtonAndLogIn() {

        homePage.clickOnAccountButton();
        homePage.typeEmailAddress();
        homePage.typePassword();
        homePage.clickOnLogInButton();
        homePage.validateUserIsLoggedIn();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnMenuButtonAndSelectPoliticsNews() {
        homePage.clickOnMenuButton();
        homePage.clickOnPoliticsNews();
        homePage.validateURLForCNNPolitics();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectWorldNewsFromNavigationTabsAndReadNews() {
        homePage.clickOnWorldButton();
        homePage.validateURLforWorldNews();
        homePage.clickOnANewsHeadline();
        homePage.validateURLForNewsPage();
    }


}
