package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;


public class Actions {


    public static void click(WebElement element) {

        System.out.println("Clicking on element: " + element.toString());
        element.click();
    }

    public static void sendKeys(WebElement element, String text) {

        click(element);
        System.out.println("Sending keys: " + text + " to element: " + element.toString());
        element.clear();
        element.sendKeys(text);

    }

    public static void waitForElementToBeClickable(WebElement element) {

        System.out.println("Waiting for text: " + " to be present in element: " + element.toString());
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void SwitchToChildWindow(WebDriver driver) {

            for (String eachwindow : driver.getWindowHandles()) { // przełączenie się na nowo otwarte okno

                driver.switchTo().window(eachwindow); // podaję nazwę okna
            }
    }

    public static void isTheCheckBoxSelected(WebElement element, WebDriver driver) {

        if(!element.isSelected()) {
            element.click();
        }
        else {
            element.getAttribute("checked");
            System.out.print("Checkbox is selected");
        }
    }

    public static void SwitchToParentWindow(WebDriver driver) {

        for (String windowHandleBefore : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandleBefore);
        }
    }
}
