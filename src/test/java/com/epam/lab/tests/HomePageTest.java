package com.epam.lab.tests;

import com.epam.lab.businesobjects.HomePageFacade;
import com.epam.lab.driver.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
    public HomePageFacade homePageFacade;

    @BeforeTest
    public void setUp() {
        homePageFacade = new HomePageFacade();
        homePageFacade.openHomePage();
    }

    @Test
    public void loginWithEmptyFieldTest() {
        homePageFacade.loginWithNoData("", "");
        Assert.assertTrue(homePageFacade.isPassFieldPresent());
    }

    @Test
    public void signUpTest(){

    }


    @AfterTest
    public void tearDown(){
        DriverFactory.close();
    }
}
