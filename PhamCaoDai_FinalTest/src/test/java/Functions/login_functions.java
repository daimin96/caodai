package Functions;

import Core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Pages.login_page;

public class login_functions extends basePage {
    public login_functions(WebDriver driver) {
        super(driver);
    }

    login_page loginPage = new login_page();

    public void login(String userID, String password) {
        common_functions.sendKeys(loginPage.userID,userID);
        common_functions.sendKeys(loginPage.password, password);
        common_functions.clickToElement(loginPage.login);
    }
    public void verifyLoginPage() {
        common_functions.isdisplayed(loginPage.userID);
        common_functions.isdisplayed(loginPage.password);
        common_functions.isdisplayed(loginPage.loginSuccess);
        common_functions.isdisplayed(loginPage.reset);
    }


}
