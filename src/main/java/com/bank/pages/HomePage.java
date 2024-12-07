package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //All locator of the page
    By managerLoginTab = By.cssSelector("button[ng-click='manager()']");
    By customerLoginTab=By.cssSelector("button[ng-click='customer()']");


    /**
     * This method will click on manager login tab
     */
    public void clickOnManagerLoginTab() {
        clickOnElement(managerLoginTab);
    }
    /**
     * This method will click on customer login tab
     */
    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
    }
}
