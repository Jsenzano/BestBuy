package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class PassportPage {
    private static WebDriver driver = Driver.getDriver();

    public PassportPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='BusinessUnitsMenu']/li[4]")
    public WebElement passport_Btn;

    @FindBy(xpath = "//*[@id=\"currently_reside_us\"]")
    public WebElement usa_Selection;

    @FindBy(xpath = "//*[@class=\"datepicker hasDatepicker\"]")
    public WebElement dateofbirth_Field;

    @FindBy(xpath = "//*[@id=\"existing_yes\"]")
    public WebElement yes_Selection;

    @FindBy(xpath = "//*[@id=\"passport_eligibility\"]/div[5]/div")
    public WebElement next_Btn;

    @FindBy(xpath = "//*[@id='have_passport_yes']")
    public WebElement yes_Possession_Selection;

    @FindBy(xpath = "//*[@id='replacing_lv_yes']")
    public WebElement yes_passportValidity_Selection;

    @FindBy(xpath = "//*[@id='lv_domestic']")
    public WebElement domestic_Selection;

    @FindBy(xpath = "//*[@id='lv_validity_greater']")
    public WebElement validMore_Selection;

    @FindBy(xpath = "//*[@id='lv_gender_natural_no']")
    public WebElement no_PassportLimited_Selection;

    @FindBy(name = "lv_expiration_passports_age")
    public WebElement passportIssuance_Date;

    @FindBy(xpath = "//*[@id=\"standard_processing\"]")
    public WebElement passportBook_Selection;

    @FindBy(id = "standard_processing")
    public WebElement standardProcessing_Selection;

    @FindBy (id = "standard_delivery")
    public WebElement standardDelivery_Selection;

    @FindBy(id="calculate_costs")
    public WebElement calculate_Btn;

    @FindBy(xpath = "//*[@id=\"cost_summary\"]/div[1]/div[8]/div[2]/span")
    public WebElement totalAmount;

    @FindBy(id = "next_to_documents")
    public WebElement finalNext_Btn;

    @FindBy(css = "#new_child_passport_summary > div:nth-child(2) > div.form_content.well-tsg > ul > li.total > span.usd > span")
    public WebElement finalTotal_Amount;





}
