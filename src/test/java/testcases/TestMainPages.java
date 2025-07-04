package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.DriverSetUp;

public class TestMainPages extends DriverSetUp {
    MainPage mainPage = new MainPage();
    @Test
    public void TestMainPageTitle(){
      mainPage.loadAPage(mainPage.url);
      Assert.assertEquals(mainPage.getPageTitle(),mainPage.title);

    }
    @Test
    public void LoginButton(){
        mainPage.loadAPage(mainPage.url);
        Assert.assertEquals(mainPage.getElementText(mainPage.login_btn),"log in");
        Assert.assertTrue(mainPage.getElement(mainPage.login_btn).isEnabled());
    }

}
