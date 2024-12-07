package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    //All locators of OpenAccount page
    By customer=By.xpath("//select[@id='userSelect']");
    By currency=By.cssSelector("#currency");
    By processButton=By.cssSelector("button[type='submit']");

    /**
     * This method will search customer from list
     * @param text
     */
    public void searchCustomer(String text){
        selectByContainsTextFromDropDown(customer,text);
    }
    /**
     * This method select currency pound
     */
    public void selectCurrency(String curr){
        selectByVisibleTextFromDropDown(currency,curr);
    }
    /**
     * This method will click on process button
     */
    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }


}
