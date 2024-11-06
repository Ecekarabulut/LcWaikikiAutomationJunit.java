package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import static constants.Constants.*;


public class LoginPage extends BasePage {

    public void close(){
        clickElement(By.xpath("//*[@id=\"cookieseal-banner\"]/div/button[2]"));
    }

    public void ControlPageLoad() {
        Assert.assertEquals("https://www.lcwaikiki.com/tr-TR/TR", driver.getCurrentUrl());
    }

    public void GoLogin() {
        clickElement(By.xpath(headerLoginButton));
    }

    public void beLogin(String userName, String password) {
        findElement(By.xpath(eMail)).sendKeys(userName);
        waitForSecond(1000);
        findElement(By.xpath(pass)).sendKeys(password);
        waitForSecond(1000);
        clickElement(By.xpath(loginButton));
        waitForSecond(3000);




    }
}
