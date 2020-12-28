package com.facebooktest;

import com.facebook.pages.FriendsPage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FriendsPageValidations extends TestBase {

    @BeforeMethod
    public void loginToTheAccount() {
        LandingPageValidations landingPageValidations = PageFactory.initElements(driver, LandingPageValidations.class);
        landingPageValidations.validateUserIsAbleToSignInUsingTheCorrectUserNameAndPassword();
    }

    @Test
    public void validateUserIsAbleToAcceptFriendRequest() {
        HomePageValidations homePageValidations = PageFactory.initElements(driver, HomePageValidations.class);
        FriendsPage friendsPage = PageFactory.initElements(driver, FriendsPage.class);

        homePageValidations.validateUserIsAbleToNavigateToFriendsPageFromHomePage();
        friendsPage.validateURLForFriendsPage();
        friendsPage.clickOnConfirmFriendRequest();
    }
}
