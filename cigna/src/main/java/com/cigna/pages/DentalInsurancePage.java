package com.cigna.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DentalInsurancePage extends TestBase {
    @FindBy(xpath = "//span[text()= 'Dental Plans']")
    private WebElement dentalPlanHeader;

    @FindBy(linkText = "Cigna Dental Preventive**")
    private WebElement preventiveOptionButton;

    @FindBy(xpath = "//span[text()='Cigna Dental Preventive']")
    private WebElement headerForPreventive;

    @FindBy(linkText = "Dental Care for Seniors")
    private WebElement dentalCareForSeniorsButton;

    @FindBy(xpath = "//span[text()='Dental Care for Seniors']")
    private WebElement headerForDentalCareForSeniorsPage;

    public void validateHeaderIsDisplayedOnTheDentalPlanPage() {
        Assert.assertTrue(dentalPlanHeader.isDisplayed());
        ExtentTestManager.log("Validated header Dental Plans is displayed on the Dental insurance page");
    }

    public void clickOnCignaDentalPreventiveOption() {
        preventiveOptionButton.click();
        ExtentTestManager.log("Clicked On Cigna Dental Preventive Button");
    }


    public void validateHeaderForCignaDentalPreventivePage() {
        Assert.assertTrue(headerForPreventive.isDisplayed());
        ExtentTestManager.log("Validated header for Cigna Dental Preventive Page");
    }

    public void scrollDownToDentalCareForSeniors() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", dentalCareForSeniorsButton);
        ExtentTestManager.log("The page scrolled down to Dental Care for Seniors");
    }

    public void clickOnDentalCareForSeniorsButton() {
        dentalCareForSeniorsButton.click();
        ExtentTestManager.log("Clicked on dental care for seniors button");
    }

    public void validateHeaderForDentalCareForSeniorsPage() {
        Assert.assertTrue(headerForDentalCareForSeniorsPage.isDisplayed());
        ExtentTestManager.log("Validated Header for Dental Care for Seniors Page is Displayed");
    }
}
