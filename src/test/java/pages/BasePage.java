package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetUp.getDriver;

public class BasePage {

   public WebElement getElement(By locator){
     return getDriver().findElement(locator);
   }

   public void clickOnElement(By locator){
       getElement(locator).click();
   }
   public void writeOneElement(By locator ,String text){
       getElement(locator).sendKeys(text);
   }
   public boolean visibleState(By locator){
       return getElement(locator).isDisplayed();
   }
    public void loadAPage(String url){
         getDriver().get(url);
    }
    public String getPageTitle(){
      return getDriver().getTitle();
    }
    public String getElementText(By locator){
       return getElement(locator).getText();
    }

}
