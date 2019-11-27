package tests;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.InstitutionPage;
import pages.LoginPage;
import pages.SurveysPage;
import pages.WorkHoursSurveyPage;
import utils.WebDriverSingleton;

import java.io.File;

public class TestBase {

    protected WebDriver driver;
    LoginPage loginPage;
    InstitutionPage institutionPage;
    SurveysPage surveysPage;
    WorkHoursSurveyPage workHoursSurveyPage;


    @Before
    public void setUp() {
        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.get("http://localhost/***.php");
        loginPage = new LoginPage(driver);
        institutionPage = new InstitutionPage(driver);
        surveysPage = new SurveysPage(driver);
        workHoursSurveyPage = new WorkHoursSurveyPage(driver);

    }

    @After
    public void quit() throws Exception {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        FileUtils.copyFile(scrFile, new File("./picture/" + System.currentTimeMillis() +  ".png"));

        WebDriverSingleton.quit();
    }

}
