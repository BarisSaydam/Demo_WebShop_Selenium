package US_207;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_207_TC_01 extends BaseDriver {

    @Test
    public void Test () {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(1);

        WebElement voteExlnt1=driver.findElement(By.id("pollanswers-1"));
        voteExlnt1.click();
        MyFunc.Bekle(1);

        WebElement vote1= driver.findElement(By.id("vote-poll-1"));
        vote1.click();
        MyFunc.Bekle(1);

        WebElement loginButton = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginButton.click();
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//input[@class='email']"));
        email.sendKeys("atillapractice@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
        password.sendKeys("GreenCard123");
        MyFunc.Bekle(1);

        WebElement log_in = driver.findElement(By.xpath("//input[@value='Log in']"));
        log_in.click();
        MyFunc.Bekle(1);

        WebElement voteExlnt2 = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        voteExlnt2.click();
        MyFunc.Bekle(1);
        //  oylama 1 kereliktir, giris yaptiktan sonra hata almaniz olasi

        WebElement vote2 = driver.findElement(By.xpath("//input[@value='Vote']"));
        vote2.click();
        MyFunc.Bekle(1);

        WebElement voteResult = driver.findElement(By.xpath("//ul[@class='poll-results']"));
        System.out.println("Vote Result = " + voteResult.getText());

        BekleKapat();

    }
}
