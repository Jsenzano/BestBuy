package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.TopDealsPage;
import util.Driver;
import util.SeleniumUtils;

public class TopDealsPage_Impl {
    public WebDriver driver = Driver.getDriver();
    public static void ListElement() {
        TopDealsPage topDealsPage = new TopDealsPage();
        topDealsPage.listItem.forEach(K-> System.out.println(SeleniumUtils.getText(K)));
        topDealsPage.itemName.forEach(k -> System.out.println(SeleniumUtils.getText(k)));
        topDealsPage.Discount.forEach(k-> System.out.println(SeleniumUtils.getText(k)));
        topDealsPage.Prices.forEach(k-> System.out.println(SeleniumUtils.getText(k)));
    }
}
