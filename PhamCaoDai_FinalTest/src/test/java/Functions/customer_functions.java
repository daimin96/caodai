package Functions;

import Core.basePage;
import Pages.login_page;
import org.openqa.selenium.WebDriver;

public class customer_functions extends basePage {
    public customer_functions(WebDriver driver) {
        super(driver);
    }
    login_page loginPage = new login_page();

    public void newCustomer(String name, String date, String address, String city, String state,String pin,String mobi, String password, String email){
        common_functions.clickToElement(loginPage.newCustomer);
        common_functions.sendKeys(loginPage.customerName,name);
        common_functions.sendKeys(loginPage.dateOfBirth,date);
        common_functions.sendKeys(loginPage.address,address);
        common_functions.sendKeys(loginPage.city,city);
        common_functions.sendKeys(loginPage.state,state);
        common_functions.sendKeys(loginPage.pin,pin);
        common_functions.sendKeys(loginPage.mobileNumber,mobi);
        common_functions.sendKeys(loginPage.email,email);
        common_functions.sendKeys(loginPage.Password,password);
        common_functions.clickToElement(loginPage.submit);
        common_functions.alert();
//        common_functions.verifyMessage(loginPage.message,"Your User id is wrong please provide correct userid");
        common_functions.clickToElement(loginPage.logOut);

    }
    public void verifyNewCustomer(){
        common_functions.isdisplayed(loginPage.customerName);
        common_functions.isdisplayed(loginPage.dateOfBirth);
        common_functions.isdisplayed(loginPage.address);
        common_functions.isdisplayed(loginPage.city);
        common_functions.isdisplayed(loginPage.state);
        common_functions.isdisplayed(loginPage.pin);
        common_functions.isdisplayed(loginPage.mobileNumber);
        common_functions.isdisplayed(loginPage.email);
        common_functions.isdisplayed(loginPage.Password);
    }
//    public void verifyInformation() {
//    }
}
