package com.citibank.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "signInBtn")
    private WebElement signOnButton;

    @FindBy(id = "signOnLoginError")
    private WebElement errorMessage;

    @FindBy(xpath = "//span[text()='Credit Cards']")
    private WebElement creditCardsTab;

    @FindBy(linkText = "View All Credit Cards")
    private WebElement allCreditCardsButton;

    @FindBy(id = "lending")
    private WebElement lendingButton;

    @FindBy(id = "lending_buyahomedesk")
    private WebElement buyAHomeButton;

    @FindBy(linkText = "Wealth Management")
    private WebElement wealthManagementTab;

    @FindBy(id = "wm_citigold")
    private WebElement citigoldButton;

    @FindBy(linkText = "Careers")
    private WebElement careerLink;

    @FindBy(xpath = "//input[@id='citi-autocomplete-content-searchbox-livesearch']")
    private WebElement searchBar;

    @FindBy(id = "search_icon")
    private WebElement searchIcon;

    @FindBy(xpath = "//span[text()= 'What is a bank']")
    private WebElement searchResultPageHeader;


    public void validateURLForHomePage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/login.do";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for HomePage");
    }

    public void typeInUsernameInUsernameField() {
        usernameField.sendKeys("CaptainAmerica");
        ExtentTestManager.log("Typed in incorrect username in the username field");
    }

    public void typeInPasswordInPasswordField() {
        passwordField.sendKeys("HailHydra");
        ExtentTestManager.log("Typed in incorrect password in the password field");
    }

    public void clickOnSignOnButton() {
        signOnButton.click();
        ExtentTestManager.log("Clicked on sign on button");
    }

    public void validateErrorMessageIsDisplayed() {
        Assert.assertTrue(errorMessage.isDisplayed());
        ExtentTestManager.log("Validated error message is displayed when wrong username and password is typed");
    }

    public void hoverOverCreditCardsTab() {
        Actions actions = new Actions(driver);
        actions.moveToElement(creditCardsTab).build().perform();
        ExtentTestManager.log("Hovered mouse over Credit Cards Tab");
    }

    public void clickOnAllCreditCardsButton() {
        allCreditCardsButton.click();
        ExtentTestManager.log("Clicked on all credit cards button");
    }

    public void hoverOverLending() {
        Actions actions = new Actions(driver);
        actions.moveToElement(lendingButton).build().perform();
        ExtentTestManager.log("Hovered mouse over Lending tab on the homepage");
    }

    public void clickOnBuyAHomeButton() {
        buyAHomeButton.click();
        ExtentTestManager.log("Clicked on Buy A Home after hovering over Lending to open up drop down menu");
    }

    public void hoverOverWealthManagement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wealthManagementTab).build().perform();
        ExtentTestManager.log("Hovered mouse over Wealth Management Tab");
    }

    public void clickOnCitigold() {
        citigoldButton.click();
        ExtentTestManager.log("Clicked on Citigold Button");
    }

    public void scrollToCareer() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", careerLink);
        ExtentTestManager.log("The page scrolled down to Career");
    }

    public void clickOnCareerLink() {
        careerLink.click();
        ExtentTestManager.log("Clicked on the Career Link");
    }

    public void validatedURLForCareerPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://jobs.citi.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Career page " + actualURL);
    }

    public void clickOnSearchIcon() {
        searchIcon.click();
        ExtentTestManager.log("Clicked on Search icon");
    }

    public void typeOnSearchBarAndHitEnter() {
        searchBar.sendKeys("What is a Bank?");
        searchBar.sendKeys(Keys.ENTER);
        ExtentTestManager.log("Searched for item and hit enter");
    }

    public void validateSearchResultPageHeader() {
        Assert.assertTrue(searchResultPageHeader.isDisplayed());
        ExtentTestManager.log("Validated that the search result page header is displayed.");
    }
}
