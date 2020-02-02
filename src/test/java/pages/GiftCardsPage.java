package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class GiftCardsPage {
    private WebDriver driver= Driver.getDriver();
    public GiftCardsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"site-control-content\"]/div[3]/h1")
    public WebElement giftCards_title;

    @FindBy(xpath = "//*[@id=\"visual-navigation-titleLink-ffb657f2-d569-4987-9bc3-3344dc134f4e\"]/a")
    public WebElement speGiftCards_btn;

    @FindBy (xpath = "//div[@class='panel-wrapper with-header']/div/div[1]/div/div[2]/div/ul/li")
    public WebElement listSpecialty_GiftCards;


}
