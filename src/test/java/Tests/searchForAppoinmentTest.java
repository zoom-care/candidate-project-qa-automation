package Tests;

import org.junit.Test;

public class searchForAppoinmentTest extends BaseTestSuite{

    @Test
    public void searchForAnAppoinment(){
        zoomCareLandingPage.searchForAnAppoinment("Salem, OR","Primary Care");
    }
}
