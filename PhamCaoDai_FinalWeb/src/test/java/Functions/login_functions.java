package Functions;

import Core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.login_page;

public class login_functions extends basePage {
    public login_functions(WebDriver driver) {
        super(driver);
    }

    commom_functions commonFunctions = new commom_functions(driver);

    login_page loginPage = new login_page(driver);



    public void login(String username, String password) {
        commom_functions.selectDropdown(loginPage.username,username);
        commom_functions.sendKeys(loginPage.password, password);
        commom_functions.clickToElement(loginPage.signINBtn);
        commom_functions.driver.navigate().refresh();
    }

    public void verifyLoginPage() {
        commom_functions.isdisplayed(loginPage.username);
        commom_functions.isdisplayed(loginPage.password);
        commom_functions.isdisplayed(loginPage.signINBtn);
        commom_functions.isdisplayed(loginPage.forgotYourPassword);
    }
    public void verifyLoginSuccess(String value) {
        dashboard_functions.checkTitle(value);
    }

    public void add(String firstName, String lastName, String email) {
        commom_functions.clickToElement(loginPage.customer);
        commom_functions.clickToElement(loginPage.allCustomer);
        commom_functions.clickToElement(loginPage.addNewCustomer);
//        commom_functions.clickToElement(loginPage.button);
        commom_functions.driver.navigate().refresh();
//        commom_functions.sendKeys(loginPage.Prefix, Prefix);
        commom_functions.sendKeys(loginPage.firstName, firstName);
//        commom_functions.sendKeys(loginPage.MiddleName_Initial, MiddleName_Initial);
        commom_functions.sendKeys(loginPage.lastName, lastName);
//        commom_functions.sendKeys(loginPage.Suffix, Suffix);
        commom_functions.sendKeys(loginPage.email, email);
        commom_functions.clickToElement(loginPage.SaveCustomer);
        commom_functions.verifyMessage(loginPage.message,"You saved the customer.");

    }
}
