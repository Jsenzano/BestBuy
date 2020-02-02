package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;
import util.Screenshots;
import util.SeleniumUtils;

public class HomePage_STEPS {
    HomePage_impl homePage_impl = new HomePage_impl();

    @Given("User opens home page")
    public void user_opens_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }

    @Then("Verifies title is {string}")
    public void verifies_title_is(String string) {
        Assert.assertEquals("Best Buy | Official Online Store | Shop Now & Save", homePage_impl.getTitle());
    }

    @When("User sees {string}")
    public void user_sees(String string) {
        homePage_impl.clickCloseModalSignUp();
        Assert.assertEquals("Today's popular picks", homePage_impl.getPopularPicksName());
    }

    @When("User navigates to {string}")
    public void user_navigates_to(String navItem) {
        try {
            homePage_impl.clickCloseModalSignUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
        homePage_impl.clickNavItem(navItem);
    }

    @Then("Verifies bottom navigation name with following info")
    public void verifies_bottom_navigation_name_with_following_info(io.cucumber.datatable.DataTable dataTable) {
//        Assert.assertEquals(bookingPageImpl.expectedCouponMessage, bookingPageImpl.getCouponCodeConfirmationText());
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }

    @And("Takes screenshot")
    public void Takes_screenshot() {
        SeleniumUtils.sleep(1000);
        Screenshots.captureScreenShot();
    }

}
