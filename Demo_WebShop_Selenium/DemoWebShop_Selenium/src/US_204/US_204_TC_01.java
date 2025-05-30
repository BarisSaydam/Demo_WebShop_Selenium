package US_204;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_204_TC_01 extends BaseDriver {

    @Test
    public void Test1 (){

         driver.get("https://demowebshop.tricentis.com/");

        WebElement login=driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("atillapractice@hotmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("GreenCard123");

        WebElement loginweb=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginweb.click();

        WebElement logout=driver.findElement(By.className("ico-logout"));


        Assert.assertTrue("Hatali giris yaptiniz",logout.getText().contains("Log out"));

        BekleKapat();
    }
}
