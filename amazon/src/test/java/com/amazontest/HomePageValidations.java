package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void setupPageFactory() {

        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnAmazonLogo() {
        homePage.validateClickOnLogo();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnSignInButton() {
        homePage.validateSignInButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverTryPrimeLogoAndClickTryPrime() {
        homePage.clickOnTryPrime();
        homePage.validateURLForPrime();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverAccountsAndListsAndClickOrders() {
        homePage.hoverOverAccountsAndList();
        homePage.clickOnOrders();
        homePage.validateURLForSignIn();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToTypeOnSearchBarAndClickSearchButton() {
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();
    }

    @Test(enabled = false)
    public void validateUserInAbleToSelectDeptFromDropdownBoxAndSearchForItem() {
        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToSearchForMultipleItems(String data) {
        homePage.typeMultipleDataOnSearchBar(data);
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndScrollBackUp() {
        homePage.scrollToElement();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndClickOnALink() {
        homePage.scrollDownAndClickOnLink();
        homePage.validateAboutAmazonURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToNavigateToCanadianWebsite() {
        homePage.navigateToCanadianAmazonWebsite();
        homePage.validateCanadianAmazonURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectItemsFromMenuBar() {
        homePage.clickOnMenuButton();
        homePage.clickOnMoviesMusicGamesButton();
        homePage.clickOnVideoGamesButton();
        homePage.validateVideoGamesPage();
    }


}
