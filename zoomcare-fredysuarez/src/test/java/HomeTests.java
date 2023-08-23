import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SchedulePage;

public class HomeTests extends BaseTest {
    private SchedulePage schedulePage;
    private HomePage homePage;

    @Test
    public void HomePage_NavigateToSchedulePage_SchedulePageIsDisplayed() throws InterruptedException {
        this.homePage = new HomePage(this.driver);
        this.driver.navigate().to(homePage.URL);
        Assert.assertTrue(this.homePage.heroHeadingText().contains("Healthcare on your schedule"));
    }
}
