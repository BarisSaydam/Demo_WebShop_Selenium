package US_205;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_205_TC_01 extends BaseDriver {

    @Test

    public void test1() {

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);
        Actions action=new Actions(driver);

        WebElement loginanamenu = driver.findElement(By.linkText("Log in"));
        action.click(loginanamenu).build().perform();


        WebElement email1 = driver.findElement(By.xpath("//input[@id='Email']"));
        email1.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement password1 = driver.findElement(By.xpath("//input[@id='Password']"));
        password1.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement login1 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        action.click(login1).click().build().perform();
        MyFunc.Bekle(1);


        WebElement email2 = driver.findElement(By.xpath("//input[@id='Email']"));
        email2.sendKeys("atillapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password2 = driver.findElement(By.xpath("//input[@id='Password']"));
        password2.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement login2 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        action.click(login2).click().build().perform();
        MyFunc.Bekle(1);

        email2.clear();
        password2.clear();


        WebElement email3 = driver.findElement(By.xpath("//input[@id='Email']"));
        email3.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement password3 = driver.findElement(By.xpath("//input[@id='Password']"));
        password3.sendKeys("GreenCard123");
        MyFunc.Bekle(1);

        WebElement login3 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        action.click(login3).click().build().perform();
        MyFunc.Bekle(1);

        WebElement email4 = driver.findElement(By.xpath("//input[@id='Email']"));
        email4.sendKeys("atillaaaapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password4 = driver.findElement(By.xpath("//input[@id='Password']"));
        password4.sendKeys(" ");
        MyFunc.Bekle(1);

        WebElement login4 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        action.click(login4).click().build().perform();

        System.out.println("password4 = " + password4.getAttribute("value"));


        BekleKapat();


    }
}
