package tests.practice10Februar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P1_DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P1_DemoGuruTest {

    /*
http://demo.guru99.com/test/drag_drop.html url e git
DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
DEBIT SIDE da Amount bolumune 5000(dikkat -5000 degil) butonunu surukle ve birak
CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
Perfect butonun goruntulendigini dogrulayin
 */


    @Test
   public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));

        Actions actions=new Actions(Driver.getDriver());
        P1_DemoGuruPage p1DemoGuruPage=new P1_DemoGuruPage();
        p1DemoGuruPage.tumunuKabulet.click();
        actions.dragAndDrop(p1DemoGuruPage.bankButonu, p1DemoGuruPage.creditBankAccount)
                .dragAndDrop(p1DemoGuruPage.salesButonu,p1DemoGuruPage.creditBankAccount)
                .dragAndDrop(p1DemoGuruPage.first5000Butonu, p1DemoGuruPage.creditsideAmount).
                sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(p1DemoGuruPage.perfectYazisi.isDisplayed());
        ReusableMethods.waitFor(4);

}





}
