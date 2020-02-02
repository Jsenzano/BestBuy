package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CreditCardsPage;
import pages.HomePage;
import step_definitions.step_impl.CreditCardsPage_impl;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class CreditCardsPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    CreditCardsPage creditCardsPage = new CreditCardsPage();
    CreditCardsPage_impl creditCardsPage_impl =new CreditCardsPage_impl();
    HomePage_impl homePage_impl = new HomePage_impl();



//    @Then("User clicks credit cards button")
//    public void user_clicks_credit_cards_button() {
//        homePage_impl.clickNavItem("credit card");
//    }

    @When("User sees credit card {string}")
    public void user_sees(String value) {
       creditCardsPage_impl.verify_Manage_Account();
       Assert.assertEquals(value,creditCardsPage.manageAccount_Btn.getText());
    }

    @Then("Verifies  Credit Card title is {string}")
    public void verifies_title_is(String string) {
        Assert.assertEquals(string,driver.getTitle());
    }


}

