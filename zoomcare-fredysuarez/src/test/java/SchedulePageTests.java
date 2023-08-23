import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SchedulePage;

public class SchedulePageTests extends BaseTest {
    private SchedulePage schedulePage;

    @Test
    public void homePage_NavigateToSchedulePage_SchedulePageIsDisplayed() throws InterruptedException {
        this.schedulePage = new SchedulePage(this.driver);
        this.driver.navigate().to(schedulePage.URL);
        Thread.sleep(1000);
    }

    @Test
    public void schedulePage_SelectSeattleLocationAndOpenServicesSelector_WomenHealthServiceIsDisplayed() {
        this.schedulePage = new SchedulePage(this.driver);
        this.driver.navigate().to(schedulePage.URL);
        this.schedulePage.waitForLoad();
        this.schedulePage.selectLocationContainingName("seattle");
        WebElement womenHealthService = this.schedulePage.getOptionContainingName("women's health", "service");
        Assert.assertNotNull(womenHealthService);
    }

    @Test
    public void SchedulePage_SelectSeattleLocationAndOpenServicesSelector_DermatologyServiceIsNotDisplayed() {
        this.schedulePage = new SchedulePage(this.driver);
        this.driver.navigate().to(schedulePage.URL);
        this.schedulePage.waitForLoad();
        this.schedulePage.selectLocationContainingName("seattle");
        WebElement womenHealthService = this.schedulePage.getOptionContainingName("dermatology", "service");
        Assert.assertNull(womenHealthService);
    }

    @Test
    public void SchedulePage_SelectLocationServiceAndDate_SearchBtnIsEnable() {
        this.schedulePage = new SchedulePage(this.driver);
        this.driver.navigate().to(schedulePage.URL);
        this.schedulePage.waitForLoad();
        this.schedulePage.selectLocationContainingName("denver");
        this.schedulePage.selectServiceContainingName("primary care");
        this.schedulePage.selectDate();
        Assert.assertFalse(this.schedulePage.btnSearchIsDisable());
    }
}
