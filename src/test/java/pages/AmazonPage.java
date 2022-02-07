package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Properties;

public class AmazonPage {


  public  AmazonPage()
  {
      PageFactory.initElements(Driver.getDriver(),this);

  }

  @FindBy(xpath = "//input[@name='accept']")
    public WebElement cookiesAkzeptieren;

  @FindBy(xpath = "//a[@data-csa-c-content-id='nav_ya_signin']")
   public WebElement loginButton;
  @FindBy(xpath = "//input[@id='ap_email']")
    public  WebElement emailGiris;
  @FindBy(xpath = "//input[@id='continue']")
   public WebElement weiterButton;
  @FindBy(id = "ap_password")
   public  WebElement passwordGiris;
  @FindBy(id = "signInSubmit")
   public  WebElement anmeldenButton;
 @FindBy(xpath = "//select[@id='searchDropdownBox']")
   public  WebElement katagoriler;





}
