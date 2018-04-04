package com.epam.lab.tests;

import com.epam.lab.bisnesobjects.HomePageFacade;
import com.epam.lab.driver.DriverFactory;
import com.epam.lab.pageobjects.AdminPanelPage;
import com.epam.lab.utils.property.ConfigProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AdminPageTest {
    private ConfigProperty properties;
    private AdminPanelPage adminPanelPage;
    private HomePageFacade homePageFacade;

    @BeforeMethod
    public void setUp() {
        adminPanelPage = new AdminPanelPage();
        homePageFacade = new HomePageFacade();
        properties = new ConfigProperty();
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.close();
    }


}
