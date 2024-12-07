package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    //All Locators

    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By firstName = By.cssSelector("input[placeholder='First Name']");
    By lastName = By.cssSelector("input[placeholder='Last Name']");
    By postcode = By.cssSelector("input[placeholder='Post Code']");
    By addCustomerButton = By.cssSelector("button[type='submit']");
    By openAccountButton=By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass2']");


    /**
     * This method will click on open account  tab
     */
    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountButton);
    }

    /**
     * This method will click on add customer tab
     */
    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }

    /**
     * This method will enter first name
     */
    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
    }
    /**
     * This method will enter last name
     */
    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }
    /**
     * This method will enter post code
     */
    public void enterPostCode(String text) {
        sendTextToElement(postcode, text);
    }
    /**
     * This method will click on add customer button
     */
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
    /**
     * This method will verify pop up display
     */
    public void popUpDisplay(){
        switchToAlert();
    }

    public String verifyPopUp(){
        return getTextFromAlert();
    }
    /**
     * This will accept the pop up
     */
    public void clickOnOK(){
        acceptAlert();
    }
}
