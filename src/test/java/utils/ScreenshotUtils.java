package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils {

    public static String CaptureScreenshot(WebDriver driver, String testName, String status) {
        if (driver == null) {
            System.err.println("Driver is null. Cannot capture screenshot.");
            return null;
        }

        // Corrected date pattern: 'dd' for day of month
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        
        // Corrected file name & directory path
        String filename = testName + "_" + status + "_" + timestamp + ".png";
        String destPath = System.getProperty("user.dir") + File.separator + "Test-output" 
                          + File.separator + "Screenshots" + File.separator + filename;

        File destination = new File(destPath);

        try {
            // Ensure target parent directory exists
            if (!destination.getParentFile().exists()) {
                destination.getParentFile().mkdirs();
            }

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Corrected: Copy from source to destination
            FileHandler.copy(source, destination);
            System.out.println("Screenshot saved successfully at: " + destPath);
            
        } catch (IOException e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
        }

        return destPath;
    }
}
