package tests.practice10Februar;

import org.testng.annotations.Test;
import pages.P3_TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P3_TutorialTest {

//~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
//~ Phones & PDAs e tıklayın
//~ telefonların marka adını al
//~ tüm elemanlar için ekle düğmesine tıklayın
//~ siyah toplam eklenen sepet düğmesine tıklayın
//~ listenin isimlerini sepetten al
//~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
//~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin

   @Test
    public  void  test(){
       Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
       P3_TutorialPage p3_tutorialPage=new P3_TutorialPage();
       p3_tutorialPage.istenenYerLinki.click();



   }




}
