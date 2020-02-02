package step_definitions.step_impl;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.CountryInformationPage;
import pages.InternationalTravelPage;
import util.Driver;
import util.Screenshots;
import util.SeleniumUtils;

public class CountryInformationPage_impl {
    private static WebDriver driver = Driver.getDriver();
    CountryInformationPage countryInformationPage = new CountryInformationPage();
    InternationalTravelPage internationalTravelPage = new InternationalTravelPage();

    public void navigateToCountryInfoTab(){
        //SeleniumUtils.highlightElement(internationalTravelPage.xountryInformation_Tab);
        SeleniumUtils.click(internationalTravelPage.xountryInformation_Tab);
    }

    public void verifyCountryInfoPage(){
        Assert.assertEquals("Country Information",driver.getTitle());
    }

    public void searchForCountry(){
        //SeleniumUtils.highlightElement(countryInformationPage.countrySearch_Field);
        SeleniumUtils.sendKeys(countryInformationPage.countrySearch_Field,"Bolivia");
       // countryInformationPage.countrySearch_Field.sendKeys(Keys.TAB);
        SeleniumUtils.click(countryInformationPage.countrySearch_Btn);
    }

    public void verifyCorrectCountryInfo(){
        Assert.assertEquals("Bolivia",countryInformationPage.country_Name.getText());
        Screenshots.captureScreenShot();
    }



}
