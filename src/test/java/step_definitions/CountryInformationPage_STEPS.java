package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.InternationalTravelPage;
import step_definitions.step_impl.CountryInformationPage_impl;
import step_definitions.step_impl.InternationalTravelPage_impl;
import util.Driver;

public class CountryInformationPage_STEPS {
    public static WebDriver driver = Driver.getDriver();
    InternationalTravelPage internationalTravelPage = new InternationalTravelPage();
    CountryInformationPage_impl countryInformationPage_impl = new CountryInformationPage_impl();

    @Then("User navigates to Country Information")
    public void user_navigates_to_Country_Information() {
        countryInformationPage_impl.navigateToCountryInfoTab();
    }

    @Then("User verifies Country Info page")
    public void user_verifies_Country_Info_page() {
        countryInformationPage_impl.verifyCountryInfoPage();
    }

    @Then("User enters a country")
    public void user_enters_a_country() {
        countryInformationPage_impl.searchForCountry();
    }

    @Then("User verifies correct country info")
    public void user_verifies_correct_country_info() {
        countryInformationPage_impl.verifyCorrectCountryInfo();
    }
}
