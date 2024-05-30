package Functions;

import Core.basePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static Core.basePage.driver;

public class dashboard_functions extends basePage {
    public dashboard_functions(WebDriver driver){
        super(driver);
    }
    commom_functions commonFunctions = new commom_functions(driver);
    public static void checkTitle(String value) {
        String title = driver.getTitle();
        Assert.assertEquals(title, value);
    }
    public void verifyLoginSuccess(){
        commonFunctions.verifyTitle("Dashboard /Magento Admin");
    }

}
