package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;

public class HomePage_impl {

    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    public String getTitle(){
        return driver.getTitle();
    }

    public void openTab(String name){
        switch (name.toLowerCase()){
            case "passport": SeleniumUtils.click(homePage.passportTab);
                break;
            case "last tour": SeleniumUtils.click(homePage.lastFeaturedTour);
                break;
        }
    }



}
