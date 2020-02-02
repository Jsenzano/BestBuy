package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class TopDealsPage {
    private static WebDriver driver= Driver.getDriver();
    public TopDealsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[@class='heading-focus v-fw-medium']")
    public WebElement CategoryText;

    @FindBy(xpath = "//div[@class='wf-offer-content']")
    public List<WebElement>listItem;

    @FindBy(xpath = "//a[@class='wf-offer-link v-line-clamp ']")
    public List<WebElement>itemName;

    @FindBy(xpath = "//div[@class='priceView-hero-price priceView-customer-price']")
    public List<WebElement>Prices;

    @FindBy(xpath = "//div[@class='pricing-price__savings']")
    public List<WebElement>Discount;
}

