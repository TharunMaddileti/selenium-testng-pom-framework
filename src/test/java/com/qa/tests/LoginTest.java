package com.qa.tests;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test(priority = 1, description = "Verify successful login with valid credentials")
    public void testValidLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        String message = loginPage.getFlashMessage();
        Assert.assertTrue(message.contains("You logged into a secure area!"));
    }

    @Test(priority = 2, description = "Verify error message on invalid login")
    public void testInvalidLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("wrongUser");
        loginPage.enterPassword("wrongPassword");
        loginPage.clickLogin();

        String message = loginPage.getFlashMessage();
        Assert.assertTrue(message.contains("Your username is invalid!"));
    }
}
