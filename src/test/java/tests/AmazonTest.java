package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonTest {


    @Test
    public  void  test01() {


// Ana sayfanın açıldıgı kontrol edin
        Driver.getDriver().get(ConfigReader.getProperty("AmazonURL"));

        // String expectedTitle="Amazon";
        String expectedTitle="Amazon.de";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // çerez tercihlerinden Çerezleri kabul et seçilir
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.cookiesAkzeptieren.click();

        // siteye login olun
        amazonPage.loginButton.click();

        amazonPage.emailGiris.sendKeys(ConfigReader.getProperty("EmailValid"));
        amazonPage.weiterButton.click();
        amazonPage.passwordGiris.sendKeys(ConfigReader.getProperty("SifreValid"));
        amazonPage.anmeldenButton.click();
        // login işlemi kontrol edin

        //arama butonunun yanındaki kategörüler tabından bilgisayar secilir

        Select select=new Select(amazonPage.katagoriler);
        select.selectByVisibleText("Computers & Accessories");

        // bilgisayar kategorisi seçildigi kontrol edilir
        amazonPage.katagoriler.isSelected();
        // arama aranına msi yaz ve arama yapın

        // aramanın yapıldıgını kontrol et
        // arama sonucları sayfasından 2. sayfa açılır
        // 2. sayfanın açıldıgı kontrol edilir
        //sayfadaki 2. ürün favorilere eklenir
        // 2. ürünün favorilere eklendigi kontrol edilir
        // hesabım->  favori listem sayfasına gidilir
        // favori Listem sayfası açıldıgı kontrol edilir
        // eklenen ürün favorilerden silinir
        // silme işleminin gerçekleştigi kontrol edilir.
        // üye çıkış işlemi yapılır
        //çıkış işleminin yapıldıgı kontrol edilir.


    }














}
