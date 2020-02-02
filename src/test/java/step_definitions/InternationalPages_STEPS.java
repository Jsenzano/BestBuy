package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.InternationalTravelPage;
import step_definitions.step_impl.InternationalTravelPage_impl;
import util.Driver;

public class InternationalPages_STEPS {
    public static WebDriver driver = Driver.getDriver();
    InternationalTravelPage_impl internationalTraveslPage = new InternationalTravelPage_impl();



    @Then("User navigates to International Travel")
    public void user_navigates_to_International_Travel() {
        internationalTraveslPage.navigateToInternationalTravel();
    }

    @Then("User veryfies International Travel page")
    public void user_veryfies_International_Travel_page() {
        Assert.assertEquals("International Travel",driver.getTitle());
    }
}
