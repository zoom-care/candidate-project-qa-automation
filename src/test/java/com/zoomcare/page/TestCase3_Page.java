package com.zoomcare.page;

import com.zoomcare.uitilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase3_Page {


    public TestCase3_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@data-testid='text-VideoCare™']")
    public WebElement videoChat;

    @FindBy(xpath = "(//div[contains(@class,'css-18t94o4 css-1dbjc4n')])[2]")
    public WebElement time;


    @FindBy(xpath = "//div[text()='Cancel Visit']")
    public WebElement cancel;
    public void setVideoChat() {
        videoChat.click();
    }
    public void setTime() {
        time.click();
    }

    public void setCancel() {
        cancel.click();
    }

    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }
}
