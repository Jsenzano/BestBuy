package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;
import util.Screenshots;
import util.SeleniumUtils;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    HomePage_impl homePage_impl = new HomePage_impl();

    @Given("User opens home page")
    public void user_opens_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }

    @When("User sees TSG Banner")
    public void user_sees_TSG_Banner() {
        SeleniumUtils.waitForVisibilityOfElement(homePage.tsg_Banner);
    }

    @Then("Verifies title is U.S Department of State - Bureau of Consular Affairs")
    public void verifies_title_is_U_S_Department_of_State_Bureau_of_Consular_Affairs() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Travel",driver.getTitle());
        Screenshots.captureScreenShot();

    }




}
