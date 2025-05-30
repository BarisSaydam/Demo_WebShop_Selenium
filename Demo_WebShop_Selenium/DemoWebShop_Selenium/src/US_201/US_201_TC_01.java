package US_201;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_201_TC_01 extends BaseDriver {

    @Test
    public void test1()
    {
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement clickRegister= driver.findElement(By.xpath("//a[text()='Register']"));
        clickRegister.click();

        MyFunc.Bekle(2);
        WebElement genderMale= driver.findElement(By.id("gender-male"));
        genderMale.click();

        MyFunc.Bekle(2);
        WebElement firstname= driver.findElement(By.cssSelector("input[id='FirstName']"));
        firstname.sendKeys("Green");

        MyFunc.Bekle(2);
        WebElement lastname= driver.findElement(By.cssSelector("input[id='LastName']"));
        lastname.sendKeys("Card");

//        MyFunc.Bekle(2);
//        WebElement email= driver.findElement(By.name("Email"));
//        email.sendKeys("atillapractice@hotmail.com");
        MyFunc.Bekle(2);
        WebElement email2= driver.findElement(By.name("Email"));
        email2.sendKeys("test" + (int)(Math.random()*100000000)+"@test.com") ;

        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("GreenCard123");

        MyFunc.Bekle(2);
        WebElement confirmpassword= driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        confirmpassword.sendKeys("GreenCard123");

        MyFunc.Bekle(2);
        WebElement registerButton= driver.findElement(By.id("register-button"));
        registerButton.click();

        MyFunc.Bekle(2);
        WebElement result=driver.findElement(By.className("result"));
        Assert.assertTrue("Aranilan Mesaj Bulunamadi", result.getText().contains("Your registration completed"));
        System.out.println("Onaylama Mesaji = " + result.getText());

        MyFunc.Bekle(2);
        WebElement contineButton=driver.findElement(By.cssSelector("input[class='button-1 register-continue-button']"));
        contineButton.click();


        BekleKapat();
    }

}
