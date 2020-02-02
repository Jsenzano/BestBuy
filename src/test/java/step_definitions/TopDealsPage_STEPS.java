package step_definitions;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TopDealsPage;
import step_definitions.step_impl.TopDealsPage_Impl;
import util.Driver;

public class TopDealsPage_STEPS {
    public WebDriver driver = Driver.getDriver();

    @Then("User prints category {string}")
    public void user_veryfies_category(String string) {
       TopDealsPage topDealsPage = new TopDealsPage();
        Assert.assertEquals("Shop Top Deals by category", topDealsPage.CategoryText.getText());
    }

    @Then("verify product by name")
    public void verify_product_by_name() {
        TopDealsPage_Impl topDealsPage_impl = new TopDealsPage_Impl();
        topDealsPage_impl.ListElement();
    }
}

