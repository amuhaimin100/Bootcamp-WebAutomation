package com.citibank.pages;

import com.peoplentech.webautomationbootcamp.base.TestBase;
import com.peoplentech.webautomationbootcamp.extent.ExtentTestManager;
import org.testng.Assert;

public class CitigoldPage extends TestBase {
    public void validateURLForCitigoldPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "ID=CitigoldOverview";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Citigold Page");
    }
}
