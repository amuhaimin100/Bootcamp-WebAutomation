package com.cigna.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends TestBase {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement loginButton;

    @FindBy(id = "alertmessage")
    private WebElement errorMessage;

    public void validateURLForLoginPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://my.cigna.com/web/public/guest";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for log in page " + actualURL);
    }

    public void inputUsername() {
        usernameField.sendKeys("boomboom100@gmail.com");
        ExtentTestManager.log("Typed in email address in the username field");
    }

    public void inputPassword() {
        passwordField.sendKeys("fakeBoom123#");
        ExtentTestManager.log("Typed in password in the password field");
    }

    public void clickOnLogin() {
        loginButton.click();
        ExtentTestManager.log("Clicked on login button");
    }

    public void validateErrorMessageIsDisplayed() {
        Assert.assertTrue(errorMessage.isDisplayed());
        ExtentTestManager.log("Validated error message is displayed when inputting incorrect username and password");
    }
}
