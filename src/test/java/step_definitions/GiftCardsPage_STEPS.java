package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.GiftCardsPage;
import step_definitions.step_impl.GiftCardsPage_impl;
import step_definitions.step_impl.HomePage_Impl;
import util.Driver;

public class GiftCardsPage_STEPS {
    public WebDriver driver = Driver.getDriver();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    GiftCardsPage_impl giftCardsPage_impl = new GiftCardsPage_impl();
    HomePage_Impl homePage_impl = new HomePage_Impl();

    @When("User navigates to Gift Cards page")
    public void user_navigates_to_Gift_Cards_page() {
        //homePage_impl.clickNavItem("gift cards");
    }

    @Then("Verifies Gift Cards title is {string}")
    public void verifiesGiftCardsTitleIs(String arg0) {
        Assert.assertEquals(arg0,giftCardsPage.giftCards_title.getText());
    }

    @Then("verify list of items in Specialty Gift Cards")
    public void verify_list_of_items_in_Specialty_Gift_Cards() {
        Assert.assertEquals("Specialty gift cards",giftCardsPage.speGiftCards_btn.getText());
        System.out.println(giftCardsPage.speGiftCards_btn.getText());
    }

    @Then("print list of Specialty Gift Cards Items")
    public void print_list_of_Specialty_Gift_Cards_Items() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        giftCardsPage_impl.listAllSpecialty_GiftCards();
    }



}
