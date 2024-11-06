
import base.BaseTest;
import org.junit.Test;
import pages.BasketPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class TestCases extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    HomePage homePage = new HomePage();
    BasketPage basketPage = new BasketPage();


    @Test
    public void Test() {
        loginPage.ControlPageLoad();
        loginPage.close();
        loginPage.GoLogin();
        loginPage.beLogin("testautomationdeneme@gmail.com", "0018000Na");
        homePage.searchProduct("Parfüm");
        homePage.goPageEnd();
        productPage.selectProduct();
        basketPage.controlPrice();
        basketPage.controlQuantity();
        basketPage.deleteProduct();

    }

}
