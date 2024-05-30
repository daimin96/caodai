package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        ExcelUtils.writeHeadingExcelFile("Report");
        driver.get("https://www.demo.guru99.com/v4/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        ExcelUtils.writeDataToExcelFile("src/Source/report.xlsx");
        driver.close();
    }
}
