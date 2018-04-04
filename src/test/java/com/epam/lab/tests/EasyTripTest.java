package com.epam.lab.tests;


import com.epam.lab.driver.DriverFactory;
import com.epam.lab.pageobjects.HomePage;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class EasyTripTest {

    @Test
   public void testTest(){
        HomePage page = new HomePage();
        page.openEasyTripHomePage();
    }

   @AfterMethod
    public void closeDriver() {
        DriverFactory.close();
    }
}