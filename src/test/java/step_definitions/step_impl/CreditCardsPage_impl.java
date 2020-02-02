package step_definitions.step_impl;

import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CreditCardsPage;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;

public class CreditCardsPage_impl {

    private static WebDriver driver = Driver.getDriver();
    CreditCardsPage creditCardsPage = new CreditCardsPage();

    public void verify_Manage_Account(){
        SeleniumUtils.waitForVisibilityOfElement(creditCardsPage.manageAccount_Btn);
    }

    public void verify_CCPage_Title(){
        driver.getTitle();
    }




//    public void openTab(String name){
//        switch (name.toLowerCase()){
//            case "passport": SeleniumUtils.click(homePage.passportTab);
//                break;
//            case "last tour": SeleniumUtils.click(homePage.lastFeaturedTour);
//                break;
//        }
//    }



}
