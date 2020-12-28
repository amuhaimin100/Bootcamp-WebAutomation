package com.cnntest;

import com.cnn.pages.HomePage;
import com.cnn.pages.TravelPage;
import com.peoplentech.webautomationbootcamp.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TravelPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToSelectTravelFromTheHomePageAndClickOnDestinations() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        TravelPage travelPage = PageFactory.initElements(driver, TravelPage.class);

        homePage.clickOnTravel();
        travelPage.validateURLForTravelPage();
        travelPage.clickOnDestinationsButton();
        travelPage.validateURLForDestinationPage();
    }

}

