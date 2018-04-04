package com.epam.lab.businesobjects;

import com.epam.lab.pageobjects.HomePage;

public class HomePageFacade {
    private HomePage homePage;

    public HomePageFacade() {
        homePage = new HomePage();
    }

    public void openHomePage() {
        homePage.openEasyTripHomePage();
    }

    public void login(String login, String password) {
        homePage.clickSignInButton();
        homePage.enterUserName(login);
        homePage.enterPassword(password);
        homePage.clickSubmitButton();
    }

    public void loginWithNoData(String login, String pass) {
        homePage.clickSignInButton();
        homePage.enterUserName(login);
        homePage.enterPassword(pass);
        homePage.clickSubmit();
    }

    public void logout(){
        homePage.clickLogoutButton();
    }

    public void signup(){
        homePage.clickSignInButton();
        homePage.clickSignUp();

    }

    public boolean isPassFieldPresent() {
        return homePage.isEnterPasswordFieldPresent();
    }

}
