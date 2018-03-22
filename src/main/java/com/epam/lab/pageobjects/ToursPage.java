package com.epam.lab.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToursPage extends AbstractPage {
    //todo
    //http://localhost:4200/tours
    @FindBy(xpath = "//input[@class='form-control input-sm']")
            /*/html/body/app-root/app-admin-panel/app-manage-tours/section/div/div[2]/div/input*/
            WebElement searchTourAdminInput;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-capsul px-4 py-2 btn-block']")
            WebElement viewButton;

///???????????????????????????
    @FindBy(xpath = "//rgb-raiting[@class='d-inline-flex']")//????????????????????
    WebElement raiting;
///???????????????????????????

   // http://localhost:4200/tours/3
    @FindBy(xpath = "//a[@id='ngb-tab-3']")
    WebElement routeButton;

    @FindBy(xpath = "//a[@id='ngb-tab-4']")
    WebElement dayByDayButton;

    @FindBy(xpath = "//a[@id='ngb-tab-5']")
    WebElement whereToStayButton;


    @FindBy(xpath = "//a[@class='btn btn-primary btn-capsul px-4 py-2 btn-block']")
    WebElement saveAsYourTripButton;

    @FindBy(xpath = "//*[@id=\"ngb-tab-3-panel\"]/div/div[1]/div[1]/div[5]/div/select")
    WebElement selectDistanceBeetweenCitiesButton;


    //day-by-day
    @FindBy(xpath = "//*[@id=\"sortable\"]/li[1]/div[2]/div[3]/a")
    WebElement seeDetailsDayByDayButton;

    //wheretoStay
    @FindBy(xpath = "//*[@id=\"ngb-tab-8-panel\"]/div/div[2]/ul/li/div[2]/div[3]/a")
    WebElement seeDetailsWhereToStayButton;


}
