package Functions;

import Core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.login_page;

import static Core.basePage.driver;

public class customer_functions extends basePage {
    public customer_functions(WebDriver driver) {
        super(driver);
    }

//    customer_functions customerFunctions = new customer_functions(driver);
    login_page loginPage = new login_page(driver);


    public void addNewCustomer(String user, String password, String email){
        commom_functions.sendKeys(loginPage.username,user);
        commom_functions.sendKeys(loginPage.password,password);
        commom_functions.sendKeys(loginPage.email,email);
    }
    public void edit(){
        commom_functions.clickToElement(loginPage.customer);
        commom_functions.clickToElement(loginPage.allCustomer);
        commom_functions.sendKeysEnter(loginPage.search,"Marie Delabre");
        commom_functions.clickToElement(loginPage.edit);
        commom_functions.driver.navigate().refresh();
        commom_functions.clickToElement(loginPage.accountInformation);
//        commom_functions.verifyMessage(loginPage.message,"Marie");
    }


}
