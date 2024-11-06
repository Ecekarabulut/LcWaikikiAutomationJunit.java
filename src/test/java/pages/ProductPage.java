package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static constants.Constants.*;

public class ProductPage extends BasePage {
    public void selectProduct() {
        List<WebElement> products = findElements(By.xpath(productList));
        products.get(0).click();
    }
}
