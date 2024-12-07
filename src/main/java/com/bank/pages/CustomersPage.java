package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    //All locators of the page
    By addedCustomer=By.cssSelector("#userSelect");
    By loginButton=By.cssSelector("button[type='submit']");

    /**
     * This method will search customer
     */
    public void searchAddedCustomer(String cust){
        selectByContainsTextFromDropDown(addedCustomer,cust);
    }
    /**
     * This method will click on login button
     */
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }



}
