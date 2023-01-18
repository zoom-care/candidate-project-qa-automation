package Tests;

import org.junit.Assert;
import org.junit.Test;

public class ZoomCareTests extends BaseTestSuite{

    /*Verify the flow to start scheduling on the main page.
    Once the user is on the landing page, and he provides the locations and area needed,
    the option to "Schedule now" should be enabled and once the user clicks on that,
    The user should land on the: https://www.zoomcare.com/schedule with the details provided before.*/
    @Test
    public void searchForAnAppoinment(){
        String location="Salem, OR";
        String service="Primary Care";
        zoomCareLandingPage.goToLandingPage();
        zoomCareLandingPage.searchForAnAppoinment(location,service);
        Assert.assertEquals(location,zoomCareSchedulePage.getTextFromLocationSelector());
        Assert.assertEquals(service,zoomCareSchedulePage.getTextFromServiceSelector());
    }

    /*Verify the behavior for the button "More" on the slot time. Once the user clicks on that,
    there should be more dates available and the button "Less" is displayed at the end.*/
    @Test
    public void checkTheOptionMoreAndLess(){
        String location="Vancouver, WA";
        String service="Illness/Injury";
        zoomCareSchedulePage.goToSchedulePage();
        zoomCareSchedulePage.searchForAnAppointment(location,service);
        zoomCareSchedulePage.clickOnTheButtonMoreSlotTime();
        Assert.assertTrue(zoomCareSchedulePage.isLessButtonDisplayed());
    }

    /*Verify all the doctors on the list result are from the location selected.
    Check everyone matching the location selected before.*/
    @Test
    public void checkListResult(){
        String location="Denver, CO";
        String service="Sports Physical";
        zoomCareSchedulePage.goToSchedulePage();
        zoomCareSchedulePage.searchForAnAppointment(location,service);
        Assert.assertTrue(zoomCareSchedulePage.keyLocationOnTheList("CO"));
    }
}
