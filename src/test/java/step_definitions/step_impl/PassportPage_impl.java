package step_definitions.step_impl;

import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.PassportPage;
import util.Driver;
import util.Screenshots;
import util.SeleniumUtils;

import javax.swing.*;

public class PassportPage_impl {
    private static WebDriver driver = Driver.getDriver();
    PassportPage passportPage = new PassportPage();
    HomePage_impl homePage = new HomePage_impl();


    public void navigateToPassport() {
        SeleniumUtils.click(passportPage.passport_Btn);
    }

    public void selectUsa() {
        SeleniumUtils.click(passportPage.usa_Selection);
    }

    public void enterDOB() {
        SeleniumUtils.sendKeys(passportPage.dateofbirth_Field, "01/01/1990");
        passportPage.dateofbirth_Field.sendKeys(Keys.RETURN);
    }

    public void passportHistory() {
        SeleniumUtils.click(passportPage.yes_Selection);
    }

    public void passportPossession() {
        SeleniumUtils.click(passportPage.yes_Possession_Selection);
    }

    public void passportValidity() {
        SeleniumUtils.click(passportPage.yes_passportValidity_Selection);
    }

    public void passportIssuanceLocation() {
        SeleniumUtils.click(passportPage.domestic_Selection);
    }

    public void validityOfPassportYear() {
        SeleniumUtils.click(passportPage.validMore_Selection);
    }

    public void passportLimited() {
        SeleniumUtils.click(passportPage.no_PassportLimited_Selection);
    }

    public void passportIssuaneDate() {
        SeleniumUtils.sendKeys(passportPage.passportIssuance_Date, "01/01/1990");
        passportPage.passportIssuance_Date.sendKeys(Keys.RETURN);
    }

    public void clickNext() {
        SeleniumUtils.click(passportPage.next_Btn);
    }

    public void selectPassportBook() {
//        Actions action = new Actions(driver);
//        action.moveToElement(passportPage.passportBook_Selection);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", passportPage.passportBook_Selection);
        //passportPage.passportBook_Selection.click();
    }

    public void selectStandardMethod() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", passportPage.standardProcessing_Selection);
        // SeleniumUtils.click(passportPage.standardProcessing_Selection);
    }

    public void selectDelieveryMethod() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", passportPage.standardDelivery_Selection);
        //SeleniumUtils.click(passportPage.standardDelivery_Selection);
    }

    public void calculateTotalAmout_Btn() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", passportPage.calculate_Btn);
        //SeleniumUtils.click(passportPage.calculate_Btn);
    }

    public void verifyTotalAmount() {
        passportPage.totalAmount.getText();
        System.out.println(passportPage.totalAmount.getText());
        Assert.assertEquals("$35.00", passportPage.totalAmount.getText());

    }

    public void clickNextToComplete() {
        SeleniumUtils.click(passportPage.finalNext_Btn);
        Assert.assertEquals("U.S. Passports", driver.getTitle());
        Screenshots.captureScreenShot();
       // Assert.assertEquals("$50.00", passportPage.totalAmount.getText());


    }

}
