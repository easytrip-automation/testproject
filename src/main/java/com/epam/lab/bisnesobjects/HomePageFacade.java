package com.epam.lab.bisnesobjects;

import com.epam.lab.pageobjects.EasyTripHomePage;

public class HomePageFacade {
    private EasyTripHomePage easyTripHomePage;

    public HomePageFacade() {
        easyTripHomePage = new EasyTripHomePage();
    }

    public void login(String login, String password) {
        easyTripHomePage.clickSignInButton();
        easyTripHomePage.enterUserName(login);
        easyTripHomePage.enterPasword(password);
        easyTripHomePage.clickLogoutButton();
    }
}
