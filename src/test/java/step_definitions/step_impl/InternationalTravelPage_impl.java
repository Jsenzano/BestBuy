package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.InternationalTravelPage;
import util.Driver;
import util.SeleniumUtils;

public class InternationalTravelPage_impl {
    private static WebDriver driver = Driver.getDriver();
    InternationalTravelPage internationalTravelPage = new InternationalTravelPage();
    HomePage homePage = new HomePage();

    public void navigateToInternationalTravel(){
        SeleniumUtils.click(homePage.internationalTravelTab);
    }




}
