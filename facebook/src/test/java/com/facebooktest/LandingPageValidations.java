package com.facebooktest;

import com.facebook.pages.HomePage;
import com.facebook.pages.LandingPage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToSeeTheFacebookLogoWhenTheyComeToTheHomePage() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.validateFBLogo();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSignInUsingTheCorrectUserNameAndPassword() {

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        landingPage.typeInUserName();
        landingPage.typeInPassword();
        landingPage.clickOnLoginButton();

        homePage.validateHomePageURL();
    }


}
