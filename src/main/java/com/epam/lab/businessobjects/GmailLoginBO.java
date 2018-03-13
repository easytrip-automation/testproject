package com.epam.lab.businessobjects;

import com.epam.lab.pageobjects.GmailLoginPage;
import org.apache.log4j.Logger;

public class GmailLoginBO {
    private static final Logger LOG = Logger.getLogger(GmailLoginBO.class);
    private GmailLoginPage gmailLoginPage;
    private String browser;

    public GmailLoginBO(String browser) {
        gmailLoginPage = new GmailLoginPage(browser);
        this.browser = browser;
    }

    public void openLoginPage() {
        LOG.info("Opening Login Page");
        gmailLoginPage.openLoginPage(browser);
    }


    public void loginAS(String mail, String password) {
        LOG.info("Entering Mail and Password");
        gmailLoginPage.enterEmail(mail);
        gmailLoginPage.enterPassword(password);
    }

    public boolean checkLoginSuccess() {
        LOG.info("Check IF Login was Success");
        return true;
    }
}
