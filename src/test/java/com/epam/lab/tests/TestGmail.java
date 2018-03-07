package com.epam.lab.tests;

import com.epam.lab.businessobjects.GmailLoginBO;
import com.epam.lab.driver.Driver;
import com.epam.lab.models.UserModel;
import com.epam.lab.utils.provider.TestProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestGmail {


    @Test(dataProvider = "getUsersData", dataProviderClass = TestProvider.class)
    public void sendFromDrafts(UserModel userModel) {

        GmailLoginBO gmailLoginBO = new GmailLoginBO();

        gmailLoginBO.openLoginPage();

        gmailLoginBO.loginAS(userModel);

        assertTrue(gmailLoginBO.checkLoginSuccess());

    }

    @AfterMethod
    public void closeDriver() {
        Driver.close();
    }
}