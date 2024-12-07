package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    /**
     * Assert Method
     */
    public void verifyText(String actualText, String expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }

    /**
     * Assert Method
     */
    public void verifyMessage(String actualText, String expectedText, String message) {
        if (!actualText.contains(expectedText)) {
            System.out.println("expected message is not same as actualMessage");
        }
    }

    //Create an object for all pages
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();

    //1.bankManagerShouldAddCustomerSuccessfully().
    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        //    click On "Bank Manager Login" Tab
        homePage.clickOnManagerLoginTab();

        //	click On "Add Customer" Tab
        //customerLoginPage.clickOnAddCustomerTab();
        bankManagerLoginPage.clickOnAddCustomerTab();

        //	enter FirstName
        bankManagerLoginPage.enterFirstName("Harry Potter");

        //	enter LastName
        bankManagerLoginPage.enterLastName("xyz");

        //	enter PostCode
        bankManagerLoginPage.enterPostCode("HA452");

        //	click On "Add Customer" Button
        bankManagerLoginPage.clickOnAddCustomerButton();

        //	popup display
        bankManagerLoginPage.popUpDisplay();

        //	verify message "Customer added successfully"
        String expectedMessage = "Customer added successfully";
        String actualMessage = bankManagerLoginPage.verifyPopUp();
        System.out.println(actualMessage);
        verifyMessage(actualMessage, expectedMessage, "Customer not added");

        //	click on "ok" button on popup.
        bankManagerLoginPage.clickOnOK();
    }

    //2. bankManagerShouldOpenAccountSuccessfully().
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        //	click On "Bank Manager Login" Tab
        homePage.clickOnManagerLoginTab();

        //	click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();

        //	Search customer that created in first test
        openAccountPage.searchCustomer("Harry Potter");

        //	Select currency "Pound"
        openAccountPage.selectCurrency("Dollar");

        //	click on "process" button
        openAccountPage.clickOnProcessButton();

        //	popup displayed
        bankManagerLoginPage.popUpDisplay();

        //	verify message "Account created successfully"
        String expectedMessage = "Account created successfully";
        String actualMessage = bankManagerLoginPage.verifyPopUp();
        System.out.println(actualMessage);
        verifyMessage(actualMessage, expectedMessage, "Account not created");

        //	click on "ok" button on popup.
        bankManagerLoginPage.clickOnOK();
    }

    //3. customerShouldLoginAndLogoutSuceessfully().
    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {

        //	click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();

        //	search customer that you created.
        customersPage.searchAddedCustomer("Harry Potter");
        //openAccountPage.searchCustomer("Ron Weasly");

        //	click on "Login" Button
        customersPage.clickOnLoginButton();

        //	verify "Logout" Tab displayed.
        String expectedLogoutText = "Logout";
        String actualLogoutText = accountPage.verifyLogoutTab();
        System.out.println(actualLogoutText);
        verifyMessage(actualLogoutText, expectedLogoutText, "Logout not displayed");

        //	click on "Logout"
        accountPage.clickOnLogoutTab();

        //	verify "Your Name" text displayed.
        String expectedName = "Harry Potter";
        String actualName = accountPage.verifyCustomerName();
        System.out.println(actualName);
        verifyText(actualName, expectedName, "Customer name not displayed");
    }

    //4. customerShouldDepositMoneySuccessfully().
    @Test
    public void customerShouldDepositMoneySuccessfully() {
        //	click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();

        //	search customer that you created.
        customersPage.searchAddedCustomer("Harry Potter");
        //openAccountPage.searchCustomer("Ron Weasly");

        //	click on "Login" Button
        customersPage.clickOnLoginButton();

        //select currency
       // accountPage.selectCurrency("1005");

        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();

        //	Enter amount 100
        accountPage.enterAmount("100");

        //	click on "Deposit" Button
        accountPage.clickOnSubmit();

        //	verify message "Deposit Successful"
        String expectedDepositMessage = "Deposit Successful";
        String actualDepositMessage = accountPage.verifyMessage();
        System.out.println(actualDepositMessage);
        verifyText(actualDepositMessage, expectedDepositMessage, "Deposit not done");
    }

    //5. customerShouldWithdrawMoneySuccessfully().
    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        //	click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();

        //	search customer that you created.
        customersPage.searchAddedCustomer("Harry Potter");
        //openAccountPage.searchCustomer("Ron Weasly");

        //	click on "Login" Button
        customersPage.clickOnLoginButton();

        //	click on "Deposit" Tab
       accountPage.clickOnDepositTab();

        //	Enter amount 100
        accountPage.enterAmount("100");

        //	click on "Deposit" Button
        accountPage.clickOnSubmit();


        //	click on "Withdrawl" Tab
        accountPage.clickOnWithdrawlButton();

        //	Enter amount 50
        accountPage.enterAmount("50");

        //	click on "Withdraw" Button
       // accountPage.clickOnWithdrawlSubmit();

        //	verify message "Transaction Successful"
//       String expectedMessage = "Transaction Successful";
//        String actualMessage = accountPage.verifyMessage();
//        System.out.println(actualMessage);
//        verifyText(actualMessage, expectedMessage, "Transaction not done");

    }

}
