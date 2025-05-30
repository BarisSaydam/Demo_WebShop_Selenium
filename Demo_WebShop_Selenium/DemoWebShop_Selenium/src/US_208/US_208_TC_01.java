package US_208;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US_208_TC_01 extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(1);

        WebElement login= driver.findElement(By.xpath("//a[text()='Log in']"));
        login.click();

        MyFunc.Bekle(1);
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("atillapractice@hotmail.com");

        MyFunc.Bekle(1);
        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("GreenCard123");

        MyFunc.Bekle(1);
        WebElement loginbutton= driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginbutton.click();

        WebElement computers= driver.findElement(By.cssSelector("[class='top-menu']> :nth-child(2) > :nth-child(1) "));

        MyFunc.Bekle(1);
        Actions aksiyonDriver=new Actions(driver);
        Action aksiyon=aksiyonDriver.moveToElement(computers).build();
        aksiyon.perform();

        MyFunc.Bekle(1);
        WebElement desktops= driver.findElement(By.xpath("(//a[@href='/desktops'])[1]"));
        aksiyonDriver.moveToElement(desktops).build().perform();

        MyFunc.Bekle(1);
        WebElement notebook= driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]"));
        aksiyonDriver.moveToElement(notebook).build().perform();
        MyFunc.Bekle(1);
        notebook.click();

        MyFunc.Bekle(1);
        WebElement laptop= driver.findElement(By.cssSelector("[class='product-title'] a"));
        laptop.click();

        MyFunc.Bekle(1);
        WebElement addToCart= driver.findElement(By.id("add-to-cart-button-31"));
        addToCart.click();

        MyFunc.Bekle(1);
        WebElement shoppingCart= driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();

        MyFunc.Bekle(1);
        WebElement confirmProduct=driver.findElement(By.xpath("//a[@class='product-name']"));
        Assert.assertTrue("Aranan urun bulunamadi ",confirmProduct.getText().contains("14.1-inch Laptop"));
        System.out.println("Sepetinizdeki Urun = " + confirmProduct.getText());

        MyFunc.Bekle(1);
        WebElement discountCode= driver.findElement(By.name("discountcouponcode"));
        discountCode.click();

        MyFunc.Bekle(1);
        WebElement applyCoupon= driver.findElement(By.name("applydiscountcouponcode"));
        applyCoupon.click();

        MyFunc.Bekle(1);
        WebElement message=driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Aranilan Mesaj Bulunamadi", message.getText().contains("The coupon code you entered couldn't be applied to your order"));
        System.out.println("Discount Code onaylama mesaji = " + message.getText());

        MyFunc.Bekle(1);
        WebElement giftCard= driver.findElement(By.name("giftcardcouponcode"));
        giftCard.click();

        MyFunc.Bekle(1);
        WebElement addGiftCart= driver.findElement(By.name("applygiftcardcouponcode"));
        addGiftCart.click();

        MyFunc.Bekle(1);
        WebElement message2=driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Aranilan Mesaj Bulunamadi", message2.getText().contains("The coupon code you entered couldn't be applied to your order"));
        System.out.println("Gift Card onaylama mesaji = " + message2.getText());

        MyFunc.Bekle(1);
        WebElement termsOfService= driver.findElement(By.id("termsofservice"));
        termsOfService.click();

        MyFunc.Bekle(1);
        WebElement checkoutButton= driver.findElement(By.id("checkout"));
        checkoutButton.click();

        MyFunc.Bekle(1);
        WebElement continueButton= driver.findElement(By.cssSelector("[id='billing-buttons-container'] input"));
        continueButton.click();

        MyFunc.Bekle(1);
        WebElement continueButton2= driver.findElement(By.cssSelector("[id='shipping-buttons-container'] input"));
        continueButton2.click();

        MyFunc.Bekle(1);
        WebElement continueButton3= driver.findElement(By.cssSelector("[id='shipping-method-buttons-container'] input"));
        continueButton3.click();

        MyFunc.Bekle(1);
        WebElement continueButton4= driver.findElement(By.cssSelector("[id='payment-method-buttons-container'] input"));
        continueButton4.click();

        MyFunc.Bekle(1);
        WebElement continueButton5= driver.findElement(By.cssSelector("[id='payment-info-buttons-container'] input"));
        continueButton5.click();

        MyFunc.Bekle(1);
        WebElement iframe=driver.findElement(By.cssSelector("[id='confirm-order-buttons-container'] input"));
        new Actions(driver).scrollToElement(iframe).build().perform();

        MyFunc.Bekle(1);
        WebElement confirmButton= driver.findElement(By.cssSelector("[id='confirm-order-buttons-container'] input"));
        confirmButton.click();


        MyFunc.Bekle(1);
        WebElement confirmMessage=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue("Aranilan Mesaj Bulunamadi", confirmMessage.getText().contains("Your order has been successfully processed!"));
        System.out.println("Onaylama mesaji = " + confirmMessage.getText());




















        BekleKapat();






    }

}
