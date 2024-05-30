package Functions;

import Core.basePage;
import org.openqa.selenium.WebDriver;
import pages.catalog_Page;

public class catalog_functions extends basePage {
    public catalog_functions(WebDriver driver) {
        super(driver);
    }

    //    catalog_functions catalogFunctions = new catalog_functions(driver);
    catalog_Page catalogPage = new catalog_Page(driver);
    public void catalogProduct() {
        commom_functions.clickToElement(catalogPage.catalog);
        commom_functions.clickToElement(catalogPage.product);
//        commom_functions.sendKeysEnter(catalogPage.search1,"Joust Duffle Bag-Black");
        commom_functions.isdisplayed(catalogPage.addProductBtn);
        commom_functions.isdisplayed(catalogPage.searchKey);
        commom_functions.isdisplayed(catalogPage.filtersBtn);
        commom_functions.isdisplayed(catalogPage.newView);
        commom_functions.isdisplayed(catalogPage.columns);
        commom_functions.isdisplayed(catalogPage.tableListOutProduct);
    }
    public void catalogProduct1() {
        commom_functions.clickToElement(catalogPage.catalog);
        commom_functions.clickToElement(catalogPage.product);
        commom_functions.sendKeysEnter(catalogPage.search1,"Joust Duffle Bag");
        commom_functions.clickToElement(catalogPage.edit);
        commom_functions.isdisplayed(catalogPage.productName);
    }
    public void catalogProduct2() {
        commom_functions.clickToElement(catalogPage.catalog);
        commom_functions.clickToElement(catalogPage.product);
        commom_functions.sendKeysEnter(catalogPage.search1,"Joust Duffle Bag");
        commom_functions.clickToElement(catalogPage.edit);
        commom_functions.isdisplayed(catalogPage.productName);
        commom_functions.isdisplayed(catalogPage.price);
        commom_functions.isdisplayed(catalogPage.attributeSet);
    }
}
