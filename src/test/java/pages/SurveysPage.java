package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.waitForElementToBeClickable;

public class SurveysPage extends BasePage {

    public SurveysPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-time\"]")
    private WebElement workHoursInput;

    public SurveysPage selectWorkHoursSurveyClick() {

        waitForElementToBeClickable(workHoursInput);
        click(workHoursInput);
        return this;
    }
}
