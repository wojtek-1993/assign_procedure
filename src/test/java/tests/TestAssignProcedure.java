package tests;


import org.junit.Assert;
import org.junit.Test;


public class TestAssignProcedure extends TestBase {

    @Test
    public void popTest() {

        loginPage.fillInLoginForm("***", "***");
        loginPage.loginButtonClick();
        institutionPage.selectInstitutionClick();
        institutionPage.selectSurveyClick();
        surveysPage.selectWorkHoursSurveyClick();
        workHoursSurveyPage.selectProcedureClick();
        workHoursSurveyPage.markNameProcedureClick();
        workHoursSurveyPage.returnButtonClick();

        String url = "http://localhost/***/***.php?";
        Assert.assertEquals(url, driver.getCurrentUrl());

    }
}
