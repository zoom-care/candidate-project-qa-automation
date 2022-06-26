package com.zoomcare.page;

import com.zoomcare.uitilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TestCase1_Page {

    public TestCase1_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@data-testid='CareSelector.dropdown']")
    public WebElement listOfItem;
    @FindBy(xpath = "(//div[@dir='auto'])[2]")
    public WebElement clickDropdown;

    public void setClickDropdown() {
        clickDropdown.click();
    }

    // public void setListOfItem() {
    //   String str = listOfItem.getText();

    // }
    public void setListOfItem() {
        String str = listOfItem.getText();
        System.out.println(str);

    }

    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

    public List<String> getElementsText(List<WebElement> webElementList) {

//Placeholder empty list of web element
        List<String> webElementsAsString = new ArrayList<>();

        //Looping through list of web elements and storing text into placeholder list
        for (WebElement each : webElementList) {
            webElementsAsString.add(each.getText());
        }

        //returning final List<String>
        return webElementsAsString;
    }
}
