package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.SeleniumUtils;

public class HomePage {
    private static WebDriver driver = Driver.getDriver();
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='nameplate-website-tagline']")
    public WebElement tsg_Banner;

    @FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
    public WebElement myAccount_Btn;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement signUp_Btn;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement logIn_Btn;

    @FindBy(xpath = "//div[@class='container']//div[1]//figure[1]//a[1]")
    public WebElement firstFeaturedTour;

    @FindBy(xpath = "//div[@class=\"col\"][8]")
    public WebElement lastFeaturedTour;

    @FindBy(xpath = "//*[@class='BusinessUnitsMenu']/li[4]")
    public WebElement passportTab;

    @FindBy (xpath = "//ul[@class='BusinessUnitsMenu']/li[5]")
    public WebElement internationalTravelTab;







}
