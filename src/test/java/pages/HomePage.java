package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static constants.Constants.*;

public class HomePage extends BasePage {


    public void searchProduct(String searchData) {
        clearText(By.id(searchInput));
        findElement(By.id(searchInput)).sendKeys(searchData);
        clickElement(By.xpath(searchButton));
    }

    public void goPageEnd() {
        waitForSecond(2000);
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        waitForSecond(2000);
        clickElement(By.xpath(scroolProduct));
    }
}
