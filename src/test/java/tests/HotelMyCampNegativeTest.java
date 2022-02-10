package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;
import utilities.Screenshot;

import java.io.File;
import java.io.IOException;

public class HotelMyCampNegativeTest {

    HotelMyCampPage hotelMyCampPage;
        @Test
        public  void  test01() throws IOException {


            // 1 ) Bir Class olustur : NegativeTest
            //2) Bir test method olustur NegativeLoginTest()
            //https://www.chanel.com/us/adresine git
            Driver.getDriver().get("https://www.hotelmycamp.com/");

            //login butonuna bas
            hotelMyCampPage=new HotelMyCampPage();
            hotelMyCampPage.ilkLoginLinki.click();

            //test data username: manager1 ,
            hotelMyCampPage.usernameBox.sendKeys("manager1");
            //test data password : manager1!
            hotelMyCampPage.passwordBox.sendKeys("manager1!");
            hotelMyCampPage.loginButonu.click();
            //Degerleri girildiginde sayfaya girilemedigini test et
            Assert.assertTrue(hotelMyCampPage.gecersizGirisYazisi.isDisplayed());

            Screenshot.webElementScreenshot(hotelMyCampPage.gecersizGirisYazisi);
            Screenshot.tumSayfaScreenshot();

        }

}
