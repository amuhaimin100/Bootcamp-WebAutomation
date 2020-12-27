package com.facebooktest;

import com.facebook.pages.HomePage;
import com.facebook.pages.ProfilePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageValidations extends TestBase {

    @BeforeMethod
    public void loginToTheAccount() {
        LandingPageValidations landingPageValidations = PageFactory.initElements(driver, LandingPageValidations.class);
        landingPageValidations.validateUserIsAbleToSignInUsingTheCorrectUserNameAndPassword();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnAccountAndThenNavigateToTheirProfile() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
        homePage.clickOnViewProfile();
        profilePage.validateURLForProfile();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToLikeAPost() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
        homePage.clickOnViewProfile();
        profilePage.clickOnLikeButton();
        profilePage.validateLikeButtonHasBeenClicked();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToCommentOnAPost() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
        homePage.clickOnViewProfile();
        profilePage.commentOnAPostAndHitEnter();
        profilePage.validateCommentIsPosted();

    }
}
