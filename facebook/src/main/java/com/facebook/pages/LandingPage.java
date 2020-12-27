package com.facebook.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LandingPage extends TestBase {
    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    private WebElement fbLogo;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "u_0_b")
    private WebElement loginButton;


    public void validateFBLogo() {
        Assert.assertTrue(fbLogo.isDisplayed());
        ExtentTestManager.log("Validated the Facebook Logo is Displayed on the Landing Page");
    }

    public void typeInUserName() {
        emailField.sendKeys("amuhaimin100@gmail.com");
        ExtentTestManager.log("Typed in email address in the email/phone number field");
    }

    public void typeInPassword() {
        passwordField.sendKeys("fakefake1234");
        ExtentTestManager.log("Typed in password in the password field");
    }


    public void clickOnLoginButton() {
        loginButton.click();
        ExtentTestManager.log("Clicked on login button after providing username and password");
    }


}
