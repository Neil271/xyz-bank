package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    //All locators of the page
    By logoutTab = By.cssSelector(".btn.logout");
    By customerName=By.xpath("//span[@class='fontBig ng-binding']");
    By logoutText=By.xpath("//button[contains(text(),'Logout')]");
    By depositButton=By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass2']");
    By amount=By.cssSelector("input[placeholder='amount']");
    By submit=By.cssSelector("button[type='submit']");
    By message=By.cssSelector(".error.ng-binding");
    By withdrawlButton=By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass3']");
    By withdrawlSubmit=By.xpath("//button[normalize-space()='Withdraw']");
    By selectCurrency=By.xpath("//select[@id='accountSelect']");
    /**
     * This method will click on withdrawl submit
     */
    public void clickOnWithdrawlSubmit(){
        clickOnElement(withdrawlSubmit);
    }

    /**
     * This method will click on logout tab
     */
    public void clickOnLogoutTab(){
        clickOnElement(logoutTab);
    }
    /**
     * This method will verify logout tab
     */
    public String verifyLogoutTab(){
        return getTextFromElement(logoutText);
    }
    /**
     * This method will verify customer name
     */
    public String verifyCustomerName(){
        return getTextFromElement(customerName);
    }
    /**
     * This method will click on deposit tab
     */
    public void clickOnDepositTab(){
        clickOnElement(depositButton);
    }
    /**
     * This method will enter amount
     */
    public void enterAmount(String a){
        sendTextToElement(amount,a);
    }
    /**
     * This method will click on deposit submit button
     */
    public void clickOnSubmit(){
        clickOnElement(submit);
    }
    /**
     * This method will verify deposit message
     */
    public String verifyMessage(){
        return getTextFromElement(message);
    }
    /**
     * This method will click on withdrawl button
     */
    public void clickOnWithdrawlButton(){
        clickOnElement(withdrawlButton);
    }
    /**
     * This ethod will select currency
     */
    public void selectCurrency(String value){
        selectByValueFromDropDown(selectCurrency,value);
    }
}
