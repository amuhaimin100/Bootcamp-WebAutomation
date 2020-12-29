package com.citibank.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
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
}
