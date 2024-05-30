package Functions;

import Core.basePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.security.Key;

public class common_functions extends basePage {
    public common_functions(WebDriver driver) {
        super(driver);
    }

    public static void clickToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

    }
    public static void alert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public static void selectByVisibleText(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void sendKeys(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }
    public static void sendKeysEnter(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value, Keys.ENTER);
    }
    public static void selectDropdown(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static boolean isdisplayed(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.isDisplayed();
        return false;
    }

    public void checkText(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String a = element.getText();
        Assert.assertEquals(a, value);
    }
    public static void verifyMessage(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String a = element.getText();
        Assert.assertEquals(a, value);
    }


    public static void verifyMessage1(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String a = element.getAttribute("value");
        Assert.assertEquals(a, value);
    }

    public void verifyTitle(String s) {
    }
}
