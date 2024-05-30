package Tests;

import Core.ExcelUtils;
import Core.basePage;
import Core.baseTest;
import Functions.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.login_page;

public class final_test extends baseTest {
    @DataProvider
    public  static Object[][] getAccountData(){
        String path = "src/Source/accountData.xlsx";
        String sheetName = "account";
        return  ExcelUtils.getTableArray(path, sheetName,0,2);
    }
    @DataProvider
    public  static Object[][] CustomerData(){
        String path = "src/Source/accountData.xlsx";
        String sheetName = "account2";
        return  ExcelUtils.getTableArray(path, sheetName,0,5);
    }


    @Test(dataProvider = "getAccountData")
    public void tc01_CreateNewCustomer(String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        dashboard_functions dashboardFunctions = new dashboard_functions(driver);
        try {
            loginFunctions.verifyLoginPage();
            loginFunctions.login(user, pass);
            dashboardFunctions.verifyLoginSuccess();
            Assert.assertEquals(2, 3);
            ExcelUtils.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Pass");
        }catch (Exception e){
            ExcelUtils.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Failed");
        }catch (AssertionError a){
            ExcelUtils.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass",  String.valueOf(a));
        }
    }
    @Test(priority = 2, dataProvider = "CustomerData")
    public void tc02_VerifyCreateNewCustomer(String user, String pass, String lastname, String firstname, String email){
        login_functions loginFunctions = new login_functions(driver);

        loginFunctions.login(user,pass);
        loginFunctions.add(firstname, lastname, email);
        customer_functions customerFunctions = new customer_functions(driver);

    }
    @Test(priority = 3,dataProvider = "getAccountData")
    public void tc03_VerifyEditCustomer(String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        customer_functions customerFunctions = new customer_functions(driver);
        customerFunctions.edit();

        login_page loginPage = new login_page(driver);
        commom_functions.verifyMessage(loginPage.firstName,"Marie");
        commom_functions.verifyMessage(loginPage.lastName,"Delabre");

    }

    @Test(dataProvider = "getAccountData")
    public void tc04_VerifyProductPage (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        catalog_functions catalogFunctions = new catalog_functions(driver);
        catalogFunctions.catalogProduct();
    }

    @Test(dataProvider = "getAccountData")
    public void tc05_VerifySearchProductPage (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        catalog_functions catalogFunctions = new catalog_functions(driver);
        catalogFunctions.catalogProduct1();
    }
    @Test(dataProvider = "getAccountData")
    public void tc06_VerifySearchProductPage (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        catalog_functions catalogFunctions = new catalog_functions(driver);
        catalogFunctions.catalogProduct2();
    }

    @Test(dataProvider = "getAccountData")
    public void tc07_VerifyProductAttributesPage (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        store_functions storeFunctions = new store_functions(driver);
        storeFunctions.storeProduct();
    }
    @Test(dataProvider = "getAccountData")
    public void tc08_VerifyAddNewProductAttributesPage (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        store_functions storeFunctions = new store_functions(driver);
        storeFunctions.storeProduct1();
        storeFunctions.storeProduct2();
    }

    @Test(dataProvider = "getAccountData")
    public void tc09_VerifyCreateNewProductAttributesSuccessfully (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        store_functions storeFunctions = new store_functions(driver);
        storeFunctions.storeProduct3();

    }

    @Test(dataProvider = "getAccountData")
    public void VerifySearchProductAttributes (String user, String pass){
        login_functions loginFunctions = new login_functions(driver);
        loginFunctions.login(user,pass);

        store_functions storeFunctions = new store_functions(driver);
        storeFunctions.storeProduct4();

    }
}
