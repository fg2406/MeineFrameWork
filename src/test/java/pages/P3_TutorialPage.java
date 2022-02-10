package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P3_TutorialPage {

    public  P3_TutorialPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


  @FindBy(linkText = "Phones & PDAs")
    public WebElement istenenYerLinki;





}
