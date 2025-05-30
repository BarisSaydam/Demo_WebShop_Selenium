package US_209;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_209_TC_01 extends BaseDriver {

    @Test

    public void test1() {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);
        Actions action=new Actions(driver);
        WebElement loginanamenu = driver.findElement(By.linkText("Log in"));
        action.click(loginanamenu).build().perform();



        WebElement email1 = driver.findElement(By.xpath("//input[@id='Email']"));
        email1.sendKeys("atillapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password1 = driver.findElement(By.xpath("//input[@id='Password']"));
        password1.sendKeys("GreenCard123");
        MyFunc.Bekle(1);

        WebElement login1 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        action.click(login1).build().perform();

        MyFunc.Bekle(1);

        WebElement epostasi = driver.findElement(By.linkText("atillapractice@hotmail.com"));
        action.click(epostasi).build().perform();
        MyFunc.Bekle(1);

        WebElement orders = driver.findElement(By.linkText("Orders"));
        action.click(orders).build().perform();
        MyFunc.Bekle(1);

        WebElement details = driver.findElement(By.cssSelector("input[class=\"button-2 order-details-button\"]"));
        action.click(details).build().perform();
        MyFunc.Bekle(1);

        WebElement pdfindir = driver.findElement(By.linkText("PDF Invoice"));
        action.click(pdfindir).build().perform();
        MyFunc.Bekle(1);


        BekleKapat();

    }
}
