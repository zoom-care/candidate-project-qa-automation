package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseUtility {

    //Method to type on a specific Element.
    public void type(WebElement element, String text){
        element.sendKeys(text);
    }

    //Method to click on a specific element.
    public void clickOnElement(WebElement element){
        element.click();
    }

    //Method to get text from a specific element.
    public String getText(WebElement element){
        return element.getText();
    }

    //Method to get the actual URL from a page.
    public String getURLActual(WebDriver driver){
        return driver.getCurrentUrl();
    }

    //Method to get the text for every webelement on the list
    public List<String> getTextFromList(List<WebElement> listElements){
        List<String> listStringFromElements= new ArrayList<>();
        for (int i=0;i<listElements.size();i++){
            listStringFromElements.add(listElements.get(i).getText().toLowerCase());
        }

        return listStringFromElements;
    }

    //Method to get a URL
    public void goTo(WebDriver driver,String url){
        driver.get(url);
    }

    //Method to return if a button is enabled or not
    public boolean isDisplayed(WebElement element){
        return element.isEnabled();
    }

    //Method to generate a date for the screenshot Names.
    public String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
        Date date=  new Date();
        return dateFormat.format(date);
    }

    //Method to take a screenshot on the automation.
    public void takeScreenShots(WebDriver driver, String destPath) throws IOException {
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile= new File(destPath+"test-"+getDate()+".png");
        FileUtils.copyFile(screenShotFile,destFile);
    }
}
