package utils;

import Steps.PageInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver-win64/chromedriver.exe");
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
               // WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // initializePageObjects();
    }


    public static void sendText(WebElement element, String textToSend){
        //element.clear();
        element.sendKeys(textToSend);
    }

     public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait;
    }

    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) throws InterruptedException {
       // waitForClickability(element);
        Thread.sleep(1000);
        element.click();
    }

    public static JavascriptExecutor getJSExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

        public static void jsClick(WebElement element){
            getJSExecutor().executeScript("arguments[0].click();", element);
        }

    //for dropdown selection using text
    public static void selectDropdown(WebElement element, String text){
        Select s= new Select(element);
        s.selectByVisibleText(text);
    }


    //screenshot method
    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot ts = (TakesScreenshot) driver;
       byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
       File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH + fileName + " " +
                    getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"
            ));

        } catch (IOException e) {
            e.printStackTrace();
        }
return picBytes;
    }

    public static String getTimeStamp(String pattern){
        Date date = new Date();
        //yyyy-mm-dd-hh-mm-ss-ms
        //to format the date according to out choice we have to use this function
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
    /*
    public static void waitJSPathsLoad(){
        WebDriver wait = new WebDriverWait(driver, 120);

    }
*/
    public static void closeBrowser(){
        driver.quit();
    }

    //JS for interacting with Shadow Root and Shadow DOM
   /*
    //Shadow Root must be (open) in order to interact with it with Selenium and JS
    document.querySelector('tag above shadow root'>'').shadowRoot.querySelector('')

    .shadowRoot('') must be added on for each shadow-root we encounter

    (JavaScriptExecutor)driver

    JavascriptExecutor jse = (JavascriptExecutor) driver;
    WebElement variableA = (WebElement) jse.executeScript("return ");
*/
    String js = "arguments[0].setAttribute('variable', 'WhateverYouNeedHere')";
    


}
