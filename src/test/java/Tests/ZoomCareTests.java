package Tests;

import org.junit.Assert;
import org.junit.Test;

public class ZoomCareTests extends BaseTestSuite{

    private String location="Salem, OR";
    private String service="Primary Care";
    @Test
    public void searchForAnAppoinment(){
        zoomCareLandingPage.goToLandingPage();
        zoomCareLandingPage.searchForAnAppoinment(location,service);
        Assert.assertEquals(location,zoomCareSchedulePage.getTextFromLocationSelector());
        Assert.assertEquals(service,zoomCareSchedulePage.getTextFromServiceSelector());
    }

    @Test
    public void checkTheOptionMoreAndLess(){
        zoomCareSchedulePage.goToSchedulePage();
        zoomCareSchedulePage.searchForAnAppointment(location,service);
        zoomCareSchedulePage.clickOnTheButtonMoreSlotTime();
        Assert.assertTrue(zoomCareSchedulePage.isLessButtonDisplayed());
    }

    @Test
    public void checkListResult(){
        zoomCareSchedulePage.goToSchedulePage();
        zoomCareSchedulePage.searchForAnAppointment(location,service);
        Assert.assertTrue(zoomCareSchedulePage.keyLocationOnTheList("WA"));
    }
}
