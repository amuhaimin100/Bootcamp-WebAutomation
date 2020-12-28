package com.cnn.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(id = "account-icon-button")
    private WebElement accountButton;

    @FindBy(xpath = "//input[@aria-label='Email address']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@aria-label='Password']")
    private WebElement passwordField;

    @FindBy(id = "login-form-button")
    private WebElement loginButton;

    @FindBy(linkText = "Log Out")
    private WebElement logoutButton;

    @FindBy(id = "menuButton")
    private WebElement menuButton;

    @FindBy(xpath = "(//a[@name= 'politics'])[2]")
    private WebElement politicsButton;

    @FindBy(linkText = "World")
    private WebElement worldNewsButton;

    @FindBy(xpath = "//span[contains(text(), 'Israel's government collapses')]")
    private WebElement worldNewsHeadline;

    public void validateURLForCNN() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/";

        Assert.assertTrue(actualURL.equalsIgnoreCase(expectedURL));
        ExtentTestManager.log("Validated URL for CNN " + actualURL);
    }

    public void clickOnAccountButton() {
        accountButton.click();
        ExtentTestManager.log("Clicked on Account Button");
    }

    public void typeEmailAddress() {
        emailField.sendKeys("abir_muhaimin@hotmail.com");
        ExtentTestManager.log("Typed in email address is the email address field");
    }

    public void typePassword() {
        passwordField.sendKeys("Fake123$");
        ExtentTestManager.log("Typed in Password in the password field");
    }

    public void clickOnLogInButton() {
        loginButton.click();
        ExtentTestManager.log("Clicked On LogIn Button");
    }

    public void validateUserIsLoggedIn() {
        accountButton.click();
        Assert.assertTrue(logoutButton.isDisplayed());
        ExtentTestManager.log("Validated The Option to log out is displayed once user is logged in");
    }

    public void clickOnMenuButton() {
        menuButton.click();
        ExtentTestManager.log("Clicked On Menu Button");
    }

    public void clickOnPoliticsNews() {
        politicsButton.click();
        ExtentTestManager.log("Clicked on politics button from the menu");
    }

    public void validateURLForCNNPolitics() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/politics";

        Assert.assertTrue(actualURL.equalsIgnoreCase(expectedURL));
        ExtentTestManager.log("Validated URL for cnn politics page " + actualURL);

    }

    public void clickOnWorldButton() {
        worldNewsButton.click();
        ExtentTestManager.log("Clicked On World News Button from the navigation tab");
    }

    public void validateURLforWorldNews() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/world";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for world news " + actualURL);
    }

    public void clickOnANewsHeadline() {
        worldNewsHeadline.click();
        ExtentTestManager.log("Clicked On a news headline under World news");
    }

    public void validateURLForNewsPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "/israel-government-collapses-intl";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for world news report " + actualURL);
    }
}
