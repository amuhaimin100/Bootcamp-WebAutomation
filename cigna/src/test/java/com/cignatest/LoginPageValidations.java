package com.cignatest;

import com.cigna.pages.HomePage;
import com.cigna.pages.LoginPage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserIsAbleToInputIncorrectUsernameAndPasswordAndSeeErrorMessage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLoginButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnLogin();
        loginPage.validateErrorMessageIsDisplayed();
    }
}
