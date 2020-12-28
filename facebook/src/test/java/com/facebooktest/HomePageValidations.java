package com.facebooktest;

import com.facebook.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {


    @BeforeMethod
    public void loginToTheAccount() {
        LandingPageValidations landingPageValidations = PageFactory.initElements(driver, LandingPageValidations.class);
        landingPageValidations.validateUserIsAbleToSignInUsingTheCorrectUserNameAndPassword();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSearchForANameAndHitEnter() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchForChandlerBing();
        sleepFor(2);
        homePage.hitEnterToShowSearchResults();
        sleepFor(3);
        homePage.validateURLForSearchResults();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnNewsFromTheMenu() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSeeMoreButton();
        homePage.clickOnNews();
        homePage.validateURLForNews();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToNavigateToFriendsPageFromHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnFriendsTab();
        sleepFor(3);

    }
}
