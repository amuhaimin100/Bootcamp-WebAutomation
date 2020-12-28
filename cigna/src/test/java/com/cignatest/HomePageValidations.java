package com.cignatest;

import com.cigna.pages.DentalInsurancePage;
import com.cigna.pages.HomePage;
import com.cigna.pages.LoginPage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageValidations extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void validateUserIsAbleToNavigateToTheHomepage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateURLForHomePage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnLogInButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLoginButton();
        loginPage.validateURLForLoginPage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverMedicareTabToOpenTheDropDownMenu() {
        homePage.hoverOverMedicareTab();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectHealthyAgingAndThenOpioidsFromMedicareDropDown() {
        homePage.hoverOverMedicareTab();
        homePage.clickOnHealthyAgingButton();
        homePage.clickOnOpioidsButton();
        homePage.validateHeaderForOpioidsPage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverIndividualsAndFamilies() {
        homePage.hoverOverIndividualsAndFamilies();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectDentalInsuranceFromPlansAndServices() {
        DentalInsurancePage dentalInsurancePage= PageFactory.initElements(driver, DentalInsurancePage.class);

        homePage.hoverOverIndividualsAndFamilies();
        homePage.clickOnPlansAndServices();
        homePage.clickOnDentalInsuranceButton();
        dentalInsurancePage.validateHeaderIsDisplayedOnTheDentalPlanPage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSearchForMedicalToolsFromTheHomePage(){
        homePage.typeOnSearchBar();
        homePage.validateSearchResultsHeader();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollToTheBottomOfThePageAndClickOnCustomerRights(){
        homePage.scrollToTheEndOfThePage();
        homePage.clickOnCustomerRightsLink();
        homePage.validateURLForCustomerRights();
    }
}

