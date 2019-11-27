package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.*;

public class WorkHoursSurveyPage extends BasePage {

    private WebDriver driver;

    public WorkHoursSurveyPage(WebDriver driver) {super(driver); this.driver = driver;}

    @FindBy(xpath = "//*[@id=\"tabelaPasm\"]//a[text()=\"Procedury\"]")
    private WebElement procedureInput;

    @FindBy(id = "rodzajBadania_0")
    private WebElement nameProcedureCheckboxInput;

    @FindBy(css = "input[value=\"Zapisz zmiany\"]")
    private WebElement saveChangesButton;

    @FindBy(css = "input[value=\"Powrót\"]")
    private WebElement returnButton;

    public WorkHoursSurveyPage selectProcedureClick() {

        waitForElementToBeClickable(procedureInput);
        click(procedureInput);
        return this;
    }

    public WorkHoursSurveyPage markNameProcedureClick() {

        SwitchToChildWindow(driver);
        isTheCheckBoxSelected(nameProcedureCheckboxInput, driver);
        click(saveChangesButton);
        driver.close();
        SwitchToParentWindow(driver);
        return this;
    }

    public WorkHoursSurveyPage returnButtonClick() {

        waitForElementToBeClickable(returnButton);
        click(returnButton);
        return this;
    }

}
