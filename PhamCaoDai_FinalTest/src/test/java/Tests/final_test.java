package Tests;

import Core.ExcelUtils;
import Core.baseTest;
import Functions.changePassword_Functions;
//import Functions.customer_functions;
import Functions.customer_functions;
import Functions.dashboard_functions;
import Functions.login_functions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class final_test extends baseTest {
    @DataProvider
    public  static Object[][] getAccountData(){
        String path = "src/Source/accountData.xlsx";
        String sheetName = "accountData";
        return  ExcelUtils.getTableArray(path, sheetName,0,2);
    }

    @Test(dataProvider = "getAccountData")
    public void tc01_ChangePassword(String userID, String password) {
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(userID, password);
        loginFunctions.verifyLoginPage();

        changePassword_Functions changePasswordFunctions = new changePassword_Functions(driver);
        changePasswordFunctions.changePass("yrypEjA","daimin","daimin");
    }


    @Test(dataProvider = "getAccountData")
    public void tc02_CreateNewCustomer(String userID, String password){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(userID, password);

        dashboard_functions dashboardFunctions = new dashboard_functions(driver);
        dashboardFunctions.verifyLoginSuccess();

        customer_functions customerFunctions = new customer_functions(driver);
        customerFunctions.verifyNewCustomer();

        try {
            loginFunctions.verifyLoginPage();
            loginFunctions.login(userID, password);
            dashboardFunctions.verifyLoginSuccess();
            Assert.assertEquals(2, 3);
            ExcelUtils.writeData("2", "TCs_01", "tc01_TC_CreateNewCustomer", "Pass", "Pass");
        }catch (Exception e){
            ExcelUtils.writeData("2", "TCs_01", "tc01_TC_CreateNewCustomer", "Pass", "Failed");
        }catch (AssertionError a){
            ExcelUtils.writeData("2", "TCs_01", "tc01_TC_CreateNewCustomer", "Pass",  String.valueOf(a));
        }
    }
}
