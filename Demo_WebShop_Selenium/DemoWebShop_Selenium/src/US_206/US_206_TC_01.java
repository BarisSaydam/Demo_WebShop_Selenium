package US_206;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US_206_TC_01 extends BaseDriver {

    @Test
    public void Test601() {
        //Bu testin düzgün çalışabilmesi için sepette laptop harici ürün olmamalı.
        //Adres silme adımında upload süresi çok uzun sürebilir ve hata alınabilir bu site ile alakalı bir problem.

        driver.get("https://demowebshop.tricentis.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver); //Projede kullanılmalı yazdığı için eklendi...

        WebElement logIn = driver.findElement(By.cssSelector("[href='/login']"));
        actions.click(logIn).build().perform();

        WebElement email = driver.findElement(By.id("Email"));
        actions.sendKeys(email, "atillapractice@hotmail.com").build().perform();

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("GreenCard123");

        WebElement logIn2 = driver.findElement(By.cssSelector("[value='Log in']"));
        logIn2.click();

        WebElement myAccnt=driver.findElement(By.xpath("(//*[@class='account'])[1]"));
        myAccnt.click();

        WebElement Addresses =driver.findElement(By.linkText("Addresses"));
        Addresses.click();

        //Kayıtlı adres varsa sil.
        List<WebElement> delete=driver.findElements(By.cssSelector("[class='button-2 delete-address-button']"));
        if (delete.size()>0) {
            delete.get(0).click();

            MyFunc.Bekle(1);
            driver.switchTo().alert().accept();
        }

        WebElement homepage=driver.findElement(By.cssSelector("[href='/']"));
        homepage.click();

        WebElement laptop = driver.findElement(By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[2]"));
        js.executeScript("arguments[0].scrollIntoView(true);", laptop);
        laptop.click();

        WebElement content = driver.findElement(By.cssSelector("[id=bar-notification]"));

        wait.until(ExpectedConditions.visibilityOf(content));

        Assert.assertTrue("Ürün eklenemedi", content.isDisplayed());    //Sepete ürün ekle kontrolü

        WebElement shoppingCart = driver.findElement(By.cssSelector("[class='content'] a"));
        shoppingCart.click();

        WebElement country = driver.findElement(By.id("CountryId"));
        Select select = new Select(country);
        select.selectByVisibleText("Turkey");

        WebElement checkBox = driver.findElement(By.id("termsofservice"));
        checkBox.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        MyFunc.Bekle(1);
        WebElement country2 = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select1 = new Select(country2);
        select1.selectByVisibleText("Turkey");

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Mersin");

        WebElement adress = driver.findElement(By.id("BillingNewAddress_Address1"));
        adress.sendKeys("Mersin");


        WebElement zipCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("81330");

        WebElement phoneNum = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNum.sendKeys("69517275");

        WebElement continueBtn = driver.findElement(By.cssSelector("[id='billing-buttons-container'] input"));
        continueBtn.click();

        MyFunc.Bekle(1);
        WebElement pickUpStore = driver.findElement(By.id("PickUpInStore"));
        wait.until(ExpectedConditions.elementToBeClickable(pickUpStore));
        pickUpStore.click();
        WebElement addressChk=driver.findElement(By.id("shipping-address-select"));
        Assert.assertFalse("Teslim adresi yanlış!",addressChk.isDisplayed()); //Mağazadan teslim kontrolü, mağazadan teslim al seçildikten sonra adresim gözükmemeli.
        WebElement btn = driver.findElement(By.cssSelector("[id='shipping-buttons-container'] input"));
        btn.click();

        MyFunc.Bekle(1);
        WebElement creditCard = driver.findElement(By.id("paymentmethod_2"));
        creditCard.click();

        WebElement cntBtn = driver.findElement(By.cssSelector("[id='payment-method-buttons-container'] input"));
        cntBtn.click();

        MyFunc.Bekle(1);
        WebElement name = driver.findElement(By.id("CardholderName"));
        name.sendKeys("Green");

        WebElement cardNum = driver.findElement(By.id("CardNumber"));
        cardNum.sendKeys("4242 4242 4242 4242");

        WebElement month = driver.findElement(By.id("ExpireMonth"));
        Select select2 = new Select(month);
        select2.selectByVisibleText("01");

        WebElement year = driver.findElement(By.id("ExpireYear"));
        Select select3 = new Select(year);
        select3.selectByVisibleText("2032");

        WebElement cardCode = driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("123");

        WebElement cntCard = driver.findElement(By.cssSelector("[id='payment-info-buttons-container'] input"));
        cntCard.click();

        MyFunc.Bekle(1);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebElement unitPrice = driver.findElement(By.className("product-unit-price"));
        WebElement piece = driver.findElement(By.cssSelector("[class='qty nobr'] span+span"));
        WebElement total = driver.findElement(By.className("product-subtotal"));
        WebElement subtotal = driver.findElement(By.xpath("(//*[@class='nobr'])[2]"));


        double laptopPrc = Double.parseDouble(unitPrice.getText());
        double piece1 = Double.parseDouble(piece.getText());
        double total1 = Double.parseDouble(total.getText());
        double subtotal1 = Double.parseDouble(subtotal.getText());

        double prdtPrc = laptopPrc * piece1;

        Assert.assertTrue("Ürün fiyat toplamı doğru değil", prdtPrc == total1); //Ürünün toplam fiyat kontrolü
        Assert.assertTrue("Genel toplam doğru değil", subtotal1 == total1);     //Genel toplam kontrolü


        WebElement ctnBtn = driver.findElement(By.cssSelector("[id='confirm-order-buttons-container'] input"));
        ctnBtn.click();

        MyFunc.Bekle(1);
        WebElement message = driver.findElement(By.cssSelector("[class='title'] strong"));
        Assert.assertTrue("Sipariş oluşturulamadı", message.getText().contains("Your order has been successfully processed!"));//Onay mesaj kontrolü

        BekleKapat();

    }

}
