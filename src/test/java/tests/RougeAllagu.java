package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RougeAllaguPage;
import utilities.Driver;

public class RougeAllagu {
  RougeAllaguPage rougeAllagupage;
  @Test
    public void  test01(){

      //https://www.chanel.com/us/

       Driver.getDriver().get("https://www.chanel.com/us/");
       rougeAllagupage=new RougeAllaguPage();

       //1- Siteye erişim --> Site görüntüleniyorsa tamam
        Assert.assertTrue(rougeAllagupage.siteninGorunmesiTesti.isEnabled(),"sayfa basligi gorulebilir");

        //     2- Arama çubuğuna tıklayın (üst menüde)
    rougeAllagupage.aramaCubuguTesti.click();
      //     3- "ROUGE ALLURE" için arama yapın
    rougeAllagupage.aramaCubuguTesti.sendKeys("ROUGE ALLURE"+ Keys.ENTER);
      //     3- Görüntülenen listedeki öğelerin aranan kelimeyi içerip içermediğini kontrol edin
      //     4- Listenin ikinci öğesini seçin
      //     5- Görüntülenen ürün adının daha önce seçilen adla aynı olduğundan emin olun.


  }
    @Test
    public  void  test02(){
        //2. test:
        //     1- Siteye erişim
        //     2- Makyaja Erişim => Ruj kategorisi (üst menüde)
        //     3- ROUGE ALLURE ürününe tıklayın
        //     4- Ürünü sepete ekleyin
        //     5- Sepeti Görüntüle --> Tamam, eğer sepette "ROUGE ALLURE" ürünü varsa adet=1 ve toplam sepet ürün fiyatına eşittir.


    }






}
