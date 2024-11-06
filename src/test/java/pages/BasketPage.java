package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static constants.Constants.*;

public class BasketPage extends BasePage {

    private String productPrice;

    public void getPriceProduct() {
        productPrice = findElement(By.xpath(price)).getText();
    }

    public void goBasket() {

        clickElement(By.xpath(basket));
    }

    public String getPriceBasket() {
        return findElement(By.cssSelector(basketPrice)).getText();
    }

    public void addToBasket() {

        clickElement(By.id(addToBasketButton));
    }

    public void addQuantity() {
        clickElement(By.xpath(addQuantity));
    }

    public String getProductQuantity() {
        return findElement(By.xpath(productQuantity)).getText();
    }

    public void controlPrice() {
        getPriceProduct();
        addToBasket();
        goBasket();
        Assert.assertEquals("Price is Not Same", productPrice, getPriceBasket());
    }

    public void controlQuantity() {
        addQuantity();
    }
    public void deleteProduct(){
        clickElement(By.xpath(productDelete));
        waitForSecond(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Sil ve Favorilere Ekle')]"));
        js1.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", element);
        waitForSecond(3000);
        waitForSecond(5000);
        String title=findElement(By.xpath(emptyTitle)).getText();
        Assert.assertEquals("Basket is not Empty","Sepetinizde ürün bulunmamaktadır.",title);
    }
}
