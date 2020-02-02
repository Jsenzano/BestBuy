package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class InternationalTravelPage {
    private static WebDriver driver= Driver.getDriver();
    public InternationalTravelPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "International-Travel-Country-Information-Pages")
    public WebElement destinationSearch_Field;

    @FindBy(xpath = "//*[@class='segmentMenu parbase section']/ul/li[2]")
    public WebElement xountryInformation_Tab;


}
