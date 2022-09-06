package org.delta.pex.test_automation.CandidateTest;

import com.google.gson.JsonObject;
import org.delta.automation.selenium.automationbaseclasses.BaseSeleniumTest;
import org.delta.pex.pagemodels.Candidate.ZoomLandingPage;
import org.delta.pex.pagemodels.Candidate.ZoomSchedulePage;
import org.delta.pex.pagemodels.ddins.DDINSLandingPage;
import org.delta.pex.utils.DataProviders;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ZoomTest extends BaseSeleniumTest {
    @Test
    public void TC1_ZoomScheduler() throws InterruptedException {
        SoftAssert soAssert = new SoftAssert();
        ZoomLandingPage landingPage = new ZoomLandingPage(this.getDriver(), soAssert);
        ZoomSchedulePage schedulePage = new ZoomSchedulePage(this.getDriver(), soAssert);

        //navigate to ZoomCare
        this.getDriver().get("https://www.zoomcare.com");

        //verify Scheduler displays
        landingPage.verifySchedulerDisplays();
        landingPage.verifyChooseLocationDisplays();
        landingPage.verifyChooseServiceDisplays();
        landingPage.verifyScheduleNowDisplays();
        landingPage.verifyScheduleNowIsDisabled();
    }

    @Test
    public void TC2_ZoomSchedulerPage() throws InterruptedException {
        SoftAssert soAssert = new SoftAssert();
        ZoomLandingPage landingPage = new ZoomLandingPage(this.getDriver(), soAssert);
        ZoomSchedulePage schedulePage = new ZoomSchedulePage(this.getDriver(), soAssert);

        //navigate to ZoomCare
        this.getDriver().get("https://www.zoomcare.com");

        //enter info and verify Schedule page displays
        landingPage.selectLocation();
        landingPage.selectService();
        landingPage.verifyScheduleNowIsEnabled();
        landingPage.clickScheduleNow();
        schedulePage.verifyServiceHeaderDisplays();
        schedulePage.verifyScheduledLocationDisplays();
        schedulePage.verifyScheduledServiceDisplays();
        schedulePage.verifyScheduledDateDisplays();
        schedulePage.verifyClinicCareButtonDisplays();
        schedulePage.verifyVideoCareButtonDisplays();
        schedulePage.verifyChatCareButtonDisplays();
        schedulePage.verifyServiceLineSectionDisplays();
        schedulePage.verifyInfoLinkDisplays();
    }

    @Test
    public void TC3_ZoomSchedulerServiceLine() throws InterruptedException {
        SoftAssert soAssert = new SoftAssert();
        ZoomLandingPage landingPage = new ZoomLandingPage(this.getDriver(), soAssert);
        ZoomSchedulePage schedulePage = new ZoomSchedulePage(this.getDriver(), soAssert);

        //navigate to ZoomCare
        this.getDriver().get("https://www.zoomcare.com");

        //enter info and verify Service Line displays
        landingPage.selectLocation();
        landingPage.selectService();
        landingPage.verifyScheduleNowIsEnabled();
        landingPage.clickScheduleNow();
        schedulePage.verifyServiceLineLocationDisplays();
        schedulePage.verifyServiceLineMapDisplays();
        schedulePage.verifyServiceClinicServicesDisplays();
        schedulePage.verifyServiceLineMapDisplays();
        schedulePage.verifyServiceClinicProviderDisplays();
        schedulePage.verifyServiceClinicProviderNameDisplays();
        schedulePage.verifyServiceClinicProviderTeamDisplays();
        schedulePage.verifyServiceClinicProviderDateInfoDisplays();
        schedulePage.verifyTimeSlotDisplays();
    }
}
