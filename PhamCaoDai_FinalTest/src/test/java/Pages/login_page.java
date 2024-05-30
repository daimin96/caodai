package Pages;

import Core.basePage;
import org.openqa.selenium.By;

public class login_page {
    public By userID = By.name("uid");
    public By password = By.name("password");
    public By login = By.name("btnLogin");
    public By reset = By.name("btnReset");
    public By Checktitle = By.tagName("h2");

    public By changePassword = By.xpath("//a[contains(text(),'Change Password')]");

    public By oldPassword = By.name("oldpassword");
    public By newPassword = By.name("newpassword");
    public By confirmPassword = By.name("confirmpassword");
    public By submit = By.name("sub");
    public By logOut = By.xpath("//ul[@class=\"menusubnav\"]//li[15]/a");

    public By loginSuccess = By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]");
    public By newCustomer = By.xpath("//a[contains(text(),'New Customer')]");
    public By customerName = By.name("name");

//    public By gender = By.xpath("//tbody/tr[5]/td[1]");

    public By dateOfBirth = By.xpath("//input[@id='dob']");

    public By address = By.name("addr");

    public By city = By.name("city");

    public By state = By.name("state");
    public By pin = By.name("pinno");

    public By mobileNumber = By.name("telephoneno");

    public By email = By.name("emailid");

    public By Password = By.name("password");


}
