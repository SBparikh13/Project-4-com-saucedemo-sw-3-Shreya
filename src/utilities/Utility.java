package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    //Method to click on
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    //Method to send text to element
    public void sentTextToElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    //Method to get text from element
    public void getTextFromElement(By by){
        driver.findElement(by).getText();
    }
    //Select class method
    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByVisibleText(text);
    }
}
