package step_definitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.BookingPage_Impl;
import util.Driver;

public class BookingPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    BookingPage_Impl bookingPageImpl = new BookingPage_Impl();

    @When("Clicks on {string} button")
    public void clicks_on_button(String string) {
        bookingPageImpl.clickButton(string);

    }


}
