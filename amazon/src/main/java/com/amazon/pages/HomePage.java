package com.amazon.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends TestBase {

    @FindBy(id = "nav-logo-sprites")
    private WebElement logo;

    @FindBy(xpath = "//span[text()='Hello, Sign in']")
    private WebElement signin;


    @FindBy(xpath = "//i[@aria-label='Amazon']")
    private WebElement signinHeading;

    @FindBy(xpath = "(//a[text()='Start here.'])[1]")
    private WebElement createAccountButton;

    @FindBy(id = "nav-hamburger-menu")
    private WebElement menuButton;

    @FindBy(xpath = "//div[text()='Movies, Music & Games']")
    private WebElement moviesMusicGamesButton;

    @FindBy(xpath = "(//a[text()='Video Games'])[1]")
    private WebElement videoGamesButton;

    @FindBy(xpath = "(//a[text()='New Releases'])[2]")
    private WebElement newReleasesButton;

    @FindBy(xpath = "//a[@id='nav-link-prime']")
    private WebElement tryPrimeLogo;

    @FindBy(xpath = "//div[@class='prime-button-try']")
    private WebElement tryPrime;

    @FindBy(xpath = "//span[text()='Account & Lists']")
    private WebElement accountsAndLists;

    @FindBy(xpath = "//span[text()='Orders']")
    private WebElement orders;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchBar;

    @FindBy(xpath = "(//input[@type='submit'])[1]")

    private WebElement searchButton;

    @FindBy(id = "searchDropdownBox")
    private WebElement departments;

    @FindBy(linkText = "Sell apps on Amazon")
    private WebElement elementSellAppsOnAmazon;

    @FindBy(linkText = "About Amazon")
    private WebElement aboutAmazonLink;

    @FindBy(xpath = "(//div[text()='Change country/region.'])[1]")
    private WebElement changeCountryRegion;

    @FindBy(xpath = "//a[@aria-label='Choose a language for shopping.']")
    private WebElement changeLanguage;

    @FindBy(xpath = "//span[@id = 'a-autoid-0-announce']")

    private WebElement countryDropDown;

    @FindBy(xpath = "//span[text()='Canada']")
    private WebElement canadaButton;


    @FindBy(xpath = "//span[@id='a-autoid-2']")
    private WebElement goToWebsiteButton;

    @FindBy(xpath = "//span[text()='Register for a Business Account']")
    private WebElement businessAccountButton;

    @FindBy(xpath = "//b[text()='Video Games']")
    private WebElement searchedItem;


    public void clickOnMenuButton() {
        menuButton.click();
        ExtentTestManager.log("Clicked on Menu Bar");
    }

    public void validateClickOnLogo() {
        logo.click();
        Assert.assertTrue(logo.isDisplayed());
        ExtentTestManager.log("Clicked on Amazon Logo");
    }

    public void validateSignInButton() {
        signin.click();
        ExtentTestManager.log("Clicked on SignIn Button");
        Assert.assertTrue(signinHeading.isDisplayed());
        ExtentTestManager.log("Validated SignIn header is displayed");
    }

    public void hoverOverTryPrimeLogo() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(tryPrimeLogo).build().perform();
    }

    public void clickOnTryPrime() {

        hoverOverTryPrimeLogo();
        ExtentTestManager.log("Hover over try prime logo");

        tryPrime.click();
        ExtentTestManager.log("Click On Try Prime");
    }

    public void validateURLForPrime() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/amazonprime";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void hoverOverAccountsAndList() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(accountsAndLists).build().perform();
    }

    public void clickOnOrders() {
        hoverOverAccountsAndList();
        ExtentTestManager.log("Hover over Accounts & Lists");

        orders.click();
        ExtentTestManager.log("Clicked On Orders");
    }


    public void validateURLForSignIn() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/signin";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void typeOnSearchBar() {
        searchBar.sendKeys("PlayStation 5");
    }

    public void clickOnSearchButton() {
        searchButton.click();
        ExtentTestManager.log("Clicked on the search button");
    }

    public void typeOnSearchBarAndClickOnSearchButton() {
        typeOnSearchBar();
        ExtentTestManager.log("Typed on search bar: PlayStation 5");

        searchButton.click();
        ExtentTestManager.log("Clicked on the search button");
    }

    public void validateURLForSearchButton() {

        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/s?k=PlayStation+5";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("The Search result URL been validated " + actualURL);
    }

    public void clickOnAllDeptAndSelectDept() {

        Select select = new Select(departments);
        select.selectByVisibleText("Video Games");
        ExtentTestManager.log("Video Games has been selected from departments dropdown box");
    }

    public void typeMultipleDataOnSearchBar(String data) {
        searchBar.sendKeys(data);
        ExtentTestManager.log("Typed on Search Bar: " + data);
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", elementSellAppsOnAmazon);
        ExtentTestManager.log("The page scrolled down to sell apps on Amazon");

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        ExtentTestManager.log("Scrolled back to the top of the page");
    }

    public void scrollDownAndClickOnLink() {

        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", elementSellAppsOnAmazon);
        ExtentTestManager.log("The page scrolled down to sell apps on Amazon");

        aboutAmazonLink.click();
        ExtentTestManager.log("After scrolling down to element, click on about Amazon link");
    }

    public void validateAboutAmazonURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.aboutamazon.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void hoverOverChangeLanguage() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(changeLanguage).build().perform();
        ExtentTestManager.log("Hover mouse over Change Language and Region");
    }

    public void clickOnChangeCountry() {
        hoverOverChangeLanguage();
        changeCountryRegion.click();
        ExtentTestManager.log("Clicked on Change Country/Region");
    }

    public void validateChangeCountryURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/gp/navigation-country";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Changing Country/Region");
    }

    public void clickOnCountryDropDownBoxAndSelectCanada() {

        clickOnChangeCountry();
        validateChangeCountryURL();

        countryDropDown.click();
        canadaButton.click();

        ExtentTestManager.log("Selected Canada from the Region dropdown box");
    }

    public void navigateToCanadianAmazonWebsite() {
        clickOnCountryDropDownBoxAndSelectCanada();
        goToWebsiteButton.click();
        ExtentTestManager.log("Navigated to Canadian Amazon website");

        List<String> browserTabs = new ArrayList<String>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(browserTabs.get(1));
        ExtentTestManager.log("Switched to Canadian Amazon tab");

    }

    public void validateCanadianAmazonURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.ca/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Canadian Amazon Website");
    }


    public void clickOnMoviesMusicGamesButton() {
        moviesMusicGamesButton.click();
        ExtentTestManager.log("Clicked on Movies Music & Games Option");
    }

    public void clickOnVideoGamesButton() {
        videoGamesButton.click();
        ExtentTestManager.log("Clicked on Video Games Button");
    }

    public void validateVideoGamesPage() {
        String actualText = searchedItem.getText();
        String expectedText = "Video Games";

        Assert.assertEquals(actualText, expectedText);
        ExtentTestManager.log("Validated Searched Item matches the display on the search result page: " + actualText);

    }

}
