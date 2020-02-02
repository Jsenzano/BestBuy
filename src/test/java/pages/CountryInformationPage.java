package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class CountryInformationPage {
    private static WebDriver driver= Driver.getDriver();
    public CountryInformationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"International-Travel-Country-Information-Pages\"]")
    public WebElement countrySearch_Field;

    @FindBy(xpath = "//div[@class='fieldwrapper']/button")
    public WebElement countrySearch_Btn;

    @FindBy(xpath = "//*[@id=\"csi-mainbody\"]/div/div[1]/div/div[1]")
    public WebElement country_Name;
}
