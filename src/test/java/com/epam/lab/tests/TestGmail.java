package com.epam.lab.tests;


import com.epam.lab.driver.DriverFactory;
import com.epam.lab.pageobjects.EasyTripHomePage;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;



public class TestGmail {


    @Test
   public void testTest(){
        EasyTripHomePage page = new EasyTripHomePage();
        page.openEasyTripHomePage();
    }

   @AfterMethod
    public void closeDriver() {
        DriverFactory.close();
    }
}