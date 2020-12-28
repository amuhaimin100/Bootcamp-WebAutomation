package com.cnn.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(id = "footer-search-bar")
    private WebElement searchBar;

    @FindBy(xpath = "(//div[text()= 'Search'])[2]")
    private WebElement searchButton;

    @FindBy(xpath = "//Strong[text()= 'Joe Biden']")
    private WebElement resultHeader;

    @FindBy(linkText = "Entertainment")
    private WebElement entertainmentButton;

    @FindBy(linkText = "Photos")
    private WebElement photosButton;

    @FindBy(xpath = "(//a[@aria-label='CNN'])[1]")
    private WebElement cnnLogo;

    @FindBy(linkText = "Travel")
    private WebElement travelTab;


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

    public void scrollDownToSearchBarThenTypeOnSearchBarAndClickSearchButton() {

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);", searchBar);
        ExtentTestManager.log("The page scrolled down to searchbar");

        searchBar.sendKeys("Joe Biden");
        ExtentTestManager.log("Typed on Search Bar to search for Joe Biden");
        searchButton.click();
        ExtentTestManager.log("Clicked on search button after typing on the search bar");

    }

    public void validateHeaderForSearchResults() {
        Assert.assertTrue(resultHeader.isDisplayed());
        ExtentTestManager.log("Validated the search results are displayed");
    }

    public void clickOnEntertainmentNews() {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);", entertainmentButton);
        ExtentTestManager.log("The page scrolled down to Entertainment");

        entertainmentButton.click();
        ExtentTestManager.log("Clicked On Entertainment Button");
    }

    public void validateURLForEntertainment() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/entertainment";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Entertainment News " + actualURL);
    }

    public void scrollDownToTheBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Scroll Down to the bottom of the page");
    }

    public void clickOnPhotos() {
        photosButton.click();
        ExtentTestManager.log("Clicked on Photos");

    }

    public void validateURLForPhotos() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/specials/photos";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Photos " + actualURL);
    }

    public void clickOnCNNLogo() {
        cnnLogo.click();
        ExtentTestManager.log("Clicked on cnn logo to return to homepage");
    }

    public void clickOnTravel() {
        travelTab.click();
        ExtentTestManager.log("Clicked on Travel tab from the Homepage");
    }

    public void clickOnLogOut() {
        logoutButton.click();
        ExtentTestManager.log("Clicked on logout button to logout of CNN");
    }
}
