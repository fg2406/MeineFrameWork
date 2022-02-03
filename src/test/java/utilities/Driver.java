package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    public static WebDriver driver;
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        if(driver==null) { // bu if sayesinde kod çalışırken bir kere new keyword ile driver oluşturulacak.
            // new devreye girmeyecek,birkez calistir demek yani varsa ici null degilse devam et yeni browser acma,ama daha once calismamissa ici bossa
            driver = new ChromeDriver();   //burayi calistir,olustur demek
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
