package com.epam.lab.tests;

import com.epam.lab.businesobjects.HomePageFacade;
import com.epam.lab.driver.DriverFactory;
import com.epam.lab.pageobjects.AdminPanelPage;
import com.epam.lab.pageobjects.HomePage;
import com.epam.lab.utils.property.ConfigProperty;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AdminPageTest {
    private ConfigProperty properties;
    private AdminPanelPage adminPanelPage;
    private HomePage homePage;
    private HomePageFacade homePageFacade;

    @BeforeMethod
    public void setUp() {
        adminPanelPage = new AdminPanelPage();
        homePage = new HomePage();
        homePageFacade = new HomePageFacade();
        properties = new ConfigProperty();
        DriverFactory.getDriver().get(properties.getLink());
    }

/*    @AfterMethod
    public void tearDown() {
        DriverFactory.close();
    }*/

    @Test
    public void adminLoginTest() {
        homePageFacade.login(properties.getAdminLogin(), properties.getAdminPassword());
        homePage.goToProfile();
        assertTrue(adminPanelPage.adminPanelButtonIsPresent());
    }
}
