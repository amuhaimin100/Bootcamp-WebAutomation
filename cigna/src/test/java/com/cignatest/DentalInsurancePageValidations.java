package com.cignatest;

import com.cigna.pages.DentalInsurancePage;
import com.cigna.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DentalInsurancePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToSelectCignaDentalPreventiveFromTheDentalInsurancePage(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        DentalInsurancePage dentalInsurancePage= PageFactory.initElements(driver, DentalInsurancePage.class);

        homePage.hoverOverIndividualsAndFamilies();
        homePage.clickOnPlansAndServices();
        homePage.clickOnDentalInsuranceButton();
        dentalInsurancePage.validateHeaderIsDisplayedOnTheDentalPlanPage();
        dentalInsurancePage.clickOnCignaDentalPreventiveOption();
        dentalInsurancePage.validateHeaderForCignaDentalPreventivePage();

    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownToDentalCareForSeniorsAndClick(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        DentalInsurancePage dentalInsurancePage= PageFactory.initElements(driver, DentalInsurancePage.class);

        homePage.hoverOverIndividualsAndFamilies();
        homePage.clickOnPlansAndServices();
        homePage.clickOnDentalInsuranceButton();
        dentalInsurancePage.validateHeaderIsDisplayedOnTheDentalPlanPage();
        dentalInsurancePage.scrollDownToDentalCareForSeniors();
        dentalInsurancePage.clickOnDentalCareForSeniorsButton();
        dentalInsurancePage.validateHeaderForDentalCareForSeniorsPage();
    }
}
