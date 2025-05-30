package US_203;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_203_TC_01 extends BaseDriver {

  @Test
    public void test1(){
      driver.get("https://demowebshop.tricentis.com/ ");

      WebElement login= driver.findElement(By.className("ico-login"));
      login.click();
    MyFunc.Bekle(2);

      WebElement email=driver.findElement(By.id("Email"));
      email.sendKeys("atillapractice@hotmail.com");
    MyFunc.Bekle(2);

      WebElement password= driver.findElement(By.id("Password"));
      password.sendKeys("GreenCard123");
    MyFunc.Bekle(2);

      WebElement button= driver.findElement(By.cssSelector("[value='Log in']"));
      button.click();
    MyFunc.Bekle(2);

      WebElement logout=driver.findElement(By.cssSelector("[class='ico-logout']"));
      logout.click();




      MyFunc.Bekle(3);
      driver.quit();
    }
}
