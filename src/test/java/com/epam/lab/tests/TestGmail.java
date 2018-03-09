package com.epam.lab.tests;

import com.epam.lab.businessobjects.GmailLoginBO;
import com.epam.lab.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestGmail {

    @Parameters({"username", "password"})
    @Test
    public void sendFromDrafts(String username, String password) {

        GmailLoginBO gmailLoginBO = new GmailLoginBO();

        gmailLoginBO.openLoginPage();

        gmailLoginBO.loginAS(username, password);

        assertTrue(gmailLoginBO.checkLoginSuccess());

    }

    @AfterMethod
    public void closeDriver() {
        Driver.close();
    }
}