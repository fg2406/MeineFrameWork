package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelMyCampTablePage;
import utilities.Driver;

import java.util.List;

public class C02 {



    HotelMyCampPage hotelMyCampPage;
   HotelMyCampTablePage hotelMyCampTablePage;
    @Test
    public  void  giris() {
    hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkBilgiler();

   //● Bir class oluşturun : D18_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //● https://qa-environment.concorthotel.com/admin/HotelRoomAdmin adresine gidin
    //○ Username : manager ○ Password : Manager2!

        Driver.getDriver().get("HMCUrl");
    }


    @Test
    public  void  table(){
        hotelMyCampTablePage=new HotelMyCampTablePage();
//● table( ) metodu oluşturun
        //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        System.out.println(hotelMyCampTablePage.sutunListesi.size());

        //○ Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın
        System.out.println(hotelMyCampTablePage.tbodyWebElement.getText()); //tum body yazdirir

        for (WebElement each : hotelMyCampTablePage.sutunListesi   //basliklari getir
             ) {
            System.out.println(each.getText());
        }
    }


   @Test
   public  void  printRows(){
        hotelMyCampTablePage=new HotelMyCampTablePage();
//● printRows( ) metodu oluşturun //tr
       //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
       System.out.println(hotelMyCampTablePage.satirlarListesi.size());
       //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
       hotelMyCampTablePage.satirlarListesi.stream().forEach(t-> System.out.println(t.getText()));

       //○ 4.satirdaki(row) elementleri konsolda yazdırın.
       System.out.println("4.siradaki element :"+hotelMyCampTablePage.satirlarListesi.get(3).getText());

   }


  @Test
    public  void  printCells() {
      //● printCells( ) metodu oluşturun //td
      //○ table body’sinde bulunan toplam hücre(cell) sayısını bulun.
      System.out.println(hotelMyCampTablePage.hucrelerList.size());
      //○ Table body’sinde bulunan hücreleri(cells) konsolda yazdırın.
      System.out.println("body deki tum hucreler*************");
       hotelMyCampTablePage.hucrelerList.stream().forEach(t-> System.out.println(t.getText()));
  }
   @Test
   public void printColumns(){
        //● printColumns( ) metodu oluşturun
       //○ table body’sinde bulunan toplam sutun(column) sayısını bulun.
       //○ Table body’sinde bulunan sutunlari(column) konsolda yazdırın.
       hotelMyCampTablePage.sutunlariYazdir();

       //○ 5.column daki elementleri konsolda yazdırın.
       //4.satirin 5.hucresindeki datayi yazdirin
       hotelMyCampTablePage.istenenDatayiYazdirmaBulma(4,5);
  }

}
