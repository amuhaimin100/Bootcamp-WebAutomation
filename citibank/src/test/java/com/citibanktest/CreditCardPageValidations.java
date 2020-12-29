package com.citibanktest;

import com.citibank.pages.CreditCardPage;
import com.citibank.pages.HomePage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreditCardPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToArriveAtCreditCardPageAndClickOnCitiPremierCard() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CreditCardPage creditCardPage = PageFactory.initElements(driver, CreditCardPage.class);

        homePage.hoverOverCreditCardsTab();
        homePage.clickOnAllCreditCardsButton();
        creditCardPage.validateURLForCreditCardPage();
        creditCardPage.clickOnLearnMoreApplyForCitiPremierCard();
        creditCardPage.validateURLForCitiPremierCard();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnCitiRewardsPlusCardFromAllCreditCardsPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CreditCardPage creditCardPage = PageFactory.initElements(driver, CreditCardPage.class);

        homePage.hoverOverCreditCardsTab();
        homePage.clickOnAllCreditCardsButton();
        creditCardPage.validateURLForCreditCardPage();
        creditCardPage.clickOnLearnMoreApplyForCitiRewardsPlusCard();
        creditCardPage.validateURLForCitiRewardsPlusCard();
    }
}
