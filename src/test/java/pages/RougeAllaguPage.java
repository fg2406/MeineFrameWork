package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RougeAllaguPage {

    public  RougeAllaguPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//img[@class='logo_header']")
    public WebElement siteninGorunmesiTesti;

    @FindBy(xpath = "/span[text()='Search']")
    public  WebElement aramaCubuguTesti;



}
