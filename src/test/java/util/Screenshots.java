package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshots{
    private static WebDriver driver = Driver.getDriver();
    private static int countScreenshot = 0;
    public static void captureScreenShot(){
        String date = DateUtils.currentDate();
        System.out.println(date);

        try{
            countScreenshot++;
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            System.out.println("eoueuae");
            FileUtils.copyFile(screenshot, new File("src/main/resources/screenshots/screen"+countScreenshot+".jpeg"));
            System.out.println("Screenshot Taken");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
