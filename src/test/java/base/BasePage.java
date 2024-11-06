package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BasePage extends BaseTest {

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void clickElement(By by) {
        findElement(by).click();
    }

    public void clickElements(By by, int index) {
        findElements(by).get(index).click();
    }


    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void clearText(By by) {
        findElement(by).clear();
    }
    public void waitForSecond(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean isElementVisible(By by) {
        return findElement(by).isDisplayed();

    }

}
