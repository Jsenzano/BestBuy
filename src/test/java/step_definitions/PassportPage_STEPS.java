package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.jam.JElement;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.PassportPage;
import step_definitions.step_impl.PassportPage_impl;
import util.Driver;
import util.Screenshots;
import util.SeleniumUtils;

public class PassportPage_STEPS {
    public static WebDriver driver = Driver.getDriver();
    PassportPage_impl passportPage = new PassportPage_impl();

    @When("User navigates Passports page")
    public void user_navigates_Passports_page() {
        passportPage.navigateToPassport();
    }

    @Then("Verifies title is U.S. Passports")
    public void verifies_title_is_U_S_Passports() {
        Assert.assertEquals("U.S. Passports",driver.getTitle());
    }

    @Then("User selects United States")
    public void userSelectsUnitedStates() throws InterruptedException {
        Thread.sleep(2000);
        passportPage.selectUsa();
    }

    @Then("User enters DOB")
    public void userEntersDOB() throws InterruptedException {
        Thread.sleep(2000);
        passportPage.enterDOB();

    }

    @Then("User selects passport history")
    public void userSelectsPassportHistory() throws InterruptedException {
        Thread.sleep(2000);
        passportPage.passportHistory();
    }

    @Then("User selects yes passport possession")
    public void user_selects_yes_passport_possession() {
        passportPage.passportPossession();
    }

    @Then("User selects yes replacing passport")
    public void user_selects_yes_replacing_passport() {
        passportPage.passportValidity();
    }

    @Then("User selects domestic option")
    public void user_selects_domestic_option() {
        passportPage.passportIssuanceLocation();
    }

    @Then("User selects valid more than a year")
    public void user_selects_valid_more_than_a_year() {
        passportPage.validityOfPassportYear();
    }

    @Then("user selects passport limited no")
    public void user_selects_passport_limited_no() {
        passportPage.passportLimited();
    }

    @Then("User enters issuance date")
    public void user_enters_issuance_date() {
        passportPage.passportIssuaneDate();
    }

    @Then("User click Next")
    public void userClickNext() {
        passportPage.clickNext();
    }

    @Then("User slects Passport Book")
    public void user_slects_Passport_Book() {
        passportPage.selectPassportBook();
    }

    @Then("User selects Standard method")
    public void user_selects_Standard_method() {
        passportPage.selectStandardMethod();
    }

    @Then("User selects Standard Delivery")
    public void user_selects_Standard_Delivery() {
        passportPage.selectDelieveryMethod();
    }

    @Then("User clicks the Calculate button")
    public void user_clicks_the_Calculate_button() {
        passportPage.calculateTotalAmout_Btn();
    }

    @Then("user verifies total")
    public void user_verifies_total() throws InterruptedException {
        passportPage.verifyTotalAmount();
        Thread.sleep(10000);
    }

    @Then("user clicks next")
    public void user_clicks_next() {
        passportPage.clickNextToComplete();
    }
}
