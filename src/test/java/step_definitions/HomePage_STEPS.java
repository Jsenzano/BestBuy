package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;

public class HomePage_STEPS {
    HomePage_impl homePage_impl = new HomePage_impl();

    @Given("User opens home page")
    public void user_opens_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }

    @Then("Verifies title is {string}")
    public void verifies_title_is(String string) {
        Assert.assertEquals("Best Buy | Official Online Store | Shop Now & Save",homePage_impl.getTitle());
        System.out.println(homePage_impl.getTitle());
    }

    @When("User sees {string}")
    public void user_sees(String string) {
        homePage_impl.clickCloseModalSignUp();
        Assert.assertEquals("Today's popular picks",homePage_impl.getPopularPicksName());
    }

    @When("User navigates to {string}")
    public void user_navigates_to(String navItem){
        try {
            homePage_impl.clickCloseModalSignUp();
        }catch (Exception e){
            e.printStackTrace();
        }
        homePage_impl.clickNavItem(navItem);
    }
}
