package Functions;

import Core.basePage;
import Pages.login_page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


public class changePassword_Functions extends basePage {
    public changePassword_Functions(WebDriver driver) {
        super(driver);
    }
    login_page loginPage = new login_page();

    public void changePass(String oldPass, String newPassword, String confirmPass){
        common_functions.clickToElement(loginPage.changePassword);
        common_functions.sendKeys(loginPage.oldPassword,oldPass);
        common_functions.sendKeys(loginPage.newPassword,newPassword);
        common_functions.sendKeys(loginPage.confirmPassword,confirmPass);
        common_functions.clickToElement(loginPage.submit);
        common_functions.alert();
        common_functions.sendKeys(loginPage.oldPassword,oldPass);
        common_functions.sendKeys(loginPage.newPassword,newPassword);
        common_functions.sendKeys(loginPage.confirmPassword,confirmPass);
        common_functions.clickToElement(loginPage.logOut);
    }

//    WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]"));
//        clickMe1.click();
//        Alert alert = driver.switchTo().alert();
//        //get text alert
//        String text1 = alert.getText();
//        System.out.println("this is text of Alert " + text1);
//
//        //accept alert
//        alert.accept();
//        clickMe1.click();
}
