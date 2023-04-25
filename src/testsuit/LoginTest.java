package testsuit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

@Test
    public void userShouldLoginSuccessfullyWithValid() {
        //click on username
        clickOnElement(By.xpath("//input[@id='user-name']"));
        //enter username
        sentTextToElement(By.id("user-name"),"standard_user");
        //click on password
        clickOnElement(By.xpath("//input[@id='password']"));
        //enter password
        sentTextToElement(By.name("password"),"secret_sauce");
        //click on login button
        clickOnElement(By.xpath("//input[@id='login-button']"));

    String expectedMessage = "Product";
    driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
    Assert.assertEquals("Product", expectedMessage);

}
@Test
public void verifyThatSixProductsAreDisplayedOnPage(){
    //click on username
    clickOnElement(By.xpath("//input[@id='user-name']"));
    //enter username
    sentTextToElement(By.id("user-name"),"standard_user");
    //click on password
    clickOnElement(By.xpath("//input[@id='password']"));
    //enter password
    sentTextToElement(By.name("password"),"secret_sauce");
    //click on login button
    clickOnElement(By.xpath("//input[@id='login-button']"));

    String expectedMessage = "Product";
    driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
    Assert.assertEquals("Product", expectedMessage);


    List<WebElement> ItemElementList =  driver.findElements(By.xpath("//div[@class = 'inventory_item']"));
    for (WebElement list:ItemElementList){
        String productName = list.getText();

    }
    int expectedItems = 6;
        Assert.assertEquals("6",expectedItems,ItemElementList.size());

}


}