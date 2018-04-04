package com.epam.lab.businesobjects;

import com.epam.lab.pageobjects.HomePage;

public class HomePageFacade {
    private HomePage homePage;

    public HomePageFacade() {
        homePage = new HomePage();
    }

    public void login(String login, String password) {
        homePage.clickSignInButton();
        homePage.enterUserName(login);
        homePage.enterPasword(password);
        homePage.clickSubmitButton();
    }
}
