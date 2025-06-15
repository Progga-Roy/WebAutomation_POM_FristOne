package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetUp;

public class TestHomePages extends DriverSetUp {
    @Test
    public void TestHomePageTitle(){
        getDriver().get("https://www.google.com");
        Assert.assertEquals(getDriver().getTitle(),"Google");
    }

}
