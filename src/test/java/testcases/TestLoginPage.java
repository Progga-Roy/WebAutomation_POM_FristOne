package testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.DriverSetUp;

public class TestLoginPage extends DriverSetUp {
    private static final Logger log = LoggerFactory.getLogger(TestLoginPage.class);
    MainPage mainPage = new MainPage();
    LoginPage login_page = new LoginPage();
    @Test
    public void TestUserCanLoginWithValidCredentials(){
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);
        login_page.writeOneElement(login_page.userInput,login_page.user_Name);
        login_page.writeOneElement(login_page.password,login_page.userPass);
        login_page.clickOnElement(login_page.checkBox);
        login_page.clickOnElement(login_page.loginBtn);
        Assert.assertEquals(mainPage.getElementText(mainPage.name),login_page.user_Name);
       Assert.assertTrue(mainPage.waitForElement(mainPage.user_icon).isDisplayed());


    }
}
