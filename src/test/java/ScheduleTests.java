import POM.BasePage;
import POM.SchedulePage;
import org.testng.annotations.Test;

public class ScheduleTests extends BaseTest {

    @Test (priority = 0 ) //TC3 - Search Results for Colorado under Clinic Visits
    public void coClinicVisits() throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);

        schedulePage.selectSchedule().selectLocation().selectService().selectDate().clickSearch().isCODisplayed();
    }
    @Test (priority = 1 ) //TC4 - Search Results for Colorado under Video Visits
    public void coVideoVisits() throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);

        schedulePage.selectSchedule().selectLocation().selectService().selectDate().clickSearch().clickVideoCareBtn().isCODisplayed();
    }

    @Test (priority = 2 )//TC5 - Illness/Injury Clinic Visit Pop-up Info
    public void clinicPopUpInfo() throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);

        schedulePage.selectSchedule().selectLocation().selectService().selectDate().clickSearch().clickClinicInfoBtn().isClinicIllInjPopUpDisplayed();
    }

    @Test (priority = 3 )//TC8 - Redirection to Login Page upon Video Visit Timeslot Selection
    public void timeslotSelectionLoginRedirection() throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);

        schedulePage.selectSchedule().selectLocation().selectService().selectDate().clickSearch().clickVideoCareBtn().clickFirstTimeslot().isLoginPageDisplayed();
    }

    @Test (priority = 4 )//TC10 - "More" Button Functionality
    public void moreButton() throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);

        schedulePage.selectSchedule().selectLocation().selectService().selectDate().clickSearch().clickMoreBtn().isLessBtnDisplayed();
    }
}
