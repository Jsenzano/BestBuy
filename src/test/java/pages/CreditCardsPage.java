package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class CreditCardsPage {
    private static WebDriver driver= Driver.getDriver();
    public CreditCardsPage(){
        PageFactory.initElements(driver,this);
    }

}
