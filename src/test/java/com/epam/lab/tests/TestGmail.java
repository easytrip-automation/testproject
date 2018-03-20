package com.epam.lab.tests;

import com.epam.lab.businessobjects.GmailLoginBO;
import com.epam.lab.driver.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;

import static org.testng.Assert.assertTrue;


public class TestGmail {

    @Parameters({"browser","username", "password"})
    @Test
    public void sendFromDrafts(String browser, String username, String password) {

        GmailLoginBO gmailLoginBO = new GmailLoginBO(browser);

/*        gmailLoginBO.openLoginPage();

        gmailLoginBO.loginAS(username, password);

        assertTrue(gmailLoginBO.checkLoginSuccess());*/
    }

/*    @AfterMethod
    public void closeDriver() {
        DriverFactory.close();
    }*/
}