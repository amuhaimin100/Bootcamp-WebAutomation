package com.cigna.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends TestBase {

    @FindBy(linkText = "Log in to myCigna")
    private WebElement loginButton;

    @FindBy(linkText = "Medicare")
    private WebElement medicareTab;

    @FindBy(id = "healthy-aging-tab")
    private WebElement healthyAgingButton;

    @FindBy(linkText = "Opioids: Know the Risks")
    private WebElement opioidsButton;

    @FindBy(xpath = "//span[contains(text(),'Opioids: Know the Risks')]")
    private WebElement opioidsHeader;

    @FindBy(linkText = "Individuals and Families")
    private WebElement individualsAndFamiliesTab;

    @FindBy(id = "plans-services-1-tab")
    private WebElement plansAndServicesButton;

    @FindBy(linkText = "Dental Insurance")
    private WebElement dentalInsuranceButton;

    @FindBy(id = "search-desktop")
    private WebElement searchbar;

    @FindBy(xpath = "//strong[text()='Medical Tools']")
    private WebElement medicalToolsHeader;

    @FindBy(linkText = "Customer Rights")
    private WebElement customerRightsButton;

    public void validateURLForHomePage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/";

        Assert.assertTrue(actualURL.equalsIgnoreCase(expectedURL));
        ExtentTestManager.log("Validated URL for HomePage " + actualURL);

    }

    public void clickOnLoginButton() {
        loginButton.click();
        ExtentTestManager.log("Clicked on log in to my cigna button");

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        ExtentTestManager.log("Switched to Log-in page tab");
    }

    public void hoverOverMedicareTab() {
        Actions actions = new Actions(driver);
        actions.moveToElement(medicareTab).build().perform();
        ExtentTestManager.log("Hovered over Medicare tab to open the drop down menu");
    }

    public void clickOnHealthyAgingButton() {
        healthyAgingButton.click();
        ExtentTestManager.log("Clicked on healthy aging button from medicare tab");
    }

    public void clickOnOpioidsButton() {
        opioidsButton.click();
        ExtentTestManager.log("Clicked on opioids button");
    }

    public void validateHeaderForOpioidsPage() {
        Assert.assertTrue(opioidsHeader.isDisplayed());
        ExtentTestManager.log("Validated opioids header is displayed");
    }

    public void hoverOverIndividualsAndFamilies() {
        Actions actions = new Actions(driver);
        actions.moveToElement(individualsAndFamiliesTab).build().perform();
    }

    public void clickOnPlansAndServices() {
        plansAndServicesButton.click();
        ExtentTestManager.log("Clicked on plans and services button from individuals and families tab");
    }

    public void clickOnDentalInsuranceButton() {
        dentalInsuranceButton.click();
        ExtentTestManager.log("Clicked on Dental Insurance button");
    }

    public void typeOnSearchBar() {
        searchbar.sendKeys("Medical Tools");
        searchbar.sendKeys(Keys.ENTER);
        ExtentTestManager.log("Searched for Medical Tools and hit enter");
    }

    public void validateSearchResultsHeader() {
        Assert.assertTrue(medicalToolsHeader.isDisplayed());
        ExtentTestManager.log("Validated Header for medical tools search results is displayed");

    }

    public void scrollToTheEndOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Scroll Down to the bottom of the page");
    }

    public void clickOnCustomerRightsLink() {
        customerRightsButton.click();
        ExtentTestManager.log("Clicked On Customer Rights Button");
    }

    public void validateURLForCustomerRights() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/memberrightsandresponsibilities";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for customer rights page");

    }
}
