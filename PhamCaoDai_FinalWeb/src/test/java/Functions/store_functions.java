package Functions;

import Core.basePage;
import org.openqa.selenium.WebDriver;
import pages.store_Page;

public class store_functions extends basePage {
    public store_functions(WebDriver driver) {
        super(driver);
    }

    store_Page storePage = new store_Page();

    public void storeProduct() {
        commom_functions.clickToElement(storePage.store);
        commom_functions.clickToElement(storePage.product);
        commom_functions.isdisplayed(storePage.addNewAttributeBtn);
        commom_functions.isdisplayed(storePage.searchBtn);
        commom_functions.isdisplayed(storePage.resetFilter);
        commom_functions.isdisplayed(storePage.productAttributeTable);
        commom_functions.isdisplayed(storePage.productAttributeTable20rows);
    }

    public void storeProduct1() {
        commom_functions.clickToElement(storePage.store);
        commom_functions.clickToElement(storePage.product);
        commom_functions.clickToElement(storePage.addNewAttributeBtn);
        commom_functions.isdisplayed(storePage.defaultLabelText);
        commom_functions.isdisplayed(storePage.catalogInputTypeForStoreOwnerCombobox);
        commom_functions.isdisplayed(storePage.valuesRequiredCombobox);
    }
    public void storeProduct2() {
        commom_functions.clickToElement(storePage.advancedAttributeProperties);
        commom_functions.isdisplayed(storePage.attributeCode);
        commom_functions.isdisplayed(storePage.scope);
        commom_functions.isdisplayed(storePage.defaultValue);
        commom_functions.isdisplayed(storePage.uniqueValue);
        commom_functions.isdisplayed(storePage.inputValidationForStoreOwner);
        commom_functions.isdisplayed(storePage.addToColumnOptions);
        commom_functions.isdisplayed(storePage.useInFilterOptions);
    }

    public void storeProduct3() {
        commom_functions.clickToElement(storePage.store);
        commom_functions.clickToElement(storePage.product);
        commom_functions.clickToElement(storePage.addNewAttributeBtn);
        commom_functions.sendKeys(storePage.defaultLabelText,"honey");
        commom_functions.clickToElement(storePage.saveBtn);
        commom_functions.verifyMessage(storePage.message,"You saved the product attribute.");
    }

    public void storeProduct4(){
        commom_functions.clickToElement(storePage.store);
        commom_functions.clickToElement(storePage.product);
        commom_functions.sendKeysEnter(storePage.attributeCode,"color");
        commom_functions.verifyMessage(storePage.verifyDefaultLabel,"color");
    }
}