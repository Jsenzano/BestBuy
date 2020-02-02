package step_definitions.step_impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GiftCardsPage;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;

import java.util.List;

public class GiftCardsPage_impl {

    private WebDriver driver = Driver.getDriver();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    HomePage homePage = new HomePage();



    public void verify_GiftCards_Title(){
        giftCardsPage.giftCards_title.getText();
  }
    public void verifyGiftSpecialty_Title(){
        driver.getTitle();
    }

    public void listAllSpecialty_GiftCards(){


        giftCardsPage.listSpecialty_GiftCards.getText();
        System.out.println(giftCardsPage.listSpecialty_GiftCards);

        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='panel-wrapper with-header']/div/div[1]/div/div[2]/div/ul/li"));

        for(WebElement a : listOfElements) {
            System.out.println(a.getText());

        }

    }

}