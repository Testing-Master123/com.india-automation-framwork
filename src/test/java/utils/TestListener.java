package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClass.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        WebDriver driver = BaseTest.getDriver();
        // Use result.getName() to get the method name safely
        ScreenshotUtils.CaptureScreenshot(driver, result.getName(), "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = BaseTest.getDriver();
        // Use result.getName() to get the method name safely
        ScreenshotUtils.CaptureScreenshot(driver, result.getName(), "FAIL");
    }
}